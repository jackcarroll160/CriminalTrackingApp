/*
 * @author Kyle Persyn
 * This class is going to be the Witness  class that will be included as part of the crimes
 */
public class Witness extends Person{
	
	private String proof;
	private String testimony;
	private String location;
	private String typeOfWitness;
	private int witnessId;
	
	/*
	 * 
	 */
	public String toString()
	{
		return "";
	}

	/*
	 * 
	 */
	public String getProof() {
		return proof;
	}

	/*
	 * 
	 */
	public void setProof(String proof) {
		this.proof = proof;
	}

	/*
	 * 
	 */
	public String getTestimony() {
		return testimony;
	}

	/*
	 * 
	 */
	public void setTestimony(String testimony) {
		this.testimony = testimony;
	}

	/*
	 * 
	 */
	public String getLocation() {
		return location;
	}

	/*
	 * 
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/*
	 * 
	 */
	public String getTypeOfWitness() {
		return typeOfWitness;
	}

	/*
	 * 
	 */
	public void setTypeOfWitness(String typeOfWitness) {
		this.typeOfWitness = typeOfWitness;
	}

	/*
	 * 
	 */
	public int getWitnessId() {
		return witnessId;
	}

	/*
	 * 
	 */
	public void setWitnessId(int witnessId) {
		this.witnessId = witnessId;
	}
	
	
	
}
