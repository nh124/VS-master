import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener{ // to use action listener we have to implement it. And if we implement something we have to add code to it
    int clicks = 0;
    int reset = 0;
    JLabel label;
    JFrame frame;
    JButton button;
    JPanel panel;
    JButton Reset;
    public GUI(){ // Treat this constructor as the method
        frame = new JFrame("push Counter"); // the window
        button = new JButton("Click Me!");// Make a button inside the window for the user to interact with.this has to be added to the panel.
        Reset = new JButton("Reset!");
        button.addActionListener(this); // this will allow the program to increment the number of clicks in increase.
        panel = new JPanel(); // Stuff inside the window
        label  = new JLabel("Number of clicks: 0"); // this will just display the specified text inside the window. again must be added to the panel
        Reset.addActionListener(this);
        label = new JLabel("Number of clicks: " + reset);
        // To set up a Panel
            // Set up the border from the frame
           // Set the layout
          //  Add elements to the layout


        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30)); // need to pass in a object of a empty border and then add a some dimensions to it.
        panel.setLayout(new GridLayout(0,1)); // need to add a type of layout in gray layout is being used in this example just google search types of layout
        panel.add(button);
        panel.add(Reset);
        panel.add(label);
        frame.add(panel, BorderLayout.CENTER); // Everything that's happening inside thr window(frame) has to contain the other components
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // What happens when they close the frame
        //frame.setTitle("GUI"); //Title of the Window
        frame.pack(); // Set the window to match a certain size
        frame.setVisible(true); // Set the window to be visible to user and focus

    }
    public static void main (String[] args){
        // Swing method
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) { // This is the implemented method for action listener
        if(e.getSource() == button) {
            clicks++; // this increment the count.
            label.setText("Number of clicks " + clicks); //  this will display the number of clicks inside the window
        }
        else if(e.getSource() == Reset) {
            reset = 0;
            label.setText("Number of clicks " + reset);
        }
    }
}
