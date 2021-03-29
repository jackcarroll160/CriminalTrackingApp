import java.util.ArrayList;
import java.util.UUID;
import java.util.Scanner;

/*
 * @author Kyle Persyn
 * This class is going to be the CriminalList  class that will hold all of the criminals
 */
public class CriminalList{

	private static ArrayList<Criminal> criminalList = new ArrayList<Criminal>();
	private static CriminalList criminal = null;
	
	/*
	 * This is the constructor where the criminal array list will be constructed
	 */
	private CriminalList()
	{
		criminalList = new DataLoader().loadCriminals();
	}
	
	
	/** 
	 * @return CriminalList
	 */
	/*
	 * This is the getInstance method that will create a new criminal as long as criminal List is not null
	 * @return An instance of library
	 */
	public static CriminalList getInstance()
	{
		if (criminal == null) {
			criminal = new CriminalList();
		}
		return criminal;
	}
	
	
	/** 
	 * @return ArrayList<Criminal>
	 */
	/*
	 * 
	 */
	public ArrayList<Criminal> getCriminalList()
	{
		return criminalList;
	}
	
	
	
	/** 
	 * @param Fname
	 * @param Lname
	 * @return Criminal
	 */
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
	public void addCriminal(Criminal criminal) {

        criminalList.add(criminal);
        DataWriter.saveCriminals();

    }

	public void saveCriminals() {
		DataWriter.saveCriminals();
	}
	
}
