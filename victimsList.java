import java.util.ArrayList;
/**
 * Author Sydney Oklota
 * list of victims
 */

public class victimsList {
    
    private static ArrayList<Victim> victimList = new ArrayList<Victim>();
	private static Victim victims = null;
	
	/*
	 * 
	 */
	private victimsList()
	{
		victimList = new DataLoader().loadVictims();
	}
	
	/*
	 * 
	 */
	public static Victim getInstance()
	{
		if (victims == null) {
			victims = new Victim();
		}
		return victims;
	}
	
	/*
	 * 
	 */
	public ArrayList<Victim> getVictims()
	{
		return victimList;
	}
	
	
	/*
	 * 
	 */
	public Victim searchVictimsByName(String Fname, String Lname)
	{
		boolean found = false;
		
		for (Victim victims : victimList)
		{
			if(victims.getFirstName().equalsIgnoreCase(Fname) && victims.getLastName().equalsIgnoreCase(Lname))
			{
				found = true;
				return victims;
			}
		}
		
		if (!found)
		{
			System.out.println("The victim entered was not found in our database!");
		}
		return null;
	}

	/*
	 * 
	 */
	public void editVictimsByName(String Fname, String Lname) 
	{
		Victim victimEdit = searchVictimsByName(Fname, Lname);
		
		
	}

    /**
     * 
     */
	public void saveVictims() {
		DataWriter.saveVictims();
	}
	
    
}
