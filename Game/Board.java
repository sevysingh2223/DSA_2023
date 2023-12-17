package Game;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel {
    BufferedImage bgImg;
    Player player;
    Enemy enemy;
    Timer timer;
    Enemy enemies[] = new Enemy[3];

    public Board() {
        // setSize(400, 600);
        showBackGround();
        player = new Player();
        loadEnemies();
        gameLoop();
        setFocusable(true);
        bindEvents();
    }

    private void bindEvents(){
        addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub
          }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                    player.speed = 3;
                    if(player.x == 1200){
                        gamewin(getGraphics());
                    }
                }
                else if(e.getKeyCode() == KeyEvent.VK_LEFT){
                    player.speed = -3;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                player.speed = 0;
            }
        });
    }

    private void gameOver(Graphics brush){
        for(Enemy enemy : enemies){
            if(isCollide(enemy)){
                brush.setFont(new Font("times", Font.BOLD, 50));
                brush.setColor(Color.RED);
                brush.drawString("GAME OVER", 600, 300);
                timer.stop();
            }
        }
    }
    private void gamewin(Graphics brush){
                brush.setFont(new Font("times", Font.BOLD, 50));
                brush.setColor(Color.RED);
                brush.drawString("GAME WIN", 600, 300);
    }

    private boolean isCollide(Enemy enemy){
        int xDist = Math.abs(player.x - enemy.x -200);
        int yDist = Math.abs(player.y - enemy.y -200);
        int maxH = Math.max(player.h, enemy.h);
        int maxW = Math.max(player.w, enemy.w);

        return xDist <= maxH && yDist <= maxW;
    }


    private void loadEnemies(){
        int initialLocation = 450;
        int gap = 220;
        int speed = 2;
        for(int i=0;i<enemies.length;i++){
            enemies[i] = new Enemy(initialLocation,speed);
            initialLocation = initialLocation + gap;
            speed = speed +2;
        }
    }

    private void paintEnemies(Graphics brush){
        for(Enemy enemy  : enemies){
            enemy.draw(brush);
            enemy.move();
        }
    }
    private void gameLoop(){
        timer = new Timer(30 , (e) -> repaint());
        timer.start();
    }

    public void showBackGround() {
        URL image = Board.class.getResource("logo.jpg");
        try {
            bgImg = ImageIO.read(image);
        } catch (IOException e) {
            System.out.println("BackGroundImage not found");
            e.printStackTrace();
        }
    }

    public void paintComponent(Graphics brush){
        super.paintComponent(brush);
        brush.drawImage(bgImg, 0, 0, 1200, 600 ,null);
        player.draw(brush);
        player.move();
        paintEnemies(brush);
        gameOver(brush);
    }
    
}
