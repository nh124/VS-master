import java.awt.event.ActionEvent;
public class ButtonListener extends PushCounterPanel
{
    //--------------------------------------------------------------
// Updates the counter and label when the button is pushed.
//--------------------------------------------------------------
    public void actionPerformed(ActionEvent event)
    {
        count++;
        label.setText("Pushes: " + count);
    }
}