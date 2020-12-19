// CoordinatesPanel. java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CoordinatesPanel extends JPanel
{
    private final int SIZE = 6; // diameter of dot
    private int x = 50, y = 50; // coordinates of mouse press
    private String currentMessage = "";

    //-----------------------------------------------------------------
    // Constructor: Sets up this panel to listen for mouse events.
    //-----------------------------------------------------------------
    public CoordinatesPanel()
    {
        addMouseMotionListener(new CoordinatesMouseMoveListener());
        setBackground(Color.black);
        setPreferredSize(new Dimension(300, 200));
    }

//-----------------------------------------------------------------
// Draws all of the dots stored in the list.
//-----------------------------------------------------------------
public void paintComponent(Graphics page) // Can you explain this line of code to me??
{
    super.paintComponent(page);
    page.setColor(Color.green);
    page.fillOval(x, y, SIZE, SIZE);
    page.drawString(currentMessage, 50,100);
    page.drawString(currentMessage,50,150);
    //
}
    //*****************************************************************
    // Represents the listener for mouse movement events.
    //*****************************************************************

    private class CoordinatesMouseMoveListener implements MouseMotionListener // make changes
    {
        public void mouseMoved(MouseEvent e)
        {
        currentMessage = "Moved";
        repaint();
        }

        public void mouseDragged(MouseEvent e)
        {
            currentMessage = "dragged";
            repaint();
        }
    }
}

