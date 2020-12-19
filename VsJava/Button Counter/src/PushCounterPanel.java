import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonListener;;
public class PushCounterPanel extends JPanel {
    public int count;
    public JButton push;
    public JLabel label;
    public JButton reset;

    //-----------------------------------------------------------------
// Constructor: Sets up the GUI.
//-----------------------------------------------------------------
    public PushCounterPanel() {
        count = 0;
        push = new JButton("Push Me!");
        label = new JLabel();
        push.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pushButtonPressed();
            }
        } );
        reset = new JButton("Reset");
        reset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                resetCode();
            }
        } );
        add(reset);
        add(push);
        add(label);
        setBackground(Color.cyan);
        setPreferredSize(new Dimension(300, 50));


    }
    public void pushButtonPressed() {
        count++;
        label.setText("Pushes: " + count);
    }
    /*public void resetButton(){
        reset = new JButton("Reset");
        reset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                resetCode();
            }
        } );
    }

     */
    public void resetCode(){
        count = 0;
        label.setText("Pushes: " + count);
    }
}
