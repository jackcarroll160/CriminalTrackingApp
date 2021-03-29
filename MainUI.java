//package GUI_2;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;

public class MainUI {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        final JFrame frame = new JFrame("CriminalTrackingApp");
        final JButton btnLogin = new JButton("Login");
        final JButton btnCreateAccount = new JButton("Create a new account");
        final JButton btnQuit = new JButton("Quit");

        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LoginDialog loginDlg = new LoginDialog(frame);
                loginDlg.setVisible(true);
                // if logon successfully, go to user interface
                if (loginDlg.isSucceeded()) {
                    UserOptions userOp = new UserOptions(frame);
                    userOp.setVisible(true);
                }
            }
        });
        btnCreateAccount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CreateAccount account = null;
                try {
                    account = new CreateAccount();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                account.setVisible(true);
            }
        });
        btnQuit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(300, 110);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());
        frame.getContentPane().add(btnLogin);
        frame.getContentPane().add(btnCreateAccount);
        frame.getContentPane().add(btnQuit);
        frame.setVisible(true);
    }

}
