import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class DataWriter extends DataConstants{

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


}
