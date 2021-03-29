import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class AddReportFunction extends JDialog {

    private JButton btnCriminalSearch = new JButton("Add Criminal Report");
    private JButton btnCrimeSearch = new JButton("Add Crime Report");
    private JButton btnPOI = new JButton("Add POI Report");
    private JButton btnVictim = new JButton("Add Victim Report");
    private JButton btnWitness = new JButton("Add Witness Report");
    private JButton btnSuspect = new JButton("Add Suspect Report");
    private JButton btnBack = new JButton("Back");

    public AddReportFunction(Frame parent) {
        super(parent, "CriminalTrackingApp - Choose what you want to add", true);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints cs = new GridBagConstraints();

        cs.fill = GridBagConstraints.HORIZONTAL;

        // setting the color
        panel.setBorder(new LineBorder(Color.BLUE));

        // button functions
        btnCriminalSearch.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                addReport(e);
            }
        });
        btnCrimeSearch.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                addReport(e);
            }
        });
        btnPOI.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                addReport(e);
            }
        });
        btnVictim.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                addReport(e);
            }
        }); 
        
        btnWitness.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                addReport(e);
            }
        });

        btnSuspect.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                addReport(e);
            }
        });
        btnBack.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        // Displays Buttons; their layout; window size; location
        JPanel bp = new JPanel(new GridLayout(3, 3, 10, 5));
        bp.add(btnCriminalSearch);
        bp.add(btnCrimeSearch);
        bp.add(btnPOI);
        bp.add(btnVictim);
        bp.add(btnWitness);
        bp.add(btnSuspect);
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

    
    /** 
     * @param evt
     */
    // set name based on button pressed 
    private void addReport(java.awt.event.ActionEvent evt) {
        AddFunctionCriminal afc;
        AddFunctionCrime afcrime;
        AddFunctionVictim afv;
        AddFunctionWitness afw;
        AddFunctionPOI afpoi;
        AddFunctionSuspect afs;
        if (evt.getSource() == btnCriminalSearch) {
            afc = new AddFunctionCriminal("Add Criminal Report");
            afc.setLocationRelativeTo(null);
        }
        else if (evt.getSource() == btnCrimeSearch) {
            afcrime = new AddFunctionCrime("Add Crime Report");
            afcrime.setLocationRelativeTo(null);
        }
        else if (evt.getSource() == btnPOI) {
            afpoi = new AddFunctionPOI("Person of Interest Search");
            afpoi.setLocationRelativeTo(null);
        }
        else if (evt.getSource() == btnVictim) {
            afv = new AddFunctionVictim("Add Victim Report");
            afv.setLocationRelativeTo(null);
        }
        else if (evt.getSource() == btnWitness) {
            afw = new AddFunctionWitness("Add Witness Report");
            afw.setLocationRelativeTo(null);
        }
        else if (evt.getSource() == btnSuspect) {
            afs = new AddFunctionSuspect("Add Suspect Report");
            afs.setLocationRelativeTo(null);
        }
        
    } 

}
