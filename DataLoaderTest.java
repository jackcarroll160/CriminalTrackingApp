import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DataLoaderTest {
    private Users users = Users.getInstance();
    private ArrayList<User> userList = users.getUsersList();

    private CriminalList criminals = CriminalList.getInstance();
    private ArrayList<Criminal> criminalList = criminals.getCriminalList();

    private CrimeList crimes = CrimeList.getInstance();
    private ArrayList<Crime> crimeList = crimes.getCrimeList();

    private suspectsList suspects = suspectsList.getInstance();
    private ArrayList<Suspect> suspectList= suspects.getSuspectList();

    private victimsList victims = victimsList.getInstance();
    private ArrayList<Victim> victimList = victims.getVictimList();

    private personOfInterestList pois = personOfInterestList.getInstance();
    private ArrayList<PersonOfInterest> poiList = pois.getPersonOfInterestList();
    
    @BeforeEach
    public void setup() {
        userList.clear();
        userList.add(new User("JackTest", "PWD"));
        DataWriter.saveUsers();
    }

    @AfterEach
    public void tearDown() {
        Users.getInstance().getUsersList().clear();
        DataWriter.saveUsers();
    }

    @Test
    void testGetUsersSize() {
        userList = DataLoader.loadUsers();
        assertEquals(1, userList.size());
    }

    @Test
    void testGetUsersSizeZero() {
        Users.getInstance().getUsersList().clear();
        DataWriter.saveUsers();
        assertEquals(0, userList.size());
    }

    @Test 
    void testGetUserFirstUsername() {
        userList = DataLoader.loadUsers();
        assertEquals("JackTest", userList.get(0).getUsername());
    }

    @Test
    void testGetUserFirstPassword() {
        userList = DataLoader.loadUsers();
        assertEquals("PWD", userList.get(1).getPassword());
    }

    @Test
    void testLoadCriminalsList() {
        criminalList = DataLoader.loadCriminals();
        assertEquals(criminalList, criminals);
    }

    @Test
    void testLoadCrimesList() {
        crimeList = DataLoader.loadCrime();
        assertEquals(crimeList, crimes);
    }

    @Test
    void testLoadSuspectsList() {
        suspectList = DataLoader.loadSuspects();
        assertEquals(suspectList, suspects);
    }

    @Test
    void testLoadVictimsList() {
        victimList = DataLoader.loadVictims();
        assertEquals(victimList, victims);
    }

    @Test
    void testLoadPOIsList() {
        poiList = DataLoader.loadPersonOfInterests();
        assertEquals(poiList, pois);
    }
}
