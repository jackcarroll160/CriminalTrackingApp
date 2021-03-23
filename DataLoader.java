import java.io.FileReader;
import java.util.ArrayList;
import java.util.UUID;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader extends DataConstants{

// crime
public static ArrayList <Crime> loadCrime(){
    ArrayList <Crime> crime = new ArrayList <Crime>();

    try{
        FileReader reader = new FileReader(CRIME_FILE_NAME);
        JSONParser parser = new JSONParser();
        JSONArray crimeJSON = (JSONArray) new JSONParser().parse(reader);
        

        for (int i = 0; i < crimeJSON.size(); i++){
            JSONObject crimeJSON = (JSONObject)crimeJSON.get(i);
            UUID crimeId = UUID.fromString((String)crimeJSON.get(CRIME_CRIME_ID));
            UUID criminalId = UUID.fromString((String)criminalJSON.get(CRIMINALS_CRIMINAL_ID));
            String description = (String)crimeJSON.get(CRIME_DESCRIPTION);
            String dateOfCrime = (String)crimeJSON.get(CRIME_DATE_OF_CRIME);
            String timeOfCrime = (String)crimeJSON.get(CRIME_TIME_OF_CRIME);
            //boolean
            String caseOpen = (String)crimeJSON.get(CRIME_CASE_OPEN);
            UUID witnessId = UUID.fromString((String)crimeJSON.get(CRIME_WITNESS_ID);
            UUID victimId = UUID.fromString((String)crimeJSON.get(CRIME_VICTIM_ID);
            UUID suspectId = UUID.fromString((String)crimeJSON.get(CRIME_SUSPECT_ID);
            UUID personOfInterestId = UUID.fromString((String)crimeJSON.get(CRIME_POI_ID);
            String officers = (String)crimeJSON.get(CRIME_OFFICERS);
            crime.add(new Crime(crimeId, criminalId, description, dateOfCrime, timeOfCrime, caseOpen, witnessId, victimId, suspectId, personOfInterestId, officers));
        }

        return crime;
    } catch (Exception e){
        e.printStackTrace();
    }

    return null;
}


    // criminal
    public static ArrayList <Criminal> loadCriminals(){
        ArrayList <Criminal> criminal = new ArrayList <Criminal>();

        try{
            FileReader reader = new FileReader(CRIMINALS_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray criminalJSON = (JSONArray) new JSONParser().parse(reader);
            }

            for (int i = 0; i < criminalJSON.size(); i++){
                JSONObject criminalJSON = (JSONObject)criminalJSON.get(i);
                UUID criminalId = UUID.fromString((String)criminalJSON.get(CRIMINALS_CRIMINAL_ID));
                String firstName = (String)criminalJSON.get(CRIMINALS_FIRST_NAME);
                String lastName = (String)criminalJSON.get(CRIMINALS_LAST_NAME);
                //boolean
                String hasNickname = (String)criminalJSON.get(CRIMINALS_HAS_NICKNAME);
                String nickname = (String)criminalJSON.get(CRIMINALS_NICKNAME);
                int age = ((Long)criminalJSON.get(CRIMINALS_AGE)).intValue();
                String gender = (String)criminalJSON.get(CRIMINALS_GENDER);
                String ethnicity = (String)criminalJSON.get(CRIMINALS_ETHNICITY);
                String contactInfo = (String)criminalJSON.get(CRIMINALS_CONTACT_INFO);
                String linkedCrime = (String)criminalJSON.get(CRIMINALS_LINKED_CRIME);
                UUID crimeId = UUID.fromString((String)criminalJSON.get(CRIMINALS_CRIME_ID));
                String birthDate = (String)criminalJSON.get(CRIMINALS_BIRTH_DATE);
                String eyeColor = (String)criminalJSON.get(CRIMINALS_EYE_COLOR);
                String hairDescription = (String)criminalJSON.get(CRIMINALS_HAIR_DESCRIPTION);
                //boolean
                String facialHair = (String)criminalJSON.get(CRIMINALS_FACIAL_HAIR);
                String facialHairDescription = (String)criminalJSON.get(CRIMINALS_FACIAL_HAIR_DESCRIPTION);
                String height = (String)criminalJSON.get(CRIMINALS_HEIGHT);
                String weight = (String)criminalJSON.get(CRIMINALS_WEIGHT);
                //boolean
                String hasTattoos = (String)criminalJSON.get(CRIMINALS_HAS_TATTOOS);
                String tattooDescription = (String)criminalJSON.get(CRIMINALS_TATTOO_DESCRIPTION);
                //boolean
                String hasPiercings = (String)criminalJSON.get(CRIMINALS_HAS_PIERCINGS);
                String physicalMarksDescription = (String)criminalJSON.get(CRIMINALS_PHYSICAL_MARKS);
                String physicalBuild = (String)criminalJSON.get(CRIMINALS_PHYSICAL_BUILD);
                //BOOLEAN
                String hasWeapon = (String)criminalJSON.get(CRIMINALS_HAS_WEAPON);
                String weaponDescription = (String)criminalJSON.get(CRIMINALS_WEAPON_DESCRIPTION);
                String complexion = (String)criminalJSON.get(CRIMINALS_COMPLEXION);
                String clothingDescription = (String)criminalJSON.get(CRIMINALS_CLOTHING_DESCRIPTION);
                //boolean
                String isGuilty = (String)criminalJSON.get(CRIMINALS_IS_GUILTY);
                //boolean
                String hasFingerprints = (String)criminalJSON.get(CRIMINALS_HAS_FINGERPRINTS);
                //BOOLEAN
                String hasVehicle = (String)criminalJSON.get(CRIMINALS_HAS_VEHICLE);
                String vehicleDescription = (String)criminalJSON.get(CRIMINALS_VEHICLE_DESCRIPTION);



                criminal.add(new Criminal(criminalId, firstName, lastName, hasNickname, nickname, age, gender, ethnicity, contactInfo, linkedCrime, crimeId, birthDate, eyeColor, hairDescription, facialHair, facialHairDescription, height, weight, hasTattoos, tattooDescription, hasPiercings, physicalMarksDescription, physicalBuild, hasWeapon, weaponDescription, complexion, clothingDescription, isGuilty, hasFingerprints, hasVehicle, vehicleDescription));
            }

            return criminal;

        } catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    
    // person of interest
    public static ArrayList <POI> loadPOI(){
        ArrayList <POI> poi = new ArrayList <POI>();

        try{
            FileReader reader = new FileReader(PERSONOFINTEREST_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray poiJSON = (JSONArray) new JSONParser().parse(reader);
            

            for (int i = 0; i < poiJSON.size(); i++){
                JSONObject poiJSON = (JSONObject)poiJSON.get(i);
                UUID personOfInterestId = UUID.fromString((String)poiJSON.get(PERSONOFINTEREST_POI_ID);
                UUID suspectId = UUID.fromString((String)poiJSON.get(PERSONOFINTEREST_SUSPECT_ID);
                UUID crimeId = UUID.fromString((String)poiJSON.get(PERSONOFINTEREST_CRIME_ID);
                String firstName = (String)poiJSON.get(PERSONOFINTEREST_FIRST_NAME);
                String lastName = (String)poiJSON.get(PERSONOFINTEREST_LAST_NAME);
                int age = ((Long)poiJSON.get(PERSONOFINTEREST_AGE)).intValue();
                String contactInfo = (String)poiJSON.get(PERSONOFINTEREST_CONTACT_INFO);
                // BOOLEAN
                String isMinor = (String)poiJSON.get(PERSONOFINTEREST_IS_MINOR);
                String statement = (String)poiJSON.get(PERSONOFINTEREST_STATEMENT);
                // BOOLEAN
                String hasAlibi = (String)poiJSON.get(PERSONOFINTEREST_HAS_ALIBI);
                //BOOLEAN
                String isSuspect = (String)poiJSON.get(PERSONOFINTEREST_IS_SUSPECT);

                poi.add(new POI(personOfInterestId, suspectId, crimeId, firstName, lastName, age, contactInfo, isMinor, statement, hasAlibi, isSuspect));
            }

            return poi;
        } catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    // suspects
    public static ArrayList <Suspect> loadSuspect(){
        ArrayList <Suspect> suspect = new ArrayList <Suspect>();

        try{
            FileReader reader = new FileReader(SUSPECTS_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray suspectJSON = (JSONArray) new JSONParser().parse(reader);
            

            for (int i = 0; i < suspectJSON.size(); i++){
                JSONObject suspectJSON = (JSONObject)suspectJSON.get(i);
                UUID suspectId = UUID.fromString((String)suspectJSON.get(SUSPECTS_SUSPECT_ID);
                UUID crimeId = UUID.fromString((String)suspectJSON.get(SUSPECTS_CRIME_ID);
                String firstName = (String)suspectJSON.get(SUSPECTS_FIRST_NAME);
                String lastName = (String)suspectJSON.get(SUSPECTS_LAST_NAME);
                int age = ((Long)suspectJSON.get(SUSPECTS_AGE)).intValue();
                String gender = (String)suspectJSON.get(SUSPECTS_GENDER);
                String ethnicity = (String)suspectJSON.get(SUSPECTS_ETHNICITY);
                String contactInfo = (String)suspectJSON.get(SUSPECTS_CONTACT_INFO);
                //BOOLEAN
                String isMinor = (String)suspectJSON.get(SUSPECTS_IS_MINOR);
                String statement = (String)suspectJSON.get(SUSPECTS_STATEMENT);
                //BOOLEAN
                String hasAlibi = (String)suspectJSON.get(SUSPECTS_HAS_ALIBI);
                String birthDate = (String)suspectJSON.get(SUSPECTS_BIRTH_DATE);
                String eyeColor = (String)suspectJSON.get(SUSPECTS_EYE_COLOR);
                String hairDescription = (String)suspectJSON.get(SUSPECTS_HAIR_DESCRIPTION);
                //boolean
                String facialHair = (String)suspectJSON.get(SUSPECTS_FACIAL_HAIR);
                String facialHairDescription = (String)suspectJSON.get(SUSPECTS_FACIAL_HAIR_DESCRIPTION);
                String height = (String)suspectJSON.get(SUSPECTS_HEIGHT);
                String weight = (String)suspectJSON.get(SUSPECTS_WEIGHT);
                //BOOLEAN
                String hasTattoos = (String)suspectJSON.get(SUSPECTS_HAS_TATOOS);
                String tattooDescription = (String)suspectJSON.get(SUSPECTS_TATTOO_DESCRIPTION);
                //BOOLEAN
                String hasPiercings = (String)suspectJSON.get(SUSPECTS_HAS_PIERCINGS);
                String physicalMarksDescription = (String)suspectJSON.get(SUSPECTS_PHYSICAL_MARKS);
                String physicalBuild = (String)suspectJSON.get(SUSPECTS_PHYSICAL_BUILD);
                //BOOLEAN
                String hasWeapon = (String)suspectJSON.get(SUSPECTS_HAS_WEAPON);
                String weaponDescription = (String)suspectJSON.get(SUSPECTS_WEAPON_DESCRIPTION);
                String complexion = (String)suspectJSON.get(SUSPECTS_COMPLEXION);
                String clothingDescription = (String)suspectJSON.get(SUSPECTS_CLOTHING_DESCRIPTION);
                //boolean
                String hasVehicle = (String)suspectJSON.get(SUSPECTS_HAS_VEHICLE);
                String vehicleDescription = (String)suspectJSON.get(SUSPECTS_VEHICLE_DESCRIPTION);

                suspect.add(new Suspect(suspectId, crimeId, firstName, lastName, age, gender, ethnicity, contactInfo, isMinor, statement, hasAlibi, birthDate, eyeColor, hairDescription, facialHair, facialHairDescription, height, weight, hasTattoos, tattooDescription, hasPiercings, physicalMarksDescription, physicalBuild, hasWeapon, weaponDescription, complexion, clothingDescription, hasVehicle, vehicleDescription));
            }

            return suspect;
        } catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}

// victims
public static ArrayList <Victim> loadVictims(){
    ArrayList <Victim> victim = new ArrayList <Victim>();

    try{
        FileReader reader = new FileReader(VICTIMS_FILE_NAME);
        JSONParser parser = new JSONParser();
        JSONArray victimJSON = (JSONArray) new JSONParser().parse(reader);
        

        for (int i = 0; i < victimJSON.size(); i++){
            JSONObject victimJSON = (JSONObject)victimJSON.get(i);
            UUID victimId = UUID.fromString((String)victimJSON.get(VICTIMS_VICTIM_ID);
            UUID crimeId = UUID.fromString((String)victimJSON.get(VICTIMS_CRIME_ID);
            String firstName = (String)victimJSON.get(VICTIMS_FIRST_NAME);
            String lastName = (String)victimJSON.get(VICTIMS_LAST_NAME);
            int age = ((Long)victimJSON.get(VICTIMS_AGE)).intValue();
            String contactInfo = (String)victimJSON.get(VICTIMS_CONTACT_INFO);
            //boolean
            String isMinor = (String)victimJSON.get(VICTIMS_IS_MINOR);
            //BOOLEAN
            String isAlive = (String)victimJSON.get(VICTIMS_IS_ALIVE);
            //BOOLEAN
            String isInjured = (String)victimJSON.get(VICTIMS_IS_INJURED);
            String statement = (String)victimJSON.get(VICTIMS_STATEMENT);

            victim.add(new Victim(victimId, crimeId, firstName, lastName, age, contactInfo, isMinor, isAlive, isInjured, statement));
        }

        return victim;
    } catch (Exception e){
        e.printStackTrace();
    }

    return null;
}

// witnesses
public static ArrayList <Witness> loadWitnesses(){
    ArrayList <Witness> witness = new ArrayList <Witness>();

    try{
        FileReader reader = new FileReader(WITNESSES_FILE_NAME);
        JSONParser parser = new JSONParser();
        JSONArray witnessJSON = (JSONArray) new JSONParser().parse(reader);
        

        for (int i = 0; i < witnessJSON.size(); i++){
            JSONObject witnessJSON = (JSONObject)witnessJSON.get(i);
            UUID witnessId = UUID.fromString((String)witnessJSON.get(WITNESSES_WITNESS_ID);
            UUID crimeId = UUID.fromString((String)witnessJSON.get(WITNESSES_CRIME_ID);
            String firstName = (String)witnessJSON.get(WITNESSES_FIRST_NAME);
            String lastName = (String)witnessJSON.get(WITNESSES_LAST_NAME);
            int age = ((Long)witnessJSON.get(WITNESSES_AGE)).intValue();
            String contactInfo = (String)witnessJSON.get(WITNESSES_CONTACT_INFO);
            //boolean
            String isMinor = (String)witnessJSON.get(WITNESSES_FIRST_NAME);
            String proof= (String)witnessJSON.get(WITNESSES_PROOF);
            String testimony = (String)witnessJSON.get(WITNESSES_TESTIMONY);
            String location = (String)witnessJSON.get(WITNESSES_LOCATION);
            String typeOfWitness = (String)witnessJSON.get(WITNESSES_TYPE_OF_WITNESS);
           

            witness.add(new Witness(firstName, lastName, age, contactInfo, isMinor, proof, testimony, location, typeOfWitness));
        }

        return witness;
    } catch (Exception e){
        e.printStackTrace();
    }

    return null;
}
