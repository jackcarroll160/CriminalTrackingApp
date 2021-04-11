import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class suspectsListTest {
	private suspectsList suspects = suspectsList.getInstance();
	private ArrayList<Suspect> SuspectsList = suspects.getSuspectList();
	
	@BeforeEach
	public void setup() {
		SuspectsList.clear();  
		SuspectsList.add(new Suspect("Kyle", "Persyn", 19, "Male", "white", "803-792-2294", "false", "I was at the field", "false", "July 24, 2001", "Green", "Short Brown Hair", "Beard", "5'11", "178", "No Tattoos", "None", "None", "Athletic", "None", "Smooth tan Complexion", "Athletic Clothes", "Black Chevy Avalanche"));
		DataWriter.saveSuspect();
	}
	
	@AfterEach
	public void tearDown() {
		suspectsList.getInstance().getSuspectList().clear();
		DataWriter.saveSuspect();
	}

    @Test
    void testHasValidFirstSuspect(){
        boolean hasSuspect = suspects.searchSuspectsByName("Kyle", "Persyn") != null;
        assertTrue(hasSuspect);
    }

    @Test
    void testAddCriminal() {
        Suspect canaan = new Suspect("Canaan", "Eident", 19, "Male", "white", "803-792-2294", "false", "I was at the field", "false", "July 24, 2001", "Green", "Short Brown Hair", "Beard", "5'11", "178", "No Tattoos", "None", "None", "Athletic", "None", "Smooth tan Complexion", "Athletic Clothes", "Black Chevy Avalanche");
        suspects.addSuspect(canaan);
        boolean hasSuspect = suspects.searchSuspectsByName("Canaan", "Eident") != null;
        assertTrue(hasSuspect);
    }

    @Test
    void testCreateDupe(){
        Suspect dupe = new Suspect("Kyle", "Persyn", 19, "Male", "white", "803-792-2294", "false", "I was at the field", "false", "July 24, 2001", "Green", "Short Brown Hair", "Beard", "5'11", "178", "No Tattoos", "None", "None", "Athletic", "None", "Smooth tan Complexion", "Athletic Clothes", "Black Chevy Avalanche");
        suspects.addSuspect(dupe);
        assertNotEquals(suspects.getSuspectList().size(), 2);
    }
}
	
