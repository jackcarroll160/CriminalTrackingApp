//package GUI_2;

import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;

public class Login extends LoginDialog {

    //private static HashMap<String, String> loginInfo = new HashMap<>();
    //private static ArrayList<User> temp = Users.getUsers();
 
    public static boolean authenticate(String username, String password) throws IOException {
        //loginInfo.put("user1", "password1");
        //loginInfo.put("user2", "password2");

        // verifying login credentials 
        /*if (loginInfo.containsKey(username) && loginInfo.get(username).equals(password)) {
            return true;
        }
        else {
            loginInfo.put(username, password);
            return false;
        } */
        if (userList.haveUser(username)) {
            return true;
        }
        return false;

    }

    public static boolean authenticateNewUser(String username, String password) throws IOException {
        Users userList = new Users();
        return userList.addUser(username, password);
    }

}
