import java.util.*;
public class RegisteredUser extends User{

    private ArrayList<Criminal> criminals;

    public RegisteredUser(){

    }

    public ArrayList<Criminal> getCriminals(){
        
        return criminals;

    }

    public ArrayList<Criminal> getCriminalsSearch(String firstName, String lastName){

        return criminals;

    }

    public void registeredUser(String firstName, String lastName, String password, String email){

    }

    public void addFavoriteCriminal(Criminal criminal){

    }

    public void suggestInformation(Criminal criminal, String comment){

    }

    public boolean isRegistered(String email, String username){
        
        return true;

    }
    
}