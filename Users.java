import java.io.IOException;
import java.util.ArrayList;

/**
 * Users class for adding and removing users
 * @author Overachievers
 */
public class Users {
    private static Users users = null;
    private static ArrayList<User> userList = new ArrayList<>();

   
    Users() throws IOException{
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
     * @param string a String for the User's username
     * @return true/false based on if the username was found in the list or not
     */
    public static boolean haveUser(String string) {
        for (int i= 0; i< userList.size(); i++) {
            if (userList != null && userList.get(i).getUsername().equals(string)) {
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
        for (int i= 0; i< userList.size(); i++) {
            if (userList.get(i).getUsername().equalsIgnoreCase(userName)) {
                return userList.get(i);
            }
        }
        return null;
    }

    /**
     * Returns the list of users
     * @return an ArrayList of users
     */
    public static ArrayList<User> getUsersList() {
        return userList;
    }

    /**
     * Checks if user can be added
     * @param string a String for the user's username
     * @param string2 a String for the user's password
     * @return true/false depending on if the user is in the database or not
     * @throws IOException
     */
    public static void addUser(String string, String string2) throws IOException {
       

        userList.add(new User(string, string2));
        DataWriter.saveUsers();
     
    }

    public User getUserById(Object id) {
        for(User user : userList)
		{
			if(user.getUserId().equals(id))
			{
				return user;
			}
		}
		return null;
    }
}
