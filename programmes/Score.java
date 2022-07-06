import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;

public class Score extends JFrame implements ActionListener {
    JFrame resultf;
    ImageIcon resulti;
    JLabel imagel;
    JLabel thankyou;
    JLabel yscore;
    JButton again , exit;

    public Score(String username, int score) {
        resultf = new JFrame();
        resultf.setLayout(null);
        resultf.setBounds(200, 100, 1000, 500);
        resultf.setBackground(Color.white);

        resulti = new ImageIcon(getClass().getResource("score.png"));
        imagel = new JLabel(resulti);
        resultf.add(imagel);
        imagel.setLayout(null);
        imagel.setBounds(0, 0, 500, 500);

        thankyou = new JLabel("Thankyou " + username + " For Playing Quiz ");
        resultf.add(thankyou);
        thankyou.setLayout(null);
        thankyou.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
        thankyou.setForeground(Color.blue);
        thankyou.setBounds(550, 50, 600, 50);

        yscore = new JLabel("your score is  " + score);
        resultf.add(yscore);
        yscore.setLayout(null);
        yscore.setFont(new Font("Tahoma", Font.BOLD, 20));
        yscore.setForeground(Color.black);
        yscore.setBounds(600, 250, 500, 30);

        again = new JButton("Play Again");
        again.setLayout(null);
        again.setBounds(600, 350, 150, 30);
        again.setFont(new Font("Times New Roman", Font.BOLD, 15));
        again.setBackground(new Color(30, 144, 254));
        again.setForeground(Color.white);
        again.addActionListener(this);
        resultf.add(again);

         
        exit = new JButton("Exit");
        exit.setLayout(null);
        exit.setBounds(800, 350, 150, 30);
        exit.setFont(new Font("Times New Roman", Font.BOLD, 15));
        exit.setBackground(new Color(30, 144, 254));
        exit.setForeground(Color.white);
        exit.addActionListener(this);
        resultf.add(exit);
        resultf.setVisible(true);
        resultf.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == again) {
            this.setVisible(false);
            new Quiz();
        }else {
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        Score sc = new Score("", 0);
    }
}
