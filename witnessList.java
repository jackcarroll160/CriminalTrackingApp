import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

/**
 * Author: Sydney Oklota
 * holds all witnesses
 */
public class witnessList {
	
    private static ArrayList<Witness> witnessList = new ArrayList<Witness>();
	private static witnessList witness = null;
	
	/*
	 * loads witness library
	 */
	private witnessList()
	{
		witnessList = new DataLoader().loadWitnesses();
	}
	
	/*
	 * creates new witness
	 */
	public static witnessList getInstance()
	{
        if (witness == null) {
			witness = new witnessList();
		}
        return witness;
		
	}
	
	/*
	 * returns witnessList
	 */
	public ArrayList<Witness> getWitnesses()
	{
		return witnessList;
	}
	
	/**
	 * searches for witness by ID num
	 */
	public Witness getWitnessById(Object id)
	{
		for(Witness witness : witnessList)
		{
			if(witness.getWitnessId().equals(id))
			{
				return witness;
			}
		}
		return null;
	}

	/*
	 * searches for witness by first and last name
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
	 * allows user to edit witness info
	 */
	public void editWitnessByName(String Fname, String Lname) 
	{
		Witness witnessEdit = searchWitnessByName(Fname, Lname);
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Would you like to edit: ");
		System.out.println("1) First Name" ); 
		System.out.println("2) Last Name");
		System.out.println("3) Age");
		System.out.println("4) Contact Info");	
		System.out.println("5) Proof");
		System.out.println("6) Testimony");
		System.out.println("7) Location");
		System.out.println("8) Type of Witness");
		int userInput = keyboard.nextInt();

		if(userInput == 1)
		{
			System.out.println("Enter the New First Name: " );
			String FirstN = keyboard.nextLine();
			witnessEdit.setFirstName(FirstN);
		}
		if(userInput == 2)
		{
			System.out.println("Enter the New Last Name: " );
			String LastN = keyboard.nextLine();
			witnessEdit.setLastName(LastN);
		}
		if(userInput == 3)
		{
			System.out.println("Enter the New Age: " );
			int age = keyboard.nextInt();
			witnessEdit.setAge(age);
		}
		if(userInput == 4)
		{
			System.out.println("Enter the New Contact Info: " );
			String contactInfo = keyboard.nextLine();
			witnessEdit.setContactInfo(contactInfo);
		}
		if(userInput == 5)
		{
			System.out.println("Enter the New Proof: " );
			String proof = keyboard.nextLine();
			witnessEdit.setProof(proof);
		}
		if(userInput == 6)
		{
			System.out.println("Enter the New Testimony: " );
			String testimony = keyboard.nextLine();
			witnessEdit.setTestimony(testimony);
		}
		if(userInput == 7)
		{
			System.out.println("Enter the New Location: " );
			String location = keyboard.nextLine();
			witnessEdit.setLocation(location);
		}
		if(userInput == 8)
		{
			System.out.println("Enter the New Type of Witness: " );
			String ToW = keyboard.nextLine();
			witnessEdit.setTypeOfWitness(ToW);
		}
		if(userInput <= 0 || userInput >= 8)
		{
			System.out.println("Invalid Input!");
		}
		
		
		
		
	}

	/**
	 * saves witness in library
	 */
	public void saveWitnesses() {
		DataWriter.saveWitness();
	}
	


    
}

