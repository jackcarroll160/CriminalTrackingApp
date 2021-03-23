import java.util.ArrayList;

/**
 * Author: Sydney Oklota
 * will hold all witnesses
 */
public class witnessList {
	
    private static ArrayList<Witness> witnessList = new ArrayList<Witness>();
	private static Witness witness = null;
	
	/*
	 * 
	 */
	private witnessList()
	{
		witnessList = new DataLoader().loadWitnesses();
	}
	
	/*
	 * 
	 */
	public static Witness getInstance()
	{
        if (witness == null) {
			witness = new Witness();
		}
        return witness;
		
	}
	
	/*
	 * 
	 */
	public ArrayList<Witness> getWitnesses()
	{
		return witnessList;
	}
	
	
	/*
	 * 
	 */
	public Witness searchWitnessByName(String Fname, String Lname)
	{
		boolean found = false;
		
		for (Witness witness : witnessList)
		{
			if(witness.getFirstName().equalsIgnoreCase(Fname) && witness.getLastName().equalsIgnoreCase(Lname))
			{
				found = true;
				return witness;
			}
		}
		
		if (!found)
		{
			System.out.println("The witness entered was not found in our database!");
		}
		return null;
	}

	/*
	 * 
	 */
	public void editWitnessByName(String Fname, String Lname) 
	{
		Witness witnessEdit = searchWitnessByName(Fname, Lname);
		
		
	}

	/**
	 * 
	 */
	public void saveWitnesses() {
		DataWriter.saveWitness();
	}
	


    
}

