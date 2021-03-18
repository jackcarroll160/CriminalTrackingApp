import java.util.*;

/**
 * Author: Sydney Oklota
 */
public interface UserInterface {

    public void searchCriminalsByName(String Fname, String Lname);
    
    public void editCriminalByName(String Fname, String Lname);

    public void registerAdmin(Admin admin);

    public void registerOfficer(Officer officer);
    
    public void registerUser(RegisteredUser user);
    
    public void removeAdmin(Admin admin);
    
    public void removeOfficer(Officer officer);
    
    public void removeUser(RegisteredUser user);






}
