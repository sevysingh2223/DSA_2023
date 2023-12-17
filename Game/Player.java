package Game;

import javax.swing.ImageIcon;

public class Player extends Sprites{
    
    public Player(){
        w = 200;
        h = 250;
        x = 10; 
        y=280;
        speed = 1;
        imageIcon = new ImageIcon(Player.class.getResource("dude2.gif"));
    }

    public void move(){
        x = x + speed;
    }
}
