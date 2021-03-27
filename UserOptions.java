//package GUI_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class UserOptions extends JDialog {

    private JButton btnSearchDatabase = new JButton("Search Database");
    private JButton btnAdd = new JButton("Add New Report");
    private JButton btnRemove = new JButton("Remove Old Report");
    //private JButton btnEdit = new JButton("Edit Existing Report");
    private JButton btnLogout = new JButton("Logout");

    public UserOptions(Frame parent) {
        super(parent, "CriminalTrackingApp - What would you like to do?", true);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints cs = new GridBagConstraints();

        cs.fill = GridBagConstraints.HORIZONTAL;

        // setting the color
        panel.setBorder(new LineBorder(Color.BLUE));

        // button functions
        btnSearchDatabase.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                UserButtonOptions btnOp = new UserButtonOptions(parent);
                pack();
                btnOp.setVisible(true);
                setLocationRelativeTo(null);
                //setSearchName(e);
            }
        });
        btnAdd.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                AddReportFunction arf = new AddReportFunction(parent);
                pack();
                arf.setVisible(true);
                setLocationRelativeTo(null);
                //addReport(e);
            }

        });
        /*btnRemove.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                setSearchName(e);
            }
        });*/
        /*btnEdit.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                setSearchName(e);
            }
        }); */
        
        btnLogout.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        // Displays Buttons; their layout; window size; location
        JPanel bp = new JPanel(new GridLayout(3, 1, 10, 5));
        bp.add(btnSearchDatabase);
        bp.add(btnAdd);
        //bp.add(btnRemove);
        //bp.add(btnEdit);
        bp.add(btnLogout);

        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(bp, BorderLayout.CENTER);

        pack();
        setResizable(false);
        setSize(400, 400); //400x400
        setLocationRelativeTo(null);

    } // END OF USEROPTIONS
    
    // set name based on button pressed 
    /*private void setSearchName(java.awt.event.ActionEvent evt) {
        SearchFunctionCriminal sf;
        AddReportFunction arf;
        if (evt.getSource() == btnSearchDatabase) {
            sf = new SearchFunctions("CRIMINAL TEST");
            sf.setLocationRelativeTo(null);
        }
        if (evt.getSource() == btnAdd) {
            arf = new AddReportFunction("TEST HERE Add New Report");
            arf.setLocationRelativeTo(null);
        }
        if (evt.getSource() == btnRemove) {
            sf = new SearchFunctionCriminal("TEST HERE Remove Old Report");
            sf.setLocationRelativeTo(null);
        }
        else if (evt.getSource() == btnEdit) {
            sf = new SearchFunctionCriminal("TEST HERE Edit Existing Report");
            sf.setLocationRelativeTo(null);
        }
    } */

}
