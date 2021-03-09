/*
 * @author Kyle Persyn
 * This class is going to be the Victim  class that will be included as part of the crimes
 */
public class Victim {

	private boolean isAlive;
	private String gender;
	private boolean isInjured;
	private String statement;
	private int victimId;
	
	/*
	 * 
	 */
	public boolean isAlive() {
		return isAlive;
	}
	
	/*
	 * 
	 */
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	/*
	 * 
	 */
	public String getGender() {
		return gender;
	}
	
	/*
	 * 
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/*
	 * 
	 */
	public boolean isInjured() {
		return isInjured;
	}
	
	/*
	 * 
	 */
	public void setInjured(boolean isInjured) {
		this.isInjured = isInjured;
	}
	
	/*
	 * 
	 */
	public String getStatement() {
		return statement;
	}
	
	/*
	 * 
	 */
	public void setStatement(String statement) {
		this.statement = statement;
	}
	
	/*
	 * 
	 */
	public int getVictimId() {
		return victimId;
	}
	
	/*
	 * 
	 */
	public void setVictimId(int victimId) {
		this.victimId = victimId;
	}
	
	
	
}
