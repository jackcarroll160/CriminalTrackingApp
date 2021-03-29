import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

/**
 * Suspect class extending Person of Interest
 * @author Overachievers 
 */
public class Suspect extends Person{
    
    public Suspect(String firstName, String lastName, int age, String gender,
            String ethnicity, String contactInfo, String isMinor, String statement, String hasAlibi2,
            String birthDate, String eyeColor, String hairDescription,
            String facialHairDescription, String height, String weight,
            String tattooDescription, String hasPiercings2, String physicalMarksDescription, String physicalBuild,
            String weaponDescription, String complexion, String clothingDescription, String vehicleDescription) 
            {
               super(firstName,lastName,age,contactInfo,isMinor);
               this.suspectId = UUID.randomUUID();
               this.crimeId= UUID.randomUUID();
               this.gender =gender;
               this.ethnicity =ethnicity;
               this.statement = statement;
               this.hasAlibi = hasAlibi2;
               this.birthDate = birthDate;
               this.eyeColor = eyeColor;
               this.hairDescription = hairDescription;
               //this.hasFacialHair = facialHair;
               this.facialHairDescription = facialHairDescription;
               this.height = height;
               this.weight = weight;
               //this.hasTattoos = hasTattoos2;
               this.tattooDescription = tattooDescription;
               this.hasPiercings = hasPiercings2;
               this.physicalMarksDescription = physicalMarksDescription;
               this.physicalBuild = physicalBuild;
               //this.hasWeapon = hasWeapon2;
               this.weaponDescription = weaponDescription;
               this.complexion = complexion;
               this.clothingDescription = clothingDescription;
               //this.hasVehicle = hasVehicle2;
               this.vehicleDescription = vehicleDescription;


            }

    public Suspect(UUID suspectId2, String firstName, String lastName, int age, String gender2,
            String ethnicity2, String contactInfo, String isMinor, String statement2, String hasAlibi2,
            String birthDate2, String eyeColor2, String hairDescription2, String facialHairDescription2, String height2,
            String weight2, String tattooDescription2, String hasPiercings2, String physicalMarksDescription2,
            String physicalBuild2, String weaponDescription2, String complexion2, String clothingDescription2,
            String vehicleDescription2) {
                
                super(firstName,lastName,age,contactInfo,isMinor);
                this.suspectId = suspectId2;
               this.gender =gender2;
               this.ethnicity =ethnicity2;
               this.statement = statement2;
               this.hasAlibi = hasAlibi2;
               this.birthDate = birthDate2;
               this.eyeColor = eyeColor2;
               this.hairDescription = hairDescription2;
               //this.hasFacialHair = facialHair;
               this.facialHairDescription = facialHairDescription2;
               this.height = height2;
               this.weight = weight2;
               //this.hasTattoos = hasTattoos2;
               this.tattooDescription = tattooDescription2;
               this.hasPiercings = hasPiercings2;
               this.physicalMarksDescription = physicalMarksDescription2;
               this.physicalBuild = physicalBuild2;
               //this.hasWeapon = hasWeapon2;
               this.weaponDescription = weaponDescription2;
               this.complexion = complexion2;
               this.clothingDescription = clothingDescription2;
               //this.hasVehicle = hasVehicle2;
               this.vehicleDescription = vehicleDescription2;

    }

    private Crime linkedCrime;
    private UUID crimeId;
    private String statement;
    private String hasAlibi;
    private UUID suspectId;
    private String birthDate;
    private String eyeColor;
    private String hairDescription;
    private String hasFacialHair;
    private String facialHairDescription;
    private String height;
    private String weight;
    private String hasTattoos;
    private String tattooDescription;
    private String hasPiercings;
    private String physicalMarksDescription;
    private String physicalBuild;
    private String hasWeapon;
    private String weaponDescription;
    private String complexion;
    private String clothingDescription;
    private Evidence evidence;
    private boolean hasInterrogationReport;
    private String interrogationReport;
    private String hasVehicle;
    private String vehicleDescription;
    private boolean isGuilty;
    private String ethnicity;
    private String gender;


    /**
     * Returns the linked crime
     * @return a Crime's linkedCrime 
     */
    public Crime getLinkedCrime() {
        return this.linkedCrime;
    }

    /**
     * Sets the linked crime to local variable
     * @param linkedCrime Crime to 
     */
    public void setLinkedCrime(Crime linkedCrime) {
        this.linkedCrime = linkedCrime;
    }

    /**
     * Returns the Suspect's Id
     * @return an int for suspect Id
     */
    public UUID getSuspectId() {
        return this.suspectId;
    }

    /**
     * Sets the suspect's Id number
     * @param suspectId integer for suspect's Id number
     */
    public void setSuspectId(UUID suspectId) {
        this.suspectId = suspectId;
    }

    /**
     * Returns the Birth date
     * @return a String for the suspects date of birth
     */
    public String getBirthDate() {
        return this.birthDate;
    }

    /**
     * Sets the birth date for a suspect
     * @param birthDate a String of the suspect's birthday
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Gets the suspect's eye color
     * @return a String for the eye color of the suspect
     */
    public String getEyeColor() {
        return this.eyeColor;
    }

    /**
     * Sets the eye color of the suspect
     * @param eyeColor a String for the eye color of the suspect
     */
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    /**
     * Gets the suspect's hair description
     * @return a String for the hair description
     */
    public String getHairDescription() {
        return this.hairDescription;
    }

    /**
     * Sets the suspect's hair description
     * @param hairDescription a String for the hair description
     */
    public void setHairDescription(String hairDescription) {
        this.hairDescription = hairDescription;
    }

    /**
     * Gets the facial hair of the suspect
     * @return true/false based on suspect's facial hair
     */
    public String isHasFacialHair() {
        return this.hasFacialHair;
    }

    /**
     * Sets facial hair if the suspect has facial hair
     * @param hasFacialHair boolean for having facial hair or not
     */
    public void setHasFacialHair(String hasFacialHair) {
        this.hasFacialHair = hasFacialHair;
    }

    /**
     * Gets the suspect's facial hair description
     * @return a String for facial hair description 
     */
    public String getFacialHairDescription() {
        return this.facialHairDescription;
    }

    /**
     * Sets the facial hair description 
     * @param facialHairDescription a String for facial hair description
     */
    public void setFacialHairDescription(String facialHairDescription) {
        this.facialHairDescription = facialHairDescription;
    }

    /**
     * Gets the height of the suspect
     * @return a String for the height of the suspect
     */
    public String getHeight() {
        return this.height;
    }

    /**
     * Sets the height for a suspect
     * @param height String for the height of a suspect
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * Gets the weight of a suspect
     * @return a double corresponding to the weight of the suspect
     */
    public String getWeight() {
        return this.weight;
    }

    /**
     * Sets the weight of the suspect
     * @param weight to set weight of suspect
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * Returns true/false based on if suspect has tattoos or not
     * @return true/false for suspects tattoos
     */
    public String isHasTattoos() {
        return this.hasTattoos;
    }

    /**
     * Sets the tattoos by having tattoos or not
     * @param hasTattoos a boolean to set true/false for suspect having tattoos
     */
    public void setHasTattoos(String hasTattoos) {
        this.hasTattoos = hasTattoos;
    }

    /**
     * Gets the hair description of the suspect
     * @return a String for the tattoo description of the suspect
     */
    public String getTattooDescription() {
        return this.tattooDescription;
    }

    /**
     * Sets the tattoo description of a suspect
     * @param tattooDescription a String for the tattoo description
     */
    public void setTattooDescription(String tattooDescription) {
        this.tattooDescription = tattooDescription;
    }

    /**
     * Gets the piercing status of a suspect
     * @return true/false if a suspect has tattoos or not
     */
    public String isHasPiercings() {
        return this.hasPiercings;
    }

    /**
     * Sets the piercing status of a suspect
     * @param hasPiercings a boolean to determine if suspect does or does not have piercings
     */
    public void setHasPiercings(String hasPiercings) {
        this.hasPiercings = hasPiercings;
    }

    /**
     * Gets the physical mark description of a suspect
     * @return A String for the description of physical marks
     */
    public String getPhysicalMarksDescription() {
        return this.physicalMarksDescription;
    }

    /**
     * Sets the physical marks description
     * @param physicalMarksDescription a String for the physical mark description
     */
    public void setPhysicalMarksDescription(String physicalMarksDescription) {
        this.physicalMarksDescription = physicalMarksDescription;
    }

    /**
     * Gets the physical build of a suspect
     * @return A String for the physical build of a suspect
     */
    public String getPhysicalBuild() {
        return this.physicalBuild;
    }

    /**
     * Sets the physical build of a suspect
     * @param physicalBuild A String for the physical build of a suspect
     */
    public void setPhysicalBuild(String physicalBuild) {
        this.physicalBuild = physicalBuild;
    }

    /**
     * Gets a suspects weapon status
     * @return a boolean if the suspect had a weapon or not
     */
    public String isHasWeapon() {
        return this.hasWeapon;
    }

    /**
     * Sets the weapon status of a suspect
     * @param hasWeapon boolean for having a weapon or not
     */
    public void setHasWeapon(String hasWeapon) {
        this.hasWeapon = hasWeapon;
    }

    /**
     * Gets the weapon description of a suspect
     * @return A String for the weapon description
     */
    public String getWeaponDescription() {
        return this.weaponDescription;
    }

    /**
     * Sets the weapon description
     * @param weaponDescription a String for the weapon's description
     */
    public void setWeaponDescription(String weaponDescription) {
        this.weaponDescription = weaponDescription;
    }

    /**
     * Gets the complexion of a suspect
     * @return A String for the suspect's complexion
     */
    public String getComplexion() {
        return this.complexion;
    }

    /**
     * Sets the complexion for a suspect
     * @param complexion a String to set the suspect's complexion
     */
    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }

    /**
     * Gets the clothing description of a suspect
     * @return A String for the suspect's clothing description
     */
    public String getClothingDescription() {
        return this.clothingDescription;
    }

    /**
     * Sets the clothing description for a suspect
     * @param clothingDescription A String for the clothing description
     */
    public void setClothingDescription(String clothingDescription) {
        this.clothingDescription = clothingDescription;
    }

    /**
     * Gets the evidence of a suspected crimnals 
     * @return Evidence of suspect's evidence
     */
    public Evidence getEvidence() {
        return this.evidence;
    }

    /**
     * Sets the Evidence of a suspect
     * @param evidence Evidence to be stored on a suspect
     */
    public void setEvidence(Evidence evidence) {
        this.evidence = evidence;
    }

    /**
     * Gets if the suspect has an interrogation report
     * @return true/false based on if the suspect has an interrogation report
     */
    public boolean isHasInterrogationReport() {
        return this.hasInterrogationReport;
    }

    /**
     * Sets the interrogation report status
     * @param hasInterrogationReport A boolean if they have a report or not
     */
    public void setHasInterrogationReport(boolean hasInterrogationReport) {
        this.hasInterrogationReport = hasInterrogationReport;
    }

    /**
     * Gets the interrogation report
     * @return A String of the interrogation report
     */
    public String getInterrogationReport() {
        return this.interrogationReport;
    }

    /**
     * Sets the interrogation report 
     * @param interrogationReport a String for the suspect's interrogation report
     */
    public void setInterrogationReport(String interrogationReport) {
        this.interrogationReport = interrogationReport;
    }

    /**
     * Gets the vehicle description of a suspect
     * @return A String for the vehicle description
     */
    public String getVehicleDescription() {
        return this.vehicleDescription;
    }

    /**
     * Sets the vehicle desription for a suspect
     * @param vehicleDescription A String for the vehicle description
     */
    public void setVehicleDescription(String vehicleDescription) {
        this.vehicleDescription = vehicleDescription;
    }

    /**
     * Gets true or false based on if a suspect is guilty of a crime or not
     * @return true/false if suspect is or is not guilty of a crime
     */
    public boolean isIsGuilty() {
        return this.isGuilty;
    }

    /**
     * Sets the guilty status of a suspect
     * @param isGuilty true/false if the suspect has been found guilty
     */
    public void setIsGuilty(boolean isGuilty) {
        this.isGuilty = isGuilty;
    }

    /**
     * Gets the ethnicity of a suspect
     * @return A String for the suspect's ethnicity
     */
    public String getEthnicity() {
        return this.ethnicity;
    }

    /**
     * Sets the ethnicity for a suspect
     * @param ethnicity a String for the ethnicity of a suspect
     */
    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    /**
     * Gets the gender of the suspect
     * @return A String for the gender of a suspect
     */
    public String getGender() {
        return this.gender;
    }

    /**
     * Sets the gender for a suspect
     * @param gender A String for the gender of a suspect
     */
    public void setGender(String gender) {
        this.gender = gender;
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
    public String getHasVehicle() {
        return this.hasVehicle;
    }

    
    /** 
     * @param crimeId
     */
    public void setCrimeId(UUID crimeId) {
       this.crimeId = crimeId;
    }

    
    /** 
     * @param hasVehicle
     */
    public void setHasVehicle(String hasVehicle) {
        this.hasVehicle = hasVehicle;
    }
   
    
    /** 
     * @return String
     */
    public String getStatement() {
        return this.statement;
    }

    
    /** 
     * @return String
     */
    public String getHasAlibi() {
        return this.hasAlibi;
    }

    
    /** 
     * @param statement
     */
    public void setStatement(String statement) {
       this.statement = statement;
    }

    
    /** 
     * @param hasAlibi
     */
    public void setHasAlibi(String hasAlibi) {
        this.hasAlibi = hasAlibi;
    }

    
    /** 
     * @return String
     */
    public String toString()
    {
        return "********* " + firstName +" " + lastName +"'s Report *********\n" + " Suspect Id: " + suspectId + "\n Age: " + age + "\n Gender: " + gender + "\n Ethnicity: " + ethnicity + "\n Complexion: " + complexion +
         "\n Contact Information: " + contactInfo +  "\n Is Minor: " + isMinor +  "\n Statement: " + statement +
        "\n In Prison: " + hasAlibi + "\n Birth Date: " + birthDate+ "\n Eye Color: " + eyeColor + "\n Hair Description: " + hairDescription +
        "\n Facial Hair: " + facialHairDescription + "\n Height: "+ height + "\n Weight: " + weight + "\n Tattoo Description: " + tattooDescription +
        "\n Has Piercings: " + hasPiercings + "\n Physical Marks Descriptions: " + physicalMarksDescription + "\n Physical Build: " + physicalBuild+
        "\n Weapon Description: " + weaponDescription + "\n Clothing Description: " + clothingDescription + "\n Vehicle Description: " + vehicleDescription ;

        
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
