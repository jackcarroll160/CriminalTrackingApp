/**
 * Author: Sydney Oklota
 */
import java.util.*;
public class User {
   
    private String username;
    private String password;
    private HashMap<UUID, String> storeUserPwd;
    
    
    


    public User(String username, String password){

        this.username = username;
        this.password = password;
        
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public String setPassword(){
        return this.password;
    }

    public String setUsername(){
        return this.username;
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

    

    


   
}

