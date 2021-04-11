import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class victimsListTest {
	private victimsList victims = victimsList.getInstance();
	private ArrayList<Victim> VictimsList = victims.getVictimList();
	
	@BeforeEach
	public void setup() {
		VictimsList.clear();  
		VictimsList.add(new Victim("Kyle", "Persyn", 19, "803-792-2294", "False", "True", "True", "I was walking down the street and was shot"));
        VictimsList.add(new Victim("Canaan", "Eident", 20, "803-298-7924", "False", "True", "False", "Someone tried to rob me while I was pumping gas"));
		DataWriter.saveVictim();
	}
	
	@AfterEach
	public void tearDown() {
		victimsList.getInstance().getVictimList().clear();
		DataWriter.saveVictim();
	}
	
	@Test
	void testHaveFirstVictimInList(){
		boolean hasFirst = victims.searchVictimsByName("Kyle", "Persyn") != null;
		assertTrue(hasFirst);
	}

	@Test
	void testHaveSecondVictimInList(){
		boolean hasFirst = victims.searchVictimsByName("Canaan", "Eident") != null;
		assertTrue(hasFirst);
	}

	@Test
	void testCreateDupe() {
		Victim canaan = new Victim("Canaan", "Eident", 20, "803-298-7924", "False", "True", "False", "Someone tried to rob me while I was pumping gas");
		victims.addVictim(canaan);
		assertNotEquals(victims.getVictimList().size(), 3);
	}
	
	@Test
	void testHaveFirstVictimValidFirstName() {
        Victim firstVictim = VictimsList.get(0);
		boolean hasKyle = firstVictim.getFirstName().equalsIgnoreCase("Kyle");
		assertTrue(hasKyle);
	}

	@Test
	void testHaveSecondVictimValidFirstName() {
        Victim secondVictim = VictimsList.get(1);
		boolean hasCanaan = secondVictim.getFirstName().equalsIgnoreCase("Canaan");
		assertTrue(hasCanaan);
	}

    @Test
	void testHaveFirstVictimValidLastName() {
        Victim firstVictim = VictimsList.get(0);
		boolean hasPersyn = firstVictim.getLastName().equalsIgnoreCase("Persyn");
		assertTrue(hasPersyn);
	}

	@Test
	void testHaveSecondVictimValidLastName() {
        Victim secondVictim = VictimsList.get(1);
		boolean hasEident = secondVictim.getLastName().equalsIgnoreCase("Eident");
		assertTrue(hasEident);
	}

	@Test
	void testHaveFirstVictimlValidAge() {
        Victim firstVictim = VictimsList.get(0);
		boolean correctAge = (firstVictim.getAge() == 19);
		assertTrue(correctAge);
	}

	@Test
	void testHaveSecondVictimValidAge() {
        Victim secondVictim = VictimsList.get(1);
		boolean correctAge = (secondVictim.getAge() == 20);
		assertTrue(correctAge);
	}

	@Test
	void testHaveFirstVictimValidContactInfo() {
        Victim firstVictim = VictimsList.get(0);
		boolean hasContact = firstVictim.getContactInfo().equalsIgnoreCase("803-792-2294");
		assertTrue(hasContact);
	}

	@Test
	void testHaveSecondVictimValidContactInfo() {
        Victim secondVictim = VictimsList.get(1);
		boolean hasContact = secondVictim.getContactInfo().equalsIgnoreCase("803-298-7924");
		assertTrue(hasContact);
	}

    @Test
	void testHaveFirstVictimValidMinor() {
        Victim firstVictim = VictimsList.get(0);
		boolean isMinor = firstVictim.getIsMinor().equalsIgnoreCase("False");
		assertTrue(isMinor);
	}

	@Test
	void testHaveSecondVictimValidMinor() {
        Victim secondVictim = VictimsList.get(1);
		boolean isMinor = secondVictim.getIsMinor().equalsIgnoreCase("False");
		assertTrue(isMinor);
	}

    @Test
	void testHaveFirstVictimValidAlive() {
        Victim firstVictim = VictimsList.get(0);
		boolean isAlive = firstVictim.isAlive().equalsIgnoreCase("True");
		assertTrue(isAlive);
	}

	@Test
	void testHaveSecondVictimValidAlive() {
        Victim secondVictim = VictimsList.get(1);
		boolean isAlive = secondVictim.isAlive().equalsIgnoreCase("True");
		assertTrue(isAlive);
	}

    @Test
	void testHaveFirstVictimValidInjured() {
        Victim firstVictim = VictimsList.get(0);
		boolean isInjured = firstVictim.isInjured().equalsIgnoreCase("True");
		assertTrue(isInjured);
	}

	@Test
	void testHaveSecondVictimValidInjured() {
        Victim secondVictim = VictimsList.get(1);
		boolean isInjured = secondVictim.isInjured().equalsIgnoreCase("False");
		assertTrue(isInjured);
	}

    @Test
	void testHaveFirstVictimValidStatement() {
        Victim firstVictim = VictimsList.get(0);
		boolean isMinor = firstVictim.getStatement().equalsIgnoreCase("I was walking down the street and was shot");
		assertTrue(isMinor);
	}

	@Test
	void testHaveSecondVictimValidStatement() {
        Victim secondVictim = VictimsList.get(1);
		boolean isMinor = secondVictim.getStatement().equalsIgnoreCase("Someone tried to rob me while I was pumping gas");
		assertTrue(isMinor);
	}

    @Test
    void testForSearchNotInList() {
        Victim firstVictim = VictimsList.get(0);
        boolean hasVictim = firstVictim.getFirstName().equalsIgnoreCase("Not Here");
        assertFalse(hasVictim);

    }

    @Test
	void testLengthOfList()
	{
		assertEquals(VictimsList.size(), 2);
	}

}
