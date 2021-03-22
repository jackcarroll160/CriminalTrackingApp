//package GUI_2;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import java.awt.*;

public class Login extends LoginDialog {

    private static HashMap<String, String> loginInfo = new HashMap<>();
    private boolean usernameTaken;
 
    public static boolean authenticate(String username, String password) {

        loginInfo.put("user1", "password1");
        loginInfo.put("user2", "password2");
        //loginInfo.put("user3", "password3");
        //loginInfo.put("user4", "password4");
        //loginInfo.put("user5", "password5");
        //loginInfo.put("", ""); // for easy login for me

        // verifying login credentials 
        if (loginInfo.containsKey(username) && loginInfo.get(username).equals(password)) {
            return true;
        }
        else {
            loginInfo.put(username, password);
            return false;
        }

    }

    public static boolean authenticateNewUser(String username, String password) {
        loginInfo.put("user1", "password1");
        loginInfo.put("user2", "password2");
        
        if (loginInfo.containsKey(username)) {
            return false;
        }
        else {
            loginInfo.put(username, password);
            return true;
        }
    }

    private boolean checkAllUsernames(String username, String password) {
        for (Map.Entry<String, String> entry : loginInfo.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.equalsIgnoreCase(username))
                usernameTaken = true;
            else if (key.equalsIgnoreCase(username) && value.equals(password))
                return true;
            else
                continue;
        }
    }

}
