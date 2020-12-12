package ru.mirea.lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Football extends JFrame {
    int scoreMilan=0, scoreMadrid=0;
    JLabel lbl1 = new JLabel("Result: "+scoreMilan+"X"+scoreMadrid);
    JLabel lbl2 = new JLabel("Last Scorer: N/A");
    JLabel lbl3 = new JLabel("Winner: DRAW");
    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");

    public Football(){
        super("Match");
        setLayout(null);
        setSize(300, 250);
        button1.setBounds(0,10, 120,25);
        button2.setBounds(150,10, 120,25);
        lbl1.setBounds(100,50,200,20);
        lbl2.setBounds(100,100,200,20);
        lbl3.setBounds(100,150,200,20);
        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(button1);
        add(button2);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                scoreMilan++;
                lbl1.setText("Result: "+scoreMilan+"X"+scoreMadrid);
                lbl2.setText("Last Scorer: AC Milan");
                if (scoreMilan>scoreMadrid)
                    lbl3.setText("Winner: AC Milan");
                else if (scoreMadrid==scoreMilan)
                    lbl3.setText("Winner: DRAW");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                scoreMadrid++;
                lbl1.setText("Result: "+scoreMilan+"X"+scoreMadrid);
                lbl2.setText("Last Scorer: Real Madrid");
                if (scoreMilan<scoreMadrid)
                    lbl3.setText("Winner: Real Madrid");
                else if (scoreMadrid==scoreMilan)
                    lbl3.setText("Winner: DRAW");
            }
        });
    }
}
