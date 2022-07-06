import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Ques extends JFrame implements ActionListener {
    JButton next, lifeLine, submit;
    public static int count = 0;
    public static int timer = 15;
    public static int ans_given = 0;
    public static int score = 0;
    JLabel qno, question;
    String q[][] = new String[10][5];
    String qa[][] = new String[10][2];
    String pa[][] = new String[10][1];
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup options;
    String username;

    public Ques(String username) {
        this.username = username;
        JFrame jf2 = new JFrame();
        jf2.setBounds(200, 100, 1000, 500);
        jf2.setBackground(Color.white);
        // --------------------image----------------------------------------
        ImageIcon i3 = new ImageIcon(getClass().getResource("quiz.jpg"));
        JLabel jl4 = new JLabel(i3);
        jl4.setLayout(null);
        jl4.setBounds(0, 0, 1000, 250);
        jf2.add(jl4);
        // -------------questions-------------------------
        qno = new JLabel("");
        jf2.setLayout(null);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 20));
        qno.setBounds(100, 270, 500, 30);
        jf2.add(qno);

        question = new JLabel("ffffggggg");
        jf2.setLayout(null);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        question.setBounds(130, 270, 500, 30);
        jf2.add(question);

        // --------------------QUESTIONS AND ANSWER
        // ARRAY----------------------------------------

        q[0][0] = "What do you call a computer on a network that requests files from another computer?";
        q[0][1] = "A client";
        q[0][2] = "A host";
        q[0][3] = "A router";
        q[0][4] = "A web server";

        q[1][0] = "How can you catch a computer virus?";
        q[1][1] = " Sending e-mail messages";
        q[1][2] = "Using a laptop during the winter";
        q[1][3] = "Opening e-mail attachments";
        q[1][4] = " Shopping on-line";

        q[2][0] = " Google (www.google.com) is a";
        q[2][1] = "Search Engine";
        q[2][2] = "Number in Math";
        q[2][3] = "Directory of images";
        q[2][4] = "Chat service on the web";

        q[3][0] = "Which is not an Internet protocol?";
        q[3][1] = "HTTP";
        q[3][2] = " FTP";
        q[3][3] = "STP";
        q[3][4] = "IP";

        q[4][0] = "AOL stands for:";
        q[4][1] = "Arranged Outer Line";
        q[4][2] = "America Over LAN";
        q[4][3] = "Audio Over LAN";
        q[4][4] = "America On-line";

        q[5][0] = "Another name for a computer chip is:";
        q[5][1] = "Execute";
        q[5][2] = "Micro chip";
        q[5][3] = " Microprocessor";
        q[5][4] = "Select";

        q[6][0] = "WWW stands for:";
        q[6][1] = "World Wide Web";
        q[6][2] = " World Wide Wares";
        q[6][3] = " World Wide Wait";
        q[6][4] = " World Wide War";

        q[7][0] = "The main computer that stores the files that can be sent to computers that are networked together is:";
        q[7][1] = " Clip art";
        q[7][2] = "Mother board";
        q[7][3] = "Peripheral";
        q[7][4] = "File server";

        q[8][0] = "Which of the following is not a valid domain name?";
        q[8][1] = "www.yahoo.com";
        q[8][2] = "www.yahoo.co.uk";
        q[8][3] = " www.com.yahoo";
        q[8][4] = " www.yahoo.co.in";

        q[9][0] = "what is the full form of HTML";
        q[9][1] = "Hyper Text Markup Language";
        q[9][2] = "Heap Text Markup Language";
        q[9][3] = "Hyper Text Moving Language";
        q[9][4] = "Hide Text Moving Language";

        qa[0][1] = "A client";
        qa[1][1] = "Sending e-mail messages";
        qa[2][1] = "Search Engine";
        qa[3][1] = "HTTP";
        qa[4][1] = "Audio Over LAN";
        qa[5][1] = "Microprocessor";
        qa[6][1] = "World Wide Web";
        qa[7][1] = "File server";
        qa[8][1] = "www.com.yahoo";
        qa[9][1] = "Hyper Text Markup Language";

        // --------------------RADIO
        // BUTTONSSSSSS----------------------------------------

        opt1 = new JRadioButton("  ");
        opt1.setFont(new Font("tahoma", Font.PLAIN, 18));
        opt1.setBounds(70, 310, 200, 30);
        jf2.setLayout(null);
        jf2.add(opt1);

        opt2 = new JRadioButton("  ");
        jf2.add(opt2);
        opt2.setFont(new Font("tahoma", Font.PLAIN, 18));
        jf2.setLayout(null);
        opt2.setBounds(70, 340, 200, 30);

        opt3 = new JRadioButton("  ");
        jf2.add(opt3);
        opt3.setFont(new Font("tahoma", Font.PLAIN, 18));
        jf2.setLayout(null);
        opt3.setBounds(70, 370, 200, 30);

        opt4 = new JRadioButton("  ");
        jf2.add(opt4);
        opt4.setFont(new Font("tahoma", Font.PLAIN, 18));
        jf2.setLayout(null);
        opt4.setBounds(70, 400, 200, 30);

        options = new ButtonGroup();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);

        // --------------------BUTTONS----------------------------------------
        next = new JButton("NEXT");
        next.setLayout(null);
        next.setBounds(850, 310, 100, 30);
        next.setFont(new Font("Times New Roman", Font.BOLD, 15));
        next.setBackground(new Color(30, 144, 254));
        next.setForeground(Color.white);
        next.addActionListener(this);
        jf2.add(next);

        lifeLine = new JButton("50-50 lifeLine");
        lifeLine.setLayout(null);
        lifeLine.setBounds(850, 350, 100, 30);
        lifeLine.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lifeLine.setBackground(new Color(30, 144, 254));
        lifeLine.setForeground(Color.white);
        lifeLine.addActionListener(this);
        jf2.add(lifeLine);

        submit = new JButton("Submit");
        submit.setLayout(null);
        submit.setBounds(850, 390, 100, 30);
        submit.setFont(new Font("Times New Roman", Font.BOLD, 15));
        submit.setBackground(new Color(30, 144, 254));
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        jf2.add(submit);
        submit.setEnabled(false);
        start(0);

        jf2.setVisible(true);
        jf2.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void start(int count) {
        qno.setText("" + (count + 1) + ".");
        question.setText(q[count][0]);
        opt1.setText(q[count][1]);
        opt1.setActionCommand(q[count][1]);
        opt2.setText(q[count][2]);
        opt2.setActionCommand(q[count][2]);
        opt3.setText(q[count][3]);
        opt3.setActionCommand(q[count][3]);
        opt4.setText(q[count][4]);
        opt4.setActionCommand(q[count][4]);

        options.clearSelection();

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            ans_given = 1;
            if (options.getSelection() == null) {
                pa[count][0] = "";

            } else {
                pa[count][0] = options.getSelection().getActionCommand();
            }
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count++;
            start(count);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (options.getSelection() == null) {
                pa[count][0] = "";
            } else {
                pa[count][0] = options.getSelection().getActionCommand();
            }
            for (int i = 0; i < pa.length; i++) {
                if (pa[i][0].equals(qa[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            this.setVisible(false);
            new Score(username, score).setVisible(true);

        } else if (ae.getSource() == lifeLine) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeLine.setEnabled(true);
        }

    }

    public void paint(Graphics g) {

        super.paint(g);
        String time = "Time Left:" + timer;
        g.setColor(Color.red);
        g.setFont(new Font("Tahoma", Font.BOLD, 15));
        g.drawString(time, 850, 320);

        if (timer > 0) {
            g.drawString(time, 850, 320);
        } else {
            g.drawString("times up!!!", 850, 320);
        }
        timer--;
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) {
                if (options.getSelection() == null) {
                    pa[count][0] = "";
                } else {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                for (int i = 0; i < pa.length; i++) {
                    if (pa[i][0].equals(qa[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                this.setVisible(false);
                new Score(username, score).setVisible(true);
            } else {
                if (options.getSelection() == null) {
                    pa[count][0] = "";

                } else {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }
    }

    public static void main(String[] args) {
        new Ques("").setVisible(true);

    }
}
