

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {

    JButton b1;
    JButton b2;
    JTextField tf;
     String name;
     JFrame jf;
    public Quiz() {
        jf = new JFrame("Quiz on -  LOGIN");
        jf.setBounds(200, 100, 1000, 500);
        jf.setBackground(Color.white);

        // --------------image--------------

        ImageIcon i1 = new ImageIcon(getClass().getResource("login.jpeg"));
        JLabel jl = new JLabel(i1);
        jl.setLayout(null);
        jl.setBounds(0, 0, 500, 500);
        jf.add(jl);

        // // --------------Quiz Time!!!!--------------

        JLabel jl2 = new JLabel("GET READY FOR QUIZ!!!!");
        jl2.setLayout(null);
        jl2.setBounds(520, 50, 500, 40);
        jl2.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        // jl2.setBackground(Color.black);
        jl2.setForeground(Color.blue);
        jf.add(jl2);
        // // --------------enter your name!!!!--------------

        JLabel jl3 = new JLabel("ENTER YOUR NAME PLEASE");
        jl3.setLayout(null);
        jl3.setBounds(620, 140, 800, 20);
        jl3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        // jl2.setBackground(Color.black);
        jl3.setForeground(new Color(30, 144, 254));
        jf.add(jl3);

        // // --------------text field--------------
        tf = new JTextField();
        jf.setLayout(null);
        tf.setBounds(610, 170, 300, 30);
        tf.setBackground(Color.white);
        tf.setFont(new Font("Times New Roman", Font.BOLD, 20));

        tf.setForeground(Color.black);
        jf.add(tf);
        // --------------BUTTON--------------

        b1 = new JButton("RULES...");
        b1.setLayout(null);
        b1.setBounds(600, 250, 150, 30);
        b1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        b1.setBackground(new Color(30, 144, 254));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
         jf.add(b1);

        b2 = new JButton("EXIT");
        b2.setLayout(null);
        
        b2.setBackground(new Color(30, 144, 254));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        b2.setBounds(800, 250, 150, 30);
        b2.setFont(new Font("Times New Roman", Font.BOLD, 15));

        jf.add(b2);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
          
             String name = tf.getText();
             new Rules(name);
             jf.setVisible(false);
        } else {
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        Quiz q = new Quiz();
    }
}
