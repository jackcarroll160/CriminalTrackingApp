/**
 * Evidence class for the evidence information
 * @author Overachievers
 */
public class Evidence {
    
    private int idNum;
    private String dateOfDiscovery;
    private String description;
    private String testimony;
    private String exhibits;

    /**
     * Gets the identification number for associated crime
     * @return an int for the identification number the evidence
     */
    public int getIdNum() {
        return this.idNum;
    }

    /**
     * Sets the Id number for Evidence
     * @param idNum an int for the case number the evidence is associated with
     */
    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    /**
     * Gets the date the evidence was discovered
     * @return A String for the date the evidence was found
     */
    public String getDateOfDiscovery() {
        return this.dateOfDiscovery;
    }

    /**
     * Sets the Evidence discovery date
     * @param dateOfDiscovery A String for the date the evidence was discovered
     */
    public void setDateOfDiscovery(String dateOfDiscovery) {
        this.dateOfDiscovery = dateOfDiscovery;
    }

    /**
     * Gets the evidence description
     * @return A String for the evidence description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Sets the evidence description
     * @param description A String for the evidence description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the testimony as evidence
     * @return the testimony to use as evidence
     */
    public String getTestimony() {
        return this.testimony;
    }

    /**
     * Sets a testimony to be used as evidence
     * @param testimony A String for the testimony evidence
     */
    public void setTestimony(String testimony) {
        this.testimony = testimony;
    }

    /**
     * Gets the exhibit evidence
     * @return the exhibit evidence
     */
    public String getExhibits() {
        return this.exhibits;
    }

    /**
     * Sets the exhibit evidence
     * @param exhibits A String for the exhibit evidence
     */
    public void setExhibits(String exhibits) {
        this.exhibits = exhibits;
    }

}
