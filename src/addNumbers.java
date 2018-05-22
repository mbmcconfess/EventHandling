import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;


public class addNumbers extends JFrame {
    JTextField num1,num2, result;
    JLabel number1,number2,resultLabel;
    JButton addBtn,subBtn,mulBtn,divBtn;

    private Container container;
    private GridLayout gridLayout;



    BigInteger resultAdd,resultSub,resultMul,resultDiv;
    public static final int DEFAULT_WIDTH = 300;
    public  static final int DEFAULT_HEIGHT = 200;

    public addNumbers(){
        setTitle("Adding Two Numbers");
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
        gridLayout = new GridLayout(7,2);
        container = getContentPane();
        setLayout(gridLayout);

        num1 = new JTextField();
        num2 = new JTextField();
        result = new JTextField();

        number1 = new JLabel("Number 1");
        number2 = new JLabel("Number 2");
        resultLabel = new JLabel("Result :");
        addBtn = new JButton("Add");
        subBtn = new JButton("Subtract");
        mulBtn = new JButton("Multiply");
        divBtn = new JButton("Divide");

        add(number1);
        add(num1);
        add(number2);
        add(num2);
        add(new JLabel(" "));
        add(addBtn);
        add(new JLabel(" "));
        add(subBtn);
        add(new JLabel(" "));
        add(mulBtn);
        add(new JLabel(" "));
        add(divBtn);
        add(resultLabel);
        add(result);


        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultAdd =new BigInteger(num1.getText()).add(new BigInteger(num2.getText()));
                resultLabel.setText("Add Result: ");
                result.setText(resultAdd.toString());
            }
        });

        subBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultSub =new BigInteger(num1.getText()).subtract(new BigInteger(num2.getText()));
                resultLabel.setText("Subtraction Result: ");
                result.setText(resultSub.toString());
            }
        });

        mulBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultMul =new BigInteger(num1.getText()).multiply(new BigInteger(num2.getText()));
                resultLabel.setText("Multiplication Result: ");
                result.setText(resultMul.toString());
            }
        });

        divBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultDiv =new BigInteger(num1.getText()).divide(new BigInteger(num2.getText()));
                resultLabel.setText("Division Result: ");
                result.setText(resultDiv.toString());
            }
        });
    }
}
