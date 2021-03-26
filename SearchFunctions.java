//package GUI_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SearchFunctions extends JFrame {

    private JTextField nameSearch = new JTextField(30);
    private JButton searchButton = new JButton("Search");
    private JButton backButton = new JButton("Back");
    private JCheckBox checkBox = new JCheckBox("First Name");
    private JCheckBox checkBox2 = new JCheckBox("Last Name");
    private JCheckBox checkBox3 = new JCheckBox("Nickname");
    private JCheckBox checkBox4 = new JCheckBox("Age");
    private JCheckBox checkBox5 = new JCheckBox("Gender");
    private JCheckBox checkBox6 = new JCheckBox("Ethnicity");
    private JCheckBox checkBox7 = new JCheckBox("Contact Info");
    private JCheckBox checkBox8 = new JCheckBox("Crime Description");
    private JCheckBox checkBox9 = new JCheckBox("Eye Color");
    private JCheckBox checkBox10 = new JCheckBox("Hair Description");
    private JCheckBox checkBox11 = new JCheckBox("Facial Hair Description");
    private JCheckBox checkBox12 = new JCheckBox("Height");
    private JCheckBox checkBox13 = new JCheckBox("Weight");
    private JCheckBox checkBox14 = new JCheckBox("Tattoo Description");
    private JTable result = new JTable();
    private JPanel panel = new JPanel();

    public SearchFunctions() {
        new DataLoader();
    }

    public SearchFunctions(String title) throws HeadlessException {
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
        panel.add(checkBox14);
        panel.setLayout(new FlowLayout());
        add(panel);
    }
/*
    private void setTable() { // Maybe make this a read JSON file method
        

        Object rowData[][] = {{ "Row1-Column1"}, {"Row1-Column2"}, {"Row1-Column3" }};
        Object columnNames[] = { "Column One", "Column Two", "Column Three" };
        result = new JTable(rowData, columnNames);

        scrollPane = new JScrollPane(result);
        //result.setFillsViewportHeight(true);
        panel.setLayout(new BorderLayout());

        panel.add(scrollPane,BorderLayout.PAGE_END);
        panel.setSize(550, 200);
        panel.setVisible(true);
        try {
            Client cl = Client.create();
            WebResource webResource = cl
                    .resource("http://localhost:8080/rest_server/rest/jersey/dbAccess/getDBVal");
            ClientResponse response = webResource.accept("application/json")
                    .get(ClientResponse.class);
    
            if (response.getStatus() != 200) {
                System.out.println("no out put");
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }
    
            String output = response.getEntity(String.class);
            // String[] output = response.getEntity(String.);
            System.out.println("\n -------");
            System.out.println(output);
    
        } catch (Exception e) {
            e.printStackTrace();
        }
        JFrame frame = new JFrame("JTable Test Display");

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JTable table = new JTable();

        JScrollPane tableContainer = new JScrollPane(table);

        panel.add(tableContainer, BorderLayout.CENTER);
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
        
    }
*/
    /**
     * Creates a new frame to go "back" to the main page
     * CHANGE BACK BUTTON FOR DIFFERENT FUNCTIONS
     */
    private void backButtonFunction() {
        JFrame frame = new JFrame("Criminal Tracking App - What would you like to do?");

        searchButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                searchCriminalJSON();
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

    private void searchCriminalJSON() {

        //checking first name
        if (checkBox.isSelected()) {
            for (Criminal criminal : CriminalList.getInstance().getCriminalList()) {
			    if(criminal.getFirstName().equalsIgnoreCase(nameSearch.getText()))
			    {
				    int choice = JOptionPane.showConfirmDialog(null, criminal.toString() + "\nDownload Information on this Criminal?", "Search Results" , JOptionPane.YES_NO_OPTION);
                    if (choice == 0)
                    {
                        dispose();
                    }
                    else
                    {
                        
                    }
                }
		    }
        }

        //checking last name
        else if (checkBox2.isSelected()) {
            for (Criminal criminal : CriminalList.getInstance().getCriminalList()) {
			    if(criminal.getLastName().equalsIgnoreCase(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, criminal.toString() + "\nDownload Information on this Criminal?", "Search Results" , JOptionPane.YES_NO_OPTION);
			    }
		    }
        }

         //checking last name
         else if (checkBox3.isSelected()) {
            for (Criminal criminal : CriminalList.getInstance().getCriminalList()) {
			    if(criminal.getNickname().equalsIgnoreCase(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, criminal.toString() + "\nDownload Information on this Criminal?", "Search Results" , JOptionPane.YES_NO_OPTION);
			    }
		    }
        }

         //checking last name
         else if (checkBox4.isSelected()) {
            for (Criminal criminal : CriminalList.getInstance().getCriminalList()) {
			    if(criminal.getAge() == (Integer.parseInt(nameSearch.getText())))
			    {
				    int choice = JOptionPane.showConfirmDialog(null, criminal.toString() + "\nDownload Information on this Criminal?", "Search Results" , JOptionPane.YES_NO_OPTION);
			    }
		    }
        }
         //checking last name
         else if (checkBox5.isSelected()) {
            for (Criminal criminal : CriminalList.getInstance().getCriminalList()) {
			    if(criminal.getGender().equalsIgnoreCase(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, criminal.toString() + "\nDownload Information on this Criminal?", "Search Results" , JOptionPane.YES_NO_OPTION);
			    }
		    }
        }
         //checking last name
         else if (checkBox6.isSelected()) {
            for (Criminal criminal : CriminalList.getInstance().getCriminalList()) {
			    if(criminal.getEthnicity().equalsIgnoreCase(nameSearch.getText()))
			    {
				    int choice = JOptionPane.showConfirmDialog(null, criminal.toString() + "\nDownload Information on this Criminal?", "Search Results" , JOptionPane.YES_NO_OPTION);
			    }
		    }
        }
         //checking last name
         else if (checkBox7.isSelected()) {
            for (Criminal criminal : CriminalList.getInstance().getCriminalList()) {
			    if(criminal.getContactinfo().equalsIgnoreCase(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, criminal.toString() + "\nDownload Information on this Criminal?", "Search Results" , JOptionPane.YES_NO_OPTION);
			    }
		    }
        }
         //checking last name
         else if (checkBox8.isSelected()) {
            for (Criminal criminal : CriminalList.getInstance().getCriminalList()) {
			    if(criminal.getLinkedCrime().equalsIgnoreCase(nameSearch.getText()))
			    {
				    int choice = JOptionPane.showConfirmDialog(null, criminal.toString() + "\nDownload Information on this Criminal?", "Search Results" , JOptionPane.YES_NO_OPTION);
			    }
		    }
        }
         //checking last name
         else if (checkBox9.isSelected()) {
            for (Criminal criminal : CriminalList.getInstance().getCriminalList()) {
			    if(criminal.getEyeColor().equalsIgnoreCase(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, criminal.toString() + "\nDownload Information on this Criminal?", "Search Results" , JOptionPane.YES_NO_OPTION);
			    }
		    }
        }
         //checking last name
         else if (checkBox10.isSelected()) {
            for (Criminal criminal : CriminalList.getInstance().getCriminalList()) {
			    if(criminal.getHairDescription().equalsIgnoreCase(nameSearch.getText()))
			    {
				    int choice = JOptionPane.showConfirmDialog(null, criminal.toString() + "\nDownload Information on this Criminal?", "Search Results" , JOptionPane.YES_NO_OPTION);
			    }
		    }
        }
         //checking last name
         else if (checkBox11.isSelected()) {
            for (Criminal criminal : CriminalList.getInstance().getCriminalList()) {
			    if(criminal.getFacialHairDescription().equalsIgnoreCase(nameSearch.getText()))
			    {
				    int choice = JOptionPane.showConfirmDialog(null, criminal.toString() + "\nDownload Information on this Criminal?", "Search Results" , JOptionPane.YES_NO_OPTION);
			    }
		    }
        }
         //checking last name
         else if (checkBox12.isSelected()) {
            for (Criminal criminal : CriminalList.getInstance().getCriminalList()) {
			    if(criminal.getHeight().equalsIgnoreCase(nameSearch.getText()))
			    {
				    int choice = JOptionPane.showConfirmDialog(null, criminal.toString() + "\nDownload Information on this Criminal?", "Search Results" , JOptionPane.YES_NO_OPTION);
			    }
		    }
        }
         //checking last name
         else if (checkBox13.isSelected()) {
            for (Criminal criminal : CriminalList.getInstance().getCriminalList()) {
			    if(criminal.getWeight().equalsIgnoreCase(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, criminal.toString() + "\nDownload Information on this Criminal?", "Search Results" , JOptionPane.YES_NO_OPTION);
			    }
		    }
        }
         //checking last name
         else if (checkBox14.isSelected()) {
            for (Criminal criminal : CriminalList.getInstance().getCriminalList()) {
			    if(criminal.getTattooDescription().equalsIgnoreCase(nameSearch.getText()))
			    {
                    int choice = JOptionPane.showConfirmDialog(null, criminal.toString() + "\nDownload Information on this Criminal?", "Search Results" , JOptionPane.YES_NO_OPTION);
			    }
		    }
        }

        else {
            JOptionPane.showMessageDialog(null, "User not found", "Error", JOptionPane.OK_OPTION);
        }
    }
    
}
