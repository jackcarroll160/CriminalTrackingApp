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
	
	/*
	 * 
	 */
	public ArrayList<Criminal> getCriminalList()
	{
		return criminalList;
	}
	
	
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

	/*
	 * 
	 */
	/*public void editCriminalsByName(String Fname, String Lname) 
	{
		Criminal crimEdit = searchCriminalsByName(Fname, Lname);
		Scanner keyboard = new Scanner (System.in);

		System.out.println("Would you like to edit: ");
		System.out.println("1) First Name" ); 
		System.out.println("2) Last Name");
		System.out.println("3) Has Nickname");
		System.out.println("4) Nickname");
		System.out.println("5) Age");
		System.out.println("6) Gender");
		System.out.println("7) Ethnicity");
		System.out.println("8) Contact Info");
		System.out.println("9) Birth Date");
		System.out.println("10) Eye Color");
		System.out.println("11) Hair Description");
		System.out.println("12) Facial Hair");
		System.out.println("13) Facial Hair Description");
		System.out.println("14) Height");
		System.out.println("15) Weight");
		System.out.println("16) Has Tattoos");
		System.out.println("17) Tattoo Description");
		System.out.println("18) Has Piercings");
		System.out.println("19) Physical Marks Description");
		System.out.println("20) physicalBuild");
		System.out.println("21) hasWeapon");
		System.out.println("22) weaponDescription");
		System.out.println("23) complexion");
		System.out.println("24) clothingDescription");
		System.out.println("25) isGuilty");
		System.out.println("26) hasFingerprints");
		System.out.println("27) hasVehicle");
		System.out.println("28) vehicleDescription");
		
		int userInput = keyboard.nextInt();

		if(userInput == 1)
		{
			System.out.println("Enter the New First Name: " );
			String FirstN = keyboard.nextLine();
			crimEdit.setFirstName(FirstN);
		}
		if(userInput == 2)
		{
			System.out.println("Enter the New Last Name: " );
			String LastN = keyboard.nextLine();
			crimEdit.setLastName(LastN);
		}
		if(userInput == 3)
		{
			System.out.println("Enter the New Has Nickname: " );
			boolean HasNick = keyboard.nextBoolean();
			crimEdit.setHasNickname(HasNick);
		}
		if(userInput == 4)
		{
			System.out.println("Enter the New Nickname: " );
			String Nick = keyboard.nextLine();
			crimEdit.setNickname(Nick);
		}
		if(userInput == 5)
		{
			System.out.println("Enter the New Age: " );
			int newAge = keyboard.nextInt();
			crimEdit.setAge(newAge);
		}
		if(userInput == 6)
		{
			System.out.println("Enter the New Gender: " );
			String gender = keyboard.nextLine();
			crimEdit.setGender(gender);
		}
		if(userInput == 7)
		{
			System.out.println("Enter the New Ethnicity: " );
			String ethn = keyboard.nextLine();
			crimEdit.setEthnicity(ethn);
		}
		if(userInput == 8)
		{
			System.out.println("Enter the New Contact Info: " );
			String phoneNum = keyboard.nextLine();
			crimEdit.setContactinfo(phoneNum);
		}
		if(userInput == 9)
		{
			System.out.println("Enter the New Birth Date: " );
			String bDay = keyboard.nextLine();
			crimEdit.setBirthDate(bDay);
		}
		if(userInput == 10)
		{
			System.out.println("Enter the New Eye Color: " );
			String eColor = keyboard.nextLine();
			crimEdit.setEyeColor(eColor);
		}
		if(userInput == 11)
		{
			System.out.println("Enter the New Hair Description: " );
			String hDesc = keyboard.nextLine();
			crimEdit.setHairDescription(hDesc);
		}
		if(userInput == 12)
		{
			System.out.println("Enter the New Facial Hair (True or False): " );
			boolean fHair = keyboard.nextBoolean();
			crimEdit.setFacialHair(fHair);
		}
		if(userInput == 13)
		{
			System.out.println("Enter the New Facial Hair Description: " );
			String fHairDesc = keyboard.nextLine();
			crimEdit.setFacialHairDescription(fHairDesc);
		}
		if(userInput == 14)
		{
			System.out.println("Enter the New Height: " );
			String height = keyboard.nextLine();
			crimEdit.setHeight(height);
		}
		if(userInput == 15)
		{
			System.out.println("Enter the New Weight: " );
			String weight = keyboard.nextLine();
			crimEdit.setWeight(weight);
		}
		if(userInput == 16)
		{
			System.out.println("Enter the New Has Tattoos (True or False): " );
			boolean tats = keyboard.nextBoolean();
			crimEdit.setHasTattoos(tats);
		}
		if(userInput == 17)
		{
			System.out.println("Enter the New Tattoo Description: " );
			String tatDesc = keyboard.nextLine();
			crimEdit.setTattooDescription(tatDesc);
		}
		if(userInput == 18)
		{
			System.out.println("Enter the New Has Peircings (True or False): " );
			boolean hasP = keyboard.nextBoolean();
			crimEdit.setHasPiercings(hasP);
		}
		if(userInput == 19)
		{
			System.out.println("Enter the New Physical Marks Description: " );
			String pMarks = keyboard.nextLine();
			crimEdit.setPhysicalMarksDescription(pMarks);
		}
		if(userInput == 20)
		{
			System.out.println("Enter the New Physical Build: " );
			String pBuild = keyboard.nextLine();
			crimEdit.setPhysicalBuild(pBuild);
		}
		if(userInput == 21)
		{
			System.out.println("Enter the New Has Weapon (True or False): " );
			boolean hasWeapon = keyboard.nextBoolean();
			crimEdit.setHasWeapon(hasWeapon);
		}
		if(userInput == 22)
		{
			System.out.println("Enter the New Weapon Description: " );
			String weapDesc = keyboard.nextLine();
			crimEdit.setWeaponDescription(weapDesc);
		}
		if(userInput == 23)
		{
			System.out.println("Enter the New Complexion: " );
			String compl = keyboard.nextLine();
			crimEdit.setComplexion(compl);
		}
		if(userInput == 24)
		{
			System.out.println("Enter the New Clothing Description: " );
			String cDesc = keyboard.nextLine();
			crimEdit.setClothingDescription(cDesc);
		}
		if(userInput == 25)
		{
			System.out.println("Enter the New Is Guilty (True or False): " );
			boolean isguilt = keyboard.nextBoolean();
			crimEdit.setIsGuilty(isguilt);
		}
		if(userInput == 26)
		{
			System.out.println("Enter the New Has FingerPrints (True or False): " );
			boolean fPrints = keyboard.nextBoolean();
			crimEdit.setHasFingerprints(fPrints);
		}
		if(userInput == 27)
		{
			System.out.println("Enter the New Has Vehicle (True or False): " );
			boolean hasVehicle = keyboard.nextBoolean();
			crimEdit.setHasVehicle(hasVehicle);
		}
		if(userInput == 28)
		{
			System.out.println("Enter the New Vehicle Description: " );
			String vehicleDesc = keyboard.nextLine();
			crimEdit.setVehicleDescription(vehicleDesc);
		}
		if(userInput <= 0 || userInput >= 29)
		{
			System.out.println("Invalid Input!");
		}
	} */

	public void addCriminal(Criminal criminal) {

        criminalList.add(criminal);
        DataWriter.saveCriminals();

    }

	public void saveCriminals() {
		DataWriter.saveCriminals();
	}
	
}
