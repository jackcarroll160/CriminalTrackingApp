import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
/**
 * Author Sydney Oklota
 * list of victims
 */ 

public class victimsList {
    
    private static ArrayList<Victim> victimList = new ArrayList<Victim>();
	private static victimsList victims = null;
	
	/*
	 * loads victim library
	 */
	private victimsList()
	{
		victimList = new DataLoader().loadVictims();
	}
	
	
	/** 
	 * @return victimsList
	 */
	/*
	 * creates new victim 
	 */
	public static victimsList getInstance()
	{
		if (victims == null) {
			victims = new victimsList();
		}
		return victims;
	}
	
	
	/** 
	 * @return ArrayList<Victim>
	 */
	/*
	 * returns victimList
	 */
	public ArrayList<Victim> getVictimList()
	{
		return victimList;
	}
	
	/**
	 * searches for victim by ID num
	 */
	public Victim getVictimById(Object id)
	{
		for(Victim victim : victimList)
		{
			if(victim.getVictimId().equals(id))
			{
				return victim;
			}
		}
		return null;
	}

	
	/** 
	 * @param Fname
	 * @param Lname
	 * @return Victim
	 */
	/*
	 * searches for victims by first and last name
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



	public void addVictim(Victim victim) {

		victimList.add(victim);
		DataWriter.saveVictim();

	}

    /**
     * saves victims to library
     */
	public void saveVictims() {
		DataWriter.saveVictim();
	}
	
    
}
