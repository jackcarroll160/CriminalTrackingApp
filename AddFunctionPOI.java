import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddFunctionPOI extends JFrame {
    String firstName = "";
    String lastName = "";
    int age = 0;
    String contactInfo = "";
    String isMinor = "";
    String statement = "";
    String hasAlibi = "";
    String isSuspect = "";

    private JTextField addItem = new JTextField(30);
    private JButton addButton = new JButton("Add");
    private JButton backButton = new JButton("Cancel");
    private JTable result = new JTable();
    private JPanel panel = new JPanel();
    public int count = 0;
    public String[] criminalItems = {"First Name", "Last Name",  "Age",  "Contact Info", 
                                        "Is Minor", "Statement" , "Has Alibi" , "Is Suspect"};

    public AddFunctionPOI() {
        new DataLoader();
    }

    public AddFunctionPOI(String title) throws HeadlessException {
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
                        contactInfo = addItem.getText();
                    else if(count == 4)
                        isMinor = addItem.getText();
                    else if(count == 5)
                        statement = addItem.getText();
                    else if(count == 6)
                        hasAlibi= addItem.getText();
                    else if(count == 7)
                        isSuspect = addItem.getText();
                    else
                    {
                        PersonOfInterest poi = new PersonOfInterest(firstName, lastName, age, contactInfo ,isMinor,statement, hasAlibi,isSuspect );
                        
                        int choice = JOptionPane.showConfirmDialog(null, poi.toString() + "\n\nAdd this Person Of Interest?", "Add Reports" , JOptionPane.YES_NO_OPTION);
                        if(choice == 0)
                        {
                            personOfInterestList.getInstance().addPersonOfInterest(firstName, lastName, age, contactInfo, isMinor, statement, hasAlibi, isSuspect);
                            dispose();
                            UserOptions userOp = new UserOptions(frame);
                            setLocationRelativeTo(null);
                            userOp.setVisible(true);

                        }
                    }
                     
                    count++;
                    if (count <= 7 )
                        addItem.setText("Enter " + criminalItems[count] + " here...");
                   
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
