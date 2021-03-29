
/**
 * Author: Sydney Oklota
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.UUID;

public class Criminal {

    private UUID criminalID;
    private String firstName;
    private String lastName;
    private boolean hasNickname;
    private String nickname;
    private int age;
    private String gender;
    private String ethnicity;
    private String contactInfo;
    private String linkedCrime;
    private UUID crimeId;
    private String birthDate;
    private String eyeColor;
    private String hairDescription;
    private String hairColor;
    private boolean facialHair;
    private String facialHairDescription;
    private String height;
    private String weight;
    private boolean hasTattoos;
    private String tattooDescription;
    private boolean hasPiercings;
    private String physicalMarksDescription;
    private String physicalBuild;
    private boolean hasWeapon;
    private String weaponDescription;
    private String complexion;
    private String clothingDescription;
    private boolean isGuilty;
    private boolean hasFingerprints;
    private boolean hasVehicle;
    private String vehicleDescription;

    public Criminal(String firstName, String lastName,  String nickname, int age, String gender,
            String ethnicity, String contactInfo, String linkedCrime, String birthDate, String eyeColor,
            String hairDescription,  String facialHairDescription, String height, String weight,
           String tattooDescription, String physicalMarksDescription,
            String physicalBuild, String weaponDescription, String complexion,
            String clothingDescription,
            String vehicleDescription) {
        this.criminalID = UUID.randomUUID();
        this.crimeId = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.age = age;
        this.gender = gender;
        this.ethnicity = ethnicity;
        this.contactInfo = contactInfo;
        this.linkedCrime = linkedCrime;
        this.birthDate = birthDate;
        this.eyeColor = eyeColor;
        this.hairDescription = hairDescription;
        this.facialHairDescription = facialHairDescription;
        this.height = height;
        this.weight = weight;
        this.tattooDescription = tattooDescription;
        this.physicalMarksDescription = physicalMarksDescription;
        this.physicalBuild = physicalBuild;
        this.weaponDescription = weaponDescription;
        this.complexion = complexion;
        this.clothingDescription = clothingDescription;
        this.vehicleDescription = vehicleDescription;
    }

    public Criminal(UUID criminalId, String firstName, String lastName, String nickname, int age,
            String gender, String ethnicity, String contactInfo, String linkedCrime, String birthDate,
            String eyeColor, String hairDescription,String hairColor, String facialHairDescription, String height,
            String weight, String tattooDescription,
            String physicalMarksDescription, String physicalBuild, String weaponDescription,
            String complexion, String clothingDescription,
            String vehicleDescription) {
        this.hairColor = hairColor;
        this.criminalID = UUID.randomUUID();
        this.criminalID = criminalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.age = age;
        this.gender = gender;
        this.ethnicity = ethnicity; 
        this.contactInfo = contactInfo;
        this.linkedCrime = linkedCrime;
        this.birthDate = birthDate;
        this.eyeColor = eyeColor;
        this.hairDescription = hairDescription;
        this.facialHairDescription = facialHairDescription;
        this.height = height;
        this.weight = weight;
        this.tattooDescription = tattooDescription;
        this.physicalMarksDescription = physicalMarksDescription;
        this.physicalBuild = physicalBuild;
        this.weaponDescription = weaponDescription;
        this.complexion = complexion;
        this.clothingDescription = clothingDescription;
        this.vehicleDescription = vehicleDescription;
    }

    
    /** 
     * @return UUID
     */
    public UUID getCriminalID() {
        return criminalID;
    }

    
    /** 
     * @param criminalID
     */
    public void setCriminalID(UUID criminalID) {
        this.criminalID = criminalID;
    }

    
    /** 
     * @return String
     */
    public String getHairColor() {
        return hairColor;
    }

    
    /** 
     * @param hairColor
     */
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    
    /** 
     * @return String
     */
    public String getFirstName() {
        return firstName;
    }

    
    /** 
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    /** 
     * @return String
     */
    public String getLastName() {
        return lastName;
    }

    
    /** 
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    /** 
     * @return boolean
     */
    public boolean getHasNickname() {
        return hasNickname;
    }

    
    /** 
     * @param hasNickname
     */
    public void setHasNickname(boolean hasNickname) {
        this.hasNickname = hasNickname;
    }

    
    /** 
     * @return String
     */
    public String getNickname() {
        return nickname;
    }

    
    /** 
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    
    /** 
     * @return int
     */
    public int getAge() {
        return age;
    }

    
    /** 
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    
    /** 
     * @return String
     */
    public String getGender() {
        return gender;
    }

    
    /** 
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    
    /** 
     * @return String
     */
    public String getEthnicity() {
        return ethnicity;
    }

    
    /** 
     * @param ethnicity
     */
    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    
    /** 
     * @return String
     */
    public String getContactinfo() {
        return contactInfo;
    }

    
    /** 
     * @param contactinfo
     */
    public void setContactinfo(String contactinfo) {
        this.contactInfo = contactinfo;
    }

    
    /** 
     * @return String
     */
    public String getLinkedCrime() {
        return linkedCrime;
    }

    
    /** 
     * @param linkedCrime
     */
    public void setLinkedCrime(String linkedCrime) {
        this.linkedCrime = linkedCrime;
    }

    
    /** 
     * @return UUID
     */
    public UUID getCrimeId() {
        return crimeId;
    }

    
    /** 
     * @param crimeId
     */
    public void setCrimeId(UUID crimeId) {
        this.crimeId = crimeId;
    }

    
    /** 
     * @return String
     */
    public String getBirthDate() {
        return birthDate;
    }

    
    /** 
     * @param birthDate
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    
    /** 
     * @return String
     */
    public String getEyeColor() {
        return eyeColor;
    }

    
    /** 
     * @param eyeColor
     */
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    
    /** 
     * @return String
     */
    public String getHairDescription() {
        return hairDescription;
    }

    
    /** 
     * @param hairDescription
     */
    public void setHairDescription(String hairDescription) {
        this.hairDescription = hairDescription;
    }

    
    /** 
     * @return boolean
     */
    public boolean getFacialHair() {
        return facialHair;
    }

    
    /** 
     * @param facialHair
     */
    public void setFacialHair(boolean facialHair) {
        this.facialHair = facialHair;
    }

    
    /** 
     * @return String
     */
    public String getFacialHairDescription() {
        return facialHairDescription;
    }

    
    /** 
     * @param facialHairDescription
     */
    public void setFacialHairDescription(String facialHairDescription) {
        this.facialHairDescription = facialHairDescription;
    }

    
    /** 
     * @return String
     */
    public String getHeight() {
        return height;
    }

    
    /** 
     * @param height
     */
    public void setHeight(String height) {
        this.height = height;
    }

    
    /** 
     * @return String
     */
    public String getWeight() {
        return weight;
    }

    
    /** 
     * @param weight
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    
    /** 
     * @return boolean
     */
    public boolean getHasTattoos() {
        return hasTattoos;
    }

    
    /** 
     * @param hasTattoos
     */
    public void setHasTattoos(boolean hasTattoos) {
        this.hasTattoos = hasTattoos;
    }

    
    /** 
     * @return String
     */
    public String getTattooDescription() {
        return tattooDescription;
    }

    
    /** 
     * @param tattooDescription
     */
    public void setTattooDescription(String tattooDescription) {
        this.tattooDescription = tattooDescription;
    }

    
    /** 
     * @return boolean
     */
    public boolean getHasPiercings() {
        return hasPiercings;
    }

    
    /** 
     * @param hasPiercings
     */
    public void setHasPiercings(boolean hasPiercings) {
        this.hasPiercings = hasPiercings;
    }

    
    /** 
     * @return String
     */
    public String getPhysicalMarksDescription() {
        return physicalMarksDescription;
    }

    
    /** 
     * @param physicalMarksDescription
     */
    public void setPhysicalMarksDescription(String physicalMarksDescription) {
        this.physicalMarksDescription = physicalMarksDescription;
    }

    
    /** 
     * @return String
     */
    public String getPhysicalBuild() {
        return physicalBuild;
    }

    
    /** 
     * @param physicalBuild
     */
    public void setPhysicalBuild(String physicalBuild) {
        this.physicalBuild = physicalBuild;
    }

    
    /** 
     * @return boolean
     */
    public boolean getHasWeapon() {
        return hasWeapon;
    }

    
    /** 
     * @param hasWeapon
     */
    public void setHasWeapon(boolean hasWeapon) {
        this.hasWeapon = hasWeapon;
    }

    
    /** 
     * @return String
     */
    public String getWeaponDescription() {
        return weaponDescription;
    }

    
    /** 
     * @param weaponDescription
     */
    public void setWeaponDescription(String weaponDescription) {
        this.weaponDescription = weaponDescription;
    }

    
    /** 
     * @return String
     */
    public String getComplexion() {
        return complexion;
    }

    
    /** 
     * @param complexion
     */
    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }

    
    /** 
     * @return String
     */
    public String getClothingDescription() {
        return clothingDescription;
    }

    
    /** 
     * @param clothingDescription
     */
    public void setClothingDescription(String clothingDescription) {
        this.clothingDescription = clothingDescription;
    }

    
    /** 
     * @return boolean
     */
    public boolean getIsGuilty() {
        return isGuilty;
    }

    
    /** 
     * @param isGuilty
     */
    public void setIsGuilty(boolean isGuilty) {
        this.isGuilty = isGuilty;
    }

    
    /** 
     * @return boolean
     */
    public boolean getHasFingerprints() {
        return hasFingerprints;
    }

    
    /** 
     * @param hasFingerprints
     */
    public void setHasFingerprints(boolean hasFingerprints) {
        this.hasFingerprints = hasFingerprints;
    }

    
    /** 
     * @return boolean
     */
    public boolean getHasVehicle() {
        return hasVehicle;
    }

    
    /** 
     * @param hasVehicle
     */
    public void setHasVehicle(boolean hasVehicle) {
        this.hasVehicle = hasVehicle;
    }

    
    /** 
     * @return String
     */
    public String getVehicleDescription() {
        return vehicleDescription;
    }

    
    /** 
     * @param vehicleDescription
     */
    public void setVehicleDescription(String vehicleDescription) {
        this.vehicleDescription = vehicleDescription;
    }
    
    /** 
     * @return String
     */
    public String toString()
    {
        return "********* " + firstName +" " + lastName +"'s Report *********\n" + " Criminal Id: " + criminalID +
        "\n NickName: " + nickname + "\n Age: " + age + "\n Gender: " + gender + "\n Ethnicity: " + ethnicity + "\n Complexion: " + complexion +
         "\n Contact Information: " + contactInfo +
        "\n Crime Description: " + linkedCrime + "\n Crime Id: " + crimeId + "\n Birth Date: " + birthDate + "\n Eye Color: " + eyeColor +
        "\n Hair Desciption: " + hairDescription + "\n Hair Color: "+ hairColor + "\n Facial Hair Description: " + facialHairDescription + "\n Height: " + height +
        "\n Weight: " + weight + "\n Tattoo Description: " + tattooDescription + "\n Physical Marks: " + physicalMarksDescription +
        "\n Physical Build: " + physicalBuild + "\n Weapon Description: " + weaponDescription + "\n Clothing Description: " + clothingDescription +
        "\n Vehicle Description: " + vehicleDescription;

        
    }

    
    /** 
     * @param data
     * @param criminalName
     */
    public void Download(String data,String criminalName) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("criminalReports/"+criminalName+ ".txt"));
            writer.write(data);
            writer.close();
    } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
