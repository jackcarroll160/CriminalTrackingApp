import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class witnessListTest {
	private ArrayList<Witness> WitnessList = new ArrayList<Witness>();
	
	@BeforeEach
	public void setup() {
		WitnessList.clear();
		WitnessList.add(new Witness("Kyle", "Persyn", 19, "803-792-2294", "False", "I found the suspects jacket on the floor", "I was fueling my car when the suspect stole the purse", "Shell Gas Station", "Bystander"));
        WitnessList.add(new Witness("Canaan", "Eident", 20, "803-298-7924", "False", "No Proof", "I was in my room during the crime and watched it from window", "Hilton Hotel", "Bystander"));
            }
	
	@AfterEach
	public void tearDown() {
		WitnessList.clear();
	}
	
	
	@Test
	void testHaveFirstWitnessValidFirstName() {
        Witness firstWitness = WitnessList.get(0);
		boolean hasKyle = firstWitness.getFirstName().equalsIgnoreCase("Kyle");
		assertTrue(hasKyle);
	}

	@Test
	void testHaveSecondWitnessValidFirstName() {
        Witness secondWitness = WitnessList.get(1);
		boolean hasCanaan = secondWitness.getFirstName().equalsIgnoreCase("Canaan");
		assertTrue(hasCanaan);
	}

    @Test
	void testHaveFirstWitnessValidLastName() {
        Witness firstWitness = WitnessList.get(0);
		boolean hasPersyn = firstWitness.getLastName().equalsIgnoreCase("Persyn");
		assertTrue(hasPersyn);
	}

	@Test
	void testHaveSecondWitnessValidLastName() {
        Witness secondWitness = WitnessList.get(1);
		boolean hasEident = secondWitness.getLastName().equalsIgnoreCase("Eident");
		assertTrue(hasEident);
	}

	@Test
	void testHaveFirstWitnesslValidAge() {
        Witness firstWitness = WitnessList.get(0);
		boolean correctAge = (firstWitness.getAge() == 19);
		assertTrue(correctAge);
	}

	@Test
	void testHaveSecondWitnessValidAge() {
        Witness secondWitness = WitnessList.get(1);
		boolean correctAge = (secondWitness.getAge() == 20);
		assertTrue(correctAge);
	}

	@Test
	void testHaveFirstWitnessValidContactInfo() {
        Witness firstWitness = WitnessList.get(0);
		boolean hasContact = firstWitness.getContactInfo().equalsIgnoreCase("803-792-2294");
		assertTrue(hasContact);
	}

	@Test
	void testHaveSecondWitnessValidContactInfo() {
        Witness secondWitness = WitnessList.get(1);
		boolean hasContact = secondWitness.getContactInfo().equalsIgnoreCase("803-298-7924");
		assertTrue(hasContact);
	}

    @Test
	void testHaveFirstWitnessValidMinor() {
        Witness firstWitness = WitnessList.get(0);
		boolean isMinor = firstWitness.getIsMinor().equalsIgnoreCase("False");
		assertTrue(isMinor);
	}

	@Test
	void testHaveSecondWitnessValidMinor() {
        Witness secondWitness = WitnessList.get(1);
		boolean isMinor = secondWitness.getIsMinor().equalsIgnoreCase("False");
		assertTrue(isMinor);
	}

    @Test
	void testHaveFirstWitnessValidProof() {
        Witness firstWitness = WitnessList.get(0);
		boolean Proof = firstWitness.getProof().equalsIgnoreCase("I found the suspects jacket on the floor");
		assertTrue(Proof);
	}

	@Test
	void testHaveSecondWitnessValidProof() {
        Witness secondWitness = WitnessList.get(1);
		boolean Proof = secondWitness.getProof().equalsIgnoreCase("No Proof");
		assertTrue(Proof);
	}

    @Test
	void testHaveFirstWitnessValidTestimony() {
        Witness firstWitness = WitnessList.get(0);
		boolean hasTestimony = firstWitness.getTestimony().equalsIgnoreCase("I was fueling my car when the suspect stole the purse");
		assertTrue(hasTestimony);
	}

	@Test
	void testHaveSecondWitnessValidTestimony() {
        Witness secondWitness = WitnessList.get(1);
		boolean hasTestimony = secondWitness.getTestimony().equalsIgnoreCase("I was in my room during the crime and watched it from window");
		assertTrue(hasTestimony);
	}

    @Test
	void testHaveFirstWitnessValidLocation() {
        Witness firstWitness = WitnessList.get(0);
		boolean hasLocation = firstWitness.getLocation().equalsIgnoreCase("Shell Gas Station");
		assertTrue(hasLocation);
	}

	@Test
	void testHaveSecondWitnessValidLocation() {
        Witness secondWitness = WitnessList.get(1);
		boolean hasLocation = secondWitness.getLocation().equalsIgnoreCase("Hilton Hotel");
		assertTrue(hasLocation);
	}

    @Test
	void testHaveFirstWitnessValidType() {
        Witness firstWitness = WitnessList.get(0);
		boolean hasType = firstWitness.getTypeOfWitness().equalsIgnoreCase("Bystander");
		assertTrue(hasType);
	}

	@Test
	void testHaveSecondWitnessValidType() {
        Witness secondWitness = WitnessList.get(1);
		boolean hasType = secondWitness.getTypeOfWitness().equalsIgnoreCase("Bystander");
		assertTrue(hasType);
	}

    @Test
    void testForSearchNotInList() {
        Witness firstWitness = WitnessList.get(0);
        boolean hasType = firstWitness.getTypeOfWitness().equalsIgnoreCase("Not Here");
        assertFalse(hasType);

    }

    @Test
	void testLengthOfList()
	{
		assertEquals(WitnessList.size(), 2);
	}

}