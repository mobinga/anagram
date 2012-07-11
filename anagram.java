package anagram;

import java.util.Random;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import static anagram.logic.*;

public class anagram {
    static int v;
    public static void main(String[] args) {
        JFrame f = new JFrame("Anagram");
        f.setLayout(new BorderLayout());
        final Random rint = new Random();

        JPanel pan = new JPanel(new GridLayout(3,2));
        JPanel pan2 = new JPanel(new GridLayout(2,1));

        JButton b1 = new JButton("Guess");
        JButton b2 = new JButton("New Word");

        pan2.add(b1);
        pan2.add(b2);
        
        JLabel l1 = new JLabel("Anagram : ");
        JLabel l2 = new JLabel("Your Answer : ");

        final JLabel pos = new JLabel("Correct!");
        final JLabel neg = new JLabel("False!");

        pos.setVisible(false);
        neg.setVisible(false);

        final JTextField tf1 = new JTextField("Anagram");
        final JTextField tf2 = new JTextField("");
        tf1.setEditable(false);

        pan.add(l1);
        pan.add(tf1);
        pan.add(l2);
        pan.add(tf2);
        pan.add(pos);
        pan.add(neg);

        b1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if( values(v).equals(tf2.getText()) ){
                    pos.setVisible(true);
                } else {
                    neg.setVisible(true);
                }
                v = 0;
            }
        });
        
        
        b2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int i = rint.nextInt(9);
                tf1.setText(wrdScrmbl(values(i)));
                v = i;
                pos.setVisible(false);
                neg.setVisible(false);
            }
        });

        f.add(pan, BorderLayout.NORTH);
        f.add(pan2, BorderLayout.SOUTH);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 300);
        f.setVisible(true);

        lf();
    }


    public static void lf(){
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

}
