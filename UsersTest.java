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
	void testHaveUsersValidFirstUserName() {
		boolean hasKyle = users.haveUser("Kyle");
		assertTrue(hasKyle);
	}

	@Test
	void testHaveUsersValidSecondUserName() {
		boolean hasCanaan = users.haveUser("Canaan");
		assertTrue(hasCanaan);
	}

	@Test
	void testHaveUsersValidSecondUserNameAndPWord() {
		boolean hasCanaan = users.haveUser("Canaan","Cnan2351");
		assertTrue(hasCanaan);
	}

	@Test
	void testHaveUsersValidFirstUserNameAndPWord() {
		boolean hasKyle = users.haveUser("Kyle","Kyle1234");
		assertTrue(hasKyle);
	}

	@Test
	void testCreateUserName() {
		users.addUser("Michael", "Testing");
		boolean hasMichael = users.haveUser("Michael","Testing");
		assertTrue(hasMichael);
	}

	@Test
	void testCreateSameUser() {
		users.addUser("Kyle", "Kyle2345");
		boolean hasKyle = users.haveUser("Kyle","Kyle2345");
		assertFalse(hasKyle);
	}

	@Test
	void testCreateWithBlank() {
		users.addUser("", "");
		boolean hasBlank = users.haveUser("","");
		assertFalse(hasBlank);
	}

	@Test
	void testCreateWithBlankPWord() {
		users.addUser("Test", "");
		boolean hasBlank = users.haveUser("Test","");
		assertFalse(hasBlank);
	}

	

	@Test
	void testHaveUserValidFirstUserName() {
		boolean hasKyle = userList.get(0).getUsername().equalsIgnoreCase("Kyle");
		assertTrue(hasKyle);
	}

	@Test
	void testHaveUserValidSecondUserName() {
		boolean hasCanaan = userList.get(1).getUsername().equalsIgnoreCase("Canaan");
		assertTrue(hasCanaan);
	}

	@Test
	void testHaveUserValidFirstPassword() {
		boolean hasKylePW = userList.get(0).getPassword().equalsIgnoreCase("Kyle1234");
		assertTrue(hasKylePW);
	}
	
	@Test
	void testHaveUserValidSecondPassword() {
		boolean hasCanaanPW = userList.get(1).getPassword().equalsIgnoreCase("Cnan2351");
		assertTrue(hasCanaanPW);
	}

	@Test
	void testUsersListLength() {
		assertEquals(userList.size(), 2);
	}

	@Test
	void testHaveUserEmpty() {
		boolean hasEmpty = userList.get(0).getUsername().equalsIgnoreCase("");
		assertFalse(hasEmpty);
	}
	
	@Test
	void testHaveUserNull() {
		boolean hasNull = userList.get(0).getUsername().equalsIgnoreCase(null);
		assertFalse(hasNull);
	}

	@Test
    void testForSearchNotInList() {
        boolean hasPW = userList.get(0).getPassword().equalsIgnoreCase("Lokasd1we1");
        assertFalse(hasPW);

    }

	/**
	 * This test added by Jack
	 */
	@Test
	void testForHaveUserPasswordEmpty() {
		boolean hasEmpty = userList.get(0).getPassword().equalsIgnoreCase("");
		assertFalse(hasEmpty);
	}
	
}