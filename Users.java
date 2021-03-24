import java.io.IOException;
import java.util.ArrayList;

/**
 * Users class for adding and removing users
 * @author Overachievers
 */
public class Users {
    private static Users users;
    private ArrayList<User> userList;

    /**
     * Users class default constructor
     * @throws IOException
     */
    private Users() throws IOException {
        userList = DataLoader.getUsers();
    }

    /**
     * Returns a new Users
     * @return new Users if users is null
     * @throws IOException
     */
    public static Users getInstance() throws IOException {
        if (users == null) {
            users = new Users();
        }

        return users;
    }

    /**
     * Checks if the username is already taken
     * @param userName a String for the User's username
     * @return true/false based on if the username was found in the list or not
     */
    public boolean haveUser(String userName) {
        for (User user : userList) {
            if (user.getUsername().equalsIgnoreCase(userName)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Gets a user from the list
     * @param userName for the user's username
     * @return the user, if found, otherwise, returns null
     */
    public User getUser(String userName) {
        for (User user : userList) {
            if (user.getUsername().equalsIgnoreCase(userName)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Returns the list of users
     * @return an ArrayList of users
     */
    public ArrayList<User> getUsers() {
        return userList;
    }

    /**
     * Checks if user can be added
     * @param userName a String for the user's username
     * @param passWord a String for the user's password
     * @return true/false depending on if the user is in the database or not
     */
    public boolean addUser(String userName, String passWord) {
        if(haveUser(userName))return false;

        userList.add(new User(userName, passWord));
        return true;
    }

    /**
     * Writes the saves used
     */
    public void saveUsers() {
        DataWriter.saveUsers();
    }
}
