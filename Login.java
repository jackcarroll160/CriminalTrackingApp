//package GUI_2;

import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.ArrayList;

public class Login extends LoginDialog {

    // private static HashMap<String, String> loginInfo = new HashMap<>();
    // private static ArrayList<User> temp = ;

    public static boolean authenticate(String username, String password) throws IOException {
<<<<<<< HEAD

        // verifying login credentials
        // loginInfo.put("user1", "password1");
        // loginInfo.put("user2", "password2");
        /*
         * if (loginInfo.containsKey(username) &&
         * loginInfo.get(username).equals(password)) { return true; } else {
         * loginInfo.put(username, password); return false; }
         */
        if (Users.haveUser(username) && Users.haveUser(password)) {
=======
        
        // verifying login credentials 
        //loginInfo.put("user1", "password1");
        //loginInfo.put("user2", "password2");
        /*if (loginInfo.containsKey(username) && loginInfo.get(username).equals(password)) {
            return true;
        }
        else {
            loginInfo.put(username, password);
            return false;
        } */
        if (Users.haveUser(username, User.haveUser(username))) {
>>>>>>> a0e1ae6e4c7db76fe102a214a799708dc81df4d8
            return true;
        }
        return false;

    }

    public static void authenticateNewUser(UUID id, String username, String password) throws IOException {
        authenticate(username, password);
        Users.addUser(username, password);
    }

}
