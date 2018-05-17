package ButtonFrame;

import javax.swing.*;
import java.awt.*;

public class ButtonFrame extends JFrame {
    public static JPanel buttonPanel;
    public static final int DEFAULT_WIDTH = 300;
    public  static final int DEFAULT_HEIGHT = 200;

    public ButtonFrame(){
        setTitle("ButtonTest");
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);

        JButton yellowButton = new JButton("Yellow");
        JButton blueButton = new JButton("Blue");
        JButton redButton = new JButton("Red");

        buttonPanel = new JPanel();
        buttonPanel.add(yellowButton);
        buttonPanel.add(blueButton);
        buttonPanel.add(redButton);

        add(buttonPanel);
        ColorAction yellowAction = new ColorAction(Color.YELLOW);
        ColorAction blueAction = new ColorAction(Color.BLUE);
        ColorAction redAction = new ColorAction(Color.RED);

        yellowButton.addActionListener(yellowAction);
        blueButton.addActionListener(blueAction);
        redButton.addActionListener(redAction);
    }
}




