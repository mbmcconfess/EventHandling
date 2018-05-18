package Where_EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventInnerClass extends JFrame {
    JTextField tf;
    EventInnerClass(){
        tf = new JTextField(15);
        //setLayout(null);
        JButton b = new JButton("Click");
        b.addActionListener(new HandlerIC(this));
        add(b, BorderLayout.NORTH);
        add(tf, BorderLayout.SOUTH);
    }

    private class HandlerIC implements ActionListener {
        EventInnerClass eic;
        HandlerIC(EventInnerClass e){
            eic = e;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            eic.tf.setText("Welcome !");
        }
    }
}


