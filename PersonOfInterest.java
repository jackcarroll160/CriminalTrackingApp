import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

/*
 * @author Kyle Persyn
 * This class is going to be the PersonOfInterest  class that will be included as part of the crimes
 */
public class PersonOfInterest extends Person {

	private String statement;
	private String hasAlibi;
	private String isSuspect;
	private UUID personId;
	private UUID suspectId;
	private UUID crimeId;

	public PersonOfInterest(String firstName, String lastName,
			int age, String contactInfo, String isMinor, String statement, String hasAlibi2, String isSuspect2) {
		super(firstName, lastName, age, contactInfo, isMinor);
		this.statement = statement;
		this.hasAlibi = hasAlibi2;
		this.isSuspect = isSuspect2;
		this.personId = UUID.randomUUID();
		this.suspectId = UUID.randomUUID();
		this.crimeId = UUID.randomUUID();

	}



	/*
	 * This is a method that will take all of the data that was input and return it
	 * in a readable string format
	 * 
	 * @return a String with all of the data and attributes
	 */
	public String toString() {
		return "********* " + firstName +" " + lastName +"'s Report *********\n" + 
		 "\n Age: " + age + "\n Contact Information: " + contactInfo + "\n Statement: " + statement +  "\n Has Alibi: " + hasAlibi +
		 "\n Is Suspect: " + isSuspect+
		 "\n Is Minor: " + isMinor + "\n Person Of Interest Id: " + personId + "\n Suspect Id: " + suspectId + "\n Crime Id: " + crimeId;
	}

	/*
	 * This is the class that will return the statemet of the POI
	 * 
	 * @return a String that holds the statement
	 */
	public String getStatement() {
		return statement;
	}

	/*
	 * This is the class that will set the statemet of the POI
	 * 
	 * @param a String that holds the statement
	 */
	public void setStatement(String statement) {
		this.statement = statement;
	}

	/*
	 * This is the class that will return the boolean of alibi of the POI
	 * 
	 * @return a boolean that holds the alibi flag
	 */
	public String isHasAlibi() {
		return hasAlibi;
	}

	/*
	 * This is the class that will set the boolean of alibi of the POI
	 * 
	 * @param a boolean that holds the alibi flag
	 */
	public void setHasAlibi(String hasAlibi) {
		this.hasAlibi = hasAlibi;
	}

	/*
	 * This is the class that will return the suspect boolean of the POI
	 * 
	 * @return a boolean that holds the suspect flag
	 */
	public String isSuspect() {
		return isSuspect;
	}

	/*
	 * This is the class that will set the suspect boolean of the POI
	 * 
	 * @param a boolean that holds the suspect flag
	 */
	public void setSuspect(String isSuspect) {
		this.isSuspect = isSuspect;
	}

	/*
	 * This is the class that will return the id of the POI
	 * 
	 * @return an int that holds the id
	 */
	public UUID getPersonId() {
		return personId;
	}

	/*
	 * This is the class that will set the id of the POI
	 * 
	 * @param an int that holds the id
	 */
	public void setPersonId(UUID personId) {
		this.personId = personId;
	}

	public UUID getCrimeId() {
		return crimeId;
	}

	public UUID getSuspectId() {
		return suspectId;
	}

	public void setCrimeId(UUID crimeId) {
		this.crimeId = crimeId;
	}

	public void setSuspectId(UUID suspectId) {
		this.suspectId = suspectId;
	}

	public void Download(String string, String string2) {
		try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("criminalReports/"+string2+ ".txt"));
            writer.write(string);
            writer.close();
    } catch (IOException e)
        {
            e.printStackTrace();
        }
	}

}
