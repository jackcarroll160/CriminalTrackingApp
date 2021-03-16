/**
 * Author: Sydney Oklota
 */
public class Admin extends User{
    
    public Admin(String username, String password, int authorizationLevel){

        super(username, password, authorizationLevel);

    }

   
    

    public void editReport(Criminal criminal){

    }

    public void editMisdemeanors(Criminal criminal){

    }

    public void editFelonies(Criminal criminal){

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
