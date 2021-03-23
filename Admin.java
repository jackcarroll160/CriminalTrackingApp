import java.util.ArrayList;
 
/**
 * Author: Sydney Oklota
 */
public class Admin extends User{
    
    /**
     * constructor
     * @param username admin username
     * @param password admin password
     * @param authorizationLevel admin authorization level = 1
     */
    public Admin(String username, String password){

        super(username, password);

    }

   /**
    * Used to loop through array list and edit details on misdemeanors
    * @param crime array list of crime
    * @param misdemeanor misdemeanor being edited
    * @param crimeID id number of felony
    * @param input crime id num user enters
    */
    public void editMisdemeanors(ArrayList<Crime> crime, String misdemeanor, int input, int crimeID){
        
        System.out.println("Enter Crime ID");
        if(crime.indexOf(input) == crimeID){

            System.out.println(crime.indexOf(input));
            System.out.println("Do you wish to edit this misdemeanor?");


        }


    }

    /**
     * used to loop through array list and edit details on felonies
     * @param crime array list of crime
     * @param felony felony being edited
     * @param crimeID id number of felony
     * @param input crime id num user inputs
     */
    public void editFelonies(ArrayList<Crime> crime, String felony, int crimeID, String input){
        
    
       System.out.println("Enter Crime ID");
       if(crime.indexOf(input) == crimeID){

           System.out.println(crime.indexOf(input));
           System.out.println("Do you wish to edit this felony?");


       }
    }

    


    //interface methods
    @Override
    public void searchCriminalsByName(String Fname, String Lname) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void editCriminalByName(String Fname, String Lname) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void registerAdmin(Admin admin) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void registerOfficer(Officer officer) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void registerUser(RegisteredUser user) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removeAdmin(Admin admin) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removeOfficer(Officer officer) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removeUser(RegisteredUser user) {
        // TODO Auto-generated method stub
        
    }

  



   
}
