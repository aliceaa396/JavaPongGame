import java.awt.*;
import javax.swing.*;

//Game frame, X button and minimize button

public class GameFrame extends JFrame {

    GamePanel panel;
    //constructor
    GameFrame() {
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Java Pong");
        this.setResizable(false);
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

}
