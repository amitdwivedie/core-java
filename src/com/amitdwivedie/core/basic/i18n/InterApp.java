package com.amitdwivedie.core.basic.i18n;

import javax.swing.*;
import java.awt.*;
import java.util.*;

class InterApp {
    public static void main(String g[]) {
        try {
            Locale l = new Locale(g[0], g[1]);
            JLabel l1 = new JLabel();
            JLabel l2 = new JLabel();
            JButton jb = new JButton();
            JTextField tf1 = new JTextField(10);
            JTextField tf2 = new JTextField(10);

            ResourceBundle rb = ResourceBundle.getBundle("MyBundle", l);

            String l1text = rb.getString("lblname");
            String l2text = rb.getString("lblpass");
            String btntext = rb.getString("jbtn");

            l1.setText(l1text);
            l2.setText(l2text);
            jb.setText(btntext);

            JFrame jf = new JFrame();
            jf.setLayout(new FlowLayout());
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jf.add(l1);
            jf.add(tf1);
            jf.add(l2);
            jf.add(tf2);
            jf.add(jb);
            jf.setSize(150, 200);
            jf.setVisible(true);

        } catch (Exception e) {
            System.out
                    .println("either country code or language code is missing");
        }
    }
}
