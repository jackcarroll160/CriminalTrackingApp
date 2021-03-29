import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
                                        
public class AddFunctionWitness extends JFrame {
    private String firstName = "";
    private String lastName = "";
    private int age = 0;
    private String contactInfo = "";
    private String minorStatus = "";
    private String proof = "";
    private String testimony = "";
    private String location = "";
    private String witnessType = "";
    private JTextField addItem = new JTextField(30);
    private JButton addButton = new JButton("Add");
    private JButton backButton = new JButton("Cancel");
    private JPanel panel = new JPanel();
    public int count = 0;
    public String[] witnessItems = {"First Name", "Last Name", "Age", "Contact Info", "Minor Status", "proof", 
                                        "Testimony", "Location", "Witness Type"};
                                        
    public AddFunctionWitness() {
        new DataLoader();
    }
                                        
    public AddFunctionWitness(String title) throws HeadlessException {
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
                            proof = addItem.getText();
                        else if(count == 6)
                            testimony = addItem.getText();
                        else if(count == 7)
                            location = addItem.getText();
                        else if(count == 8)
                            witnessType = addItem.getText();
                        else
                        {
                            Witness witness = new Witness(firstName, lastName, age, contactInfo, minorStatus, proof, testimony, location, witnessType);
                                                                
                            int choice = JOptionPane.showConfirmDialog(null, witness.toString() + "\n\nAdd this Witness?", "Add Witness Reports" , JOptionPane.YES_NO_OPTION);
                            if(choice == 0)
                            {
                                witnessList.getInstance().addWitness(witness);
                                dispose();
                                UserOptions userOp = new UserOptions(frame);
                                setLocationRelativeTo(null);
                                userOp.setVisible(true);
                                        
                            }
                        }
                                                             
                        count++;
                        if (count <= 8)
                            addItem.setText("Enter " + witnessItems[count] + " here...");
                                                           
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
