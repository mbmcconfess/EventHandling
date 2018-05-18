package Where_EventHandling;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        EventSameClass sc = new EventSameClass();
        EventInnerClass ic = new EventInnerClass();
        EventOuterClass oc = new EventOuterClass();

        sc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        oc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        sc.setVisible(true);
        ic.setVisible(true);
        oc.setVisible(true);

        sc.setSize(300,300);
        ic.setSize(300,300);
        oc.setSize(300,300);
    }
}
