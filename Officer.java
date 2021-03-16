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







    //should keep? what are they exactly? difference between report and misdemeanors and felonies?

    public void addReport(Crime crime){
        

    }

    public void editReport(Crime crime){

    }



    

    @Override
    public void searchCriminalsByName(String Fname, String Lname) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void editCriminalByName(String Fname, String Lname) {
        // TODO Auto-generated method stub
        
    }
    
}
