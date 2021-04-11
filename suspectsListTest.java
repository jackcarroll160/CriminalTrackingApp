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
		SuspectsList.add(new Suspect("Kyle", "Persyn", 19, "Male", "white", contactInfo, isMinor, statement, hasAlibi2, birthDate, eyeColor, hairDescription, facialHairDescription, height, weight, tattooDescription, hasPiercings2, physicalMarksDescription, physicalBuild, weaponDescription, complexion, clothingDescription, vehicleDescription));
        SuspectsList.add(new Victim("Canaan", "Eident", 20, "803-298-7924", "False", "True", "False", "Someone tried to rob me while I was pumping gas"));
		DataWriter.saveSuspect();
	}
	
	@AfterEach
	public void tearDown() {
		suspectsList.getInstance().getSuspectList().clear();
		DataWriter.saveSuspect();
	}
	
