package otherLib;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


public class MarqueeTest {

    private void display() {
        JFrame f = new JFrame("MarqueeTest");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String s = "Tomorrow, and tomorrow, and tomorrow, "
        + "creeps in this petty pace from day to day, "
        + "to the last syllable of recorded time; ... "
        + "It is a tale told by an idiot, full of "
        + "sound and fury signifying nothing.";

        JLabel lbl_addBatch = new JLabel();
        JPanel pnl_addBatch = new JPanel();
        pnl_addBatch.add(lbl_addBatch);

        Marquee marquee = new Marquee(lbl_addBatch, s, 5);
        marquee.start();

        f.add(pnl_addBatch);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new MarqueeTest().display();
            }
        });
    }
}

class Marquee implements ActionListener {

    private static final int RATE = 12;
    private final Timer timer = new Timer(1000 / RATE, this);
    private final JLabel label;
    private final String s;
    private final int n;
    private int index;

    public Marquee(JLabel label, String s, int n) {
        if (s == null || n < 1) {
            throw new IllegalArgumentException("Null string or n < 1");
        }
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            sb.append(' ');
        }
        this.label = label;
        this.s = sb + s + sb;
        this.n = n;
        label.setFont(new Font("Serif", Font.ITALIC, 36));
        label.setText(sb.toString());
    }

    public void start() {
        timer.start();
    }

    public void stop() {
        timer.stop();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        index++;
        if (index > s.length() - n) {
            index = 0;
        }
        label.setText(s.substring(index, index + n));
    }
}