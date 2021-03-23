/**
 * Author: Sydney Oklota
 */
import java.util.*;
public class RegisteredUser extends User{

    public RegisteredUser(String username, String password){
        super(username, password);

    }

    
    @Override
    public void searchCriminalsByName(String Fname, String Lname) {
        // TODO Auto-generated method stub
        
    }
   

    @Override
    public void registerUser(RegisteredUser user) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void removeUser(RegisteredUser user) {
        // TODO Auto-generated method stub
        
    }


  


  
    //interface methods
    @Override
    public void removeAdmin(Admin admin) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removeOfficer(Officer officer) {
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
}
