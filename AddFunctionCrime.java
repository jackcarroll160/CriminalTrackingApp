import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class AddFunctionCrime extends JFrame {
    private boolean flag = false;
    private String description = "";
    private String date = "";
    private String time = "";
    private String caseOpen = "";
    private int crimeNumber = 0;
    private String witnessName = "";
    private String victimName = "";
    private String suspectName = "";
    private String poiName = "";
    private int evidenceNum = 0;
    private ArrayList<String> evidence= new ArrayList<String>();
    private ArrayList<Witness> witnesses  = new ArrayList<Witness>();
    private ArrayList<Victim> victims = new ArrayList<Victim>();
    private ArrayList<Suspect> suspects = new ArrayList<Suspect>();
    private ArrayList<PersonOfInterest> personOfInterest = new ArrayList<PersonOfInterest>();
    private ArrayList<Criminal> criminals = new ArrayList<Criminal>();
    

    private JTextField addItem = new JTextField(30);
    private JButton addButton = new JButton("Add");
    private JButton backButton = new JButton("Cancel");
    private JPanel panel = new JPanel();
    public int count = 0;
    public String[] crimeItems = {"Description" , "Date", "Time" , "Case Open", " Crime Number" , " Witness Name" , "Victim Name" , "Suspect Name"
                                    , "Person Of Interest Name", "Number Of Evidence Pieces", "Evidence"};

    public AddFunctionCrime() {
        new DataLoader();
    }

    public AddFunctionCrime(String title) throws HeadlessException {
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
        addItem.setText("Enter Crime Description here...");
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
                else if(count == 9)
                {
                    evidenceNum= Integer.parseInt(addItem.getText());  
                   
                }
                else if(count == 10 && evidenceNum != 0)
                {
                        addItem.setText("Enter Piece here...");
                        evidence.add(addItem.getText());
                        evidenceNum--;
                    
                   
                }
                else if(count == 11 && evidenceNum != 0)
                {
                    evidence.add(addItem.getText());
                        evidenceNum--;
                        addItem.setText("Enter Next Piece here...");
                   
                }
                else if(count == 12 && evidenceNum != 0)
                {
                   
                    evidence.add(addItem.getText());
                    evidenceNum--;
                    addItem.setText("Enter Next Piece here...");
                   
                }
                else if(count == 13 && evidenceNum != 0)
                {
                   
                    evidence.add(addItem.getText());
                    evidenceNum--;
                    addItem.setText("Enter Next Piece here...");
                   
                }
                else if(count == 14 && evidenceNum != 0)
                {
                    
                    evidence.add(addItem.getText());
                    evidenceNum--;
                   
                }
                else if(evidenceNum == 0 && !flag)
                {
                    addItem.setText("Click Save Again To Begin Download");
                    flag = true;
                }
                    else
                    {
                        Crime crime = new Crime(crimeNumber, description, date, time , caseOpen, witnesses, victims, suspects, personOfInterest,evidence);
                        
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
                    if (count <= 9 )
                        addItem.setText("Enter " + crimeItems[count] + " here...");
                   
                }
            }
        );

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

