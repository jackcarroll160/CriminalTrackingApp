import java.io.FileReader;

import jdk.nashorn.internal.parser.JSONParser;






public class DataLoader extends DataConstants{
    public static ArrayList <Criminal> loadCriminals(){
        ArrayList <Criminal> criminal = new ArrayList <Criminal>();

        try{
            FileReader reader = new FileReader(CRIMINALS_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray criminalsJSON = (JSONArray) new JSONParser().parse(reader);
            
            for (int i = 0; i < criminalsJSON.size(); i++){
                JSONObject personJSON = (JSONObject)criminalsJSON.get(i);
                String firstName = (String)personJSON.get(CRIMINALS_FIRST_NAME);
                String lastName = (String)personJSON.get(CRIMINALS_LAST_NAME);

                criminals.add(new Criminals(firstName,lastName));
            }

            return criminals;
        } catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}