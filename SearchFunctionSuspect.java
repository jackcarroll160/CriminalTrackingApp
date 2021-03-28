import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SearchFunctionSuspect extends JFrame {

    private JTextField nameSearch = new JTextField(30);
    private JButton searchButton = new JButton("Search");
    private JButton backButton = new JButton("Back");
    private JCheckBox checkBox = new JCheckBox("First Name");
    private JCheckBox checkBox2 = new JCheckBox("Last Name");
    private JCheckBox checkBox3 = new JCheckBox("Age");
    private JCheckBox checkBox4 = new JCheckBox("Gender");
    private JCheckBox checkBox5 = new JCheckBox("Ethnicity");
    private JCheckBox checkBox6 = new JCheckBox("Contact Information");
    private JCheckBox checkBox7 = new JCheckBox("Is Minor");
    private JCheckBox checkBox8 = new JCheckBox("Has Alibi");
    private JCheckBox checkBox9 = new JCheckBox("Eye Color");
    private JCheckBox checkBox10 = new JCheckBox("Hair Decription");
    private JCheckBox checkBox11 = new JCheckBox("Height");
    private JCheckBox checkBox12 = new JCheckBox("Weight");
    private JCheckBox checkBox13 = new JCheckBox("Tattoo Description");
    private JCheckBox checkBox15 = new JCheckBox("Physical Build");
    private JCheckBox checkBox16 = new JCheckBox("Vehicle Description");
    private JTable result = new JTable();
    private JPanel panel = new JPanel();

    public SearchFunctionSuspect() {
        new DataLoader();
    }

    public SearchFunctionSuspect(String title) throws HeadlessException {
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
        panel.add(checkBox8);
        panel.add(checkBox9);
        panel.add(checkBox10);
        panel.add(checkBox11);
        panel.add(checkBox12);
        panel.add(checkBox13);
        panel.add(checkBox15);
        panel.add(checkBox16);
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
                searchSuspectJSON();
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

    private void searchSuspectJSON() {

        //checking first name
        if (checkBox.isSelected()) {
            for (Suspect suspect : suspectsList.getInstance().getSuspectList()) {
			    if(suspect.getFirstName().equalsIgnoreCase(nameSearch.getText()))
			    {
				    int choice = JOptionPane.showConfirmDialog(null, suspect.toString() + "\n\nDownload Information on this Suspect?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        suspect.Download(suspect.toString(),suspect.getFirstName()+suspect.getLastName());
                        JOptionPane.showMessageDialog(null, "Download Successful", "Suspect Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                   
                }
		    }
        }
      
        //checking last name
        else if (checkBox2.isSelected()) {
            for (Suspect suspect : suspectsList.getInstance().getSuspectList()) {
			    if(suspect.getLastName().equalsIgnoreCase(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, suspect.toString() + "\n\nDownload Information on this Suspect?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        suspect.Download(suspect.toString(),suspect.getFirstName()+suspect.getLastName());
                        JOptionPane.showMessageDialog(null, "Download Successful", "Suspect Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                   
                }
		    }
        }

         //checking last name
         else if (checkBox3.isSelected()) {
            for (Suspect suspect : suspectsList.getInstance().getSuspectList()) {
			    if(suspect.getAge() == (Integer.parseInt(nameSearch.getText())))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, suspect.toString() + "\n\nDownload Information on this Suspect?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        suspect.Download(suspect.toString(),suspect.getFirstName()+suspect.getLastName());
                        JOptionPane.showMessageDialog(null, "Download Successful", "Suspect Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                   
                }
		    }
        }

         //checking last name
         else if (checkBox4.isSelected()) {
            for (Suspect suspect : suspectsList.getInstance().getSuspectList()) {
			    if(suspect.getGender().equalsIgnoreCase(nameSearch.getText()))
			    {
				    int choice = JOptionPane.showConfirmDialog(null, suspect.toString() + "\n\nDownload Information on this Suspect?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        suspect.Download(suspect.toString(),suspect.getFirstName()+suspect.getLastName());
                        JOptionPane.showMessageDialog(null, "Download Successful", "Suspect Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
		    }
        }
         //checking last name
         else if (checkBox5.isSelected()) {
            for (Suspect suspect : suspectsList.getInstance().getSuspectList()) {
			    if(suspect.getEthnicity().equalsIgnoreCase(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, suspect.toString() + "\n\nDownload Information on this Suspect?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        suspect.Download(suspect.toString(),suspect.getFirstName()+suspect.getLastName());
                        JOptionPane.showMessageDialog(null, "Download Successful", "Suspect Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
		    }
        }
         //checking last name
         else if (checkBox6.isSelected()) {
            for (Suspect suspect : suspectsList.getInstance().getSuspectList()) {
			    if(suspect.getContactInfo().equalsIgnoreCase(nameSearch.getText()))
			    {
				    int choice = JOptionPane.showConfirmDialog(null, suspect.toString() + "\n\nDownload Information on this Suspect?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        suspect.Download(suspect.toString(),suspect.getFirstName()+suspect.getLastName());
                        JOptionPane.showMessageDialog(null, "Download Successful", "Suspect Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
		    }
        }
         //checking last name
         else if (checkBox7.isSelected()) {
            for (Suspect suspect : suspectsList.getInstance().getSuspectList()) {
			    if(suspect.getIsMinor().equalsIgnoreCase(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, suspect.toString() + "\n\nDownload Information on this Suspect?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        suspect.Download(suspect.toString(),suspect.getFirstName()+suspect.getLastName());
                        JOptionPane.showMessageDialog(null, "Download Successful", "Suspect Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
		    }
        }
        else if (checkBox8.isSelected()) {
            for (Suspect suspect : suspectsList.getInstance().getSuspectList()) {
			    if(suspect.getHasAlibi().equalsIgnoreCase(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, suspect.toString() + "\n\nDownload Information on this Suspect?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        suspect.Download(suspect.toString(),suspect.getFirstName()+suspect.getLastName());
                        JOptionPane.showMessageDialog(null, "Download Successful", "Suspect Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
		    }
        }
        else if (checkBox9.isSelected()) {
            for (Suspect suspect : suspectsList.getInstance().getSuspectList()) {
			    if(suspect.getEyeColor().equalsIgnoreCase(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, suspect.toString() + "\n\nDownload Information on this Suspect?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        suspect.Download(suspect.toString(),suspect.getFirstName()+suspect.getLastName());
                        JOptionPane.showMessageDialog(null, "Download Successful", "Suspect Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
		    }
        }
        else if (checkBox10.isSelected()) {
            for (Suspect suspect : suspectsList.getInstance().getSuspectList()) {
			    if(suspect.getHairDescription().equalsIgnoreCase(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, suspect.toString() + "\n\nDownload Information on this Suspect?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        suspect.Download(suspect.toString(),suspect.getFirstName()+suspect.getLastName());
                        JOptionPane.showMessageDialog(null, "Download Successful", "Suspect Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
		    }
        }
        else if (checkBox11.isSelected()) {
            for (Suspect suspect : suspectsList.getInstance().getSuspectList()) {
			    if(suspect.getHeight().equalsIgnoreCase(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, suspect.toString() + "\n\nDownload Information on this Suspect?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        suspect.Download(suspect.toString(),suspect.getFirstName()+suspect.getLastName());
                        JOptionPane.showMessageDialog(null, "Download Successful", "Suspect Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
		    }
        }
        else if (checkBox12.isSelected()) {
            for (Suspect suspect : suspectsList.getInstance().getSuspectList()) {
			    if(suspect.getWeight().equalsIgnoreCase(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, suspect.toString() + "\n\nDownload Information on this Suspect?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        suspect.Download(suspect.toString(),suspect.getFirstName()+suspect.getLastName());
                        JOptionPane.showMessageDialog(null, "Download Successful", "Suspect Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
		    }
        }
         else if (checkBox13.isSelected()) {
            for (Suspect suspect : suspectsList.getInstance().getSuspectList()) {
			    if(suspect.getTattooDescription().equalsIgnoreCase(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, suspect.toString() + "\n\nDownload Information on this Suspect?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        suspect.Download(suspect.toString(),suspect.getFirstName()+suspect.getLastName());
                        JOptionPane.showMessageDialog(null, "Download Successful", "Suspect Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
		    }
        }
       
        else if (checkBox15.isSelected()) {
            for (Suspect suspect : suspectsList.getInstance().getSuspectList()) {
			    if(suspect.getPhysicalBuild().equalsIgnoreCase(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, suspect.toString() + "\n\nDownload Information on this Suspect?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        suspect.Download(suspect.toString(),suspect.getFirstName()+suspect.getLastName());
                        JOptionPane.showMessageDialog(null, "Download Successful", "Suspect Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
		    }
        }
        else if (checkBox16.isSelected()) {
            for (Suspect suspect : suspectsList.getInstance().getSuspectList()) {
			    if(suspect.getVehicleDescription().equalsIgnoreCase(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, suspect.toString() + "\n\nDownload Information on this Suspect?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        suspect.Download(suspect.toString(),suspect.getFirstName()+suspect.getLastName());
                        JOptionPane.showMessageDialog(null, "Download Successful", "Suspect Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
		    }
        }
        

        else {
            JOptionPane.showMessageDialog(null, "User not found", "Error", JOptionPane.OK_OPTION);
        }
    }
    
}
