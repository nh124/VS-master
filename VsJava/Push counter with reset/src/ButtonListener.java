import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//*****************************************************************
//  Represents a listener for button push (action) events.
//*****************************************************************
public class ButtonListener implements ActionListener
{
    int count;

    public ButtonListener(){
        count = 0;
}


    public void actionPerformed(ActionEvent event)
    {
        //count++;
        //label.setText("Pushes: " + count);
        System.out.println(event.getSource());

    }
}
// not sure


