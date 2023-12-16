package Game;

import javax.swing.ImageIcon;

public class Enemy extends Sprites{
    
    public Enemy(int x , int speed){
        w = 100;
        h = 100;
        this.x =x;
        y=20;
        this.speed = speed;
        imageIcon = new ImageIcon(Enemy.class.getResource("spider.gif"));
    }

    public void move(){
        if(y>550){
            y = 0;
        }
        y = y + speed;
    }
}
