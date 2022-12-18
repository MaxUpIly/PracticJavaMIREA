package mirea.pr5;
import  java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class work_1 {
    private static int check_milan = 0;
    private static int check_madrid = 0;
    public static void main(String args[]) {

        JFrame frame = new JFrame("MILAN VS MADRID");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(150, 300);

        JPanel panel= new JPanel();
        panel.setBackground(Color.GRAY);

        panel.setPreferredSize( new Dimension(150,300));
        JButton milan = new JButton("AC Milan");
        JButton madrid = new JButton("Real Madrid");
        JLabel result = new JLabel("Result: " + check_milan + " X "+ check_madrid, JLabel.CENTER);
        JLabel scorer = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        JLabel winner = new JLabel("Winner: DRAW", JLabel.CENTER);
        panel.add(milan);
        panel.add(madrid);
        panel.add(result);
        panel.add(scorer);
        panel.add(winner);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        ActionListener actionMilan = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                check_milan++;
                result.setText("Result: " + check_milan + " X "+ check_madrid);
                scorer.setText("Last Scorer: MILAN");
                if(check_milan>check_madrid){
                    winner.setText("Winner: MILAN");
                }
                else if(check_milan==check_madrid){
                    winner.setText("Winner: DRAW");
                }
            }
        };
        milan.addActionListener(actionMilan);
        ActionListener actionMadrid = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                check_madrid++;
                result.setText("Result: " + check_milan + " X "+ check_madrid);
                scorer.setText("Last Scorer: MADRID");
                if(check_milan<check_madrid){
                    winner.setText("Winner: MADRID");
                }
                else if(check_milan==check_madrid){
                    winner.setText("Winner: DRAW");
                }
            }
        };
        madrid.addActionListener(actionMadrid);
    }
}


