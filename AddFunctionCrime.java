import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

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
    ArrayList<Witness> witnesses;
    ArrayList<Victim> victims;
    ArrayList<Suspect> suspects;
    ArrayList<PersonOfInterest> personOfInterest;
    ArrayList<Criminal> criminals;
    

    private JTextField addItem = new JTextField(30);
    private JButton addButton = new JButton("Add");
    private JButton backButton = new JButton("Cancel");
    private JTable result = new JTable();
    private JPanel panel = new JPanel();
    public int count = 0;
    public String[] crimeItems = {"Description" , "Date", "Time" , "Case Open", " Crime Number" , " Witness Name" , "Victim Name" , "Suspect Name"
                                    , "Person Of Interest Name"};

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
        addItem.setText("Enter Crime Description here...");
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
                        description = addItem.getText();
                    else if(count == 1)
                        date = addItem.getText();
                    else if(count == 2)
                        time = addItem.getText();
                    else if(count == 3)
                        caseOpen = addItem.getText();
                    else if(count == 4)
                        crimeNumber = Integer.parseInt(addItem.getText());
                    else if(count == 5)
                    {
                        witnessName = addItem.getText();  
                        for(Witness witness : witnessList.getInstance().getWitnessList())
                        {
                            if(witness.getFirstName().equalsIgnoreCase(witnessName))
                            {
                                witnesses.add(witness);
                            }
                        }
                    }
                    else if(count == 6)
                    {
                        victimName = addItem.getText();  
                        for(Victim victim : victimsList.getInstance().getVictimList())
                        {
                            if(victim.getFirstName().equalsIgnoreCase(victimName))
                            {
                                 victims.add(victim);
                            }
                        }
                    }
                    else if(count == 7)
                    {
                        suspectName = addItem.getText();  
                        for(Suspect suspect : suspectsList.getInstance().getSuspectList())
                        {
                            if(suspect.getFirstName().equalsIgnoreCase(suspectName))
                            {
                                 suspects.add(suspect);
                            }
                        }
                    }
                    else if(count == 8)
                    {
                        poiName= addItem.getText();  
                        for(PersonOfInterest poi : personOfInterestList.getInstance().getPersonOfInterestList())
                        {
                         if(poi.getFirstName().equalsIgnoreCase(poiName))
                        {
                            personOfInterest.add(poi);
                         }
                    }
                }
                    else
                    {
                        Crime crime = new Crime(crimeNumber, description, date, time , caseOpen, witnesses, victims, suspects, personOfInterest);
                        
                        int choice = JOptionPane.showConfirmDialog(null, crime.toString() + "\n\nAdd this Crime?", "Add Reports" , JOptionPane.YES_NO_OPTION);
                        if(choice == 0)
                        {
                            CrimeList.getInstance().addCrime(crime);
                            dispose();
                            UserOptions userOp = new UserOptions(frame);
                            setLocationRelativeTo(null);
                            userOp.setVisible(true);

                        }
                    }
                     
                    count++;
                    if (count <= 8 )
                        addItem.setText("Enter " + crimeItems[count] + " here...");
                   
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

