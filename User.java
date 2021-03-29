
/**
 * Author: Sydney Oklota
 */
import java.util.*;

/**
 * import javax.swing.JPasswordField; import javax.swing.JTextField;
 */

public class User {

    private UUID userId;
    // private static HashMap<String, String> loginInfo = new HashMap<>();
    // private HashMap<UUID, String> storeUserPwd;
    private String username;
    private String password;

    public User(String username, String password) {
        this.userId = UUID.randomUUID();
        this.username = username;
        this.password = password;
        // this.loginInfo = new HashMap<>(loginInfo.put(string);
    }

    public User(UUID userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }

    
    /** 
     * @return UUID
     */
    public UUID getUserId() {
        return userId;
    }

    
    /** 
     * @param userId
     */
    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    
    /** 
     * @return String
     */
    public String getUsername() {
        return username;
    }

    
    /** 
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    
    /** 
     * @return String
     */
    public String getPassword() {
        return password;
    }

    
    /** 
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * stores user password into hashmap that contains user ID and password
     * 
     * @param userID   key, user ID number
     * @param password value, user password
     * 
     *                 public void registerUser(UUID userID, String password) {
     * 
     *                 storeUserPwd.put(userID, password);
     * 
     *                 }
     * 
     *                 /** removes user from hashmap of stored user passwords
     * 
     * @param userID   key that determines which user is being removed
     * 
     *                 public void removeUser(UUID userID) {
     * 
     *                 storeUserPwd.remove(userID);
     * 
     *                 }
     */
}
