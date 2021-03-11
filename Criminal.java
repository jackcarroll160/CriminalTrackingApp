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
    private String witnessData;
    private boolean isViolent;
    private String gangAffiliation;
    private String dateOfCrime;
    private boolean hasWitness;
    private Witness witness;
    private boolean hasFingerprints;
    private String criminalReport;


    /**
     * getters
     */
    public String toString(){

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
    public void setID(ArrayList<UUID>){

    }

    public void setCriminalID(int criminalID){

    }

    public void setNickname(String nickname){

    }

    public void setKnownAddress(String knownAddress){

    }

    public void setAffiliates(ArrayList<String>){

    }

    public void setFamilyMembers(ArrayList<String>){

    }

    public void setShoeSize(double shoeSize){

    }

    public void setCrime(Crime crime){

    }

    public void setCrimeDescription(String crimeDescription){

    }

    public void setVictimStatus(){

    }

    public void setWitnessData(String witnessData){

    }

    public void setViolence(){
       
    }

    public void setGangAffiliation(String gangAffiliation){

    }

    public void setDateOfCrime(String dateOfCrime){

    }

    public void setWitness(Witness witness){

    }
    
    public void setHasFingerprints(){

    }

    public void setHasNickname(){

    }


}
