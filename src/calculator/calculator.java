package calculator;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class calculator extends JFrame {
    public static final int DEFAULT_WIDTH = 300;
    public  static final int DEFAULT_HEIGHT = 400;
    private GridBagConstraints gbc;

    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnPoint,btnDiv,btnMul,btnAdd,btnSub,btnEquals;
    JTextField displayArea;



    public calculator(){
        setTitle("Sarbagya's Calculator");
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        initilaizeButtons();
        addButtons();


    }

    public void initilaizeButtons(){
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn0 = new JButton("0");
        btnPoint = new JButton(".");
        btnDiv = new JButton("/");
        btnMul = new JButton("*");
        btnAdd = new JButton("+");
        btnSub = new JButton("-");
        btnEquals = new JButton("=");
        displayArea = new JTextField();
        displayArea.setBounds(0,0,400,100);
    }

    public void addButtons(){
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        add(displayArea,gbc);
        gbc.gridy = 1;
        gbc.gridx = 0;
        add(btn7,gbc);
        gbc.gridx = 1;
        add(btn8,gbc);
        gbc.gridx = 2;
        add(btn9,gbc);
        gbc.gridx = 3;
        add(btnDiv,gbc);
        gbc.gridy = 2;
        gbc.gridx = 0;
        add(btn4,gbc);
        gbc.gridx = 1;
        add(btn5,gbc);
        gbc.gridx = 2;
        add(btn6,gbc);
        gbc.gridx = 3;
        add(btnMul,gbc);
        gbc.gridy = 3;
        gbc.gridx = 0;
        add(btn1,gbc);
        gbc.gridx = 1;
        add(btn2,gbc);
        gbc.gridx = 2;
        add(btn3,gbc);
        gbc.gridx = 3;
        add(btnSub,gbc);
        gbc.gridy = 4;
        add(btnPoint,gbc);
        add(btn0,gbc);
        add(btnEquals,gbc);
        add(btnAdd,gbc);
    }
}
