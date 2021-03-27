import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SearchFunctionCrime extends JFrame {

    private JTextField nameSearch = new JTextField(30);
    private JButton searchButton = new JButton("Search");
    private JButton backButton = new JButton("Back");

    private JCheckBox checkBox = new JCheckBox("Crime Number");
    private JTable result = new JTable();
    private JPanel panel = new JPanel();

    public SearchFunctionCrime() {
        new DataLoader();
    }

    public SearchFunctionCrime(String title) throws HeadlessException {
        super(title);
        
        setSize(500, 500);
        setResizable(false);
        addComponents();
        backButtonFunction();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addComponents() {
        panel.add(nameSearch);
        panel.add(searchButton);
        panel.add(backButton);
        panel.add(checkBox);
        panel.setLayout(new FlowLayout());
        add(panel);
    }

    /**
     * Creates a new frame to go "back" to the main page
     * CHANGE BACK BUTTON FOR DIFFERENT FUNCTIONS
     */
    private void backButtonFunction() {
        JFrame frame = new JFrame("Criminal Tracking App - What would you like to do?");

        searchButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                searchCrimeJSON();
            }
        });

        backButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {                
                dispose();
                UserButtonOptions userOp = new UserButtonOptions(frame); //change this when ready
                setLocationRelativeTo(null);
                userOp.setVisible(true);
            }
        });
    }

    private void searchCrimeJSON() {

        //checking crime id
        if (checkBox.isSelected()) {
            for (Crime crime : CrimeList.getInstance().getCrimeList()) {
			    if(crime.getCrimeNum()== (Integer.parseInt(nameSearch.getText())))
			    {
                   // JScrollPane scrollPane = new JScrollPane();
                    int choice = JOptionPane.showConfirmDialog(null, crime.toString() + "\n\nDownload Information on this Crime?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        crime.Download(crime.getCrimeNum() + "CrimeReport");
                        JOptionPane.showMessageDialog(null, "Download Successful", "Crime Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                   
                }
		    }
        }

         else {
            JOptionPane.showMessageDialog(null, "User not found", "Error", JOptionPane.OK_OPTION);
        }
    }
    
}
