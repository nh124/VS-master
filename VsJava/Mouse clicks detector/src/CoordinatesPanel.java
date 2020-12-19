import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CoordinatesPanel extends JPanel
{
    private final int SIZE = 6; // diameter of dot
    private int x = 50, y = 50; // coordinates of mouse press
    private String s = "";
    //-----------------------------------------------------------------
    // Constructor: Sets up this panel to listen for mouse events.
    //-----------------------------------------------------------------
    public CoordinatesPanel()
    {
        addMouseListener(new CoordinatesListener());
        setBackground(Color.black);
        setPreferredSize(new Dimension(300, 200));
    }

    //-----------------------------------------------------------------
    // Draws all of the dots stored in the list.
    //-----------------------------------------------------------------
    public void paintComponent(Graphics page)
    {
        super.paintComponent(page);
        page.setColor(Color.green);
        page.fillOval(x, y, SIZE, SIZE);
        page.drawString("Coordinates: (" + x + ", " + y + ")", 5, 15);
        page.drawString(s,5,30);

    }
    //*****************************************************************
    // Represents the listener for mouse events.
    //*****************************************************************
    private class CoordinatesListener implements MouseListener
    {
        //--------------------------------------------------------------
        // Adds the current point to the list of points and redraws
        // the panel whenever the mouse button is pressed.
        //--------------------------------------------------------------
        public void mousePressed(MouseEvent event)
        {
            x = event.getX();
            y = event.getY();
            repaint();
        }

        //--------------------------------------------------------------
        // Provide empty definitions for unused event methods.
        //--------------------------------------------------------------
        public void mouseClicked(MouseEvent event) {
            x = event.getX();
            y = event.getY();
            s = "Mouse clicked.";
            repaint();
        }
        public void mouseReleased(MouseEvent event) {
            x = event.getX();
            y = event.getY();
            s = "Mouse Released";
            repaint();
        }
        public void mouseEntered(MouseEvent event) {
            x = event.getX();
            y = event.getY();
            s = "Mouse Enter";
            repaint();
        }
        public void mouseExited(MouseEvent event) {
            x = event.getX();
            y = event.getY();
            s = "Mouse Exited";
            repaint();
        }
    }
}
