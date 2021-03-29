import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
                                        
public class AddFunctionSuspect extends JFrame {
    private String firstName = "";
    private String lastName = "";
    private int age = 0;
    private String gender = "";
    private String ethnicity = "";
    private String contactInfo = "";
    private String minorStatus = "";
    private String statement = "";
    private String hasAlibi = "";
    private String birthDate = "";
    private String eyeColor = "";
    private String hairDescription = "";
    private String facialHairDescription = "";
    private String hght = "";
    private String weight = "";
    private String tattooDescription = "";
    private String piercingDescription = "";
    private String physicalMarksDescription = "";
    private String physicalBuild = "";
    private String weaponDescription = "";
    private String complexion = "";
    private String clothingDescription = "";
    private String vehicleDescription = "";

    private JTextField addItem = new JTextField(30);
    private JButton addButton = new JButton("Add");
    private JButton backButton = new JButton("Cancel");
    private JPanel panel = new JPanel();
    public int count = 0;
    public String[] suspectItems = {"First Name", "Last Name", "Age", "Gender", "Ethnicity", "Contact Info", "Minor Status", "Statement",
                                        "Has Alibi or Not", "Birth Date", "Eye Color", "Hair Description", "Facial Hair Description", 
                                        "Height", "Weight", "Tattoo Description", "Piercing Description", "Physical Marks Description", 
                                        "Physical Build", "Weapon Description", "Complexion", "Clothing Description", "Vehicle Description"};
                                        
    public AddFunctionSuspect() {
        new DataLoader();
    }
                                        
    public AddFunctionSuspect(String title) throws HeadlessException {
        super(title);
                                                
        setSize(500, 500);
        setResizable(false);
        addComponents();
        backButtonFunction();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
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
                            age = Integer.parseInt(addItem.getText());
                        else if(count == 3)
                            gender = addItem.getText();
                        else if(count == 4)
                            ethnicity = addItem.getText();
                        else if(count == 5)
                            contactInfo = addItem.getText();
                        else if(count == 6)
                            minorStatus = addItem.getText();
                        else if(count == 7)
                            statement = addItem.getText();
                        else if(count == 8)
                            hasAlibi = addItem.getText();
                        else if(count == 9)
                            birthDate = addItem.getText();
                        else if(count == 10)
                            eyeColor = addItem.getText();
                        else if(count == 11)
                            hairDescription = addItem.getText();
                        else if(count == 12)
                            facialHairDescription = addItem.getText();
                        else if(count == 13)
                            hght = addItem.getText();
                        else if(count == 14)
                            weight = addItem.getText();
                        else if(count == 15)
                            tattooDescription = addItem.getText();
                        else if(count == 16)
                            piercingDescription = addItem.getText();
                        else if(count == 17)
                            physicalMarksDescription = addItem.getText();
                        else if(count == 18)
                            physicalBuild = addItem.getText();
                        else if(count == 19)
                            weaponDescription = addItem.getText();
                        else if(count == 20)
                            complexion = addItem.getText();
                        else if(count == 21) 
                            clothingDescription = addItem.getText();
                        else if(count == 22)
                            vehicleDescription = addItem.getText();
                        else
                        {
                            Suspect suspect = new Suspect(firstName, lastName, age, gender, ethnicity, contactInfo, minorStatus, statement, hasAlibi, birthDate, 
                                                        eyeColor, hairDescription, facialHairDescription, hght, weight, tattooDescription, piercingDescription,
                                                        physicalMarksDescription, physicalBuild, weaponDescription, complexion, clothingDescription, vehicleDescription);
                                                                
                            int choice = JOptionPane.showConfirmDialog(null, suspect.toString() + "\n\nAdd this Witness?", "Add Victim Reports" , JOptionPane.YES_NO_OPTION);
                            if(choice == 0)
                            {
                                suspectsList.getInstance().addSuspect(suspect);
                                dispose();
                                UserOptions userOp = new UserOptions(frame);
                                setLocationRelativeTo(null);
                                userOp.setVisible(true);
                                        
                            }
                        }
                                                             
                        count++;
                        if (count <= 22)
                            addItem.setText("Enter " + suspectItems[count] + " here...");
                                                           
                    }
                });
                                        
                backButton.addActionListener(new ActionListener() {
                                        
                    public void actionPerformed(ActionEvent e) {                
                        dispose();
                        UserOptions userOp = new UserOptions(frame);
                        setLocationRelativeTo(null);
                        userOp.setVisible(true);
                    }
                });
            }
                                            
    }
