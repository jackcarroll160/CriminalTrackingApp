import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
                                        
public class AddFunctionVictim extends JFrame {
    private String firstName = "";
    private String lastName = "";
    private int age = 0;
    private String contactInfo = "";
    private String minorStatus = "";
    private String alive = "";
    private String injured = "";
    private String statement = "";
    private JTextField addItem = new JTextField(30);
    private JButton addButton = new JButton("Add");
    private JButton backButton = new JButton("Cancel");
    private JPanel panel = new JPanel();
    public int count = 0;
    public String[] victimItems = {"First Name", "Last Name", "Age", "Contact Info", "Minor Status", "Alive or Not", 
                                        "Injured or Not", "Statement"};
                                        
    public AddFunctionVictim() {
        new DataLoader();
    }
                                        
    public AddFunctionVictim(String title) throws HeadlessException {
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
                            minorStatus = addItem.getText();
                        else if(count == 5)
                            alive = addItem.getText();
                        else if(count == 6)
                            injured = addItem.getText();
                        else if(count == 7)
                            statement = addItem.getText();
                        else
                        {
                            Victim victim = new Victim(firstName, lastName, age, contactInfo, minorStatus, alive, injured, statement);
                                                                
                            int choice = JOptionPane.showConfirmDialog(null, victim.toString() + "\n\nAdd this Witness?", "Add Victim Reports" , JOptionPane.YES_NO_OPTION);
                            if(choice == 0)
                            {
                                victimsList.getInstance().addVictim(victim);
                                dispose();
                                UserOptions userOp = new UserOptions(frame);
                                setLocationRelativeTo(null);
                                userOp.setVisible(true);
                                        
                            }
                        }
                                                             
                        count++;
                        if (count <= 7)
                            addItem.setText("Enter " + victimItems[count] + " here...");
                                                           
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
