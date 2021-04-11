import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class personOfInterestListTest {
	private personOfInterestList pois = personOfInterestList.getInstance();
	private ArrayList<PersonOfInterest> poiList = pois.getPersonOfInterestList();
	
	@BeforeEach
	public void setup() {
		poiList.clear();
        
		poiList.add(new PersonOfInterest("Kyle", "Persyn", 19, "803-792-2294", "False", "I was on a plane when the crime happend", "True", "False"));
        poiList.add(new PersonOfInterest("Canaan", "Eident", 20, "803-298-7924", "False", "I was on a run at the time of the crime", "False", "True"));
		DataWriter.savePersonOfInterest();
	}
	
	@AfterEach
	public void tearDown() {
		personOfInterestList.getInstance().getPersonOfInterestList().clear();
		DataWriter.savePersonOfInterest();
	}
	
	@Test
	void testCreateDupe() {
		PersonOfInterest kyle = new PersonOfInterest("Kyle", "Persyn", 19, "803-792-2294", "False", "I was on a plane when the crime happend", "True", "False");
		pois.addPersonOfInterest("Kyle", "Persyn", 19, "803-792-2294", "False", "I was on a plane when the crime happend", "True", "False");
		assertNotEquals(pois.getPersonOfInterestList().size(), 3);
	}
	
	@Test
	void testHaveFirstPOIValidFirstName() {
        PersonOfInterest firstPOI = poiList.get(0);
		boolean hasKyle = firstPOI.getFirstName().equalsIgnoreCase("Kyle");
		assertTrue(hasKyle);
	}

	@Test
	void testHaveSecondPOIValidFirstName() {
        PersonOfInterest secondPOI = poiList.get(1);
		boolean hasCanaan = secondPOI.getFirstName().equalsIgnoreCase("Canaan");
		assertTrue(hasCanaan);
	}

    @Test
	void testHaveFirstPOIValidLastName() {
        PersonOfInterest firstPOI = poiList.get(0);
		boolean hasPersyn = firstPOI.getLastName().equalsIgnoreCase("Persyn");
		assertTrue(hasPersyn);
	}

	@Test
	void testHaveSecondPOIValidLastName() {
        PersonOfInterest secondPOI = poiList.get(1);
		boolean hasEident = secondPOI.getLastName().equalsIgnoreCase("Eident");
		assertTrue(hasEident);
	}

    @Test
	void testHaveFirstPOIlValidAge() {
        PersonOfInterest firstPOI = poiList.get(0);
		boolean correctAge = (firstPOI.getAge() == 19);
		assertTrue(correctAge);
	}

	@Test
	void testHaveSecondPOIValidAge() {
        PersonOfInterest secondPOI = poiList.get(1);
		boolean correctAge = (secondPOI.getAge() == 20);
		assertTrue(correctAge);
	}

	@Test
	void testHaveFirstPOIValidContactInfo() {
        PersonOfInterest firstPOI = poiList.get(0);
		boolean hasContact = firstPOI.getContactInfo().equalsIgnoreCase("803-792-2294");
		assertTrue(hasContact);
	}

	@Test
	void testHaveSecondPOIValidContactInfo() {
        PersonOfInterest secondPOI = poiList.get(1);
		boolean hasContact = secondPOI.getContactInfo().equalsIgnoreCase("803-298-7924");
		assertTrue(hasContact);
	}

    @Test
	void testHaveFirstPOIValidMinor() {
        PersonOfInterest firstPOI = poiList.get(0);
		boolean isMinor = firstPOI.getIsMinor().equalsIgnoreCase("False");
		assertTrue(isMinor);
	}

	@Test
	void testHaveSecondPOIValidMinor() {
        PersonOfInterest secondPOI = poiList.get(1);
		boolean isMinor = secondPOI.getIsMinor().equalsIgnoreCase("False");
		assertTrue(isMinor);
	}

    @Test
	void testHaveFirstPOIValidStatement() {
        PersonOfInterest firstPOI = poiList.get(0);
		boolean isMinor = firstPOI.getStatement().equalsIgnoreCase("I was on a plane when the crime happend");
		assertTrue(isMinor);
	}

	@Test
	void testHaveSecondPOIValidStatement() {
        PersonOfInterest secondPOI = poiList.get(1);
		boolean isMinor = secondPOI.getStatement().equalsIgnoreCase("I was on a run at the time of the crime");
		assertTrue(isMinor);
	}

    @Test
    void testForSearchNotInList() {
        PersonOfInterest firstPOI = poiList.get(0);
        boolean hasPOI = firstPOI.getFirstName().equalsIgnoreCase("Not Here");
        assertFalse(hasPOI);

    }

    @Test
	void testLengthOfList()
	{
		assertEquals(poiList.size(), 2);
	}

}
