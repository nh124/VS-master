import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class PushCounterPanel extends JPanel
{
    private int result;
    private JButton GenerateRandom;
    private JLabel min;
    private JLabel max;
    private JLabel resultLabel;
    private JTextField minTextField;
    private JTextField maxTextField;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the GUI.
    //-----------------------------------------------------------------
    public PushCounterPanel()
    {
        result = 0;

        GenerateRandom = new JButton("GenerateRandom");
        min = new JLabel("min:");
        minTextField = new JTextField(5);
        max = new JLabel("max:");
        maxTextField = new JTextField(5);
        GenerateRandom.addActionListener(new ButtonListener());
        resultLabel = new JLabel("result: 0");
        add(GenerateRandom);
        add(min);
        add(minTextField);
        add(max);
        add(maxTextField);
        add(resultLabel);




        setBackground(Color.cyan);
        setPreferredSize(new Dimension(680, 40));
    }
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            minTextField.getText();
            int num1 = Integer.parseInt(minTextField.getText());
            maxTextField.getText();
            int num2 = Integer.parseInt(maxTextField.getText());
            Random r = new Random();
            int result = r.nextInt(num2 - num1) + num1; // num1 is being set to 0. so num1 is added to make the range correct
            resultLabel.setText("result:" + result);
        }
    }
}
