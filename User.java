/**
 * Author: Sydney Oklota
 */
import java.util.*;
public abstract class User implements UserInterface{
    
    protected ArrayList<UUID> userID;
    protected String username;
    protected String password;
    protected HashMap<UUID, String> storeUserPwd;
    protected String email;
    protected int authorizationLevel;
    protected String UserType;


    public User(String username, String password, int authorizationLevel){

        this.username = username;
        this.password = password;
        this.authorizationLevel = authorizationLevel;
        
    }

    /**
     * stores user password into hashmap that contains user ID and password
     * @param userID key, user ID number
     * @param password value, user password
     */
    public void registerUser(UUID userID , String password) {
        
        storeUserPwd.put(userID, password);
        
    } 

    /**
     * removes user from hashmap of stored user passwords
     * @param userID key that determines which user is being removed
     */
    public void removeUser(UUID userID) {

        storeUserPwd.remove(userID);
        
    }

    /**
     * prints authorization level to screen upon login
     * @param authorizationLevel level inputed by user at sign up and login
     * @return whether or not access has been granted
     */
    private String checkAuthorization(int authorizationLevel){
        if(authorizationLevel == 1){

            return "Authorization Level: Admin";

        }
        else if(authorizationLevel == 2){

            return "Authorization Level: Officer";
            
        }
        else if(authorizationLevel == 3){

            return "Authorization Level: Registered User";
            
        }
        else{

            return "Authorization Level: none";

        } 
        

    }




    public String toString(){

        return null;

    }

    public void getCriminals(Criminal criminal){
        return;

    }

    public void addCriminal(Criminal ID, String firstName, String lastName){
        ID.add(firstName);

    }

    public void favoiteReport(Criminal criminal){

    }

    public void addReport(Criminal criminal){

    }

    


   
}

