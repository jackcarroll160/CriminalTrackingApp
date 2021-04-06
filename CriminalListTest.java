import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CriminalListTest {
	private ArrayList<Criminal> criminalList = new ArrayList<Criminal>();
	
	@BeforeEach
	public void setup() {
		criminalList.clear();
		criminalList.add(new Criminal("Kyle", "Persyn", "KP", 19, "Male", "White", "803-792-2294", "Speeding", "July 24, 2001", "Green", "Short Brown Hair", "Beard", "5'11", "178", "No Tattoos", "No Physical Marks", "Athletic", "No Weapon", "Smooth Tan Complexion", "Nike Gym Wear", "Black Chevy Avalanche"));
		criminalList.add(new Criminal("Canaan", "Eident", "Cnan", 20, "Female", "White", "803-298-7924", "Trespassing", "March 17, 2001", "Hazel", "Medium Length Brown Hair", "No Facial Hair", "5'5", "130", "No Tattoos", "No Physical Marks", "Athletic", "No Weapon", "Smooth Tan Complexion", "Yoga Athletic Wear", "Gray Camry"));
	}
	
	@AfterEach
	public void tearDown() {
		criminalList.clear();
	}
	
	
	@Test
	void testHaveFirstCriminalValidFirstName() {
        Criminal firstCrim = criminalList.get(0);
		boolean hasKyle = firstCrim.getFirstName().equalsIgnoreCase("Kyle");
		assertTrue(hasKyle);
	}

	@Test
	void testHaveSecondCriminalValidFirstName() {
        Criminal secondCrim = criminalList.get(1);
		boolean hasCanaan = secondCrim.getFirstName().equalsIgnoreCase("Canaan");
		assertTrue(hasCanaan);
	}

	@Test
	void testHaveFirstCriminalValidLastName() {
        Criminal firstCrim = criminalList.get(0);
		boolean hasPersyn = firstCrim.getLastName().equalsIgnoreCase("Persyn");
		assertTrue(hasPersyn);
	}

	@Test
	void testHaveSecondCriminalValidLastName() {
        Criminal secondCrim = criminalList.get(1);
		boolean hasEident = secondCrim.getLastName().equalsIgnoreCase("Eident");
		assertTrue(hasEident);
	}

	@Test
	void testHaveFirstCriminalValidNickName() {
        Criminal firstCrim = criminalList.get(0);
		boolean hasNick = firstCrim.getNickname().equalsIgnoreCase("kp");
		assertTrue(hasNick);
	}

	@Test
	void testHaveSecondCriminalValidNickName() {
        Criminal secondCrim = criminalList.get(1);
		boolean hasNick = secondCrim.getNickname().equalsIgnoreCase("cnan");
		assertTrue(hasNick);
	}

	@Test
	void testHaveFirstCriminalValidAge() {
        Criminal firstCrim = criminalList.get(0);
		boolean correctAge = (firstCrim.getAge() == 19);
		assertTrue(correctAge);
	}

	@Test
	void testHaveSecondCriminalValidAge() {
        Criminal secondCrim = criminalList.get(1);
		boolean correctAge = (secondCrim.getAge() == 20);
		assertTrue(correctAge);
	}

	@Test
	void testHaveFirstCriminalValidGender() {
        Criminal firstCrim = criminalList.get(0);
		boolean hasGender = firstCrim.getGender().equalsIgnoreCase("Male");
		assertTrue(hasGender);
	}

	@Test
	void testHaveSecondCriminalValidGender() {
        Criminal secondCrim = criminalList.get(1);
		boolean hasGender = secondCrim.getGender().equalsIgnoreCase("Female");
		assertTrue(hasGender);
	}

	@Test
	void testHaveFirstCriminalValidEthnicity() {
        Criminal firstCrim = criminalList.get(0);
		boolean hasEthnicity = firstCrim.getEthnicity().equalsIgnoreCase("White");
		assertTrue(hasEthnicity);
	}

	@Test
	void testHaveSecondCriminalValidEthnicity() {
        Criminal secondCrim = criminalList.get(1);
		boolean hasEthnicity = secondCrim.getEthnicity().equalsIgnoreCase("White");
		assertTrue(hasEthnicity);
	}

	@Test
	void testHaveFirstCriminalValidContactInfo() {
        Criminal firstCrim = criminalList.get(0);
		boolean hasEthnicity = firstCrim.getContactinfo().equalsIgnoreCase("803-792-2294");
		assertTrue(hasEthnicity);
	}

	@Test
	void testHaveSecondCriminalValidContactInfo() {
        Criminal secondCrim = criminalList.get(1);
		boolean hasEthnicity = secondCrim.getContactinfo().equalsIgnoreCase("803-298-7924");
		assertTrue(hasEthnicity);
	}
}
