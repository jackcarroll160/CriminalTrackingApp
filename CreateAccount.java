//package jsonfiles;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class CreateAccount extends JFrame {
    private JButton btnCreate;
    private JButton btnCancel;
    private JTextField tfUsername;
    private JTextField pfPassword;
    private JLabel lblUsername;
    private JLabel lblPassword;
    //private DataWriter writer;


    public CreateAccount() throws IOException{
        super("Create Account");
        CreateAccountPanel();
        new DataWriter();
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
 
        pfPassword = new JTextField(20);
        cs.gridx = 1;
        cs.gridy = 1;
        cs.gridwidth = 2;
        createAccountPanel.add(pfPassword, cs);

        createAccountPanel.setBorder(new TitledBorder(new LineBorder(Color.BLUE), "Create a New Account!"));

        btnCreate = new JButton("Create");
        btnCreate.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                
                try { 
                    if (!(Users.getInstance().haveUser(tfUsername.getText()))) {
                        Users.getInstance().addUser(tfUsername.getText(), pfPassword.getText());

                        JOptionPane.showMessageDialog(null, "Account Created Successfully!");
                        dispose();
                        
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Sorry, that username is taken.\nPlease try a different name", "Create Account", JOptionPane.OK_OPTION);
                        tfUsername.setText("");
                        pfPassword.setText("");
                    }
                } catch (HeadlessException e1) {
                    e1.printStackTrace();
                } catch (Exception e2) {
                    e2.printStackTrace();
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

}