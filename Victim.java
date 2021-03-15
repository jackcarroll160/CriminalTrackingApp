/*
 * @author Kyle Persyn
 * This class is going to be the Victim  class that will be included as part of the crimes
 */
public class Victim extends Person{

	private boolean isAlive;
	private String gender;
	private boolean isInjured;
	private String statement;
	private int victimId;
	
	/*
	 * This is the class that will return the alive boolean of the victim
	 * @return a boolean that holds the alive flag
	 */
	public boolean isAlive() {
		return isAlive;
	}
	
	/*
	 * This is the class that will set the alive boolean of the victim
	 * @param a boolean that holds the alive flag
	 */
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	/*
	 * This is the class that will return the Gender of the victim
	 * @return a String that holds the gender of the victim
	 */
	public String getGender() {
		return gender;
	}
	
	/*
	 * This is the class that will set the Gender of the victim
	 * @param a String that holds the gender of the victim
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/*
	 * This is the class that will return the injured boolean of the victim
	 * @return a boolean that holds the injured flag
	 */
	public boolean isInjured() {
		return isInjured;
	}
	
	/*
	 * This is the class that will set the injured boolean of the victim
	 * @param a boolean that holds the injured flag
	 */
	public void setInjured(boolean isInjured) {
		this.isInjured = isInjured;
	}
	
	/*
	 * This is the class that will return the statement of the victim
	 * @return a String that holds the statement
	 */
	public String getStatement() {
		return statement;
	}
	
	/*
	 * This is the class that will set the statement of the victim
	 * @param a String that holds the statement
	 */
	public void setStatement(String statement) {
		this.statement = statement;
	}
	
	/*
	 * This is the class that will return the victim id of the victim
	 * @return an int that holds the id
	 */
	public int getVictimId() {
		return victimId;
	}
	
	/*
	 * This is the class that will set the victim id of the victim
	 * @param an int that holds the id
	 */
	public void setVictimId(int victimId) {
		this.victimId = victimId;
	}
	
	
	
}
