
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame  implements ActionListener{
    JButton b3, b4;
    JFrame f2;
    public Rules(String Username) {
        // --------------------frame--------------
         f2 = new JFrame();
        f2.setBounds(200, 80, 600, 600);
        f2.setBackground(Color.white);
        f2.setLayout(null);

        // --------------------welcome part--------------

        JLabel l1 = new JLabel("Welcome " + Username + " To The  Rulessss");
        l1.setForeground(new Color(30, 144, 254));
        l1.setBounds(100, 10, 500, 100);
        l1.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
        f2.add(l1);
                // --------------------line--------------
               JLabel l3= new JLabel("<hr><hr>");
               
               f2.add(l3);

        // --------------------points --------------
        JLabel l2 = new JLabel();
        l2.setBounds(50, 60, 500, 500);
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        l2.setText(
                "<html>" +
                        "1. Participation in the quiz is free and open to all persons above 18 years old. " + "<br><br>"
                        +
                        "2. While signing up, under Group please select General" + "<br><br>" +
                        "3. The quiz will be of half an hour duration. " + "<br><br>" +
                        "4. The quiz will be open all of 22nd March, from 0900 Hrs. " + "<br><br>" +
                        "5. You can attempt the quiz only once. " + "<br><br>" +
                        "6. There are a total 50 questions. " + "<br><br>" +
                        "7. Each question carries one mark. No negative marking for wrong answers.  " + "<br><br>" +
                        "8. Questions are of Multiple Choice." + "<br><br>" +
                        "</html>"

        );
        f2.add(l2);

                // --------------------buttons --------------
          b3= new JButton("BACK");
         b3.setBounds(100,520, 100, 30);
         f2.add(b3);
         b3.setBackground(new Color(30, 144, 254));
         b3.setForeground(Color.white);
         b3.addActionListener(this);

          b4= new JButton("START");
         b4.setBounds(400,520, 100, 30);
         f2.add(b4);
         b4.setBackground(new Color(30, 144, 254));
         b4.setForeground(Color.white);
         b4.addActionListener(this);
        
        f2.setVisible(true);
        f2.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed( ActionEvent a){
            if( a.getSource()==b3 ){
                     new Quiz();
                      f2.setVisible(false);
            }else{
                  new Ques(""); 
                  f2.setVisible(false);
            }
    }

    public static void main(String[] args) {
        new Rules("");
    }
}
