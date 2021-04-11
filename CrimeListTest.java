import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CrimeListTest {
    private CrimeList crimes = CrimeList.getInstance();
	private ArrayList<Crime> crimeList = crimes.getCrimeList();
	
	@BeforeEach
	public void setup() {
		crimeList.clear();
        
		crimeList.add(new Crime(1, "Store GunFight", "4/5/2021", "10:42 PM", "true", null, null, null, null,null));
        crimeList.add(new Crime(2, "Bombing", "4/7/2021", "9:34 AM", "false", null, null, null, null,null));
        DataWriter.saveCrime();
    }
	
	@AfterEach
	public void tearDown() {
		CrimeList.getInstance().getCrimeList().clear();
        DataWriter.saveCrime();
	}

    @Test
	void testCreateDupe() {
		Crime test = new Crime(1, "Store GunFight", "4/5/2021", "10:42 PM", "true", null, null, null, null,null);
        crimes.addCrime(test);
		assertNotEquals(crimes.getCrimeList().size(), 3);
	}

    @Test
    void testHasValidFirstCrimeNum() {
        Crime firstCrime = crimeList.get(0);
		boolean hasFirst = (firstCrime.getCrimeNum() == 1);
		assertTrue(hasFirst);
    }

    @Test
    void testHasValidSecondCrimeNum() {
        assertEquals(crimeList.get(1).getCrimeNum(), 2);
    }

    @Test
    void testHasValidFirstCrimeDescription() {
        Crime firstCrime = crimeList.get(0);
		boolean hasFirst = (firstCrime.getDescription().equalsIgnoreCase("Store GunFight"));
		assertTrue(hasFirst);
    }

    @Test
    void testHasValidSecondCrimeDescription() {
        Crime secondCrime = crimeList.get(1);
		boolean hasSecond = (secondCrime.getDescription().equalsIgnoreCase("Bombing"));
		assertTrue(hasSecond);
    }

    @Test
    void testHasValidFirstCrimeDate() {
        Crime firstCrime = crimeList.get(0);
		boolean hasFirst = (firstCrime.getDateOfCrime().equalsIgnoreCase("4/5/2021"));
		assertTrue(hasFirst);
    }

    @Test
    void testHasValidSecondCrimeDate() {
        Crime secondCrime = crimeList.get(1);
		boolean hasSecond = (secondCrime.getDateOfCrime().equalsIgnoreCase("4/7/2021"));
		assertTrue(hasSecond);
    }

    @Test
    void testHasValidFirstCrimeTime() {
        Crime firstCrime = crimeList.get(0);
		boolean hasFirst = (firstCrime.getTimeOfCrime().equalsIgnoreCase("10:42 PM"));
		assertTrue(hasFirst);
    }

    @Test
    void testHasValidSecondCrimeTime() {
        Crime secondCrime = crimeList.get(1);
		boolean hasSecond = (secondCrime.getTimeOfCrime().equalsIgnoreCase("9:34 AM"));
		assertTrue(hasSecond);
    }

    @Test
    void testHasValidFirstCrimeOpen() {
        Crime firstCrime = crimeList.get(0);
		boolean hasFirst = (firstCrime.isCaseOpen().equalsIgnoreCase("True"));
		assertTrue(hasFirst);
    }

    @Test
    void testHasValidSecondCrimeOpen() {
        Crime secondCrime = crimeList.get(1);
		boolean hasSecond = (secondCrime.isCaseOpen().equalsIgnoreCase("False"));
		assertTrue(hasSecond);
    }

    @Test
    void testForSearchNotInList() {
        Crime firstCrime = crimeList.get(0);
        boolean hasCriminal = firstCrime.getCrimeNum()==14;
        assertFalse(hasCriminal);

    }

    @Test
	void testLengthOfList()
	{
		assertEquals(crimeList.size(), 2);
	}
}