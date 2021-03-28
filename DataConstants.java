public abstract class DataConstants {

    // crime.json
    protected static final String CRIME_FILE_NAME = "jsonfiles/crime.json";
    protected static final String CRIME = "crime";
    protected static final String CRIME_NUM = "crimeNum";
    protected static final String CRIME_CRIME_ID = "crimeId";
    protected static final String CRIME_CRIMINAL_ID = "criminalId";
    protected static final String CRIME_DESCRIPTION = "description";
    protected static final String CRIME_DATE_OF_CRIME = "dateOfCrime";
    protected static final String CRIME_TIME_OF_CRIME = "timeOfCrime";
    protected static final String CRIME_CASE_OPEN = "caseOpen";
    protected static final String CRIME_WITNESS_ID = "witnessesId";
    protected static final String CRIME_VICTIM_ID = "victimId";
    protected static final String CRIME_SUSPECT_ID = "suspectId";
    protected static final String CRIME_POI_ID = "personOfInterestId";
    protected static final String CRIME_EVIDENCE = "evidence";

    // criminals.json
    protected static final String CRIMINALS_FILE_NAME = "jsonfiles/criminals.json";
    protected static final String CRIMINALS = "criminals";
    protected static final String CRIMINALS_CRIMINAL_ID = "criminalId";
    protected static final String CRIMINALS_FIRST_NAME = "firstName";
    protected static final String CRIMINALS_LAST_NAME = "lastName";
    protected static final String CRIMINALS_HAS_NICKNAME = "hasNickname";
    protected static final String CRIMINALS_NICKNAME = "nickname";
    protected static final String CRIMINALS_AGE = "age";
    protected static final String CRIMINALS_GENDER = "gender";
    protected static final String CRIMINALS_ETHNICITY = "ethnicity";
    protected static final String CRIMINALS_CONTACT_INFO = "contactInfo";
    protected static final String CRIMINALS_LINKED_CRIME = "linkedCrime";
    protected static final String CRIMINALS_BIRTH_DATE = "birthDate";
    protected static final String CRIMINALS_EYE_COLOR = "eyeColor";
    protected static final String CRIMINALS_HAIR_DESCRIPTION = "hairDescription";
    protected static final String CRIMINALS_HAIR_COLOR = "hairColor";
    protected static final String CRIMINALS_FACIAL_HAIR = "facialHair";
    protected static final String CRIMINALS_FACIAL_HAIR_DESCRIPTION = "facialHairDescription";
    protected static final String CRIMINALS_HEIGHT = "height";
    protected static final String CRIMINALS_WEIGHT = "weight";
    protected static final String CRIMINALS_HAS_TATTOOS = "hasTattoos";
    protected static final String CRIMINALS_TATTOO_DESCRIPTION = "tattooDescription";
    protected static final String CRIMINALS_HAS_PIERCINGS = "hasPiercings";
    protected static final String CRIMINALS_PHYSICAL_MARKS = "physicalMarksDescription";
    protected static final String CRIMINALS_PHYSICAL_BUILD = "physicalBuild";
    protected static final String CRIMINALS_HAS_WEAPON = "hasWeapon";
    protected static final String CRIMINALS_WEAPON_DESCRIPTION = "weaponDescription";
    protected static final String CRIMINALS_COMPLEXION = "complexion";
    protected static final String CRIMINALS_CLOTHING_DESCRIPTION = "clothingDescription";
    protected static final String CRIMINALS_IS_GUILTY = "isGuilty";
    protected static final String CRIMINALS_HAS_FINGERPRINTS = "hasFingerprints";
    protected static final String CRIMINALS_HAS_VEHICLE = "hasVehicle";
    protected static final String CRIMINALS_VEHICLE_DESCRIPTION = "vehicleDescription";

    // personOfInterest.json
    protected static final String PERSONOFINTEREST_FILE_NAME = "jsonfiles/personOfInterest.json";
    protected static final String PERSONOFINTEREST = "personOfInterest";
    protected static final String PERSONOFINTEREST_POI_ID = "personOfInterestId";
    protected static final String PERSONOFINTEREST_FIRST_NAME = "firstName";
    protected static final String PERSONOFINTEREST_LAST_NAME = "lastName";
    protected static final String PERSONOFINTEREST_AGE = "age";
    protected static final String PERSONOFINTEREST_CONTACT_INFO = "contactInfo";
    protected static final String PERSONOFINTEREST_IS_MINOR = "isMinor";
    protected static final String PERSONOFINTEREST_STATEMENT = "statement";
    protected static final String PERSONOFINTEREST_HAS_ALIBI = "hasAlibi";
    protected static final String PERSONOFINTEREST_IS_SUSPECT = "isSuspect";

    // suspects.json
    protected static final String SUSPECTS_FILE_NAME = "jsonfiles/suspects.json";
    protected static final String SUSPECTS = "suspects";
    protected static final String SUSPECTS_SUSPECT_ID = "suspectId";
    protected static final String SUSPECTS_FIRST_NAME = "firstName";
    protected static final String SUSPECTS_LAST_NAME = "lastName";
    protected static final String SUSPECTS_AGE = "age";
    protected static final String SUSPECTS_GENDER = "gender";
    protected static final String SUSPECTS_ETHNICITY = "ethnicity";
    protected static final String SUSPECTS_CONTACT_INFO = "contactInfo";
    protected static final String SUSPECTS_IS_MINOR = "isMinor";
    protected static final String SUSPECTS_STATEMENT = "statement";
    protected static final String SUSPECTS_HAS_ALIBI = "hasAlibi";
    protected static final String SUSPECTS_BIRTH_DATE = "birthDate";
    protected static final String SUSPECTS_EYE_COLOR = "eyeColor";
    protected static final String SUSPECTS_HAIR_DESCRIPTION = "hairDescription";
    protected static final String SUSPECTS_FACIAL_HAIR = "facialHair";
    protected static final String SUSPECTS_FACIAL_HAIR_DESCRIPTION = "facialHairDescription";
    protected static final String SUSPECTS_HEIGHT = "height";
    protected static final String SUSPECTS_WEIGHT = "weight";
    protected static final String SUSPECTS_HAS_TATOOS = "hasTattoos";
    protected static final String SUSPECTS_TATTOO_DESCRIPTION = "tattooDescription";
    protected static final String SUSPECTS_HAS_PIERCINGS = "hasPiercings";
    protected static final String SUSPECTS_PHYSICAL_MARKS = "physicalMarksDescription";
    protected static final String SUSPECTS_PHYSICAL_BUILD = "physicalBuild";
    protected static final String SUSPECTS_HAS_WEAPON = "hasWeapon";
    protected static final String SUSPECTS_WEAPON_DESCRIPTION = "weaponDescription";
    protected static final String SUSPECTS_COMPLEXION = "complexion";
    protected static final String SUSPECTS_CLOTHING_DESCRIPTION = "clothingDescription";
    protected static final String SUSPECTS_HAS_VEHICLE = "hasVehicle";
    protected static final String SUSPECTS_VEHICLE_DESCRIPTION = "vehicleDescription";

    // victims.json
    protected static final String VICTIMS_FILE_NAME = "jsonfiles/victims.json";
    protected static final String VICTIMS = "victims";
    protected static final String VICTIMS_VICTIM_ID = "victimId";
    protected static final String VICTIMS_FIRST_NAME = "firstName";
    protected static final String VICTIMS_LAST_NAME = "lastName";
    protected static final String VICTIMS_AGE = "age";
    protected static final String VICTIMS_CONTACT_INFO = "contactInfo";
    protected static final String VICTIMS_IS_MINOR = "isMinor";
    protected static final String VICTIMS_IS_ALIVE = "isAlive";
    protected static final String VICTIMS_IS_INJURED = "isInjured";
    protected static final String VICTIMS_STATEMENT = "statement";

    // witnesses.json
    protected static final String WITNESSES_FILE_NAME = "jsonfiles/witnesses.json";
    protected static final String WITNESSES = "witnesses";
    protected static final String WITNESSES_WITNESS_ID = "witnessId";
    protected static final String WITNESSES_FIRST_NAME = "firstName";
    protected static final String WITNESSES_LAST_NAME = "lastName";
    protected static final String WITNESSES_AGE = "age";
    protected static final String WITNESSES_CONTACT_INFO = "contactInfo";
    protected static final String WITNESSES_IS_MINOR = "isMinor";
    protected static final String WITNESSES_PROOF = "proof";
    protected static final String WITNESSES_TESTIMONY = "testimony";
    protected static final String WITNESSES_LOCATION = "location";
    protected static final String WITNESSES_TYPE_OF_WITNESS = "typeOfWitness";

    // user.json
    protected static final String USER_FILE_NAME = "jsonfiles/user.json";
    protected static final String USER_USER_ID = "userId";
    protected static final String USER_USERNAME = "username";
    protected static final String USER_PASSWORD = "password";
}