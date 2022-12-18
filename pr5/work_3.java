package mirea.pr5;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;


public class work_3 extends JFrame{

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);

        JPanel panel= new JPanel();
        panel.setBackground(Color.GRAY);

        panel.setPreferredSize( new Dimension(1000,800));
        BufferedImage myPicture = ImageIO.read(new File("D:\\cat.jpg"));
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        panel.add(picLabel);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);

    }
}