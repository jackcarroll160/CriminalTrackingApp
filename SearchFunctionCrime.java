import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SearchFunctionCrime extends JFrame {

    private JTextField nameSearch = new JTextField(30);
    private JButton searchButton = new JButton("Search");
    private JButton backButton = new JButton("Back");
    private JCheckBox checkBox = new JCheckBox("Crime ID");
    private JCheckBox checkBox2 = new JCheckBox("Criminal ID");
    private JCheckBox checkBox3 = new JCheckBox("Description");
    private JCheckBox checkBox4 = new JCheckBox("Date & Time");
    private JCheckBox checkBox5 = new JCheckBox("Case Open");
    private JCheckBox checkBox6 = new JCheckBox("Witnesses");
    private JCheckBox checkBox7 = new JCheckBox("Victims");
    private JCheckBox checkBox8 = new JCheckBox("Suspects");
    private JCheckBox checkBox9 = new JCheckBox("Person of Interest");
    private JCheckBox checkBox10 = new JCheckBox("Officers");
    private JCheckBox checkBox11 = new JCheckBox("Crime Number");
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
        panel.add(checkBox11);
        panel.add(checkBox);
        panel.add(checkBox2);
        panel.add(checkBox3);
        panel.add(checkBox4);
        panel.add(checkBox5);
        panel.add(checkBox6);
        panel.add(checkBox7);
        panel.add(checkBox8);
        panel.add(checkBox9);
        panel.add(checkBox10);
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

        //checking crime number
        if (checkBox11.isSelected()) {
            for (Crime crime : CrimeList.getInstance().getCrimeList()) {
			    if(crime.getCrimeNum() == (Integer.parseInt(nameSearch.getText())))
			    {
				    int choice = JOptionPane.showConfirmDialog(null, crime.toString() + "\n\nDownload Information on this Crime?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        crime.Download(crime.toString(), crime.getCrimeNum() + "CrimeReport");
                        JOptionPane.showMessageDialog(null, "Download Successful", "Crime Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                   
                }
		    }
        }

        //checking crime id
        else if (checkBox.isSelected()) {
            for (Crime crime : CrimeList.getInstance().getCrimeList()) {
			    if(crime.getCrimeId().equals(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, crime.toString() + "\n\nDownload Information on this Crime?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        crime.Download(crime.toString(), crime.getCrimeNum() + "CrimeReport");
                        JOptionPane.showMessageDialog(null, "Download Successful", "Crime Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                   
                }
		    }
        }

         //checking criminal id
         else if (checkBox2.isSelected()) {
            for (Crime crime : CrimeList.getInstance().getCrimeList()) {
			    if(crime.getCriminalID().equals(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, crime.toString() + "\n\nDownload Information on this Crime?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        crime.Download(crime.toString(), crime.getCrimeNum()+"CrimeReport");
                        JOptionPane.showMessageDialog(null, "Download Successful", "Crime Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                   
                }
		    }
        }

         //checking description
         else if (checkBox3.isSelected()) {
            for (Crime crime : CrimeList.getInstance().getCrimeList()) {
			    if(crime.getDescription().equalsIgnoreCase(nameSearch.getText()))
			    {
				    int choice = JOptionPane.showConfirmDialog(null, crime.toString() + "\n\nDownload Information on this Crime?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        crime.Download(crime.toString(), crime.getCrimeNum() + "CrimeReport");
                        JOptionPane.showMessageDialog(null, "Download Successful", "Crime Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
		    }
        }
         //checking date & time
         else if (checkBox4.isSelected()) {
            for (Crime crime : CrimeList.getInstance().getCrimeList()) {
			    if(crime.getDateOfCrime().equalsIgnoreCase(nameSearch.getText()) || crime.getTimeOfCrime().equalsIgnoreCase(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, crime.toString() + "\n\nDownload Information on this Crime?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        crime.Download(crime.toString(), crime.getCrimeNum() + "CrimeReport");
                        JOptionPane.showMessageDialog(null, "Download Successful", "Crime Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
		    }
        }
         //checking case open
         else if (checkBox5.isSelected()) {
            for (Crime crime : CrimeList.getInstance().getCrimeList()) {
			    if(crime.isCaseOpen().equalsIgnoreCase(nameSearch.getText()))
			    {
				    int choice = JOptionPane.showConfirmDialog(null, crime.toString() + "\n\nDownload Information on this Crime?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        crime.Download(crime.toString(), crime.getCrimeNum() + "CrimeReport");
                        JOptionPane.showMessageDialog(null, "Download Successful", "Crime Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
		    }
        }
         //checking witnesses
         else if (checkBox6.isSelected()) {
            for (Crime crime : CrimeList.getInstance().getCrimeList()) {
			    if(crime.getWitnesses().equals(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, crime.toString() + "\n\nDownload Information on this Crime?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        crime.Download(crime.toString(), crime.getCrimeNum()+ "CrimeReport");
                        JOptionPane.showMessageDialog(null, "Download Successful", "Crime Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
		    }
        }
         //checking victims
         else if (checkBox7.isSelected()) {
            for (Crime crime : CrimeList.getInstance().getCrimeList()) {
			    if(crime.getVictims().equals(nameSearch.getText()))
			    {
				    int choice = JOptionPane.showConfirmDialog(null, crime.toString() + "\n\nDownload Information on this Crime?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        crime.Download(crime.toString(), crime.getCrimeNum()+ "CrimeReport");
                        JOptionPane.showMessageDialog(null, "Download Successful", "Crime Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
		    }
        }
         //checking suspects
         else if (checkBox8.isSelected()) {
            for (Crime crime : CrimeList.getInstance().getCrimeList()) {
			    if(crime.getSuspects().equals(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, crime.toString() + "\n\nDownload Information on this Crime?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        crime.Download(crime.toString(), crime.getCrimeNum() + "CrimeReport");
                        JOptionPane.showMessageDialog(null, "Download Successful", "Crime Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
		    }
        }
         //checking person of interest
         else if (checkBox9.isSelected()) {
            for (Crime crime : CrimeList.getInstance().getCrimeList()) {
			    if(crime.getPersonOfInterest().equals(nameSearch.getText()))
			    {
				    int choice = JOptionPane.showConfirmDialog(null, crime.toString() + "\n\nDownload Information on this Crime?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        crime.Download(crime.toString(), crime.getCrimeNum() + "CrimeReport");
                        JOptionPane.showMessageDialog(null, "Download Successful", "Crime Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                   
                }
		    }
        }
         //checking officers
         else if (checkBox10.isSelected()) {
            for (Crime crime : CrimeList.getInstance().getCrimeList()) {
			    if(crime.getOfficers().equalsIgnoreCase(nameSearch.getText()))
			    {
				    int choice = JOptionPane.showConfirmDialog(null, crime.toString() + "\n\nDownload Information on this Crime?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        crime.Download(crime.toString(), crime.getCrimeNum() + "CrimeReport");
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
