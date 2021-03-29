
import java.util.ArrayList;
import java.util.UUID;

/**
 * Users class for adding and removing users
 * 
 * @author Overachievers
 */
public class Users {
    private static Users users = null;
    private static ArrayList<User> userList = new ArrayList<User>();

    private Users() {
        new DataLoader();
        userList = DataLoader.loadUsers();
    }

    /**
     * Returns a new Users
     * 
     * @return new Users if users is null
     * @throws IOException
     */
    public static Users getInstance() {
        if (users == null) {
            users = new Users();
        }

        return users;
    }

    /**
     * Checks if the username is already taken
     * 
     * @param string a String for the User's username
     * @return true/false based on if the username was found in the list or not
     */

    public static boolean haveUser(String username, String password) {
        for (User users : userList) {
            if (users.getUsername().equals(username) && users.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    
    /** 
     * @param username
     * @return boolean
     */
    public static boolean haveUser(String username) {
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }

        return false;
    }
    /**
     * Gets a user from the list
     * 
     * @param userName for the user's username
     * @return the user, if found, otherwise, returns null
     */
    public User getUser(String userName) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUsername().equalsIgnoreCase(userName)) {
                return userList.get(i);
            }
        }
        return null;
    }

    /**
     * Returns the list of users
     * 
     * @return an ArrayList of users
     */
    public ArrayList<User> getUsersList() {
        return userList;
    }

    /**
     * Checks if user can be added
     * 
     * @param string  a String for the user's username
     * @param string2 a String for the user's password
     * @return true/false depending on if the user is in the database or not
     * @throws IOException
     */
    public void addUser( String username, String password) {

        userList.add(new User(username, password));
        DataWriter.saveUsers();

    }

    
    /** 
     * @param id
     * @return User
     */
    public User getUserById(Object id) {
        for (User user : userList) {
            if (user.getUserId().equals(id)) {
                return user;
            }
        }
        return null;
    }

}
