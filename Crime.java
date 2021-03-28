import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Crime class for the information based on crime
 * @author Overachievers
 */
public class Crime {

    /**
     * Enumeration for the types of crime
     */
    private enum TypeOfCrime {PERSONAL, PROPERTY, HATE, VICTIMLESS, WHITECOLLAR, ORGANIZED, SOCIOLOGICAL}

    /**
     * Enumeration for the grading level of a crime
     */
    private enum Grading {MISDEMEANOR, FELONY, INFRACTION} 

    private int crimeNum;
    private String description;
    private UUID crimeId;
    private UUID criminalId;
    private String dateOfCrime;
    private String timeOfCrime;
    private String caseOpen;
    private ArrayList<Witness> witnesses;
    private ArrayList<Victim> victims;
    private ArrayList<Suspect> suspects;
    private ArrayList<PersonOfInterest> personOfInterest;
    private ArrayList<Criminal> criminals;
    private ArrayList<User> officers;
    private TypeOfCrime typeOfCrime;
    private Grading grading;
    private ArrayList<String> evidence;

    public Crime(int crimeNum, String description, String dateOfCrime, String timeOfCrime,
            String caseOpen, ArrayList<Witness> witnessId, ArrayList<Victim> victimId, ArrayList<Suspect> suspectId,
            ArrayList<PersonOfInterest> personOfInterestId,ArrayList<String> evidence2) 
            {
                this.crimeNum = crimeNum;
                this.crimeId = UUID.randomUUID();
                this.criminalId = UUID.randomUUID();
                this.description = description;
                this.dateOfCrime = dateOfCrime;
                this.timeOfCrime = timeOfCrime;
                this.caseOpen = caseOpen;
                this.witnesses = witnessId;
                this.victims = victimId;
                this.suspects = suspectId;
                this.personOfInterest = personOfInterestId;
                this.evidence = evidence2;
            }

    public int getCrimeNum() {
        return this.crimeNum;
    }

    public void setCrimeNum(int num) {
        this.crimeNum = num;
    }
    
    /**
     * Gets the description of a crime
     * @return A String for the description of a crime
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Sets the description of a crime
     * @param description A String for the description of a crime
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the date of the crime
     * @return A String for the date of the crime
     */
    public String getDateOfCrime() {
        return this.dateOfCrime;
    }

    /**
     * Sets the date of a crime case
     * @param dateOfCrime A String for the date the crime occured
     */
    public void setDateOfCrime(String dateOfCrime) {
        this.dateOfCrime = dateOfCrime;
    }

    /**
     * Gets the time of the crime
     * @return a String for the time a crime took place
     */
    public String getTimeOfCrime() {
        return this.timeOfCrime;
    }

    /**
     * Sets the time for a crime
     * @param timeOfCrime A String for the time the crime occured
     */
    public void setTimeOfCrime(String timeOfCrime) {
        this.timeOfCrime = timeOfCrime;
    }

    /**
     * Gets the case status of a crime
     * @return true/false if the case is open or not
     */
    public String isCaseOpen() {
        return this.caseOpen;
    }

    /**
     * Sets the case status
     * @param caseOpen true/false if the crime is open or not
     */
    public void setCaseOpen(String caseOpen) {
        this.caseOpen = caseOpen;
    }

    /**
     * Gets the list of Witnesses assocaited with a crime
     * @return the list of witnesses
     */
    public ArrayList<Witness> getWitnesses() {
        return this.witnesses;
    }

    /**
     * Sets the witnesses 
     * @param witnesses associated with a crime
     */
    public void setWitnesses(ArrayList<Witness> witnesses) {
        this.witnesses = witnesses;
    }

    public void setEvidence(ArrayList<String> evidence)
    {
        this.evidence = evidence;
    }

    public ArrayList<String> getEvidence()
    {
        return evidence;
    }

    /**
     * Gets the list of victims for a crime
     * @return the list of victims
     */
    public ArrayList<Victim> getVictims() {
        return this.victims;
    }

    /**
     * Sets the victims list to a crime
     * @param victims list to be added to a crime
     */
    public void setVictims(ArrayList<Victim> victims) {
        this.victims = victims;
    }

    /**
     * Gets the suspects for a crime
     * @return the list of suspects
     */
    public ArrayList<Suspect> getSuspects() {
        return this.suspects;
    }

    /**
     * Sets the suspect list for a crime
     * @param suspects the list of suspects to be added to a crime
     */
    public void setSuspects(ArrayList<Suspect> suspects) {
        this.suspects = suspects;
    }

    /**
     * Gets the person(s) of interest for a crime
     * @return the person(s) of interest
     */
    public ArrayList<PersonOfInterest> getPersonOfInterest() {
        return this.personOfInterest;
    }

    /**
     * Sets the person of interest list for a crime
     * @param personOfInterest the list of person(s) of interest to be added to a crime
     */
    public void setPersonOfInterest(ArrayList<PersonOfInterest> personOfInterest) {
        this.personOfInterest = personOfInterest;
    }

    /**
     * Gets the list of criminals associated with a crime
     * @return the list of criminal(s) associated with a crime
     */
    public ArrayList<Criminal> getCriminals() {
        return this.criminals;
    }

    /**
     * Sets the list of criminals for a crime
     * @param criminals the list of criminals for a crime
     */
    public void setCriminals(ArrayList<Criminal> criminals) {
        this.criminals = criminals;
    }

    /**
     * Gets the officers dealing with the crime
     * @return the list of officers associated with the crime
     */
    public ArrayList<User> getOfficers() {
        return this.officers;
    }

    /**
     * Sets the officer list for a crime
     * @param officers a list of involved officers to add to a crime
     */
    public void setOfficers(ArrayList<User> officers) {
        this.officers = officers;
    }

    /**
     * Gets the type of crime 
     * @return TypeOfCrime the crime is 
     */
    public TypeOfCrime getTypeOfCrime() {
        return this.typeOfCrime;
    }

    /**
     * Sets the type of crime 
     * @param typeOfCrime for the type of crime that was committed 
     */
    public void setTypeOfCrime(TypeOfCrime typeOfCrime) {
        this.typeOfCrime = typeOfCrime;
    }

    /**
     * Gets the grading level of the crime
     * @return the grading level of the crime
     */
    public Grading getGrading() {
        return this.grading;
    }

    /**
     * Sets the grading level of the crime
     * @param grading for type of grading a crime is marked as
     */
    public void setGrading(Grading grading) {
        this.grading = grading;
    }

    public UUID getCriminalID() {
        return this.criminalId;
    }

    public UUID getCrimeId() {
        return this.crimeId;
    }
    
    public void setCrimeId(UUID crimeId) {
		this.crimeId = crimeId;
	}

    public void setCriminalId(UUID criminalId) {
		this.criminalId = criminalId;
	}

    public String toString()
    {
        return "********* Crime #" + crimeNum +" Report *********\n" + " Description: " + description + "\n Date & Time of Crime: " + dateOfCrime + " at " + timeOfCrime +
         "\n Case open: " + caseOpen + "\n FOR FULL REPORT DOWNLOAD FILE: ";

        
    }


    public void Download( String name) {
        try{
            String data = "********* Crime #" + crimeNum +" Report *********\n" + " Description: " + description + "\n Date & Time of Crime: " + dateOfCrime + " at " + timeOfCrime +
            "\n Case open: " + caseOpen +  "\n Evidece: " + evidence +"\n ******* WITNESSES *******\n" + witnesses + "\n ******* VICTIMS *******\n" + victims + "\n ******* SUSPECTS *******\n" + suspects + 
            "\n ******* PERSONS OF INTEREST *******\n" + personOfInterest;
            BufferedWriter writer = new BufferedWriter(new FileWriter("criminalReports/"+ name + ".txt"));
            writer.write(data);
            writer.close();
    } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public String getNickname() {
        return null;
    }

    

}