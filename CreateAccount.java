//package jsonfiles;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.*;

public class CreateAccount extends JFrame {
    private JButton btnCreate;
    private JButton btnCancel;
    private JTextField tfUsername;
    private JPasswordField pfPassword;
    private JLabel lblUsername;
    private JLabel lblPassword;


    public CreateAccount(){
        super("Create Account");
        CreateAccountPanel();

        // add DataWriter "saveUsers()" here for writing JSON

    }

     /**
     * CreateAccountPanel method
     */
    private void CreateAccountPanel() {
        JPanel createAccountPanel = new JPanel(new GridBagLayout());
        GridBagConstraints cs = new GridBagConstraints();

        cs.fill = GridBagConstraints.BOTH;

        lblUsername = new JLabel("Username: ");
        cs.gridx = 0;
        cs.gridy = 0;
        cs.gridwidth = 1;
        createAccountPanel.add(lblUsername, cs);

        tfUsername = new JTextField(20);
        cs.gridx = 1;
        cs.gridy = 0;
        cs.gridwidth = 2;
        createAccountPanel.add(tfUsername, cs);

        lblPassword = new JLabel("Password: ");
        cs.gridx = 0;
        cs.gridy = 1;
        cs.gridwidth = 1;
        createAccountPanel.add(lblPassword, cs);
 
        pfPassword = new JPasswordField(20);
        cs.gridx = 1;
        cs.gridy = 1;
        cs.gridwidth = 2;
        createAccountPanel.add(pfPassword, cs);

        createAccountPanel.setBorder(new TitledBorder(new LineBorder(Color.BLUE), "Create a New Account!"));

        btnCreate = new JButton("Create");
        btnCreate.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                
                if (Login.authenticateNewUser(tfUsername.getText(), pfPassword.getPassword().toString())) {
                    JOptionPane.showMessageDialog(null, "Account Created Successfully!");
                    dispose();
                    //CreateAccountPanel();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Sorry, that username is taken!\nTry another name");
                    tfUsername.setText("");
                    pfPassword.setText("");
                }
            }
        });

        btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e) {
                int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel creating a new account?", 
                                    "Create New Account", JOptionPane.YES_NO_OPTION);
                if (option == 0)
                    dispose();
            }
        });

        JPanel addBtn = new JPanel();
        addBtn.add(btnCreate);
        addBtn.add(btnCancel);
        

        getContentPane().add(createAccountPanel, BorderLayout.CENTER);
        getContentPane().add(addBtn, BorderLayout.PAGE_END);
        pack();
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

  /**
   * Method to check username availability
   */

}