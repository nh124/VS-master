import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui implements ActionListener {
    // The calculations
    String strNum1 = "";
    String strNum2 = "";
    String[] statement;

    String strTotal = "";
    int totalVal = 0;

    public static void main(String[] args)
    {
        new gui();
    }

    public gui()
    {
        // JFrame attributes
        JFrame frame = new JFrame("Calculator");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,500);
        frame.setResizable(false);
        frame.setLayout(null);

        // textField
        JTextArea text = new JTextArea();
        text.setSize(380, 150);
        text.setLocation(7,5);

        // row 1
        // button 0
        JButton num0= new JButton("0");
        num0.setSize(165,50);
        num0.setLocation(10,400);
        num0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.append("0");
            }
        });
        // button 1
        JButton num1= new JButton("1");
        num1.setSize(70,50);
        num1.setLocation(10,330);
        num1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.append("1");
            }
        });

        //button2
        JButton num2= new JButton("2");
        num2.setSize(70,50);
        num2.setLocation(100,330);
        num2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.append("2");
            }
        });

        //button3
        JButton num3= new JButton("3");
        num3.setSize(70,50);
        num3.setLocation(190,330);
        num3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.append("3");
            }
        });

        // row 2
        // button 4
        JButton num4= new JButton("4");
        num4.setSize(70,50);
        num4.setLocation(10,260);
        num4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.append("4");
            }
        });
        // button 5
        JButton num5= new JButton("5");
        num5.setSize(70,50);
        num5.setLocation(100,260);
        num5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.append("5");
            }
        });

        // button 6
        JButton num6= new JButton("6");
        num6.setSize(70,50);
        num6.setLocation(190,260);
        num6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.append("6");
            }
        });

        // row 3
        //button 7
        JButton num7= new JButton("7");
        num7.setSize(70,50);
        num7.setLocation(10,190);
        num7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.append("7");
            }
        });

        //button 8
        JButton num8= new JButton("8");
        num8.setSize(70,50);
        num8.setLocation(100,190);
        num8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.append("8");
            }
        });
        // button 9
        JButton num9= new JButton("9");
        num9.setSize(70,50);
        num9.setLocation(190,190);
        num9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.append("9");
            }
        });

        // The operators

        // Addition operator
        JButton numAdd = new JButton("+");
        numAdd.setSize(70,50);
        numAdd.setLocation(290,400);
        numAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.append("+");
            }
        });
        // Multiplication operator
        JButton numMultiply = new JButton("*");
        numMultiply.setSize(70,50);
        numMultiply.setLocation(290,330);
        numMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.append("*");
            }
        });
        // Subtract operator
        JButton numSubtract = new JButton("-");
        numSubtract.setSize(70,50);
        numSubtract.setLocation(290,260);
        numSubtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.append("-");
            }
        });
        // Divide operator
        JButton numDev = new JButton("/");
        numDev.setSize(70,50);
        numDev.setLocation(290,190);
        numDev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.append("/");
            }
        });
        // The equal sign
        JButton equal= new JButton("=");
        equal.setSize(70,50);
        equal.setLocation(190,400);
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(text.getText().contains("+"))
                {
                    statement = text.getText().split("\\+");
                    strNum1 = statement[0];
                    strNum2 = statement[1];

                    int num1 = Integer.parseInt(strNum1);
                    int num2 = Integer.parseInt(strNum2);

                    totalVal = num1 + num2;

                    strTotal = Integer.toString(totalVal);

                    text.setText(strTotal);
                }else if(text.getText().contains("-"))
                {
                    statement = text.getText().split("\\-");
                    strNum1 = statement[0];
                    strNum2 = statement[1];

                    int num1 = Integer.parseInt(strNum1);
                    int num2 = Integer.parseInt(strNum2);

                    totalVal = num1 - num2;

                    strTotal = Integer.toString(totalVal);

                    text.setText(strTotal);
                }else if(text.getText().contains("*"))
                {
                    statement = text.getText().split("\\*");
                    strNum1 = statement[0];
                    strNum2 = statement[1];

                    int num1 = Integer.parseInt(strNum1);
                    int num2 = Integer.parseInt(strNum2);

                    totalVal = num1 * num2;

                    strTotal = Integer.toString(totalVal);

                    text.setText(strTotal);
                }else if(text.getText().contains("/"))
                {
                    statement = text.getText().split("\\/");
                    strNum1 = statement[0];
                    strNum2 = statement[1];

                    int num1 = Integer.parseInt(strNum1);
                    int num2 = Integer.parseInt(strNum2);

                    totalVal = num1 / num2;

                    strTotal = Integer.toString(totalVal);

                    text.setText(strTotal);
                }

            }
        });

        frame.add(text);
        // the numPad
        frame.add(num0);
        frame.add(num1);
        frame.add(num2);
        frame.add(num3);
        frame.add(num4);
        frame.add(num5);
        frame.add(num6);
        frame.add(num7);
        frame.add(num8);
        frame.add(num9);
        // the operators
        frame.add(numAdd);
        frame.add(numSubtract);
        frame.add(numMultiply);
        frame.add(numDev);
        // The equal sign
        frame.add(equal);



        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
