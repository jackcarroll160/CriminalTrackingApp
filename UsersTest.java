import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsersTest {
	private Users users = Users.getInstance();
	private ArrayList<User> userList = users.getUsersList();
	
	@BeforeEach
	public void setup() {
		userList.clear();
		userList.add(new User("Kyle", "Kyle1234"));
		userList.add(new User("Canaan", "Cnan2351"));
		DataWriter.saveUsers();
	}
	
	@AfterEach
	public void tearDown() {
		Users.getInstance().getUsersList().clear();
		DataWriter.saveUsers();
	}
	
	
	@Test
	void testHaveUserValidFirstItem() {
		boolean hasKyle = users.haveUser("Kyle");
		assertTrue(hasKyle);
	}
}