package Game;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

    public GameFrame() {
        setTitle("2D_GAME");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1500, 800); // Width and height of the window
        setResizable(false);
        setLocationRelativeTo(null);
        add(new Board());
        setVisible(true);
    }

    public static void main(String[] args) {
        // JFrame = a GUI window to add new components
        GameFrame frame = new GameFrame();
    }

}
