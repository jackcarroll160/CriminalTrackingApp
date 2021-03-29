//package GUI_2;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.*;
 
public class LoginDialog extends JDialog {
 
    private JTextField tfUsername;
    private JTextField pfPassword;
    private JLabel lbUsername;
    private JLabel lbPassword;
    private JButton btnLogin;
    private JButton btnCancel;
    private boolean succeeded;
 
    public LoginDialog() {}
    public LoginDialog(Frame parent) {
        super(parent, "Login", true);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints cs = new GridBagConstraints();
 
        cs.fill = GridBagConstraints.HORIZONTAL;
 
        lbUsername = new JLabel("Username: ");
        cs.gridx = 0;
        cs.gridy = 0;
        cs.gridwidth = 1;
        panel.add(lbUsername, cs);
 
        tfUsername = new JTextField(20);
        cs.gridx = 1;
        cs.gridy = 0;
        cs.gridwidth = 2;
        panel.add(tfUsername, cs);
 
        lbPassword = new JLabel("Password: ");
        cs.gridx = 0;
        cs.gridy = 1;
        cs.gridwidth = 1;
        panel.add(lbPassword, cs);
 
        pfPassword = new JTextField(20);
        cs.gridx = 1;
        cs.gridy = 1;
        cs.gridwidth = 2;
        panel.add(pfPassword, cs);
        panel.setBorder(new LineBorder(Color.BLUE));
 
        /**
         * Login button on login prompt
         */
        btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
 
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

            public void actionPerformed(ActionEvent e) {
                try {  
                    if ((Users.getInstance().haveUser(tfUsername.getText(), pfPassword.getText()))) {
                        JOptionPane.showMessageDialog(LoginDialog.this, "Hi " + getUsername() + "! You have successfully logged in.", "Login", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                        succeeded = true;
                    } 
                    else// if(Login.authenticateNewUser(getUsername(), getPassword())) 
                    {
                        JOptionPane.showMessageDialog(LoginDialog.this, "Invalid username or password\n*Please try again*", "Login", JOptionPane.OK_CANCEL_OPTION);
                        // reset username and password
                        tfUsername.setText("");
                        pfPassword.setText("");
                        succeeded = false;
 
                    }
                } catch (HeadlessException e1) {
                    e1.printStackTrace();
                } catch (Exception e2)
                {
                    e2.printStackTrace();
                }
            }
        });

        btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        JPanel bp = new JPanel();
        bp.add(btnLogin);
        bp.add(btnCancel);
 
        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(bp, BorderLayout.PAGE_END);
        pack();
        setResizable(false);
        setLocationRelativeTo(parent);
    }
 
    
    /** 
     * @return String
     */
    public String getUsername() {
        return tfUsername.getText();
    }
 
    
    /** 
     * @return String
     */
    public String getPassword() {
        return pfPassword.getText();
    }
 
    
    /** 
     * @return boolean
     */
    public boolean isSucceeded() {
        return succeeded;
    }
}