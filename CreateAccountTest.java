import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Create account test class
 * Tested by Jackson Carroll 
 */
public class CreateAccountTest {

    //private CreateAccount createAccount = new CreateAccount();
    private static Users users = Users.getInstance();
    private static ArrayList<User> userList = users.getUsersList();
    //private static ArrayList<User> userList

    @BeforeEach
    public void setup() {
        //Users.getInstance().getUsersList().clear();
        //DataWriter.saveUsers();
        userList.clear();
        users.addUser("JackTest", "PWDTest");
        users.addUser("", "");
        DataWriter.saveUsers();
        //userList.addUser("", "");
    }

    @AfterEach
    public void tearDown() {
        //Users.getInstance().getUsersList().clear();
        userList.clear();
        //DataWriter.saveUsers();
        //userList.clear();
    }

    @Test
    public void testCreateValidAccount() {
        //Users.getInstance().addUser("JackTest", "PWDTest");
        //users.haveUser("JackTest");
        //User myUser = users.getUser("JackTest");
        //assertEquals("JackTest", myUser.getUsername());

        User firstUser = userList.get(0);
        boolean isCreated = firstUser.getUsername().equalsIgnoreCase("JackTest");
        assertTrue(isCreated);
    }

    @Test
    void testBlankUsername() {
        User secondUser = userList.get(1);
        boolean hasSecondUsername = secondUser.getUsername().equalsIgnoreCase("");
        assertTrue(hasSecondUsername);
    }

    @Test
    void testForEmptyUsername() {
        User blankUsername = userList.get(1);
        boolean hasBlankUsername = blankUsername.getUsername().equalsIgnoreCase("");
        assertFalse(hasBlankUsername);
    }

    @Test
    void testForEmptyPassword() {
        User blankPassword = userList.get(1);
        boolean hasBlankPassword = blankPassword.getPassword().equalsIgnoreCase("");
        assertTrue(hasBlankPassword);
    }
}
