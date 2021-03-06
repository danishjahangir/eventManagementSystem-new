/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;
import com.jtattoo.plaf.smart.SmartLookAndFeel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;

/**
 *
 * @author DanishJahangir
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form splashGUI
     */
    public Main() {
        initComponents();

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Library_File a = new Library_File();
        a.setStatusBar(statusPanel, statusLabel, this, "ems.png");
    }
    JPanel statusPanel = new JPanel();
    JLabel statusLabel = new JLabel("Ready");

    public void createStatusBar(JFrame jf) {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(":: EVENT MANAGEMENT SYSTEM ::");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jMenuBar1.setMargin(new java.awt.Insets(0, 2, 0, 0));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gallery/file.png"))); // NOI18N
        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenu1MouseExited(evt);
            }
        });
        jMenu1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jMenu1MouseMoved(evt);
            }
        });
        jMenu1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jMenu1FocusGained(evt);
            }
        });

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gallery/new.png"))); // NOI18N
        jMenuItem5.setText("New");
        jMenuItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItem5MouseExited(evt);
            }
        });
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gallery/exit.png"))); // NOI18N
        jMenuItem3.setText("Exit");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseExited(evt);
            }
        });
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gallery/event.gif"))); // NOI18N
        jMenu2.setText("Event");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenu2MouseExited(evt);
            }
        });
        jMenu2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jMenu2MouseMoved(evt);
            }
        });
        jMenu2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jMenu2FocusGained(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gallery/new.png"))); // NOI18N
        jMenuItem1.setText("Create New");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseExited(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gallery/Update.png"))); // NOI18N
        jMenuItem2.setText("Update / Delete");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseExited(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gallery/report.png"))); // NOI18N
        jMenu3.setText("Report");
        jMenu3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenu3MouseExited(evt);
            }
        });
        jMenu3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jMenu3MouseMoved(evt);
            }
        });

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gallery/generate-reports.png"))); // NOI18N
        jMenuItem7.setText("Generate Report");
        jMenuItem7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItem7MouseExited(evt);
            }
        });
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gallery/user.png"))); // NOI18N
        jMenu5.setText("User");
        jMenu5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenu5MouseExited(evt);
            }
        });
        jMenu5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jMenu5MouseMoved(evt);
            }
        });

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gallery/user_male_add.png"))); // NOI18N
        jMenuItem8.setText("Add New");
        jMenuItem8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItem8MouseExited(evt);
            }
        });
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gallery/user-male-delete.png"))); // NOI18N
        jMenuItem9.setText("Modify Existing");
        jMenuItem9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItem9MouseExited(evt);
            }
        });
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gallery/user-blue-edit.png"))); // NOI18N
        jMenuItem10.setText("change Password");
        jMenuItem10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItem10MouseExited(evt);
            }
        });
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gallery/folder-utilities.png"))); // NOI18N
        jMenu6.setText("Utilities");
        jMenu6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenu6MouseExited(evt);
            }
        });

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gallery/calculator.png"))); // NOI18N
        jMenuItem4.setText("calculator");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItem4MouseExited(evt);
            }
        });
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem4);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gallery/Tic-Tac-Toe-Game.png"))); // NOI18N
        jMenuItem15.setText("Game");
        jMenuItem15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItem15MouseExited(evt);
            }
        });
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem15);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gallery/help_about.png"))); // NOI18N
        jMenu7.setText("Help");
        jMenu7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenu7MouseExited(evt);
            }
        });

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setText("Help Contents");
        jMenuItem14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItem14MouseExited(evt);
            }
        });
        jMenu7.add(jMenuItem14);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setText("About");
        jMenuItem12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItem12MouseExited(evt);
            }
        });
        jMenu7.add(jMenuItem12);

        jMenuItem13.setText("Check for Updates");
        jMenuItem13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItem13MouseExited(evt);
            }
        });
        jMenu7.add(jMenuItem13);

        jMenuBar1.add(jMenu7);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gallery/exit.png"))); // NOI18N
        jMenu4.setText("Exit");
        jMenu4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenu4MouseExited(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gallery/logout-32.gif"))); // NOI18N
        jMenuItem6.setText("LogOut");
        jMenuItem6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItem6MouseExited(evt);
            }
        });
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gallery/exit.png"))); // NOI18N
        jMenuItem11.setText("Exit");
        jMenuItem11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItem11MouseExited(evt);
            }
        });
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1071, 594));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new createEvent().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
       
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jMenu1FocusGained

    }//GEN-LAST:event_jMenu1FocusGained

    private void jMenu2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jMenu2FocusGained

    }//GEN-LAST:event_jMenu2FocusGained

    private void jMenu1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseMoved

    }//GEN-LAST:event_jMenu1MouseMoved

    private void jMenu2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseMoved

    }//GEN-LAST:event_jMenu2MouseMoved

    private void jMenu3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseMoved

    }//GEN-LAST:event_jMenu3MouseMoved

    private void jMenu5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseMoved

    }//GEN-LAST:event_jMenu5MouseMoved

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked

    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseEntered
        statusLabel.setText("  FILE : All the general stuff.");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenu1MouseEntered

    private void jMenu1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseExited
        statusLabel.setText("");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenu1MouseExited

    private void jMenu2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseEntered
        statusLabel.setText("  EVENT : Creating and modifying events.");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenu2MouseEntered

    private void jMenu2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseExited
        statusLabel.setText("");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenu2MouseExited

    private void jMenu3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseEntered
        statusLabel.setText("  REPORT : Generating Reports for quick view.");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenu3MouseEntered

    private void jMenu3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseExited
        statusLabel.setText("");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenu3MouseExited

    private void jMenu5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseEntered
        statusLabel.setText("  USERS : Manages who uses the stuff.");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenu5MouseEntered

    private void jMenu5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseExited
        statusLabel.setText("");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenu5MouseExited

    private void jMenu4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseEntered
        statusLabel.setText("  EXIT Program.");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenu4MouseEntered

    private void jMenu4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseExited
        statusLabel.setText("");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenu4MouseExited

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
//        otherLib.Calculator cl = new otherLib.Calculator();
       otherLib.GUI cl = new otherLib.GUI();
       cl.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        new addUser().setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        new modifyUser().setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        new changePwd().setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new updateDeleteEvent().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new createEvent().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        new generateReport().setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        TicTacToeMain a = new TicTacToeMain();
        a.setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        login l = new login();
        this.setVisible(false);
        l.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenu6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseEntered
        statusLabel.setText("  UTILITIES : Extra utilities here.");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenu6MouseEntered

    private void jMenu6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseExited
        statusLabel.setText("");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenu6MouseExited

    private void jMenuItem4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MouseEntered
        statusLabel.setText(" CALCULATOR : Simple calculation Task to do.");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem4MouseEntered

    private void jMenuItem4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MouseExited
        statusLabel.setText("");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem4MouseExited

    private void jMenuItem15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem15MouseEntered
        statusLabel.setText(" GAME : Focus and mind game..");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem15MouseEntered

    private void jMenuItem15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem15MouseExited
        statusLabel.setText("");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem15MouseExited

    private void jMenu7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseEntered
        statusLabel.setText(" HELP : Option regrading help.");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenu7MouseEntered

    private void jMenu7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseExited
        statusLabel.setText("");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenu7MouseExited

    private void jMenuItem14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem14MouseEntered
        statusLabel.setText(" HELP CONTENT : Contents from help menu");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem14MouseEntered

    private void jMenuItem14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14MouseClicked

    private void jMenuItem14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem14MouseExited
        statusLabel.setText("");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem14MouseExited

    private void jMenuItem12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem12MouseEntered
        statusLabel.setText(" ABOUT : About the software.");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem12MouseEntered

    private void jMenuItem12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem12MouseExited
        statusLabel.setText("");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem12MouseExited

    private void jMenuItem13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem13MouseEntered
        statusLabel.setText(" CHECK FOR UPDATE : Check for new Updates.");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem13MouseEntered

    private void jMenuItem13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem13MouseExited
        statusLabel.setText("");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem13MouseExited

    private void jMenuItem5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MouseEntered
        statusLabel.setText(" NEW EVENT : Add/Create a new Event.");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem5MouseEntered

    private void jMenuItem5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MouseExited
        statusLabel.setText("");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem5MouseExited

    private void jMenuItem3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseEntered
        statusLabel.setText(" EXIT : Terminate the Program.");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem3MouseEntered

    private void jMenuItem11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem11MouseEntered
        statusLabel.setText(" EXIT : Terminate the Program.");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem11MouseEntered

    private void jMenuItem11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem11MouseExited
        statusLabel.setText("");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem11MouseExited

    private void jMenuItem3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseExited
        statusLabel.setText("");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem3MouseExited

    private void jMenuItem6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem6MouseEntered
        statusLabel.setText(" LOG-OUT : Log me out of here.");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem6MouseEntered

    private void jMenuItem6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem6MouseExited
        statusLabel.setText("");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem6MouseExited

    private void jMenuItem1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseEntered
        statusLabel.setText(" NEW EVENT : Add/Create a new Event.");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem1MouseEntered

    private void jMenuItem1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseExited
        statusLabel.setText("");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem1MouseExited

    private void jMenuItem2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseEntered
        statusLabel.setText(" UPDATE/DELETE : Update or Delete New Event.");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem2MouseEntered

    private void jMenuItem2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseExited
        statusLabel.setText("");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem2MouseExited

    private void jMenuItem7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem7MouseEntered
        statusLabel.setText(" GENERATE REPORT : Print the Report.");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem7MouseEntered

    private void jMenuItem7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem7MouseExited
        statusLabel.setText("");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem7MouseExited

    private void jMenuItem8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem8MouseEntered
        statusLabel.setText(" ADD NEW USER : Adding a user ");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem8MouseEntered

    private void jMenuItem8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem8MouseExited
        statusLabel.setText("");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem8MouseExited

    private void jMenuItem9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem9MouseEntered
        statusLabel.setText(" MODIFY EXISTING : Update, modify Users ");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem9MouseEntered

    private void jMenuItem9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem9MouseExited
        statusLabel.setText("");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem9MouseExited

    private void jMenuItem10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem10MouseEntered
        statusLabel.setText(" CHANGE PASSWORD : Change or Update Password.");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem10MouseEntered

    private void jMenuItem10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem10MouseExited
        statusLabel.setText("");
        statusPanel.add(statusLabel);
    }//GEN-LAST:event_jMenuItem10MouseExited

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
