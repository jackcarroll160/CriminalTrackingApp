import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataWriterTest {
	private Users users = Users.getInstance();
	private ArrayList<User> userList = users.getUsersList();

    private CriminalList criminals = CriminalList.getInstance();
    private ArrayList<Criminal> criminalList = criminals.getCriminalList();

    private CrimeList crimes = CrimeList.getInstance();
    private ArrayList<Crime> crimeList = crimes.getCrimeList();

    private witnessList witnesses = witnessList.getInstance();
    private ArrayList<Witness> WitnessList = witnesses.getWitnessList();

    private suspectsList suspects = suspectsList.getInstance();
    private ArrayList<Suspect> suspectList= suspects.getSuspectList();

    private victimsList victims = victimsList.getInstance();
    private ArrayList<Victim> victimList = victims.getVictimList();

    private personOfInterestList pois = personOfInterestList.getInstance();
    private ArrayList<PersonOfInterest> poiList = pois.getPersonOfInterestList();
	
	@BeforeEach
	public void setup() {
		Users.getInstance().getUsersList().clear();
		DataWriter.saveUsers();
        CriminalList.getInstance().getCriminalList().clear();
        DataWriter.saveCriminals();
        CrimeList.getInstance().getCrimeList().clear();
        DataWriter.saveCrime();
        witnessList.getInstance().getWitnessList().clear();
        DataWriter.saveWitness();
        suspectsList.getInstance().getSuspectList().clear();
        DataWriter.saveSuspect();
        victimsList.getInstance().getVictimList().clear();
        DataWriter.saveVictim();
        personOfInterestList.getInstance().getPersonOfInterestList().clear();
        DataWriter.savePersonOfInterest();

	}
	
	@AfterEach
	public void tearDown() {
		Users.getInstance().getUsersList().clear();
		DataWriter.saveUsers();
        CriminalList.getInstance().getCriminalList().clear();
        DataWriter.saveCriminals();
        CrimeList.getInstance().getCrimeList().clear();
        DataWriter.saveCrime();
        witnessList.getInstance().getWitnessList().clear();
        DataWriter.saveWitness();
        suspectsList.getInstance().getSuspectList().clear();
        DataWriter.saveSuspect();
        victimsList.getInstance().getVictimList().clear();
        DataWriter.saveVictim();
        personOfInterestList.getInstance().getPersonOfInterestList().clear();
        DataWriter.savePersonOfInterest();
	}
	
	
	@Test
	void testWritingZeroUsers() {
		userList = DataLoader.loadUsers();
		assertEquals(0, userList.size());
	}

	@Test
	void testWritingOneUser() {
		userList.add(new User("Kyle", "Persyn"));
		DataWriter.saveUsers();
		assertEquals("Kyle", DataLoader.loadUsers().get(0).getUsername());
	}
	
	@Test
	void testWritingFiveUsers() {
		userList.add(new User("asmith", "Amy"));
		userList.add(new User("bsmith", "Amy"));
		userList.add(new User("csmith", "Amy"));
		userList.add(new User("dsmith", "Amy"));
		userList.add(new User("esmith", "Amy"));
		DataWriter.saveUsers();
		assertEquals("esmith", DataLoader.loadUsers().get(4).getUsername());
	}
	
	@Test
	void testWritingEmptyUser() {
		userList.add(new User("", ""));
		DataWriter.saveUsers();
		assertEquals("", DataLoader.loadUsers().get(0).getUsername());
	}
	
	@Test
	void testWritingNullUser() {
		userList.add(new User(null, ""));
		DataWriter.saveUsers();
		assertEquals(null, DataLoader.loadUsers().get(0).getUsername());
	}

    @Test
	void testWritingZeroCriminals() {
		criminalList = DataLoader.loadCriminals();
		assertEquals(0, criminalList.size());
	}

	@Test
	void testWritingUUID() {
		criminalList.add(new Criminal("Kyle", "Persyn", null, 19, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null));
		DataWriter.saveCriminals();
		assertEquals("Kyle", DataLoader.loadCriminals().get(0).getFirstName());
	}
	
}
