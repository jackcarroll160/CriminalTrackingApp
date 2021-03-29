import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

/*
 * @author Kyle Persyn
 * This class is going to be the Victim  class that will be included as part of the crimes
 */
public class Victim extends Person{

	private String isAlive;
	private String gender;
	private String isInjured;
	private String statement;
	private UUID victimId;
	private UUID crimeId;
	
	public Victim(String firstName, String lastName, int age, String contactInfo,
            String isMinor, String isAlive2, String isInjured, String statement) {
				super(firstName,lastName,age,contactInfo,isMinor);
				this.victimId = UUID.randomUUID();
				this.crimeId = UUID.randomUUID();
				this.isAlive = isAlive2;
				this.isInjured = isInjured;
				this.statement =statement;
    }

    public Victim(UUID victimId2, String firstName, String lastName, int age, String contactInfo,
            String isMinor, String isAlive2, String isInjured2, String statement2) {
				super(firstName,lastName,age,contactInfo,isMinor);
				this.victimId = victimId2;
				this.isAlive = isAlive2;
				this.isInjured = isInjured2;
				this.statement =statement2;
    }

    
	/** 
	 * @return String
	 */
	/*
	 * This is the class that will return the alive boolean of the victim
	 * @return a boolean that holds the alive flag
	 */
	public String isAlive() {
		return isAlive;
	}
	
	
	/** 
	 * @param isAlive
	 */
	/*
	 * This is the class that will set the alive boolean of the victim
	 * @param a boolean that holds the alive flag
	 */
	public void setAlive(String isAlive) {
		this.isAlive = isAlive;
	}
	
	
	/** 
	 * @return String
	 */
	/*
	 * This is the class that will return the Gender of the victim
	 * @return a String that holds the gender of the victim
	 */
	public String getGender() {
		return gender;
	}
	
	
	/** 
	 * @param gender
	 */
	/*
	 * This is the class that will set the Gender of the victim
	 * @param a String that holds the gender of the victim
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	/** 
	 * @return String
	 */
	/*
	 * This is the class that will return the injured boolean of the victim
	 * @return a boolean that holds the injured flag
	 */
	public String isInjured() {
		return isInjured;
	}
	
	
	/** 
	 * @param isInjured
	 */
	/*
	 * This is the class that will set the injured boolean of the victim
	 * @param a boolean that holds the injured flag
	 */
	public void setInjured(String isInjured) {
		this.isInjured = isInjured;
	}
	
	
	/** 
	 * @return String
	 */
	/*
	 * This is the class that will return the statement of the victim
	 * @return a String that holds the statement
	 */
	public String getStatement() {
		return statement;
	}
	
	
	/** 
	 * @param statement
	 */
	/*
	 * This is the class that will set the statement of the victim
	 * @param a String that holds the statement
	 */
	public void setStatement(String statement) {
		this.statement = statement;
	}
	
	
	/** 
	 * @return UUID
	 */
	/*
	 * This is the class that will return the victim id of the victim
	 * @return an int that holds the id
	 */
	public UUID getVictimId() {
		return victimId;
	}
	
	
	/** 
	 * @param victimId
	 */
	/*
	 * This is the class that will set the victim id of the victim
	 * @param an int that holds the id
	 */
	public void setVictimId(UUID victimId) {
		this.victimId = victimId;
	}

	
	/** 
	 * @return UUID
	 */
	public UUID getCrimeId() {
		return this.crimeId;
	}

	
	/** 
	 * @return String
	 */
	public String toString()
	{
		return "********* " + firstName +" " + lastName +"'s Report *********\n" + 
		 "\n Age: " + age +  "\n Victim ID: " + victimId + 
		 "\n Contact Information: " + contactInfo  + "\n Statement: " + statement +
		 "\n Is Injured: " + isInjured+ "\n Is Alive: " + isAlive +  "\n Is Minor: " + isMinor ;

		
	}

	
	/** 
	 * @param string
	 * @param string2
	 */
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
