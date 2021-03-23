import java.util.ArrayList;

/**
 * Author: Sydney Oklota
 * will hold all persons of interest
 */
public class personOfInterestList {
    private static ArrayList<PersonOfInterest> POIList = new ArrayList<PersonOfInterest>();
	private static PersonOfInterest POI = null;
	
	/*
	 * 
	 */
	private personOfInterestList()
	{
		POIList = new DataLoader().loadPOI();
	}
	
	/*
	 * 
	 */
	public static PersonOfInterest getInstance()
	{
        if (POI == null) {
			POI = new PersonOfInterest();
		}
        return POI;
		
	}
	
	/*
	 * 
	 */
	public ArrayList<PersonOfInterest> getPOI()
	{
		return POIList;
	}
	
	
	/*
	 * 
	 */
	public PersonOfInterest searchPOIByName(String Fname, String Lname)
	{
		boolean found = false;
		
		for (PersonOfInterest POI : POIList)
		{
			if(POI.getFirstName().equalsIgnoreCase(Fname) && POI.getLastName().equalsIgnoreCase(Lname))
			{
				found = true;
				return POI;
			}
		}
		
		if (!found)
		{
			System.out.println("The person of interest entered was not found in our database!");
		}
		return null;
	}

	/*
	 * 
	 */
	public void editPOIByName(String Fname, String Lname) 
	{
		PersonOfInterest poiEdit = searchPOIByName(Fname, Lname);
		
		
	}

	public void savePOI() {
		DataWriter.savePOI();
	}
	


    
}
