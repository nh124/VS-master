import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PushCounterPanel extends JPanel {
    private int count;
    private JButton push;
    private JLabel label;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the GUI.
    //-----------------------------------------------------------------
    public PushCounterPanel() {
        count = 0;

        push = new JButton("Push Me!");
        label = new JLabel();
        push.addActionListener(new ButtonListener());
        add(push);
        add(label);

        setBackground(Color.cyan);
        setPreferredSize(new Dimension(680, 40));
    }

    public void setCount(){
        count++;
    }
    public int getCount(){
        return count;
    }
}
