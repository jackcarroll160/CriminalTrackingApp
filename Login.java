//package GUI_2;

import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;

import javax.swing.JOptionPane;

import java.util.ArrayList;

public class Login extends LoginDialog {

    
    /** 
     * @param username
     * @param password
     * @return boolean
     * @throws IOException
     */
    // private static HashMap<String, String> loginInfo = new HashMap<>();
    // private static ArrayList<User> temp = ;

    public static boolean authenticate(String username, String password) throws IOException {

        if (Users.getInstance().haveUser(username)) {
            return true;
        }
        return false;
    //}

    }

    
    /** 
     * @param username
     * @param password
     * @return boolean
     * @throws IOException
     */
    public static boolean authenticateNewUser(String username, String password) throws IOException {
        if(authenticate(username, password))
        {
        Users.getInstance().addUser(username, password);
        return true;
        }
        return false;
    }

}
