/*
 * @author Kyle Persyn
 * This class is going to be the Witness  class that will be included as part of the crimes
 */
public class Witness extends Person{
	
	private int witnessId;
	private int crimeId;
	private String contanctInfo;
	private String proof;
	private String testimony;
	private String location;
	private String typeOfWitness;
	

	/*
	 * This is a method that will take all of the data that was input and return it in a readable string format
	 * @return a String with all of the data and attributes
	 */
	public String toString()
	{
		return "Proof: " + proof + " \n Testimony: " +testimony +
				" \n Location: " + location + "\n Type Of Witness: " + typeOfWitness +
				"\n Witness ID: " + witnessId;
	}

	/*
	 * This is the class that will return the proof of the witness
	 * @return a String that holds the proof
	 */
	public String getProof() {
		return proof;
	}

	/*
	 * This is the class that will set the proof of the witness
	 * @param a String that holds the proof
	 */
	public void setProof(String proof) {
		this.proof = proof;
	}

	/*
	 * This is the class that will return the testimony of the witness
	 * @return a String that holds the testimony
	 */
	public String getTestimony() {
		return testimony;
	}

	/*
	 * This is the class that will set the testimony of the witness
	 * @param a String that holds the testimony
	 */
	public void setTestimony(String testimony) {
		this.testimony = testimony;
	}

	/*
	 * This is the class that will return the location of the witness
	 * @return a String that holds the location
	 */
	public String getLocation() {
		return location;
	}

	/*
	 * This is the class that will set the location of the witness
	 * @param a String that holds the location
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/*
	 * This is the class that will return the type of the witness
	 * @return a String that holds the type
	 */
	public String getTypeOfWitness() {
		return typeOfWitness;
	}

	/*
	 * This is the class that will set the type of the witness
	 * @param a String that holds the type
	 */
	public void setTypeOfWitness(String typeOfWitness) {
		this.typeOfWitness = typeOfWitness;
	}

	/*
	 * This is the class that will return the id of the witness
	 * @return an int that holds the id
	 */
	public int getWitnessId() {
		return witnessId;
	}

	/*
	 * This is the class that will set the id of the witness
	 * @param an int that holds the id
	 */
	public void setWitnessId(int witnessId) {
		this.witnessId = witnessId;
	}
	
	public int getCrimeId() {
		return crimeId;
	}

	public void setCrimeId(int crimeId) {
		this.crimeId = crimeId;
	}

	public String getContanctInfo() {
		return contanctInfo;
	}

	public void setContanctInfo(String contanctInfo) {
		this.contanctInfo = contanctInfo;
	}
	
}
