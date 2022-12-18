package mirea.pr5;
import javax.swing.*;
import java.awt.*;

public class work_4
{
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame frame = new JFrame("GIF");
                frame.setSize(400, 400);

                JLabel jLabel = new JLabel("test");
                Image image = Toolkit.getDefaultToolkit().createImage("D:\\NyanCat.gif");
                ImageIcon imageIcon = new ImageIcon(image);
                imageIcon.setImageObserver(jLabel);
                jLabel.setIcon(imageIcon);
                frame.add(jLabel);
                frame.setVisible(true);
            }
        });
    }
}