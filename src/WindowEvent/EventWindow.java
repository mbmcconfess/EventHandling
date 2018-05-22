package WindowEvent;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class EventWindow extends WindowAdapter {
    JFrame frame;

    public EventWindow(){
        frame = new JFrame();
        frame.setTitle("Handling Window Event");
        frame.addWindowListener(this);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    public void windowClosing(WindowEvent we){
        JOptionPane.showMessageDialog(frame, "GoodBye");
        System.exit(1);
    }

    public void windowOpened(WindowEvent we){
        JOptionPane.showMessageDialog(frame, "Welcome");
    }

    public void windowIconified(WindowEvent we){
        JOptionPane.showMessageDialog(frame, "See u later");
    }

    public void windowDeiconified(WindowEvent we){
        JOptionPane.showMessageDialog(frame, "Welcome Back");
    }

    public static void main(String[] args) {
        new EventWindow();
    }
}
