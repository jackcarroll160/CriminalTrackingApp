import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class UserButtonOptions extends JDialog {

    private JButton btnCriminalSearch = new JButton("Criminal Search");
    private JButton btnCrimeSearch = new JButton("Crime Search");
    private JButton btnPOI = new JButton("Person of Interest Search");
    private JButton btnVictim = new JButton("Victim Search");
    private JButton btnWitness = new JButton("Witness Search");
    private JButton btnBack = new JButton("Back");

    public UserButtonOptions(Frame parent) {
        super(parent, "CriminalTrackingApp - Choose what you want to search", true);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints cs = new GridBagConstraints();

        cs.fill = GridBagConstraints.HORIZONTAL;

        // setting the color
        panel.setBorder(new LineBorder(Color.BLUE));

        // button functions
        btnCriminalSearch.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                setSearchName(e);
            }
        });
        btnCrimeSearch.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                setSearchName(e);
            }
        });
        btnPOI.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                setSearchName(e);
            }
        });
        btnVictim.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                setSearchName(e);
            }
        }); 
        
        btnWitness.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                setSearchName(e);
            }
        });

        btnBack.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                //setSearchName(e);
            }
        });

        // Displays Buttons; their layout; window size; location
        JPanel bp = new JPanel(new GridLayout(2, 3, 10, 5));
        bp.add(btnCriminalSearch);
        bp.add(btnCrimeSearch);
        bp.add(btnPOI);
        bp.add(btnVictim);
        bp.add(btnWitness);
        bp.add(btnBack);

        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(bp, BorderLayout.CENTER);

        backButtonFunction2();

        pack();
        setResizable(false);
        setSize(600, 400); //400x400 for search screen
        setLocationRelativeTo(null);

    } // END OF USEROPTIONS

    private void backButtonFunction2() {
        JFrame frame = new JFrame("Criminal Tracking App - Choose what you want to search");
        
        btnBack.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {                
                dispose();
                UserOptions userOp = new UserOptions(frame);
                setLocationRelativeTo(null);
                userOp.setVisible(true);
            }
        });
    }

    // set name based on button pressed 
    private void setSearchName(java.awt.event.ActionEvent evt) {
        SearchFunctionCriminal sfc;

        SearchFunctionCrime sfcrim;
        if (evt.getSource() == btnCriminalSearch) {
            sfc = new SearchFunctionCriminal("Criminal Search");
            sfc.setLocationRelativeTo(null);
        }
        else if (evt.getSource() == btnCrimeSearch) {
            sfcrim = new SearchFunctionCrime("Crime Search");
            sfcrim.setLocationRelativeTo(null);
        }
        else if (evt.getSource() == btnPOI) {
            sfc = new SearchFunctionCriminal("Person of Interest Search");
            sfc.setLocationRelativeTo(null);
        }
        else if (evt.getSource() == btnVictim) {
            sfc = new SearchFunctionCriminal("Victim Search");
            sfc.setLocationRelativeTo(null);
        }
        else if (evt.getSource() == btnWitness) {
            sfc = new SearchFunctionCriminal("Witness Search");
            sfc.setLocationRelativeTo(null);
        }
    } 

}
