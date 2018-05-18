package Where_EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventSameClass extends JFrame implements ActionListener {
    JTextField tf;
    EventSameClass(){
        tf = new JTextField(15);
        tf.setBounds(60,50,170,20);
        setLayout(null);
        JButton b = new JButton("Click");
        b.setBounds(100,120,80,30);
        b.addActionListener(this);
        add(b);
        add(tf);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome to the class !");
    }
}
