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
	public Criminal searchCriminalsByName(String Fname, String Lname)
	{
		boolean found = false;
		
		for (Criminal criminal : criminalList)
		{
			if(criminal.getFirstName().equalsIgnoreCase(Fname) && criminal.getLastName().equalsIgnoreCase(Lname))
			{
				found = true;
				return criminal;
			}
		}
		
		if (!found)
		{
			System.out.println("The Criminal entered was not found in our database!");
		}
		return null;
	}

	/*
	 * 
	 */
	public void editCriminalsByName(String Fname, String Lname) 
	{
		Criminal crimEdit = searchCriminalsByName(Fname, Lname);
		
		
	}

	public void saveCriminals() {
		DataWriter.saveCriminals();
	}
	


    
}
