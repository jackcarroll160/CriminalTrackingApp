import java.util.ArrayList;

/**
 * Author: Sydney Okota
 */
public class Officer extends User {
    
    
    
    public Officer(String username, String password){
        super(username, password);
    
    }


    /**
     * add misdemeanors to crime arraylist
     * @param crime array list
     * @param misdemeanor misdemeanor being added
     */
    public void addMisdemeanors(ArrayList<Crime> crime, Crime misdemeanor){
        crime.add(misdemeanor);

    }
 
    /**
     * add felonies to crime arraylist
     * @param crime array list
     * @param felony felony being added
     */
    public void addFelonies(ArrayList<Crime> crime, Crime felony){
        crime.add(felony);

    }

    /**
     * remove misdemeanor from array list
     * @param crime array list 
     * @param misdemeanor misdemeanor being removed
     */
    public void removeMisdemeanors(ArrayList<Crime> crime, Crime misdemeanor){
        crime.remove(misdemeanor);

    }

    /**
     * remove felony from array list
     * @param crime array list
     * @param felony felony being removed
     */
    public void removeFelonies(ArrayList<Crime> crime, Crime felony){
        crime.remove(felony);
    }

    /**
     * add criminal report
     */
    public void addReport(){
        CriminalList.getInstance();

    }

    /**
     * allows officer to edit reports
     * @param Fname first name of criminal
     * @param Lname last name of criminal
     */
    public void editReport(String Fname, String Lname){
        editCriminalByName(Fname, Lname);

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
