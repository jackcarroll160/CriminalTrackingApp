
/**
 * Author: Sydney Oklota
 */
import java.io.IOException;
import java.util.*;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class User {

    private UUID userId;
    private static HashMap<String, String> loginInfo = new HashMap<>();
    private HashMap<UUID, String> storeUserPwd = new HashMap<>();
    private String username;
    private String password;
    /// private String password;

    public User(UUID userId, String username, String password) {
        this.userId = userId;
        setUserId(userId);
        setUsername(username);
        setPassword(password);
        //User saveHashMapUser = new User(username, password);
        this.loginInfo.put(username, password);
    }

    public User(String username, String password) {
        setUsername(username);
        setPassword(password);
        
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password; 
    }
    public void setPassword(String password) { 
        this.password = password; 
    }
     

    public UUID getUserId() {
        return this.userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * stores user password into hashmap that contains user ID and password
     * 
     * @param userID   key, user ID number
     * @param password value, user password
     */
    public void registerUser(UUID userID, String password) {

        storeUserPwd.put(userID, password);

    }

    /**
     * removes user from hashmap of stored user passwords
     * 
     * @param userID key that determines which user is being removed
     */
    public void removeUser(UUID userID) {

        storeUserPwd.remove(userID);

    }
}
