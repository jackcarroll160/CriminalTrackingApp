import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SearchFunctionWitness extends JFrame {

    private JTextField nameSearch = new JTextField(30);
    private JButton searchButton = new JButton("Search");
    private JButton backButton = new JButton("Back");
    private JCheckBox checkBox = new JCheckBox("First Name");
    private JCheckBox checkBox2 = new JCheckBox("Last Name");
    private JCheckBox checkBox3 = new JCheckBox("Age");
    private JCheckBox checkBox4 = new JCheckBox("Contact Info");
    private JCheckBox checkBox5 = new JCheckBox("is a minor");
    private JCheckBox checkBox6 = new JCheckBox("Location");
    private JCheckBox checkBox7 = new JCheckBox("Type of Witness");

    private JTable result = new JTable();
    private JPanel panel = new JPanel();

    public SearchFunctionWitness() {
        new DataLoader();
    }

    public SearchFunctionWitness(String title) throws HeadlessException {
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
                searchWitnessJSON();
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

    private void searchWitnessJSON() {

        //checking first name
        if (checkBox.isSelected()) {
            for (Witness witness : witnessList.getInstance().getWitnessList()) {
			    if(witness.getFirstName().equalsIgnoreCase(nameSearch.getText()))
			    {
				    int choice = JOptionPane.showConfirmDialog(null, witness.toString() + "\n\nDownload Information on this Criminal?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        witness.Download(witness.toString(), witness.getLastName() + "WitnessReport");
                        JOptionPane.showMessageDialog(null, "Download Successful", "Criminal Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                   
                }
		    }
        }

        //checking last name
        else if (checkBox2.isSelected()) {
            for (Witness witness : witnessList.getInstance().getWitnessList()) {
			    if(witness.getLastName().equalsIgnoreCase(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, witness.toString() + "\n\nDownload Information on this Criminal?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        witness.Download(witness.toString(), witness.getLastName() + "WitnessReport");
                        JOptionPane.showMessageDialog(null, "Download Successful", "Criminal Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                   
                }
		    }
        }

         //checking age
         else if (checkBox3.isSelected()) {
            for (Witness witness : witnessList.getInstance().getWitnessList()) {
			    if(witness.getAge() == Integer.parseInt(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, witness.toString() + "\n\nDownload Information on this Criminal?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        witness.Download(witness.toString(), witness.getLastName() + "WitnessReport");
                        JOptionPane.showMessageDialog(null, "Download Successful", "Criminal Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                   
                }
		    }
        }

         //checking contact info
         else if (checkBox4.isSelected()) {
            for (Witness witness : witnessList.getInstance().getWitnessList()) {
			    if(witness.getContactInfo().equalsIgnoreCase(nameSearch.getText()))
			    {
				    int choice = JOptionPane.showConfirmDialog(null, witness.toString() + "\n\nDownload Information on this Criminal?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        witness.Download(witness.toString(), witness.getLastName() + "WitnessReport");
                        JOptionPane.showMessageDialog(null, "Download Successful", "Criminal Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
		    }
        }
         //checking is minor
         else if (checkBox5.isSelected()) {
            for (Witness witness : witnessList.getInstance().getWitnessList()) {
			    if(witness.getIsMinor().equalsIgnoreCase(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, witness.toString() + "\n\nDownload Information on this Criminal?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        witness.Download(witness.toString(), witness.getLastName() + "WitnessReport");
                        JOptionPane.showMessageDialog(null, "Download Successful", "Criminal Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
		    }
        }
         //checking location
         else if (checkBox6.isSelected()) {
            for (Witness witness : witnessList.getInstance().getWitnessList()) {
			    if(witness.getLocation().equalsIgnoreCase(nameSearch.getText()))
			    {
				    int choice = JOptionPane.showConfirmDialog(null, witness.toString() + "\n\nDownload Information on this Criminal?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        witness.Download(witness.toString(), witness.getLastName() + "WitnessReport");
                        JOptionPane.showMessageDialog(null, "Download Successful", "Criminal Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
		    }
        }
         //checking type of witness
         else if (checkBox7.isSelected()) {
            for (Witness witness : witnessList.getInstance().getWitnessList()) {
			    if(witness.getTypeOfWitness().equalsIgnoreCase(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, witness.toString() + "\n\nDownload Information on this Criminal?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        witness.Download(witness.toString(), witness.getLastName() + "WitnessReport");
                        JOptionPane.showMessageDialog(null, "Download Successful", "Criminal Download", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
		    }
        }

        else {
            JOptionPane.showMessageDialog(null, "User not found", "Error", JOptionPane.OK_OPTION);
        }
    }
    
}
