/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import javax.swing.UIManager;

/**
 *
 * @author www.ThePCWizard.in
 */
public class SplashDemo {

    public static SplashScreen loadingScreen;
    public static Double loadingTextArea;
    public static Double loadingProgressArea;
    public static Graphics2D loadingGraphics;
    public static Font myfont;

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                Properties props = new Properties();
                props.put("logoString", "DJ Soft");
                com.jtattoo.plaf.smart.SmartLookAndFeel.setCurrentTheme(props);
                UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // TODO code application logic here   
        loadingMethod();
        mainMethod();

        if (loadingScreen != null) {
            loadingScreen.close();
        }
    }

    public static void loadingMethod() {
        loadingScreen = SplashScreen.getSplashScreen();
        if (loadingScreen != null) {
            // if there are any problems displaying the splash this will be null

            //Dimension of your image
            Dimension dim = loadingScreen.getSize();
            int ht = dim.height;
            int wd = dim.width;
            //Placing textArea and progressArea
            loadingTextArea = new Rectangle2D.Double(15, ht * 0.7, wd * 0.4, 30);
            loadingProgressArea = new Rectangle2D.Double(15, ht * 0.85, wd * 0.4, 25);
            // create the Graphics environment for drawing status info
            loadingGraphics = loadingScreen.createGraphics();
            //Setting font for text in status info
            myfont = new Font("TimesRoman", Font.BOLD, 14);
            loadingGraphics.setFont(myfont);

        }
    }

    public static void loadingText(String string) {
        if (loadingScreen != null) {

            loadingGraphics.setPaint(Color.GRAY); //Color for the background of textArea
            loadingGraphics.fill(loadingTextArea);

            loadingGraphics.setPaint(Color.WHITE); //Color of the text
            loadingGraphics.drawString(string, (int) loadingTextArea.getX() + 10, (int) loadingTextArea.getY() + 20);

            loadingScreen.update();
        }
    }

    public static void loadingProgress(int prog) {
        if (loadingScreen != null) {
            //Color for the background of progressArea
            loadingGraphics.setPaint(Color.white);
            loadingGraphics.fill(loadingProgressArea);
            //Color for the border of progressArea
            loadingGraphics.setPaint(Color.GREEN);
            loadingGraphics.draw(loadingProgressArea);

            int x = (int) loadingProgressArea.getMinX();
            int y = (int) loadingProgressArea.getMinY();

            int width = (int) loadingProgressArea.getWidth();
            int height = (int) loadingProgressArea.getHeight();
            //Dividing by 50 because I would update the progress five times
            int doneProg = prog * width / 50;

            loadingGraphics.setPaint(Color.cyan);//Color for the total progress done
            loadingGraphics.fillRect(x, y + 1, doneProg, height);

            loadingScreen.update();
        }
    }

    public static void mainMethod() {
        String[] load = {"loading Resources...", "loading Libraries...", "loading UI...", "loading Modules...", "loading Resources...", "loading Libraries...", "loading UI...", "loading Modules...", "loading Resources...", "loading Libraries...", "done..."};
        for (int i = 1, j = 6; i <= 5; i++, j++) {
            loadingText("Loading Resources : " + load[i]);
            loadingText("Loading Resources : " + load[j]);
            loadingProgress(i * 10);

            try {
                // Create a URL for the desired page
                URL url = new URL("https://www.googe.com.pk");

                BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

                String str;
                while ((str = in.readLine()) != null) {
                    System.out.println(str);
                }
                in.close();
            } catch (MalformedURLException e) {
            } catch (IOException e) {
            }
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new login().setVisible(true);
            }
        });
    }
}
