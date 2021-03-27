import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SearchFunctionVictim extends JFrame {

    private JTextField nameSearch = new JTextField(30);
    private JButton searchButton = new JButton("Search");
    private JButton backButton = new JButton("Back");
    private JCheckBox checkBox = new JCheckBox("First Name");
    private JCheckBox checkBox2 = new JCheckBox("Last Name");
    private JCheckBox checkBox3 = new JCheckBox("Age");
    private JCheckBox checkBox4 = new JCheckBox("Contact Information");
    private JCheckBox checkBox5 = new JCheckBox("Is Minor");
    private JCheckBox checkBox6 = new JCheckBox("Is Alive");
    private JCheckBox checkBox7 = new JCheckBox("Is Injured");
    private JTable result = new JTable();
    private JPanel panel = new JPanel();

    public SearchFunctionVictim() {
        new DataLoader();
    }

    public SearchFunctionVictim(String title) throws HeadlessException {
        super(title);
        
        setSize(500, 500);
        setResizable(false);
        addComponents();
        backButtonFunction();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       // setTable(); //change this later to set names from JSON
        setVisible(true);
    }

    private void addComponents() {
        panel.add(nameSearch);
        panel.add(searchButton);
        panel.add(backButton);
        panel.add(checkBox);
        panel.add(checkBox2);
        panel.add(checkBox3);
        panel.add(checkBox4);
        panel.add(checkBox5);
        panel.add(checkBox6);
        panel.add(checkBox7);
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
                searchVictimJSON();
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

    private void searchVictimJSON() {

        //checking first name
        if (checkBox.isSelected()) {
            for (Victim victim : victimsList.getInstance().getVictimList()) {
			    if(victim.getFirstName().equalsIgnoreCase(nameSearch.getText()))
			    {
				    int choice = JOptionPane.showConfirmDialog(null, victim.toString() + "\n\nDownload Information on this Victim?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        victim.Download(victim.toString(),victim.getFirstName()+victim.getLastName());
                        JOptionPane.showMessageDialog(null, "Download Successful", "Victim Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                   
                }
		    }
        }
      
        //checking last name
        else if (checkBox2.isSelected()) {
            for (Victim victim : victimsList.getInstance().getVictimList()) {
			    if(victim.getLastName().equalsIgnoreCase(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, victim.toString() + "\n\nDownload Information on this Victim?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        victim.Download(victim.toString(),victim.getFirstName()+victim.getLastName());
                        JOptionPane.showMessageDialog(null, "Download Successful", "Victim Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                   
                }
		    }
        }

         //checking last name
         else if (checkBox3.isSelected()) {
            for (Victim victim : victimsList.getInstance().getVictimList()) {
			    if(victim.getAge() == (Integer.parseInt(nameSearch.getText())))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, victim.toString() + "\n\nDownload Information on this Victim?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        victim.Download(victim.toString(),victim.getFirstName()+victim.getLastName());
                        JOptionPane.showMessageDialog(null, "Download Successful", "Victim Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                   
                }
		    }
        }

         //checking last name
         else if (checkBox4.isSelected()) {
            for (Victim victim : victimsList.getInstance().getVictimList()) {
			    if(victim.getContactInfo().equalsIgnoreCase(nameSearch.getText()))
			    {
				    int choice = JOptionPane.showConfirmDialog(null, victim.toString() + "\n\nDownload Information on this Victim?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        victim.Download(victim.toString(),victim.getFirstName()+victim.getLastName());
                        JOptionPane.showMessageDialog(null, "Download Successful", "Victim Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
		    }
        }
         //checking last name
         else if (checkBox5.isSelected()) {
            for (Victim victim : victimsList.getInstance().getVictimList()) {
			    if(victim.getIsMinor().equalsIgnoreCase(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, victim.toString() + "\n\nDownload Information on this Victim?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        victim.Download(victim.toString(),victim.getFirstName()+victim.getLastName());
                        JOptionPane.showMessageDialog(null, "Download Successful", "Victim Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
		    }
        }
         //checking last name
         else if (checkBox6.isSelected()) {
            for (Victim victim : victimsList.getInstance().getVictimList()) {
			    if(victim.isAlive().equalsIgnoreCase(nameSearch.getText()))
			    {
				    int choice = JOptionPane.showConfirmDialog(null, victim.toString() + "\n\nDownload Information on this Victim?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        victim.Download(victim.toString(),victim.getFirstName()+victim.getLastName());
                        JOptionPane.showMessageDialog(null, "Download Successful", "Victim Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
		    }
        }
         //checking last name
         else if (checkBox7.isSelected()) {
            for (Victim victim : victimsList.getInstance().getVictimList()) {
			    if(victim.isInjured().equalsIgnoreCase(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, victim.toString() + "\n\nDownload Information on this Victim?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        victim.Download(victim.toString(),victim.getFirstName()+victim.getLastName());
                        JOptionPane.showMessageDialog(null, "Download Successful", "Victim Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
		    }
        }
        

        else {
            JOptionPane.showMessageDialog(null, "User not found", "Error", JOptionPane.OK_OPTION);
        }
    }
    
}
