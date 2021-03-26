//package GUI_2;

import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.ArrayList;

public class Login extends LoginDialog {

    // private static HashMap<String, String> loginInfo = new HashMap<>();
    // private static ArrayList<User> temp = ;

    public static boolean authenticate(String username, String password) throws IOException {

        // verifying login credentials
        // loginInfo.put("user1", "password1");
        // loginInfo.put("user2", "password2");
        /*
         * if (loginInfo.containsKey(username) &&
         * loginInfo.get(username).equals(password)) { return true; } else {
         * loginInfo.put(username, password); return false; }
         */
        if (Users.haveUser(username) && Users.haveUser(password)) {
            return true;
        }
        return false;

    }

    public static void authenticateNewUser(UUID id, String username, String password) throws IOException {
        authenticate(username, password);
        Users.addUser(username, password);
    }

}
