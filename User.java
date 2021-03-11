import java.util.*;
import java.util.Map;
public abstract class User implements UserInterface{
    
    protected ArrayList<UUID> userID;
    protected String username;
    protected String password;
    protected HashMap<String, String> storeUserPwd;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected int authorizationLevel;

    public String toString(){

        return null;

    }

    public void getCriminals(Criminal criminal){

    }

    public void addCriminal(Criminal criminal){

    }

    public void favoiteReport(Criminal criminal){

    }

    public void addReport(Criminal criminal){

    }

    private boolean checkAuthorization(){

        return true;

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

