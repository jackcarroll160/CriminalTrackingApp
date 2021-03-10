public class Suspect extends PersonOfInterest{
    
    private Crime linkedCrime;
    private int suspectId;
    private String birthDate;
    private String eyeColor;
    private String hairDescription;
    private boolean hasFacialHair;
    private String facrialHairDescription;
    private String height;
    private double weight;
    private boolean hasTattoos;
    private String tattooDescription;
    private boolean hasPiercings;
    private String physicalMarksDescription;
    private String physicalBuild;
    private boolean hasWeapon;
    private String weaponDescription;
    private String complexion;
    private String clothingDescription;
    private Evidence evidence;
    private boolean hasInterrogationReport;
    private String interrogationReport;
    private String vehicleDescription;
    private boolean isGuilty;
    private String ethnicity;
    private String gender;

    public String toString() {
        
    }

    public Crime getLinkedCrime() {
        return this.linkedCrime;
    }

    public void setLinkedCrime(Crime linkedCrime) {
        this.linkedCrime = linkedCrime;
    }

    public int getSuspectId() {
        return this.suspectId;
    }

    public void setSuspectId(int suspectId) {
        this.suspectId = suspectId;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEyeColor() {
        return this.eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHairDescription() {
        return this.hairDescription;
    }

    public void setHairDescription(String hairDescription) {
        this.hairDescription = hairDescription;
    }

    public boolean isHasFacialHair() {
        return this.hasFacialHair;
    }

    public void setHasFacialHair(boolean hasFacialHair) {
        this.hasFacialHair = hasFacialHair;
    }

    public String getFacrialHairDescription() {
        return this.facrialHairDescription;
    }

    public void setFacrialHairDescription(String facrialHairDescription) {
        this.facrialHairDescription = facrialHairDescription;
    }

    public String getHeight() {
        return this.height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isHasTattoos() {
        return this.hasTattoos;
    }

    public void setHasTattoos(boolean hasTattoos) {
        this.hasTattoos = hasTattoos;
    }

    public String getTattooDescription() {
        return this.tattooDescription;
    }

    public void setTattooDescription(String tattooDescription) {
        this.tattooDescription = tattooDescription;
    }

    public boolean isHasPiercings() {
        return this.hasPiercings;
    }

    public void setHasPiercings(boolean hasPiercings) {
        this.hasPiercings = hasPiercings;
    }

    public String getPhysicalMarksDescription() {
        return this.physicalMarksDescription;
    }

    public void setPhysicalMarksDescription(String physicalMarksDescription) {
        this.physicalMarksDescription = physicalMarksDescription;
    }

    public String getPhysicalBuild() {
        return this.physicalBuild;
    }

    public void setPhysicalBuild(String physicalBuild) {
        this.physicalBuild = physicalBuild;
    }

    public boolean isHasWeapon() {
        return this.hasWeapon;
    }

    public void setHasWeapon(boolean hasWeapon) {
        this.hasWeapon = hasWeapon;
    }

    public String getWeaponDescription() {
        return this.weaponDescription;
    }

    public void setWeaponDescription(String weaponDescription) {
        this.weaponDescription = weaponDescription;
    }

    public String getComplexion() {
        return this.complexion;
    }

    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }

    public String getClothingDescription() {
        return this.clothingDescription;
    }

    public void setClothingDescription(String clothingDescription) {
        this.clothingDescription = clothingDescription;
    }

    public Evidence getEvidence() {
        return this.evidence;
    }

    public void setEvidence(Evidence evidence) {
        this.evidence = evidence;
    }

    public boolean isHasInterrogationReport() {
        return this.hasInterrogationReport;
    }

    public void setHasInterrogationReport(boolean hasInterrogationReport) {
        this.hasInterrogationReport = hasInterrogationReport;
    }

    public String getInterrogationReport() {
        return this.interrogationReport;
    }

    public void setInterrogationReport(String interrogationReport) {
        this.interrogationReport = interrogationReport;
    }

    public String getVehicleDescription() {
        return this.vehicleDescription;
    }

    public void setVehicleDescription(String vehicleDescription) {
        this.vehicleDescription = vehicleDescription;
    }

    public boolean isIsGuilty() {
        return this.isGuilty;
    }

    public void setIsGuilty(boolean isGuilty) {
        this.isGuilty = isGuilty;
    }

    public String getEthnicity() {
        return this.ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
