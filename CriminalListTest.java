import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CriminalListTest {
    private CriminalList criminals = CriminalList.getInstance();
	private ArrayList<Criminal> criminalList = criminals.getCriminalList();
	
	@BeforeEach
	public void setup() {
		criminalList.clear();
		criminalList.add(new Criminal("Kyle", "Persyn", "KP", 19, "Male", "White", "803-792-2294", "Speeding", "July 24, 2001", "Green", "Short Brown Hair", "Beard", "5'11", "178", "No Tattoos", "No Physical Marks", "Athletic", "No Weapon", "Smooth Tan Complexion", "Nike Gym Wear", "Black Chevy Avalanche"));
		DataWriter.saveCriminals();
	}
	
	@AfterEach
	public void tearDown() {
		CriminalList.getInstance().getCriminalList().clear();
		DataWriter.saveCriminals();
	}
	
	
	@Test
	void testHaveCriminalValidFirstName() {
        Criminal firstCrim = criminalList.get(0);
		boolean hasKyle = firstCrim.getFirstName().equalsIgnoreCase("Kyle");
		assertTrue(hasKyle);
	}
}
