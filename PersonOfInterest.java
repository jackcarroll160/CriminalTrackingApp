/*
 * @author Kyle Persyn
 * This class is going to be the PersonOfInterest  class that will be included as part of the crimes
 */
public abstract class PersonOfInterest extends Person{

	private String statement;
	private boolean hasAlibi;
	private boolean isSuspect;
	private int personId;
	
	public String toString()
	{
		return "";
	}

	
	public String getStatement() {
		return statement;
	}

	
	public void setStatement(String statement) {
		this.statement = statement;
	}

	
	public boolean isHasAlibi() {
		return hasAlibi;
	}

	
	public void setHasAlibi(boolean hasAlibi) {
		this.hasAlibi = hasAlibi;
	}

	
	public boolean isSuspect() {
		return isSuspect;
	}

	
	public void setSuspect(boolean isSuspect) {
		this.isSuspect = isSuspect;
	}

	
	public int getPersonId() {
		return personId;
	}

	
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	
	
}
