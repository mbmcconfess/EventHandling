package ActionCommands;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        EventAction ea = new EventAction();
        ea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ea.setVisible(true);
        ea.setSize(320,300);
    }
}
