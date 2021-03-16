import java.util.ArrayList;
import java.util.UUID;


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
		criminalList = new DataLoader.loadCriminals();
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
	public void searchCriminalsByName(String Fname, String Lname)
	{
		int searchLength = criminalList.size();
		boolean found = false;
		
		for (int i = 0; i < searchLength; i++)
		{
			if(criminalList.get(i) != null && criminalList.get(i).getFirstName() == Fname &&criminalList.get(i).getLastName() == Lname)
			{
				System.out.println(criminalList.get(i).toString());
				found = true;
			}
		}
		
		if (!found)
		{
			System.out.println("The Criminal entered was not found in our database!");
		}
	}

	/*
	 * 
	 */
	public void editCriminalsByName(String Fname, String Lname) 
	{
		
	}
	
	


}
