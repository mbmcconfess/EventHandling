package Where_EventHandling;

import javax.swing.*;
import java.awt.*;

public class EventOuterClass extends JFrame {
    JTextField tf;
    EventOuterClass(){
        tf = new JTextField(15);
        //setLayout(null);
        JButton b = new JButton("Click");
        b.addActionListener(new HandlerOC(this));
        add(b, BorderLayout.NORTH);
        add(tf, BorderLayout.SOUTH);
    }
}
