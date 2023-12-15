package Game;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Board extends JPanel {
    BufferedImage bgImg;

    public Board() {
        // setSize(400, 600);
        showBackGround();
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
}
