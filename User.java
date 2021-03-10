import java.util.*;
import java.util.Map;
public abstract class User {
    
    protected ArrayList<UUID> userID;
    protected String username;
    protected String password;
    protected HashMap<String, String> storeUserPwd;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected int authorizationLevel;

    public String toString(){

        return null;

    }

    public void getCriminals(Criminal criminal){

    }

    public void addCriminal(Criminal criminal){

    }

    public void favoiteReport(Criminal criminal){

    }

    public void addReport(Criminal criminal){

    }

    private boolean checkAuthorization(){

        return true;

    }
}

