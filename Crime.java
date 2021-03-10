import java.util.ArrayList;

public class Crime {

    private String description;
    private int idNum;
    private String dateOfCrime;
    private String timeOfCrime;
    private Evidence evidence;
    private boolean caseOpen;
    private ArrayList<Witness> witnesses;
    private ArrayList<Victim> victims;
    private ArrayList<Suspect> suspects;
    private ArrayList<PersonOfInterest> personOfInterest;
    private ArrayList<Criminal> criminals;
    private ArrayList<Officer> officers;
    private TypeOfCrime typeOfCrime;
    private Grading grading;

    public String toString() {

    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String descrip) {

    }

    public int getIdNum() {
        return this.idNum;
    }

    public void setIdNum(int idnum) {

    }

    public String getDateOfCrime() {
        return this.dateOfCrime;
    }

    public void setDateOfCrime(String date) {

    }

    public String getTimeOfCrime() {
        return this.timeOfCrime;
    }

    public void setTimeOfCrime(String time) {

    }

    public Evidence getEvidence() {
        return this.evidence;
    }

    public void setEvidence(Evidence eviden) {

    }

    public boolean getCaseOpen() {
        return this.caseOpen;
    }

    public void setCaseOpen(boolean status) {

    }

    public ArrayList<Witness> getWitnesses() {
        return this.witnesses;
    }

    public void setWitnesses(ArrayList<Witness> witness) {

    }

    public ArrayList<Victim> getVictims() {
        return this.victims;
    }

    public void setVictims(ArrayList<Victim> victim) {

    }

    public ArrayList<Suspect> getSuspects() {
        return this.suspects;
    }

    public void setSuspects(ArrayList<Suspect> suspect) {

    }

    public ArrayList<PersonOfInterest> getPersonOfInterest() {
        return this.personOfInterest;
    }

    public void setPersonOfInterest(ArrayList<PersonOfInterest> POI) {

    }

    public ArrayList<Criminal> getCriminals() {
        return this.criminals;
    }

    public void setCriminals(ArrayList<Criminal> criminal) {

    }

    public ArrayList<Officer> getOfficer() {
        return this.officers;
    }

    public void setOfficer(ArrayList<Officer> officer) {

    }

    public TypeOfCrime getTypeOfCrime() {
        return this.typeOfCrime;
    }

    public void setTypeOfCrime(TypeOfCrime type) {

    }

    public Grading getGrading() {
        return this.grading;
    }

    public void setGrading(Grading grade) {
        
    }

}