/**
 * Author: Sydney Oklota
 */
import java.util.*;
import java.util.UUID;
public class Criminal {
    
    
    private int criminalID;
    private String firstName;
    private String lastName;
    private boolean hasNickname;
    private String nickname;
    private int age;
    private String gender;
    private String ethnicity;
    private String contactinfo;
    private String linkedCrime;
    private int crimeId;
    private String birthDate;
    private String eyeColor;
    private String hairDescription;
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
    private UUID id;

    public Criminal(String firstName, String lastName, String nickname, int age, String gender, String ethnicity, String contactInfo, String linkedCrime, String birthDate, String eyeColor, String hairDescription, String facialHairDescription, String height, String weight, String tattooDescription, String physicalMarksDescription, String physicalBuild, String weaponDescription, String complexion, String clothingDescription, String vehicleDescription){

        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.age = age;
        this.gender = gender; 
        this.ethnicity = ethnicity;
        this.contactinfo = contactInfo;
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

    public Criminal(UUID id, String firstName, String lastName, String nickname, int age, String gender, String ethnicity, String contactInfo, String linkedCrime, String birthDate, String eyeColor, String hairDescription, String facialHairDescription, String height, String weight, String tattooDescription, String physicalMarksDescription, String physicalBuild, String weaponDescription, String complexion, String clothingDescription, String vehicleDescription){

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.age = age;
        this.gender = gender; 
        this.ethnicity = ethnicity;
        this.contactinfo = contactInfo;
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


    public int getCriminalID() {
        return criminalID;
    }

    public void setCriminalID(int criminalID) {
        this.criminalID = criminalID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean getHasNickname() {
        return hasNickname;
    }

    public void setHasNickname(boolean hasNickname) {
        this.hasNickname = hasNickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getContactinfo() {
        return contactinfo;
    }

    public void setContactinfo(String contactinfo) {
        this.contactinfo = contactinfo;
    }

    public String getLinkedCrime() {
        return linkedCrime;
    }

    public void setLinkedCrime(String linkedCrime) {
        this.linkedCrime = linkedCrime;
    }

    public int getCrimeId() {
        return crimeId;
    }

    public void setCrimeId(int crimeId) {
        this.crimeId = crimeId;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHairDescription() {
        return hairDescription;
    }

    public void setHairDescription(String hairDescription) {
        this.hairDescription = hairDescription;
    }

    public boolean getFacialHair() {
        return facialHair;
    }

    public void setFacialHair(boolean facialHair) {
        this.facialHair = facialHair;
    }

    public String getFacialHairDescription() {
        return facialHairDescription;
    }

    public void setFacialHairDescription(String facialHairDescription) {
        this.facialHairDescription = facialHairDescription;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public boolean getHasTattoos() {
        return hasTattoos;
    }

    public void setHasTattoos(boolean hasTattoos) {
        this.hasTattoos = hasTattoos;
    }

    public String getTattooDescription() {
        return tattooDescription;
    }

    public void setTattooDescription(String tattooDescription) {
        this.tattooDescription = tattooDescription;
    }

    public boolean getHasPiercings() {
        return hasPiercings;
    }

    public void setHasPiercings(boolean hasPiercings) {
        this.hasPiercings = hasPiercings;
    }

    public String getPhysicalMarksDescription() {
        return physicalMarksDescription;
    }

    public void setPhysicalMarksDescription(String physicalMarksDescription) {
        this.physicalMarksDescription = physicalMarksDescription;
    }

    public String getPhysicalBuild() {
        return physicalBuild;
    }

    public void setPhysicalBuild(String physicalBuild) {
        this.physicalBuild = physicalBuild;
    }

    public boolean getHasWeapon() {
        return hasWeapon;
    }

    public void setHasWeapon(boolean hasWeapon) {
        this.hasWeapon = hasWeapon;
    }

    public String getWeaponDescription() {
        return weaponDescription;
    }

    public void setWeaponDescription(String weaponDescription) {
        this.weaponDescription = weaponDescription;
    }

    public String getComplexion() {
        return complexion;
    }

    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }

    public String getClothingDescription() {
        return clothingDescription;
    }

    public void setClothingDescription(String clothingDescription) {
        this.clothingDescription = clothingDescription;
    }

    public boolean getIsGuilty() {
        return isGuilty;
    }

    public void setIsGuilty(boolean isGuilty) {
        this.isGuilty = isGuilty;
    }

    public boolean getHasFingerprints() {
        return hasFingerprints;
    }

    public void setHasFingerprints(boolean hasFingerprints) {
        this.hasFingerprints = hasFingerprints;
    }

    public boolean getHasVehicle() {
        return hasVehicle;
    }

    public void setHasVehicle(boolean hasVehicle) {
        this.hasVehicle = hasVehicle;
    }

    public String getVehicleDescription() {
        return vehicleDescription;
    }

    public void setVehicleDescription(String vehicleDescription) {
        this.vehicleDescription = vehicleDescription;
    }

}
