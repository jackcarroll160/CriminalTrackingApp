import java.io.FileWriter;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends DataConstants {

    // user
    public static void saveUsers() {
        Users users = Users.getInstance();
        ArrayList<User> userList = users.getUsersList();
        JSONArray jsonUsers = new JSONArray();

        for (int i = 0; i < userList.size(); i++) {
            jsonUsers.add(getUserLoginJSON(userList.get(i)));
        }

        try (FileWriter file = new FileWriter(USER_FILE_NAME)) {
            file.write(jsonUsers.toJSONString());
            file.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    /** 
     * @param user
     * @return JSONObject
     */
    public static JSONObject getUserLoginJSON(User user) {
        JSONObject userInfo = new JSONObject();
        userInfo.put(USER_USERNAME, user.getUsername());
        userInfo.put(USER_PASSWORD, user.getPassword());

        return userInfo;
    }

    // crime
    public static void saveCrime() {
        CrimeList crime = CrimeList.getInstance();
        ArrayList<Crime> crimeList = crime.getCrimeList();
        JSONArray jsonCrimeList = new JSONArray();

        // create json objects and loop through the crime list
        for (int i = 0; i < crimeList.size(); i++) {
            jsonCrimeList.add(getCrimeJSON(crimeList.get(i)));
        }
        // write the crime json file
        try (FileWriter file = new FileWriter(CRIME_FILE_NAME)) {

            file.write(jsonCrimeList.toJSONString());
            file.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    /** 
     * @param crime
     * @return JSONObject
     */
    public static JSONObject getCrimeJSON(Crime crime) {
        JSONObject crimeInfo = new JSONObject();
        crimeInfo.put(CRIME_CRIME_ID, crime.getCrimeId());
        crimeInfo.put(CRIME_CRIMINAL_ID, crime.getCriminalID());
        crimeInfo.put(CRIME_DESCRIPTION, crime.getDescription());
        crimeInfo.put(CRIME_DATE_OF_CRIME, crime.getDateOfCrime());
        crimeInfo.put(CRIME_TIME_OF_CRIME, crime.getTimeOfCrime());
        // boolean
        crimeInfo.put(CRIME_CASE_OPEN, crime.isCaseOpen());
        ArrayList<String> witnessIds = new ArrayList<String>();
        ArrayList<String> victimIds = new ArrayList<String>();
        ArrayList<String> poisIds = new ArrayList<String>();
        ArrayList<String> suspectIds = new ArrayList<String>();
        for (Witness witness : crime.getWitnesses())
        {
            witnessIds.add(witness.getWitnessId().toString());
        }
        for (Victim victim : crime.getVictims())
        {
            victimIds.add(victim.getVictimId().toString());
        }
        for (PersonOfInterest poi : crime.getPersonOfInterest())
        {
            poisIds.add(poi.getPersonId().toString());
        }
        for (Suspect suspect : crime.getSuspects())
        {
            suspectIds.add(suspect.getSuspectId().toString());
        }
        crimeInfo.put(CRIME_WITNESS_ID, witnessIds);
        crimeInfo.put(CRIME_VICTIM_ID, victimIds);
        crimeInfo.put(CRIME_POI_ID, poisIds);
        crimeInfo.put(CRIME_SUSPECT_ID, suspectIds);
        crimeInfo.put(CRIME_EVIDENCE, crime.getEvidence());

        return crimeInfo;
    }

    // criminals
    public static void saveCriminals() {
        CriminalList criminal = CriminalList.getInstance();
        ArrayList<Criminal> criminalList = criminal.getCriminalList();
        JSONArray jsonCriminalList = new JSONArray();

        // create json objects and loop through the criminal list
        for (int i = 0; i < criminalList.size(); i++) {
            jsonCriminalList.add(getCriminalJSON(criminalList.get(i)));
        }
        // write the criminal json file
        try (FileWriter file = new FileWriter(CRIMINALS_FILE_NAME)) {

            file.write(jsonCriminalList.toJSONString());
            file.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    /** 
     * @param criminal
     * @return JSONObject
     */
    public static JSONObject getCriminalJSON(Criminal criminal) {
        JSONObject criminalInfo = new JSONObject();
        criminalInfo.put(CRIMINALS_FIRST_NAME, criminal.getFirstName());
        criminalInfo.put(CRIMINALS_LAST_NAME, criminal.getLastName());
        //criminalInfo.put(CRIMINALS_HAS_NICKNAME, criminal.getHasNickname());
        criminalInfo.put(CRIMINALS_NICKNAME, criminal.getNickname());
        criminalInfo.put(CRIMINALS_AGE, criminal.getAge());
        criminalInfo.put(CRIMINALS_GENDER, criminal.getGender());
        criminalInfo.put(CRIMINALS_ETHNICITY, criminal.getEthnicity());
        criminalInfo.put(CRIMINALS_CONTACT_INFO, criminal.getContactinfo());
        criminalInfo.put(CRIMINALS_LINKED_CRIME, criminal.getLinkedCrime());
        criminalInfo.put(CRIMINALS_BIRTH_DATE, criminal.getBirthDate());
        criminalInfo.put(CRIMINALS_EYE_COLOR, criminal.getEyeColor());
        criminalInfo.put(CRIMINALS_HAIR_DESCRIPTION, criminal.getHairDescription());
        // boolean
        //criminalInfo.put(CRIMINALS_FACIAL_HAIR, criminal.getFacialHair());
        criminalInfo.put(CRIMINALS_FACIAL_HAIR_DESCRIPTION, criminal.getFacialHairDescription());
        criminalInfo.put(CRIMINALS_HEIGHT, criminal.getHeight());
        criminalInfo.put(CRIMINALS_WEIGHT, criminal.getWeight());
        // BOOLEAN
        //criminalInfo.put(CRIMINALS_HAS_TATTOOS, criminal.getHasTattoos());
        criminalInfo.put(CRIMINALS_TATTOO_DESCRIPTION, criminal.getTattooDescription());
        //criminalInfo.put(CRIMINALS_HAS_PIERCINGS, criminal.getHasPiercings());
        criminalInfo.put(CRIMINALS_PHYSICAL_MARKS, criminal.getPhysicalMarksDescription());
        criminalInfo.put(CRIMINALS_PHYSICAL_BUILD, criminal.getPhysicalBuild());
        // BOOLEAN
        //criminalInfo.put(CRIMINALS_HAS_WEAPON, criminal.getHasWeapon());
        criminalInfo.put(CRIMINALS_WEAPON_DESCRIPTION, criminal.getWeaponDescription());
        criminalInfo.put(CRIMINALS_COMPLEXION, criminal.getComplexion());
        criminalInfo.put(CRIMINALS_CLOTHING_DESCRIPTION, criminal.getClothingDescription());
        // boolean
        //criminalInfo.put(CRIMINALS_IS_GUILTY, criminal.getIsGuilty());
        // boolean
        //criminalInfo.put(CRIMINALS_HAS_FINGERPRINTS, criminal.getHasFingerprints());
        // boolean
        //criminalInfo.put(CRIMINALS_HAS_VEHICLE, criminal.getHasVehicle());
        criminalInfo.put(CRIMINALS_VEHICLE_DESCRIPTION, criminal.getVehicleDescription());

        return criminalInfo;

    }

    public static void saveSuspect() {
        suspectsList suspect = suspectsList.getInstance();
        ArrayList<Suspect> suspectArray = suspect.getSuspectList();
        JSONArray jsonSuspect = new JSONArray();

        // creating all of the json objects
        for (int i = 0; i < suspectArray.size(); i++) {
            jsonSuspect.add(getSuspectJSON(suspectArray.get(i)));
        }

        try (FileWriter file = new FileWriter(SUSPECTS_FILE_NAME)) {
            file.write(jsonSuspect.toJSONString());
            file.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    
    /** 
     * @param suspect
     * @return JSONObject
     */
    public static JSONObject getSuspectJSON(Suspect suspect) {
        JSONObject suspectDetails = new JSONObject();
        suspectDetails.put(SUSPECTS_FIRST_NAME, suspect.getFirstName());
        suspectDetails.put(SUSPECTS_LAST_NAME, suspect.getLastName());
        suspectDetails.put(SUSPECTS_AGE, suspect.getAge());
        suspectDetails.put(SUSPECTS_BIRTH_DATE, suspect.getBirthDate());
        suspectDetails.put(SUSPECTS_CLOTHING_DESCRIPTION, suspect.getClothingDescription());
        suspectDetails.put(SUSPECTS_COMPLEXION, suspect.getComplexion());
        suspectDetails.put(SUSPECTS_CONTACT_INFO, suspect.getContactInfo());
        suspectDetails.put(SUSPECTS_ETHNICITY, suspect.getEthnicity());
        suspectDetails.put(SUSPECTS_EYE_COLOR, suspect.getEyeColor());
        suspectDetails.put(SUSPECTS_FACIAL_HAIR_DESCRIPTION, suspect.getFacialHairDescription());
        suspectDetails.put(SUSPECTS_FACIAL_HAIR, suspect.isHasFacialHair());
        suspectDetails.put(SUSPECTS_GENDER, suspect.getGender());
        suspectDetails.put(SUSPECTS_HAIR_DESCRIPTION, suspect.getHairDescription());
        suspectDetails.put(SUSPECTS_HAS_ALIBI, suspect.getHasAlibi());
        suspectDetails.put(SUSPECTS_HAS_PIERCINGS, suspect.isHasPiercings());
        suspectDetails.put(SUSPECTS_HAS_TATOOS, suspect.isHasTattoos());
        suspectDetails.put(SUSPECTS_HAS_VEHICLE, suspect.getHasVehicle());
        suspectDetails.put(SUSPECTS_HAS_WEAPON, suspect.isHasWeapon());
        suspectDetails.put(SUSPECTS_HEIGHT, suspect.getHeight());
        suspectDetails.put(SUSPECTS_IS_MINOR, suspect.getIsMinor());
        suspectDetails.put(SUSPECTS_PHYSICAL_BUILD, suspect.getPhysicalBuild());
        suspectDetails.put(SUSPECTS_PHYSICAL_MARKS, suspect.getPhysicalMarksDescription());
        suspectDetails.put(SUSPECTS_STATEMENT, suspect.getStatement());
        suspectDetails.put(SUSPECTS_SUSPECT_ID, suspect.getSuspectId());
        suspectDetails.put(SUSPECTS_TATTOO_DESCRIPTION, suspect.getTattooDescription());
        suspectDetails.put(SUSPECTS_VEHICLE_DESCRIPTION, suspect.getVehicleDescription());
        suspectDetails.put(SUSPECTS_WEAPON_DESCRIPTION, suspect.getWeaponDescription());
        suspectDetails.put(SUSPECTS_WEIGHT, suspect.getWeight());
        return suspectDetails;
    }

    public static void saveVictim() {
        victimsList victim = victimsList.getInstance();
        ArrayList<Victim> victimArray = victim.getVictimList();
        JSONArray jsonVictim = new JSONArray();

        // creating all of the json objects
        for (int i = 0; i < victimArray.size(); i++) {
            jsonVictim.add(getVictimJSON(victimArray.get(i)));
        }

        try (FileWriter file = new FileWriter(VICTIMS_FILE_NAME)) {
            file.write(jsonVictim.toJSONString());
            file.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    /** 
     * @param victim
     * @return JSONObject
     */
    public static JSONObject getVictimJSON(Victim victim) {
        JSONObject victimDetails = new JSONObject();
        victimDetails.put(VICTIMS_FIRST_NAME, victim.getFirstName());
        victimDetails.put(VICTIMS_LAST_NAME, victim.getLastName());
        victimDetails.put(VICTIMS_AGE, victim.getAge());
        victimDetails.put(VICTIMS_CONTACT_INFO, victim.getContactInfo());
        victimDetails.put(VICTIMS_IS_MINOR, victim.getIsMinor());
        victimDetails.put(VICTIMS_STATEMENT, victim.getStatement());
        victimDetails.put(VICTIMS_IS_INJURED, victim.isInjured());
        victimDetails.put(VICTIMS_IS_ALIVE, victim.isAlive());
        victimDetails.put(VICTIMS_VICTIM_ID, victim.getVictimId());

        return victimDetails;
    }

    public static void saveWitness() {
        witnessList witness = witnessList.getInstance();
        ArrayList<Witness> witnessesArray = witness.getWitnessList();
        JSONArray jsonWitness = new JSONArray();

        // creating all of the json objects
        for (int i = 0; i < witnessesArray.size(); i++) {
            jsonWitness.add(getWitnessJSON(witnessesArray.get(i)));
        }

        // Write JSON file
        try (FileWriter file = new FileWriter(WITNESSES_FILE_NAME)) {
            file.write(jsonWitness.toJSONString());
            file.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    
    /** 
     * @param witness
     * @return JSONObject
     */
    public static JSONObject getWitnessJSON(Witness witness) {
        JSONObject witnessDetails = new JSONObject();
        witnessDetails.put(WITNESSES_FIRST_NAME, witness.getFirstName());
        witnessDetails.put(WITNESSES_LAST_NAME, witness.getLastName());
        witnessDetails.put(WITNESSES_AGE, witness.getAge());
        witnessDetails.put(WITNESSES_CONTACT_INFO, witness.getContanctInfo());
        witnessDetails.put(WITNESSES_LOCATION, witness.getLocation());
        witnessDetails.put(WITNESSES_PROOF, witness.getProof());
        witnessDetails.put(WITNESSES_TESTIMONY, witness.getTestimony());
        witnessDetails.put(WITNESSES_TYPE_OF_WITNESS, witness.getTypeOfWitness());
        witnessDetails.put(WITNESSES_WITNESS_ID, witness.getWitnessId());

        return witnessDetails;
    }

    // PersonOfInterest
    public static void savePersonOfInterest() {
        personOfInterestList personOfInterest = personOfInterestList.getInstance();
        ArrayList<PersonOfInterest> poiArray = personOfInterest.getPersonOfInterestList();
        JSONArray jsonPersonOfInterest = new JSONArray();

        // create json objects and loop through the PersonOfInterest list
        for (int i = 0; i < poiArray.size(); i++) {
            jsonPersonOfInterest.add(getPersonOfInterestJSON(poiArray.get(i)));
        }
        // write the PersonOfInterest json file
        try (FileWriter file = new FileWriter(PERSONOFINTEREST_FILE_NAME)) {

            file.write(jsonPersonOfInterest.toJSONString());
            file.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    /** 
     * @param personOfInterest
     * @return JSONObject
     */
    public static JSONObject getPersonOfInterestJSON(PersonOfInterest personOfInterest) {
        JSONObject personOfInterestInfo = new JSONObject();
        personOfInterestInfo.put(PERSONOFINTEREST_POI_ID, personOfInterest.getPersonId());
        personOfInterestInfo.put(PERSONOFINTEREST_FIRST_NAME, personOfInterest.getFirstName());
        personOfInterestInfo.put(PERSONOFINTEREST_LAST_NAME, personOfInterest.getLastName());
        personOfInterestInfo.put(PERSONOFINTEREST_AGE, personOfInterest.getAge());
        personOfInterestInfo.put(PERSONOFINTEREST_CONTACT_INFO, personOfInterest.getContactInfo());
        // boolean
        personOfInterestInfo.put(PERSONOFINTEREST_IS_MINOR, personOfInterest.getIsMinor());
        personOfInterestInfo.put(PERSONOFINTEREST_STATEMENT, personOfInterest.getStatement());
        // boolean
        personOfInterestInfo.put(PERSONOFINTEREST_HAS_ALIBI, personOfInterest.isHasAlibi());
        personOfInterestInfo.put(PERSONOFINTEREST_IS_SUSPECT, personOfInterest.getIsMinor());

        return personOfInterestInfo;

    }

}