/*
 * @author Kyle Persyn
 * This class is going to be the CriminalList  class that will hold all of the criminals
 */
public class CriminalList implements UserActions{

	private ArrayList<Criminal> criminalList;
	private Criminal criminal;
	
	/*
	 * 
	 */
	public CriminalList()
	{
		
	}
	
	/*
	 * 
	 */
	public Criminal getInstance()
	{
		return criminal;
	}
	
	/*
	 * 
	 */
	public ArrayList<Criminal> getCriminals(String fullName)
	{
		return criminalList;
	}
	
	/*
	 * 
	 */
	public void searchCriminalsByName(String Fname, String Lname)
	{
		
	}

	/*
	 * 
	 */
	public void editCriminalsByName(String Fname, String Lname) 
	{
		
	}
	
	


}
