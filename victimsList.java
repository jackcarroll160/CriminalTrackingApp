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

	/*
	 *allows user to edit victim information 
	 */
	/*
	public void editVictimsByName(String Fname, String Lname) 
	{
		Victim victimEdit = searchVictimsByName(Fname, Lname);
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Would you like to edit: ");
		System.out.println("1) First Name" ); 
		System.out.println("2) Last Name");
		System.out.println("3) Age");
		System.out.println("4) Contact Info");	
		System.out.println("5) Is Minor");
		System.out.println("6) Is Alive");
		System.out.println("7) Is Injured");
		System.out.println("8) Statement");
		int userInput = keyboard.nextInt();

		if(userInput == 1)
		{
			System.out.println("Enter the New First Name: " );
			String FirstN = keyboard.nextLine();
			victimEdit.setFirstName(FirstN);
		}
		if(userInput == 2)
		{
			System.out.println("Enter the New Last Name: " );
			String LastN = keyboard.nextLine();
			victimEdit.setLastName(LastN);
		}
		if(userInput == 3)
		{
			System.out.println("Enter the New Age: " );
			int age = keyboard.nextInt();
			victimEdit.setAge(age);
		}
		if(userInput == 4)
		{
			System.out.println("Enter the New Contact Info: " );
			String contactInfo = keyboard.nextLine();
			victimEdit.setContactInfo(contactInfo);
		}
		if(userInput == 5)
		{
			System.out.println("Enter the New Is Minor Value (True or False): " );
			String isMin = keyboard.nextBoolean();
			victimEdit.setIsMinor(isMin);
		}
		if(userInput == 6)
		{
			System.out.println("Enter the New Is Alive Value (True or False): " );
			boolean isAl = keyboard.nextBoolean();
			victimEdit.setAlive(isAl);
		}
		if(userInput == 7)
		{
			System.out.println("Enter the New Is Injured Value (True or False): " );
			boolean isIn = keyboard.nextBoolean();
			victimEdit.setInjured(isIn);
		}
		if(userInput == 8)
		{
			System.out.println("Enter the New Statement: " );
			String statement = keyboard.nextLine();
			victimEdit.setStatement(statement);
		}
		if(userInput <= 0 || userInput >= 8)
		{
			System.out.println("Invalid Input!");
		}
		
		
	}
*/
    /**
     * saves victims to library
     */
	public void saveVictims() {
		DataWriter.saveVictim();
	}
	
    
}
