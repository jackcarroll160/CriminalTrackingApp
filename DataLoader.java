import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader extends DataConstants {

    /**
     * public static void LoadData() { loadUsers(); loadCrime(); loadVictims();
     * loadWitnesses(); loadPOI(); loadSuspect(); loadCriminals(); }
     */

    // ---------------------- crime
    // -------------------------------------------------------------------------------
    public static ArrayList<Crime> loadCrime() {
        ArrayList<Crime> crime = new ArrayList<Crime>();

        try {
            FileReader reader = new FileReader(CRIME_FILE_NAME);
            JSONArray crimeJSONList = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < crimeJSONList.size(); i++) {
                JSONObject crimeJSON = (JSONObject) crimeJSONList.get(i);
                int crimeNum = ((Long) crimeJSON.get(CRIME_NUM)).intValue();
                UUID crimeId = UUID.fromString((String) crimeJSON.get(CRIME_CRIME_ID));
                UUID criminalId = UUID.fromString((String) crimeJSON.get(CRIMINALS_CRIMINAL_ID));
                String description = (String) crimeJSON.get(CRIME_DESCRIPTION);
                String dateOfCrime = (String) crimeJSON.get(CRIME_DATE_OF_CRIME);
                String timeOfCrime = (String) crimeJSON.get(CRIME_TIME_OF_CRIME);
                // boolean
                String caseOpen = (String) crimeJSON.get(CRIME_CASE_OPEN);
                JSONArray witnessesIds = (JSONArray) crimeJSON.get(CRIME_WITNESS_ID);
                ArrayList<Witness> witnesses = getWitnesses(witnessesIds);
                JSONArray victimsIds = (JSONArray) crimeJSON.get(CRIME_VICTIM_ID);
                ArrayList<Victim> victims = getVictims(victimsIds);
                JSONArray suspectsIds = (JSONArray) crimeJSON.get(CRIME_SUSPECT_ID);
                ArrayList<Suspect> suspects = getSuspects(suspectsIds);
                JSONArray personOfInterestIds = (JSONArray) crimeJSON.get(CRIME_POI_ID);
                ArrayList<PersonOfInterest> personOfInterest = getPersonOfInterest(personOfInterestIds);
                crime.add(new Crime(crimeNum, description, dateOfCrime, timeOfCrime, caseOpen, witnesses,
                victims, suspects, personOfInterest));
            }

            return crime;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    // ------------------------------------- criminal
    // ---------------------------------------------------------------------------
    public static ArrayList<Criminal> loadCriminals() {
        ArrayList<Criminal> criminal = new ArrayList<Criminal>();

        try {
            FileReader reader = new FileReader(CRIMINALS_FILE_NAME);
            JSONArray criminalJSONList = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < criminalJSONList.size(); i++) {
                JSONObject criminalJSON = (JSONObject) criminalJSONList.get(i);
                UUID criminalId = UUID.fromString((String) criminalJSON.get(CRIMINALS_CRIMINAL_ID));
                String firstName = (String) criminalJSON.get(CRIMINALS_FIRST_NAME);
                String lastName = (String) criminalJSON.get(CRIMINALS_LAST_NAME);
                String nickname = (String) criminalJSON.get(CRIMINALS_NICKNAME);
                int age = ((Long) criminalJSON.get(CRIMINALS_AGE)).intValue();
                String gender = (String) criminalJSON.get(CRIMINALS_GENDER);
                String ethnicity = (String) criminalJSON.get(CRIMINALS_ETHNICITY);
                String contactInfo = (String) criminalJSON.get(CRIMINALS_CONTACT_INFO);
                String linkedCrime = (String) criminalJSON.get(CRIMINALS_LINKED_CRIME);
                UUID crimeId = UUID.fromString((String) criminalJSON.get(CRIMINALS_CRIME_ID));
                String birthDate = (String) criminalJSON.get(CRIMINALS_BIRTH_DATE);
                String eyeColor = (String) criminalJSON.get(CRIMINALS_EYE_COLOR);
                String hairDescription = (String) criminalJSON.get(CRIMINALS_HAIR_DESCRIPTION);
                String hairColor = (String) criminalJSON.get(CRIMINALS_HAIR_COLOR);
                String facialHairDescription = (String) criminalJSON.get(CRIMINALS_FACIAL_HAIR_DESCRIPTION);
                String height = (String) criminalJSON.get(CRIMINALS_HEIGHT);
                String weight = (String) criminalJSON.get(CRIMINALS_WEIGHT);
                String tattooDescription = (String) criminalJSON.get(CRIMINALS_TATTOO_DESCRIPTION);
                String physicalMarksDescription = (String) criminalJSON.get(CRIMINALS_PHYSICAL_MARKS);
                String physicalBuild = (String) criminalJSON.get(CRIMINALS_PHYSICAL_BUILD);
                String weaponDescription = (String) criminalJSON.get(CRIMINALS_WEAPON_DESCRIPTION);
                String complexion = (String) criminalJSON.get(CRIMINALS_COMPLEXION);
                String clothingDescription = (String) criminalJSON.get(CRIMINALS_CLOTHING_DESCRIPTION);
                String vehicleDescription = (String) criminalJSON.get(CRIMINALS_VEHICLE_DESCRIPTION);

                criminal.add(new Criminal(criminalId,firstName, lastName, nickname, age, gender,
                        ethnicity, contactInfo, linkedCrime, crimeId, birthDate, eyeColor, hairDescription, hairColor,
                        facialHairDescription, height, weight, tattooDescription,
                        physicalMarksDescription, physicalBuild, weaponDescription, complexion, clothingDescription,
                        vehicleDescription));
            }

            return criminal;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private static boolean getBoolean(String item) {
        if(item.equalsIgnoreCase("false"))
            return false;
        else
            return true;
    }

    // --------------------------------------- persons of interest
    // ---------------------------------------------------------
    public static ArrayList<PersonOfInterest> loadPersonOfInterests() {
        ArrayList<PersonOfInterest> personOfInterest = new ArrayList<PersonOfInterest>();

        try {
            FileReader reader = new FileReader(PERSONOFINTEREST_FILE_NAME);
            JSONArray personOfInterestJSONList = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < personOfInterestJSONList.size(); i++) {
                JSONObject personOfInterestListJSON = (JSONObject) personOfInterestJSONList.get(i);
                UUID personOfInterestId = UUID
                        .fromString((String) personOfInterestListJSON.get(PERSONOFINTEREST_POI_ID));
                UUID suspectId = UUID.fromString((String) personOfInterestListJSON.get(PERSONOFINTEREST_SUSPECT_ID));
                UUID crimeId = UUID.fromString((String) personOfInterestListJSON.get(PERSONOFINTEREST_CRIME_ID));
                String firstName = (String) personOfInterestListJSON.get(PERSONOFINTEREST_FIRST_NAME);
                String lastName = (String) personOfInterestListJSON.get(PERSONOFINTEREST_LAST_NAME);
                int age = ((Long) personOfInterestListJSON.get(PERSONOFINTEREST_AGE)).intValue();
                String contactInfo = (String) personOfInterestListJSON.get(PERSONOFINTEREST_CONTACT_INFO);
                // BOOLEAN
                String isMinor = (String) personOfInterestListJSON.get(PERSONOFINTEREST_IS_MINOR);
                String statement = (String) personOfInterestListJSON.get(PERSONOFINTEREST_STATEMENT);
                // BOOLEAN
                String hasAlibi = (String) personOfInterestListJSON.get(PERSONOFINTEREST_HAS_ALIBI);
                // BOOLEAN
                String isSuspect = (String) personOfInterestListJSON.get(PERSONOFINTEREST_IS_SUSPECT);

                personOfInterest.add(new PersonOfInterest(personOfInterestId, suspectId, crimeId, firstName, lastName,
                        age, contactInfo, isMinor, statement, hasAlibi, isSuspect));
            }

            return personOfInterest;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private static ArrayList<PersonOfInterest> getPersonOfInterest(JSONArray personOfInterestIds) {
        ArrayList<PersonOfInterest> personOfInterest = new ArrayList<PersonOfInterest>();
        for (int i = 0; i < personOfInterestIds.size(); i++) {
            
            UUID poiId = UUID.fromString((String)personOfInterestIds.get(i));
            PersonOfInterest poi = personOfInterestList.getInstance().getPOIById(poiId);
            personOfInterest.add(poi);
        }
        return personOfInterest;
    }

    // ------------------------------- suspects
    // --------------------------------------------------
    public static ArrayList<Suspect> loadSuspects() {
        ArrayList<Suspect> suspect = new ArrayList<Suspect>();

        try {
            FileReader reader = new FileReader(SUSPECTS_FILE_NAME);
            JSONArray suspectJSONList = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < suspectJSONList.size(); i++) {
                JSONObject suspectJSON = (JSONObject) suspectJSONList.get(i);
                UUID suspectId = UUID.fromString((String) suspectJSON.get(SUSPECTS_SUSPECT_ID));
                UUID crimeId = UUID.fromString((String) suspectJSON.get(SUSPECTS_CRIME_ID));
                String firstName = (String) suspectJSON.get(SUSPECTS_FIRST_NAME);
                String lastName = (String) suspectJSON.get(SUSPECTS_LAST_NAME);
                int age = ((Long) suspectJSON.get(SUSPECTS_AGE)).intValue();
                String gender = (String) suspectJSON.get(SUSPECTS_GENDER);
                String ethnicity = (String) suspectJSON.get(SUSPECTS_ETHNICITY);
                String contactInfo = (String) suspectJSON.get(SUSPECTS_CONTACT_INFO);
                // BOOLEAN
                String isMinor = (String) suspectJSON.get(SUSPECTS_IS_MINOR);
                String statement = (String) suspectJSON.get(SUSPECTS_STATEMENT);
                // BOOLEAN
                String hasAlibi = (String) suspectJSON.get(SUSPECTS_HAS_ALIBI);
                String birthDate = (String) suspectJSON.get(SUSPECTS_BIRTH_DATE);
                String eyeColor = (String) suspectJSON.get(SUSPECTS_EYE_COLOR);
                String hairDescription = (String) suspectJSON.get(SUSPECTS_HAIR_DESCRIPTION);
                // boolean
                String facialHair = (String) suspectJSON.get(SUSPECTS_FACIAL_HAIR);
                String facialHairDescription = (String) suspectJSON.get(SUSPECTS_FACIAL_HAIR_DESCRIPTION);
                String height = (String) suspectJSON.get(SUSPECTS_HEIGHT);
                String weight = (String) suspectJSON.get(SUSPECTS_WEIGHT);
                // BOOLEAN
                String hasTattoos = (String) suspectJSON.get(SUSPECTS_HAS_TATOOS);
                String tattooDescription = (String) suspectJSON.get(SUSPECTS_TATTOO_DESCRIPTION);
                // BOOLEAN
                String hasPiercings = (String) suspectJSON.get(SUSPECTS_HAS_PIERCINGS);
                String physicalMarksDescription = (String) suspectJSON.get(SUSPECTS_PHYSICAL_MARKS);
                String physicalBuild = (String) suspectJSON.get(SUSPECTS_PHYSICAL_BUILD);
                // BOOLEAN
                String hasWeapon = (String) suspectJSON.get(SUSPECTS_HAS_WEAPON);
                String weaponDescription = (String) suspectJSON.get(SUSPECTS_WEAPON_DESCRIPTION);
                String complexion = (String) suspectJSON.get(SUSPECTS_COMPLEXION);
                String clothingDescription = (String) suspectJSON.get(SUSPECTS_CLOTHING_DESCRIPTION);
                // boolean
                String hasVehicle = (String) suspectJSON.get(SUSPECTS_HAS_VEHICLE);
                String vehicleDescription = (String) suspectJSON.get(SUSPECTS_VEHICLE_DESCRIPTION);

                suspect.add(new Suspect(suspectId, crimeId, firstName, lastName, age, gender, ethnicity, contactInfo,
                        isMinor, statement, hasAlibi, birthDate, eyeColor, hairDescription, facialHair,
                        facialHairDescription, height, weight, hasTattoos, tattooDescription, hasPiercings,
                        physicalMarksDescription, physicalBuild, hasWeapon, weaponDescription, complexion,
                        clothingDescription, hasVehicle, vehicleDescription));
            }

            return suspect;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private static ArrayList<Suspect> getSuspects(JSONArray suspectIds) {
        ArrayList<Suspect> suspect = new ArrayList<Suspect>();
        for (int i = 0; i < suspectIds.size(); i++) {
            
            UUID suspectId = UUID.fromString((String)suspectIds.get(i));
            Suspect suspects = suspectsList.getInstance().getSuspectById(suspectId);
            suspect.add(suspects);
        }
        return suspect;
    }

    // -------------------------------------- victims
    // ------------------------------------------------------------------
    public static ArrayList<Victim> loadVictims() {
        ArrayList<Victim> victim = new ArrayList<Victim>();

        try {
            FileReader reader = new FileReader(VICTIMS_FILE_NAME);
            JSONArray victimJSONList = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < victimJSONList.size(); i++) {
                JSONObject victimJSON = (JSONObject) victimJSONList.get(i);
                UUID victimId = UUID.fromString((String) victimJSON.get(VICTIMS_VICTIM_ID));
                UUID crimeId = UUID.fromString((String) victimJSON.get(VICTIMS_CRIME_ID));
                String firstName = (String) victimJSON.get(VICTIMS_FIRST_NAME);
                String lastName = (String) victimJSON.get(VICTIMS_LAST_NAME);
                int age = ((Long) victimJSON.get(VICTIMS_AGE)).intValue();
                String contactInfo = (String) victimJSON.get(VICTIMS_CONTACT_INFO);
                // boolean
                String isMinor = (String) victimJSON.get(VICTIMS_IS_MINOR);
                // BOOLEAN
                String isAlive = (String) victimJSON.get(VICTIMS_IS_ALIVE);
                // BOOLEAN
                String isInjured = (String) victimJSON.get(VICTIMS_IS_INJURED);
                String statement = (String) victimJSON.get(VICTIMS_STATEMENT);

                victim.add(new Victim(firstName, lastName, age, contactInfo, isMinor, isAlive,
                        isInjured, statement));
            }

            return victim;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private static ArrayList<Victim> getVictims(JSONArray victimIds) {
        ArrayList<Victim> victims = new ArrayList<Victim>();
        for (int i = 0; i < victimIds.size(); i++) {
            
            UUID victimId = UUID.fromString((String)victimIds.get(i));
            Victim victim = victimsList.getInstance().getVictimById(victimId);
            victims.add(victim);
        }
        return victims;
    }

    // ------------------------------------------------ witnesses
    // ---------------------------------------------------------------
    public static ArrayList<Witness> loadWitnesses() {
        ArrayList<Witness> witness = new ArrayList<Witness>();

        try {
            FileReader reader = new FileReader(WITNESSES_FILE_NAME);
            JSONArray witnessJSONList = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < witnessJSONList.size(); i++) {
                JSONObject witnessJSON = (JSONObject) witnessJSONList.get(i);
                UUID witnessId = UUID.fromString((String) witnessJSON.get(WITNESSES_WITNESS_ID));
                UUID crimeId = UUID.fromString((String) witnessJSON.get(WITNESSES_CRIME_ID));
                String firstName = (String) witnessJSON.get(WITNESSES_FIRST_NAME);
                String lastName = (String) witnessJSON.get(WITNESSES_LAST_NAME);
                int age = ((Long) witnessJSON.get(WITNESSES_AGE)).intValue();
                String contactInfo = (String) witnessJSON.get(WITNESSES_CONTACT_INFO);
                String isMinor = (String) witnessJSON.get(WITNESSES_IS_MINOR);;
                String proof = (String) witnessJSON.get(WITNESSES_PROOF);
                String testimony = (String) witnessJSON.get(WITNESSES_TESTIMONY);
                String location = (String) witnessJSON.get(WITNESSES_LOCATION);
                String typeOfWitness = (String) witnessJSON.get(WITNESSES_TYPE_OF_WITNESS);

                witness.add(new Witness(witnessId,crimeId,firstName, lastName, age, contactInfo, isMinor, proof, testimony, location,
                        typeOfWitness));
            }

            return witness;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private static ArrayList<Witness> getWitnesses(JSONArray witnessIds) {
        ArrayList<Witness> witnesses = new ArrayList<Witness>();
        for (int i = 0; i < witnessIds.size(); i++) {
            UUID witnessId = UUID.fromString((String)witnessIds.get(i));
            Witness witness = witnessList.getInstance().getWitnessById(witnessId);
            witnesses.add(witness);
        }
        return witnesses;
    }

    // ------------------------------------------------ users
    // --------------------------------------------------------------------

    public static ArrayList<User> loadUsers() {
        ArrayList<User> user = new ArrayList<User>();

        try {
            FileReader reader = new FileReader(USER_FILE_NAME);
            JSONArray userJSONList = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < userJSONList.size(); i++) {
                JSONObject userJSON = ((JSONObject) userJSONList.get(i));
                UUID userId = ((UUID) userJSON.get(USER_USER_ID));
                String username = (String) userJSON.get(USER_USERNAME);
                String password = (String) userJSON.get(USER_PASSWORD);

                user.add(new User(userId, username, password));
            }

            return user;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static ArrayList<User> getUser(JSONArray userIds) {
        ArrayList<User> users = new ArrayList<User>();
        for (int i = 0; i < userIds.size(); i++) {
            
            UUID userId = UUID.fromString((String)userIds.get(i));
            User user = Users.getInstance().getUserById(userId);
            users.add(user);
        }
        return users;
    }
}

/**
 * Reading the User JSON file
 * 
 * @return an empty ArrayList
 * @throws IOException
 */
/**
 * public static ArrayList<User> getUsers() throws IOException {
 * 
 * ArrayList<User> usersList = new ArrayList<>();
 * 
 * try (FileReader reader = new FileReader(USER_FILE_NAME); ) {
 * 
 * JSONArray usersJSON = (JSONArray)new JSONParser().parse(reader);
 * 
 * for(int i = 0; i < usersJSON.size(); i++) { JSONObject userJSON =
 * (JSONObject)usersJSON.get(i); String username =
 * (String)userJSON.get(USER_USERNAME); String password =
 * (String)userJSON.get(USER_PASSWORD);
 * 
 * usersList.add(new User(username, password)); DataWriter.saveUsers(); } return
 * usersList;
 * 
 * } catch (Exception e) { e.printStackTrace(); } return new ArrayList<>(); }
 * 
 * }
 */
