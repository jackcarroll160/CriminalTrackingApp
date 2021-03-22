/**
 * Author: Sydney Oklota
 */
import java.util.*;
public class Criminal {
    
    private ArrayList<UUID> ID;
    private int criminalID;
    private boolean hasNickname;
    private String nickname;
    private String knownAddress;
    private ArrayList<String> affiliates;
    private ArrayList<String> familyMembers;
    private double shoeSize;
    private ArrayList<Crime> crime;
    private String crimeDescription;
    private boolean victimAlive;
    private String hairColor;
    private String clothing;
    private String tattoo;
    private String facialHair;
    private String witnessData;
    private boolean isViolent;
    private String gangAffiliation;
    private String dateOfCrime;
    private boolean hasWitness;
    private Witness witness;
    private boolean hasFingerprints;
    private String criminalReport;
    private String firstName;
    private String lastName;


    /**
     * getters
     */
    public String getHairColor()
    {
        return this.hairColor;
    }
    
    public String getClothing()
    {
        return this.clothing;
    }
    public String getTattoo()
    {
        return this.tattoo;
    }

    public String getFacialHair()
    {
        return this.facialHair;
    }

    public String toString(){
        return null;

    }

    public String getFirstName(){

        return this.firstName;
    }

    public String getLastName(){

        return this.lastName;
    }
    public ArrayList<UUID> getID(){

        return this.ID;

    }

    public int getCriminalID(){

        return this.criminalID;

    }

    public String getNickname(){

        return this.nickname;

    }

    public String getKnownAddress(){

        return this.knownAddress;

    }

    public ArrayList<String> getAffiliates(){

        return this.affiliates;

    }

    public ArrayList<String> getFamilyMembers(){

        return this.familyMembers;

    }

    public double getShoeSize(){

        return this.shoeSize;

    }

    public ArrayList<Crime> getCrime(){

        return this.crime;

    }

    public String getCrimeDescription(){

        return this.crimeDescription;

    }

    public boolean getVictimStatus(){

        return this.victimAlive;

    }

    public String getWitnessData(){

        return this.witnessData;

    }

    public boolean getViolence(){

        return this.isViolent;

    }
    
    public String getGangAffiliation(){

        return this.gangAffiliation;

    }

    public String getDateOfCrime(){

        return this.dateOfCrime;

    }

    public Witness getWitness(){

        return this.witness;

    }

    public boolean getHasFingerprints(){

        return this.hasFingerprints;

    }

    public boolean getHasNickname(){

        return this.hasNickname;

    }


    /**
     * setters
     */
    public void setHairColor(String hairColor)
    {
        this.hairColor = hairColor;
    }
    
    public void setClothing(String clothing)
    {
        this.clothing = clothing;
    }
    public void setTattoo(String tattoo)
    {
        this.tattoo = tattoo;
    }

    public void setFacialHair(String facialHair)
    {
        this.facialHair = facialHair;
    }

    public void setID(ArrayList<UUID> ID){
        this.ID = ID;
    }

    public void setFirstName(String firstname){
        this.firstName = firstname;
    }

    public void setLastName(String lastname){
        this.lastName = lastname;
    }

    public void setCriminalID(int criminalID){
        this.criminalID = criminalID;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public void setKnownAddress(String knownAddress){
        this.knownAddress = knownAddress;
    }

    public void setAffiliates(ArrayList<String> affiliates){
        this.affiliates = affiliates;
    }

    public void setFamilyMembers(ArrayList<String> familyMembers){
        this.familyMembers = familyMembers;
    }

    public void setShoeSize(double shoeSize){
        this.shoeSize = shoeSize;
    }

    public void setCrime(ArrayList<Crime> crime){
        this.crime = crime;
    }

    public void setCrimeDescription(String crimeDescription){
        this.crimeDescription = crimeDescription;
    }

    public void setVictimStatus(boolean victimAlive){
        this.victimAlive = victimAlive;
    }

    public void setWitnessData(String witnessData){
        this.witnessData = witnessData;
    }

    public void setViolence(boolean isViolent){
        this.isViolent = isViolent;
    }

    public void setGangAffiliation(String gangAffiliation){
        this.gangAffiliation = gangAffiliation;
    }

    public void setDateOfCrime(String dateOfCrime){
        this.dateOfCrime = dateOfCrime;
    }

    public void setWitness(Witness witness){
        this.witness = witness;
    }
    
    public void setHasFingerprints(boolean hasFingerprints){
        this.hasFingerprints = hasFingerprints;
    }

    public void setHasNickname(boolean hasNickname){
        this.hasNickname = hasNickname;
    }



}
