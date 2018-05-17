package ButtonFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static ButtonFrame.ButtonFrame.buttonPanel;

public class ColorAction implements ActionListener {
    private Color backgroundColor;

    public ColorAction(Color c){
        backgroundColor = c;
    }
    public void actionPerformed(ActionEvent event){
        buttonPanel.setBackground(backgroundColor);
    }
}
