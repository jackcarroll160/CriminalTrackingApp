import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

/**
 * Author: Sydney Oklota
 * will hold all persons of interest
 */
public class personOfInterestList {
	
    private static ArrayList<PersonOfInterest> POIList = new ArrayList<PersonOfInterest>();
	private static personOfInterestList POI = null;
	
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
	public static personOfInterestList getInstance()
	{
        if (POI == null) {
			POI = new personOfInterestList();
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
		Scanner keyboard = new Scanner (System.in);

		System.out.println("Would you like to edit: ");
		System.out.println("1) Statement" ); 
		System.out.println("2) Has Alibi");
		System.out.println("3) Is Suspect");

		int userInput = keyboard.nextInt();

		if(userInput == 1)
		{
			System.out.println("Enter the New Statement: " );
			String statement = keyboard.nextLine();
			poiEdit.setStatement(statement);
		}
		if(userInput == 2)
		{
			System.out.println("Enter the New Has Alibi Value (True or False): " );
			boolean hasAl = keyboard.nextBoolean();
			poiEdit.setHasAlibi(hasAl);
		}
		if(userInput == 3)
		{
			System.out.println("Enter the New Is Suspect Value (True or False): " );
			boolean isSus = keyboard.nextBoolean();
			poiEdit.setSuspect(isSus);
		}
		if(userInput >= 4 || userInput <=0)
		{
			System.out.println("Invalid Input!");
		}
	
	}

	/**
	 * 
	 */
	public void savePOI() {
		DataWriter.savePOI();
	}
	
	public Suspect getPOIById(UUID id)
	{
		for(PersonOfInterest poi : POIList)
		{
			if(poi.getPersonId().equals(id))
			{
				return poi;
			}
		}
		return null;
	}


    
}
