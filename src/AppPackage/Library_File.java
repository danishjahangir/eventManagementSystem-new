package AppPackage;

import java.awt.BorderLayout;
import java.awt.Dimension;
import static java.awt.Frame.ICONIFIED;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Library_File {
    public static void main(String[] args) {
        
    }
    
    /* Global variables used for 
        storing mosue movements
          under frameDragged()
    */
    int xMouse;
    int yMouse;
    
    public void setStatusBar(JPanel statusPanel, JLabel statusLabel, JFrame frame, String iconImage)
    {
        frame.setLayout(new BorderLayout());
        // create the status bar panel and shove it down the bottom of the frame
        
        statusPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
        frame.add(statusPanel, BorderLayout.SOUTH);
        statusPanel.setPreferredSize(new Dimension(frame.getWidth(), 24));
        statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.X_AXIS));
        
        statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
        statusPanel.add(statusLabel);
        frame.setVisible(true);

        //sets the icon image on the frame.
        frame.setIconImage(new ImageIcon(getClass().getResource(iconImage)).getImage());
    }
    
    
    //This function will open the Website
    public void openWebsite(String url)
    {
        try {
            Process P;
            P = Runtime.getRuntime().exec("cmd /c start " +url);
        } catch (IOException e) {
            System.out.println("Error : " +e.getMessage());
        }
    }
    
    //Powerful function use to drag the frame
    public void frameDragged(String mousePosition , JFrame frame , java.awt.event.MouseEvent e )
    {
        if(mousePosition.equalsIgnoreCase("P"))
        {
            xMouse = e.getX();
            yMouse = e.getY();
        }
        else if(mousePosition.equalsIgnoreCase("D"))
        {
            int x = e.getXOnScreen();
            int y = e.getYOnScreen();
            
            frame.setLocation(x - xMouse , y - yMouse);
        }
    }
    
    //To set the menuBar image on the frame size 40x40
    public void setMenuBarIcon(JFrame frame, String imageName)
    {
        frame.setIconImage(new ImageIcon(getClass().getResource(imageName)).getImage());
    }
    
    //To minimze or maximize or exit the JFrame Window 
    public void minMaxExit(String option, JFrame frame)
    {
        if(option.equalsIgnoreCase("exit"))
        {
            System.exit(0);
        }
        else if(option.equalsIgnoreCase("min"))
        {
            frame.setState(ICONIFIED);
        }else if (option.equalsIgnoreCase("max"))
        {
            JOptionPane.showMessageDialog(null, "maximum size achieved or no permission to change");
        }
    }
    
    // Takes only number
    public void onlyNumbers(java.awt.event.KeyEvent e)
    {
        char c = e.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE))
        {
            e.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }
    
    // Takes only number and also restrict the input to max length
    public void onlyNumbers(JTextField jt, int max, java.awt.event.KeyEvent e) {
        char c = e.getKeyChar();
        if (jt.getText().length() == max || !(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            e.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }
    
    // Takes only characters
    public void onlyChar(java.awt.event.KeyEvent e)
    {
        char c = e.getKeyChar();
        if(Character.isDigit(c))
        {
            e.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }
    
    // Takes only characters and also restrict the input to max length
     public void onlyChar(JTextField jt, int max,java.awt.event.KeyEvent e)
    {
        char c = e.getKeyChar();
        if(jt.getText().length() == max ||Character.isDigit(c))
        {
            e.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }
    
    // Simple print using java own libraries 
    // Nothing fancy like Crystal Report, Jasper Report
    public void printJTable(JTable table)
    {
        MessageFormat header = new MessageFormat("TITLE");
        MessageFormat footer = new MessageFormat("END OF PAGE");
        
        try
        {
            table.print(JTable.PrintMode.NORMAL , header , footer);
        }
        catch(Exception e )
        {
            System.out.println("Cannot print : " +e.getMessage());
        }
    }
    
    // Simple print using java own libraries 
    // Nothing fancy like Crystal Report, Jasper Report
    public void printJTable(String title, JTable table)
    {
        MessageFormat header = new MessageFormat(title);
        MessageFormat footer = new MessageFormat("END OF PAGE");
        
        try
        {
            table.print(JTable.PrintMode.NORMAL , header , footer);
        }
        catch(Exception e )
        {
            System.out.println("Cannot print : " +e.getMessage());
        }
    }
    
    // Simple print using java own libraries 
    // Nothing fancy like Crystal Report, Jasper Report
    public void printJTable(String title, String footing, JTable table)
    {
        MessageFormat header = new MessageFormat(title);
        MessageFormat footer = new MessageFormat(footing);
        
        try
        {
            table.print(JTable.PrintMode.NORMAL , header , footer);
        }
        catch(Exception e )
        {
            System.out.println("Cannot print : " +e.getMessage());
        }
    }
    
    
    // To read a text file.
    public void readFile1(JTextArea showTextOn , JLabel filename) {
        try {
            FileFilter filter = new FileNameExtensionFilter("Text Files _", "txt", "inf", "cfg");

            JFileChooser chooser = new JFileChooser();
            chooser.addChoosableFileFilter(filter);
            int returnVal = chooser.showOpenDialog(null);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File myFile = chooser.getSelectedFile();
                String text = myFile + "";
                filename.setText("" +text);
                readFile(text,showTextOn);
            }
        } catch (Exception e) {
            System.out.println("ERROR = " + e.getMessage());
        }
    }
    public void readFile(String filename , JTextArea showTextOn) {
        String line = "";
        try 
        {
            File myFile = new File(filename);
            FileReader fr = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fr);

            while ((line = reader.readLine()) != null) 
            {
                //System.out.println(line);
                showTextOn.setText("" +line);
            }
        } 
        catch (Exception e) {
            System.out.println("ERROR = " + e.getMessage());
        }
    }
}
