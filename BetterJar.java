import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.*;

public class BetterJar {
    public static void main(String[] args) {
        ImageIcon imageIcon = new ImageIcon("DonotSee/Betterjar.png");
        JFrame frame = new JFrame("Better.Jar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel(imageIcon);
        frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);
    }
}