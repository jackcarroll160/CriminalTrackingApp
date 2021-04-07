import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsersTest {
	
	private ArrayList<User> userList = new ArrayList<User>();
	
	@BeforeEach
	public void setup() {
		userList.clear();
		userList.add(new User("Kyle", "Kyle1234"));
		userList.add(new User("Canaan", "Cnan2351"));
	}
	
	@AfterEach
	public void tearDown() {
		userList.clear();
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
	
}