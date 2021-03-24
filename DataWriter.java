import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class DataWriter extends DataConstants{

    //crime
    public static void saveCrime(){
        CrimeList crime = CrimeList.getInstance();
        ArrayList<Crime> crimeList = crime.getCrimeList();
        JSONArray jsonCrimeList = new JSONArray();

        // create json objects and loop through the crime list
        for(int i = 0; i < crimeList.size(); i++){
            jsonCrimeList.add(getCrimeJSON(crimeList.get(i)));
        }

    }

    // write the crime json file
    try (FileWriter file = new FileWriter(CRIME_FILE_NAME)){

        file.write(jsonCrimeList.toJSONString());
        file.flush();

    } catch (IOException e) {
        e.printStackTrace();
    }

    public static JSONObject getCrimeJSON(Crime crime) {
        JSONObject crimeInfo = new JSONObject();
        crimeInfo.put(CRIME_CRIME_ID, crime.getCrimeId().toString());
        crimeInfo.put(CRIME_CRIMINAL_ID, crime.getCriminalId().toString());
        crimeInfo.put(CRIME_DESCRIPTION, crime.getDescription());
        crimeInfo.put(CRIME_DATE_OF_CRIME, crime.getDateOfCrime());
        crimeInfo.put(CRIME_TIME_OF_CRIME, crime.getTimeOfCrime());
        //boolean
        crimeInfo.put(CRIME_CASE_OPEN, crime.getCaseOpen());
        crimeInfo.put(CRIME_WITNESS_ID, crime.getWitnessId().toString());
        crimeInfo.put(CRIME_VICTIM_ID, crime.getVictimId().toString());
        crimeInfo.put(CRIME_POI_ID, crime.getPersonOfInterestId().toString());
        crimeInfo.put(CRIME_OFFICERS, crime.getOfficers());
    }


    // criminals
    public static void saveCriminals(){
        CriminalList criminal = CriminalList.getInstance();
        ArrayList<Criminal> criminalList = criminal.getCriminalList();
        JSONArray jsonCriminalList = new JSONArray();

        // create json objects and loop through the criminal list
        for(int i = 0; i < criminalList.size(); i++){
            jsonCriminalList.add(getCriminalJSON(criminalList.get(i)));
        }

    }

    // write the criminal json file
    try (FileWriter file = new FileWriter(CRIMINALS_FILE_NAME)){

        file.write(jsonCriminalList.toJSONString());
        file.flush();

    } catch (IOException e) {
        e.printStackTrace();
    }

    public static JSONObject getCriminalJSON(Criminal criminal) {
        JSONObject criminalInfo = new JSONObject();
        criminalInfo.put(CRIMINALS_FIRST_NAME, criminal.getFirstName());
        criminalInfo.put(CRIMINALS_LAST_NAME, criminal.getLastName());
        criminalInfo.put(CRIMINALS_HAS_NICKNAME, criminal.getHasNickname());
        criminalInfo.put(CRIMINALS_NICKNAME, criminal.getNickname());
        criminalInfo.put(CRIMINALS_AGE, criminal.getAge().toString());
        criminalInfo.put(CRIMINALS_GENDER, criminal.getGender());
        criminalInfo.put(CRIMINALS_ETHNICITY, criminal.getEthnicity());
        criminalInfo.put(CRIMINALS_CONTACT_INFO, criminal.getContactInfo());
        criminalInfo.put(CRIMINALS_LINKED_CRIME, criminal.getLinkedCrime());
        criminalInfo.put(CRIMINALS_BIRTH_DATE, criminal.getBirthDate());
        criminalInfo.put(CRIMINALS_EYE_COLOR, criminal.getEyeColor());
        criminalInfo.put(CRIMINALS_HAIR_DESCRIPTION, criminal.getHairDescription());
        //boolean
        criminalInfo.put(CRIMINALS_FACIAL_HAIR, criminal.getFacialHair());
        criminalInfo.put(CRIMINALS_FACIAL_HAIR_DESCRIPTION, criminal.getFacialHairDescription());
        criminalInfo.put(CRIMINALS_HEIGHT, criminal.getHeight());
        criminalInfo.put(CRIMINALS_WEIGHT, criminal.getWeight());
        //BOOLEAN
        criminalInfo.put(CRIMINALS_HAS_TATTOOS, criminal.getHasTattoos());
        criminalInfo.put(CRIMINALS_TATTOO_DESCRIPTION, criminal.getTattooDescription());
        criminalInfo.put(CRIMINALS_HAS_PIERCINGS, criminal.getHasPiercings());
        criminalInfo.put(CRIMINALS_PHYSICAL_MARKS, criminal.getPhysicalMarksDescription());
        criminalInfo.put(CRIMINALS_PHYSICAL_BUILD, criminal.getPhysicalBuild());
        //BOOLEAN
        criminalInfo.put(CRIMINALS_HAS_WEAPON, criminal.getHasWeapon());
        criminalInfo.put(CRIMINALS_WEAPON_DESCRIPTION, criminal.getWeaponDescription());
        criminalInfo.put(CRIMINALS_COMPLEXION, criminal.getComplexion());
        criminalInfo.put(CRIMINALS_CLOTHING_DESCRIPTION, criminal.getClothingDescription());
        //boolean
        criminalInfo.put(CRIMINALS_IS_GUILTY, criminal.getIsGuilty());
        //boolean
        criminalInfo.put(CRIMINALS_HAS_FINGERPRINTS, criminal.getHasFingerprints());
        //boolean
        criminalInfo.put(CRIMINALS_HAS_VEHICLE, criminal.getHasVehicle());
        criminalInfo.put(CRIMINALS_VEHICLE_DESCRIPTION, criminal.getVehicleDescription());

    }


    //PersonOfInterest
    public static void savePersonOfInterest(){
        PersonOfInterestList personOfInterest = PersonOfInterestList.getInstance();
        ArrayList<PersonOfInterest> personOfInterestList = personOfInterest.getPersonOfInterestList();
        JSONArray jsonPersonOfInterestList = new JSONArray();

        // create json objects and loop through the PersonOfInterest list
        for(int i = 0; i < personOfInterestList.size(); i++){
            jsonPersonOfInterestList.add(getPersonOfInterestJSON(personOfInterestList.get(i)));
        }

    }

    // write the PersonOfInterest json file
    try (FileWriter file = new FileWriter(PERSONOFINTEREST_FILE_NAME)){

        file.write(jsonPersonOfInterestList.toJSONString());
        file.flush();

    } catch (IOException e) {
        e.printStackTrace();
    }

    public static JSONObject getPersonOfInterestJSON(PersonOfInterest personOfInterest) {
        JSONObject personOfInterestInfo = new JSONObject();
        personOfInterestInfo.put(PERSONOFINTEREST_POI_ID, personOfInterest.getCrimeId().toString());
        crimeInfo.put(CRIME_CRIMINAL_ID, crime.getCriminalId().toString());
        crimeInfo.put(CRIME_DESCRIPTION, crime.getDescription());
        crimeInfo.put(CRIME_DATE_OF_CRIME, crime.getDateOfCrime());
        crimeInfo.put(CRIME_TIME_OF_CRIME, crime.getTimeOfCrime());
        //boolean
        crimeInfo.put(CRIME_CASE_OPEN, crime.getCaseOpen());
        crimeInfo.put(CRIME_WITNESS_ID, crime.getWitnessId().toString());
        crimeInfo.put(CRIME_VICTIM_ID, crime.getVictimId().toString());
        crimeInfo.put(CRIME_POI_ID, crime.getPersonOfInterestId().toString());
        crimeInfo.put(CRIME_OFFICERS, crime.getOfficers());
    }
    

}