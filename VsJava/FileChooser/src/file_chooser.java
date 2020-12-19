import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class file_chooser extends JFrame implements ActionListener {
    JCheckBox jpg;
    JCheckBox text;
    JCheckBox bmp;
    JCheckBox doc;
    JTextField add;
    JLabel l;

    public static void main(String[] args)  {

        new file_chooser();

    }
    public file_chooser() {
        // The Frame
        JFrame frame = new JFrame("File chooser");
        frame.setPreferredSize(new Dimension(800,800)); //
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);


        //The button that will open the file chooser
        JButton open = new JButton("open");
        open.addActionListener(this);


        // Check boxes
        jpg = new JCheckBox("JPG");
        text = new JCheckBox("TXT");
        bmp = new JCheckBox("bmp");
        doc = new JCheckBox(" DOCS");


        // label to let the user know whet is file is selected or not
        l = new JLabel("File has not been selected");

        // The textField for the path
        add = new JTextField(30);

        panel.add(jpg);
        panel.add(text);
        panel.add(bmp);
        panel.add(doc);
        panel.add(add);
        panel.add(open);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String n = e.getActionCommand();

        JFileChooser choose = new JFileChooser(add.getText());
        // File extension and description
        FileFilter docFilter = (FileFilter)new FileNameExtensionFilter(".docs","Word documents Files");
        FileFilter jpgFilter = (FileFilter)new FileNameExtensionFilter(".jpg","Image Files");
        FileFilter bmpFilter = (FileFilter)new FileNameExtensionFilter(".bmp","BitMap Files");
        FileFilter textFilter = (FileFilter)new FileNameExtensionFilter(".txt","Text Files");

        // implements the filter based on the selected tik marks
        if(jpg.isSelected()){
            choose.addChoosableFileFilter(jpgFilter);
        }
        if(bmp.isSelected()) {
            choose.addChoosableFileFilter(bmpFilter);
        }
        if(text.isSelected()) {
            choose.addChoosableFileFilter(textFilter);
        }
        if(doc.isSelected()) {
            choose.addChoosableFileFilter(docFilter);
        }

        int k = choose.showOpenDialog(null);

        //The will open up directory based on what the user imputes in the textBox
        if(k == JFileChooser.APPROVE_OPTION) // If the file exists in the directory
        {
            l.setText(choose.getSelectedFile().getAbsolutePath());
        }else{
            l.setText("the user cancelled the operation");
        } 


    }
}
