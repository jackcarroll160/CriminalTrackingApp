/**
 * Author: Sydney Okota
 */
public class Officer extends User {
    
    
    
    public Officer(String username, String password, String rank, int authorizationLevel){
        super(username, password, authorizationLevel);
        

    }


    /**
     * add misdemeanors to crime arraylist
     * @param crime array list
     * @param misdemeanor misdemeanor being added
     */
    public void addMisdemeanors(Criminal crime, String misdemeanor){
        crime.add(misdemeanor);

    }

    /**
     * add felonies to crime arraylist
     * @param crime array list
     * @param felony felony being added
     */
    public void addFelonies(Criminal crime, String felony){
        crime.add(felony);

    }

    /**
     * remove misdemeanor from array list
     * @param crime array list 
     * @param misdemeanor misdemeanor being removed
     */
    public void removeMisdemeanors(Criminal crime, String misdemeanor){
        crime.remove(misdemeanor);

    }

    /**
     * remove felony from array list
     * @param crime array list
     * @param felony felony being removed
     */
    public void removeFelonies(Criminal crime, String felony){
        crime.remove(felony);
    }

    public void addReport(){
        CriminalList.getInstance();

    }

    public void editReport(String Fname, String Lname){
        editCriminalByName(Fname, Lname);

    }



    

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
