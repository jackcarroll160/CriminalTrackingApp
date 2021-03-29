import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

/*
 * @author Kyle Persyn
 * This class is going to be the Witness  class that will be included as part of the crimes
 */
public class Witness extends Person{
	
	private UUID witnessId;
	private UUID crimeId;
	private String contanctInfo;
	private String proof;
	private String testimony;
	private String location;
	private String typeOfWitness;
	
/*
	This is one of the default constructors that will create a new Witness
*/
	public Witness(String firstName, String lastName, int age, String contactInfo, String isMinor, String proof,
            String testimony, String location, String typeOfWitness) {
			
			super(firstName,lastName,age,contactInfo,isMinor);
			this.witnessId = UUID.randomUUID();
			this.crimeId = UUID.randomUUID();
			this.proof = proof;
			this.testimony = testimony;
			this.location = location;
			this.typeOfWitness = typeOfWitness;
    }
/*
	This is one of the default constructors that will create a new Witness and read the json
*/
	public Witness(UUID witnessId2, String firstName, String lastName, int age, String contactInfo,
			String isMinor, String proof2, String testimony2, String location2, String typeOfWitness2) {

			super(firstName,lastName,age,contactInfo,isMinor);
			this.witnessId = UUID.randomUUID();
			this.proof = proof2;
			this.testimony = testimony2;
			this.location = location2;
			this.typeOfWitness = typeOfWitness2;
			this.witnessId= witnessId2;
			
	}

	
	/** 
	 * @return String
	 */
	/*
	 * This is the class that will return the proof of the witness
	 * @return a String that holds the proof
	 */
	public String getProof() {
		return proof;
	}

	
	/** 
	 * @param proof
	 */
	/*
	 * This is the class that will set the proof of the witness
	 * @param a String that holds the proof
	 */
	public void setProof(String proof) {
		this.proof = proof;
	}

	
	/** 
	 * @return String
	 */
	/*
	 * This is the class that will return the testimony of the witness
	 * @return a String that holds the testimony
	 */
	public String getTestimony() {
		return testimony;
	}

	
	/** 
	 * @param testimony
	 */
	/*
	 * This is the class that will set the testimony of the witness
	 * @param a String that holds the testimony
	 */
	public void setTestimony(String testimony) {
		this.testimony = testimony;
	}

	
	/** 
	 * @return String
	 */
	/*
	 * This is the class that will return the location of the witness
	 * @return a String that holds the location
	 */
	public String getLocation() {
		return location;
	}

	
	/** 
	 * @param location
	 */
	/*
	 * This is the class that will set the location of the witness
	 * @param a String that holds the location
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	
	/** 
	 * @return String
	 */
	/*
	 * This is the class that will return the type of the witness
	 * @return a String that holds the type
	 */
	public String getTypeOfWitness() {
		return typeOfWitness;
	}

	
	/** 
	 * @param typeOfWitness
	 */
	/*
	 * This is the class that will set the type of the witness
	 * @param a String that holds the type
	 */
	public void setTypeOfWitness(String typeOfWitness) {
		this.typeOfWitness = typeOfWitness;
	}

	
	/** 
	 * @return UUID
	 */
	/*
	 * This is the class that will return the id of the witness
	 * @return an int that holds the id
	 */
	public UUID getWitnessId() {
		return witnessId;
	}

	
	/** 
	 * @param witnessId
	 */
	/*
	 * This is the class that will set the id of the witness
	 * @param an int that holds the id
	 */
	public void setWitnessId(UUID witnessId) {
		this.witnessId = witnessId;
	}
	
	
	/** 
	 * @return UUID
	 */
	public UUID getCrimeId() {
		return crimeId;
	}

	
	/** 
	 * @param crimeId
	 */
	public void setCrimeId(UUID crimeId) {
		this.crimeId = crimeId;
	}

	
	/** 
	 * @return String
	 */
	public String getContanctInfo() {
		return contanctInfo;
	}

	
	/** 
	 * @param contanctInfo
	 */
	public void setContanctInfo(String contanctInfo) {
		this.contanctInfo = contanctInfo;
	}

	
	/** 
	 * @return String
	 */
	public String toString() {
		return "\n********* " + this.firstName + " " + lastName +"'s Report *********\n Witness ID: " + witnessId + "\n Crime ID: " + crimeId +
		"\n Name: " + firstName + " " + lastName + "\n Age: " + age + "\n Contact Info: " + contactInfo + "\n Minor: " + isMinor + 
		"\n Proof: " + proof + "\n Testimony: " + testimony + "\n Location: " + location + "\n Type: " + typeOfWitness;
	}

	
	/** 
	 * @param report
	 * @param name
	 */
	public void Download(String report, String name) {
		try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("witnessReports/" + name + ".txt"));
            writer.write(report);
            writer.close();
    } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
	

