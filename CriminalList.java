import java.util.ArrayList;
import java.util.UUID;
import java.util.Scanner;

/*
 * @author Kyle Persyn
 * This class is going to be the CriminalList  class that will hold all of the criminals
 */
public class CriminalList implements UserActions{

	private static ArrayList<Criminal> criminalList = new ArrayList<Criminal>();
	private static Criminal criminal = null;
	
	/*
	 * This is the constructor where the criminal array list will be constructed
	 */
	private CriminalList()
	{
		criminalList = new DataLoader().loadCriminals();
	}
	
	/*
	 * This is the getInstance method that will create a new criminal as long as criminal List is not null
	 * @return An instance of library
	 */
	public static Criminal getInstance()
	{
		if (criminal == null) {
			criminal = new Criminal();
		}
		return criminal;
	}
	
	/*
	 * 
	 */
	public ArrayList<Criminal> getCriminals()
	{
		return criminalList;
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
