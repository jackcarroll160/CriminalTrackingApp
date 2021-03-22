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
            String description = (String)crimeJSON.get(CRIME_DESCRIPTION);
            String dateOfCrime = (String)crimeJSON.get(CRIME_DATE_OF_CRIME);
            String timeOfCrime = (String)crimeJSON.get(CRIME_TIME_OF_CRIME);
            String officers = (String)crimeJSON.get(CRIME_OFFICERS);
            crime.add(new Crime(description, dateOfCrime, timeOfCrime, officers));
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
                String firstName = (String)criminalJSON.get(CRIMINALS_FIRST_NAME);
                String lastName = (String)criminalJSON.get(CRIMINALS_LAST_NAME);
                String nickname = (String)criminalJSON.get(CRIMINALS_NICKNAME);
                int age = ((Long)criminalJSON.get(CRIMINALS_AGE)).intValue();
                String ethnicity = (String)criminalJSON.get(CRIMINALS_ETHNICITY);
                String contactinfo = (String)criminalJSON.get(CRIMINALS_CONTACT_INFO);
                String linkedCrime = (String)criminalJSON.get(CRIMINALS_LINKED_CRIME);
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


                criminal.add(new Criminal(firstName,lastName, nickname, age, gender, ethnicity, contactinfo, linkedCrime));
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
                String firstName = (String)poiJSON.get(PERSONOFINTEREST_FIRST_NAME);
                String lastName = (String)poiJSON.get(PERSONOFINTEREST_LAST_NAME);

                poi.add(new POI(firstName, lastName));
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
                String firstName = (String)suspectJSON.get(SUSPECTS_FIRST_NAME);
                String lastName = (String)suspectJSON.get(SUSPECTS_LAST_NAME);

                suspect.add(new Suspect(firstName, lastName));
            }

            return suspect;
        } catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}