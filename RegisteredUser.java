/**
 * Author: Sydney Oklota
 */
import java.util.*;
public class RegisteredUser extends User{

    private ArrayList<Criminal> criminals;

    public RegisteredUser(String username, String password, int authorizationLevel){
        super(username, password, authorizationLevel);

    }

    public ArrayList<Criminal> getCriminals(){
        
        return criminals;

    }

    public ArrayList<Criminal> getCriminalsSearch(String firstName, String lastName){

        return criminals;

    }

    public void registeredUser(String firstName, String lastName, String password, String email){

    }

    public void addFavoriteCriminal(Criminal criminal){

    }

    public void suggestInformation(Criminal criminal, String comment){

    }

    public boolean isRegistered(String email, String username){
        
        return true;

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
