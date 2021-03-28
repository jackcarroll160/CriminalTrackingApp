import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddFunctionCrime extends JFrame {
    String description = "";
    String date = "";
    String time = "";
    String caseOpen = "";
    int crimeNumber = 0;
    String witnessName = "";
    String victimName = "";
    String suspectName = "";
    String poiName = "";
    
    private JTextField addItem = new JTextField(30);
    private JButton addButton = new JButton("Add");
    private JButton backButton = new JButton("Cancel");
    private JTable result = new JTable();
    private JPanel panel = new JPanel();
    public int count = 0;
    public String[] crimeItems = {"First Name", "Last Name", "Nickname", "Age", "Gender", "Ethnicity", "Contact Info", 
                                        "Linked Crime", "Crime ID", "Birth Date", "Eye Color", "Hair Description", "Hair Color", "Facial Hair Description", 
                                        "Height", "Weight", "Tattoo Description", "Physical Marks Description", "Physical Build", "Weapon Description", "Complexion", 
                                        "Clothing Description", "Vehicle Description"};

    public AddFunctionCrime() {
        //CreateCriminalAdd();
        new DataLoader();
    }

    public AddFunctionCrime(String title) throws HeadlessException {
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
        panel.add(addItem);
        addItem.setText("Enter First Name here...");
        panel.add(addButton);
        panel.add(backButton);
        panel.setLayout(new FlowLayout());
        add(panel);
    }

    //


    /**
     * Creates a new frame to go "back" to the main page
     * CHANGE BACK BUTTON FOR DIFFERENT FUNCTIONS
     */
    private void backButtonFunction() {
        JFrame frame = new JFrame("Criminal Tracking App - What would you like to do?");
       
        addButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                
                    if(count == 0)
                        firstName = addItem.getText();
                    else if(count == 1)
                        lastName = addItem.getText();
                    else if(count == 2)
                        nickname = addItem.getText();
                    else if(count == 3)
                        age = Integer.parseInt(addItem.getText());
                    else if(count == 4)
                        gender = addItem.getText();
                    else if(count == 5)
                        ethnicity = addItem.getText();
                    else if(count == 6)
                        contactInfo = addItem.getText();
                    else if(count == 7)
                        linkedCrime = addItem.getText();
                    else if(count == 8)
                        crimeID = addItem.getText();
                    else if(count == 9)
                        birthDate = addItem.getText();
                    else if(count == 10)
                        eyeColor = addItem.getText();
                    else if(count == 11)
                        hairDescription = addItem.getText();
                    else if(count == 12)
                        hairColor = addItem.getText();
                    else if(count == 13)
                        facialHairDescription = addItem.getText();
                    else if(count == 14)
                        hght = addItem.getText();
                    else if(count == 15)
                        weight = addItem.getText();
                    else if(count == 16)
                        tattooDescription = addItem.getText();
                    else if(count == 17)
                        physicalMarkDescription = addItem.getText();
                    else if(count == 18)
                        physicalBuild = addItem.getText();
                    else if(count == 19)
                        weaponDescription = addItem.getText();
                    else if(count == 20)
                        complexion = addItem.getText();
                    else if(count == 21)
                        clothingDescription = addItem.getText();
                    else if(count == 22) {
                        vehicleDescription = addItem.getText();
                    }
                    else
                    {
                        Criminal criminal = new Criminal(firstName, lastName, nickname, age, gender, ethnicity, contactInfo, linkedCrime, birthDate, eyeColor, hairDescription, 
                                                            facialHairDescription, hght, weight, tattooDescription, physicalMarkDescription, physicalBuild, weaponDescription, complexion, 
                                                            clothingDescription, vehicleDescription);
                        
                        int choice = JOptionPane.showConfirmDialog(null, criminal.toString() + "\n\nAdd this Criminal?", "Add Reports" , JOptionPane.YES_NO_OPTION);
                        if(choice == 0)
                        {
                            CriminalList.getInstance().addCriminal(criminal);
                            dispose();
                            UserOptions userOp = new UserOptions(frame);
                            setLocationRelativeTo(null);
                            userOp.setVisible(true);

                        }
                    }
                     
                    count++;
                    if (count <= 22 )
                        addItem.setText("Enter " + criminalItems[count] + " here...");
                   
                }
            }
        );

        backButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {                
                dispose();
                UserOptions userOp = new UserOptions(frame); //change this when ready
                setLocationRelativeTo(null);
                userOp.setVisible(true);
            }
        });
    }
    
}

