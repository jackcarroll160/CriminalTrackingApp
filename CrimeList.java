import java.util.ArrayList;
import java.util.UUID;
import java.util.Scanner;

/*
 * @author Kyle Persyn
 * This class is going to be the CriminalList  class that will hold all of the criminals
 */
public class CrimeList implements UserActions{

	private static ArrayList<Crime> crimeList = new ArrayList<Crime>();
	private static Crime crime = null;
	
	/*
	 * This is the constructor where the criminal array list will be constructed
	 */
	private CrimeList()
	{
		crimeList = new DataLoader().loadCrime();
	}
	
	/*
	 * This is the getInstance method that will create a new criminal as long as criminal List is not null
	 * @return An instance of library
	 */
	public static Crime getInstance()
	{
		if (crime == null) {
			crime = new Crime();
		}
		return crime;
	}
	
	/*
	 * 
	 */
	public ArrayList<Crime> getCrime()
	{
		return crimeList;
	}
	
	
	/*
	 * 
	 */
	public void searchCrimeByName(String Fname, String Lname)
	{
		
	}

    public void editCrimeByName(int CrimeID)
    {
        
    }
}

