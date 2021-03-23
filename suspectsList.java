import java.util.ArrayList;

/**
 * Author: Sydney Oklota
 * will hold all suspects
 */
public class suspectsList {
	
    private static ArrayList<Suspect> suspectsList = new ArrayList<Suspect>();
	private static Suspect suspect = null;
	
	/*
	 * 
	 */
	private suspectsList()
	{
		suspectsList = new DataLoader().loadSuspect();
	}
	
	/*
	 * 
	 */
	public static Suspect getInstance()
	{
        if (suspect == null) {
			suspect = new Suspect();
		}
        return suspect;
		
	}
	
	/*
	 * 
	 */
	public ArrayList<Suspect> getSuspect()
	{
		return suspectsList;
	}
	
	
	/*
	 * 
	 */
	public Suspect searchSuspectsByName(String Fname, String Lname)
	{
		boolean found = false;
		
		for (Suspect suspect : suspectsList)
		{
			if(suspect.getFirstName().equalsIgnoreCase(Fname) && suspect.getLastName().equalsIgnoreCase(Lname))
			{
				found = true;
				return suspect;
			}
		}
		
		if (!found)
		{
			System.out.println("The suspect entered was not found in our database!");
		}
		return null;
	}

	/*
	 * 
	 */
	public void editSuspectsByName(String Fname, String Lname) 
	{
		Suspect suspectEdit = searchSuspectsByName(Fname, Lname);
		
		
	}

	/**
	 * 
	 */
	public void saveSuspect() {
		DataWriter.saveSuspect();
	}
	


    
}
