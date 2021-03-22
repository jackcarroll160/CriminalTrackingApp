//package GUI_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SearchFunctions extends JFrame {

    private JTextField nameSearch = new JTextField(30);
    private JButton searchButton = new JButton("Search");
    private JButton backButton = new JButton("Back");
    private JCheckBox checkBox = new JCheckBox("Criminals");
    private JCheckBox checkBox2 = new JCheckBox("Crimes");
    private JCheckBox checkBox3 = new JCheckBox("Persons of Interest");
    private JCheckBox checkBox4 = new JCheckBox("Suspects");
    private JCheckBox checkBox5 = new JCheckBox("Victims");
    private JCheckBox checkBox6 = new JCheckBox("Witnesses");
    private JTable result = new JTable();
    private JPanel panel = new JPanel();
    private JScrollPane scrollPane = new JScrollPane(result);

    public SearchFunctions(String title) throws HeadlessException {
        super(title);

        setSize(500, 500);
        setResizable(false);
        addComponents();
        backButtonFunction();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTable(); //change this later to set names from JSON
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
        panel.add(scrollPane);
        add(panel);
    }

    private void setTable() { // Maybe make this a read JSON file method
        // TODO put JSON connection here to search
        
    }

    /**
     * Creates a new frame to go "back" to the main page
     */
    private void backButtonFunction() {
        JFrame frame = new JFrame("Criminal Tracking App - What Would you like to do?");
        
        backButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {                
                dispose();
                UserOptions userOp = new UserOptions(frame);
                setLocationRelativeTo(null);
                userOp.setVisible(true);
            }
        });
    }

    /**
     * Write Search Button Function here...
     */
    private void searchButtonFunction() {
        // TODO
    }
    
}
