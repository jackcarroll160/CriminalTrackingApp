import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

/**
 * Author: Sydney Oklota holds all suspects
 */
public class suspectsList {

	private static suspectsList suspect = null;
	private static ArrayList<Suspect> suspectList = new ArrayList<Suspect>();

	/*
	 * loads in suspects library
	 */
	private suspectsList() {
		suspectList = new DataLoader().loadSuspects();
	}

	
	/** 
	 * @return suspectsList
	 */
	/*
	 * creates new suspect
	 */
	public static suspectsList getInstance() {
		if (suspect == null) {
			suspect = new suspectsList();
		}
		return suspect;

	}

	
	/** 
	 * @return ArrayList<Suspect>
	 */
	/*
	 * returns suspectList
	 */
	public ArrayList<Suspect> getSuspectList() {
		return suspectList;
	}

	
	/** 
	 * @param Fname
	 * @param Lname
	 * @return Suspect
	 */
	/*
	 * searches suspects by first and last name
	 */
	public Suspect searchSuspectsByName(String Fname, String Lname) {
		boolean found = false;

		for (Suspect suspect : suspectList) {
			if (suspect.getFirstName().equalsIgnoreCase(Fname) && suspect.getLastName().equalsIgnoreCase(Lname)) {
				found = true;
				return suspect;
			}
		}

		if (!found) {
			System.out.println("The suspect entered was not found in our database!");
		}
		return null;
	}

	/*
	 * Allows users to choose which attribute they wish to edit
	 */
	/*
	public void editSuspectsByName(String Fname, String Lname) {
		Suspect suspectEdit = searchSuspectsByName(Fname, Lname);
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Would you like to edit: ");
		System.out.println("1) First Name");
		System.out.println("2) Last Name");
		System.out.println("3) Is Minor");
		System.out.println("4) Age");
		System.out.println("5) Has Alibi");
		System.out.println("6) Gender");
		System.out.println("7) Ethnicity");
		System.out.println("8) Contact Info");
		System.out.println("9) Birth Date");
		System.out.println("10) Eye Color");
		System.out.println("11) Hair Description");
		System.out.println("12) Has Facial Hair");
		System.out.println("13) Facial Hair Description");
		System.out.println("14) Height");
		System.out.println("15) Weight");
		System.out.println("16) Has Tattoos");
		System.out.println("17) Tattoo Description");
		System.out.println("18) Has Piercings");
		System.out.println("19) Physical Marks Description");
		System.out.println("20) Physical Build");
		System.out.println("21) Has Weapon");
		System.out.println("22) Weapon Description");
		System.out.println("23) Complexion");
		System.out.println("24) Clothing Description");
		System.out.println("25) Has Vehicle");
		System.out.println("26) Vehicle Description");

		int userInput = keyboard.nextInt();

		if (userInput == 1) {
			System.out.println("Enter the New First Name: ");
			String firstName = keyboard.nextLine();
			suspectEdit.setFirstName(firstName);
		}
		if (userInput == 2) {
			System.out.println("Enter the New Last Name: ");
			String lastName = keyboard.nextLine();
			suspectEdit.setLastName(lastName);
		}
		if (userInput == 3) {
			System.out.println("Enter the New Is Minor Value (True or False): ");
			boolean isMin = keyboard.nextBoolean();
			suspectEdit.setIsMinor(isMin);
		}
		if (userInput == 4) {
			System.out.println("Enter the New Age");
			int age = keyboard.nextInt();
			suspectEdit.setAge(age);
		}
		if (userInput == 5) {
			System.out.println("Enter the New Has Alibi Value (True or False): ");
			boolean hasAl = keyboard.nextBoolean();
			suspectEdit.setHasAlibi(hasAl);
		}
		if (userInput == 6) {
			System.out.println("Enter the New Gender: ");
			String gender = keyboard.nextLine();
			suspectEdit.setGender(gender);
		}
		if (userInput == 7) {
			System.out.println("Enter the New Ethnicity: ");
			String ethn = keyboard.nextLine();
			suspectEdit.setEthnicity(ethn);
		}
		if (userInput == 8) {
			System.out.println("Enter the New Contact Info: ");
			String phoneNum = keyboard.nextLine();
			suspectEdit.setContactInfo(phoneNum);
		}
		if (userInput == 9) {
			System.out.println("Enter the New Birth Date: ");
			String bDay = keyboard.nextLine();
			suspectEdit.setBirthDate(bDay);
		}
		if (userInput == 10) {
			System.out.println("Enter the New Eye Color: ");
			String eColor = keyboard.nextLine();
			suspectEdit.setEyeColor(eColor);
		}
		if (userInput == 11) {
			System.out.println("Enter the New Hair Description: ");
			String hDesc = keyboard.nextLine();
			suspectEdit.setHairDescription(hDesc);
		}
		if (userInput == 12) {
			System.out.println("Enter the New Has Facial Hair (True or False): ");
			boolean fHair = keyboard.nextBoolean();
			suspectEdit.setHasFacialHair(fHair);
		}
		if (userInput == 13) {
			System.out.println("Enter the New Facial Hair Description: ");
			String fHairDesc = keyboard.nextLine();
			suspectEdit.setFacialHairDescription(fHairDesc);
		}
		if (userInput == 14) {
			System.out.println("Enter the New Height: ");
			String height = keyboard.nextLine();
			suspectEdit.setHeight(height);
		}
		if (userInput == 15) {
			System.out.println("Enter the New Weight: ");
			String weight = keyboard.nextLine();
			suspectEdit.setWeight(weight);
		}
		if (userInput == 16) {
			System.out.println("Enter the New Has Tattoos (True or False): ");
			boolean tats = keyboard.nextBoolean();
			suspectEdit.setHasTattoos(tats);
		}
		if (userInput == 17) {
			System.out.println("Enter the New Tattoo Description: ");
			String tatDesc = keyboard.nextLine();
			suspectEdit.setTattooDescription(tatDesc);
		}
		if (userInput == 18) {
			System.out.println("Enter the New Has Peircings (True or False): ");
			boolean hasP = keyboard.nextBoolean();
			suspectEdit.setHasPiercings(hasP);
		}
		if (userInput == 19) {
			System.out.println("Enter the New Physical Marks Description: ");
			String pMarks = keyboard.nextLine();
			suspectEdit.setPhysicalMarksDescription(pMarks);
		}
		if (userInput == 20) {
			System.out.println("Enter the New Physical Build: ");
			String pBuild = keyboard.nextLine();
			suspectEdit.setPhysicalBuild(pBuild);
		}
		if (userInput == 21) {
			System.out.println("Enter the New Has Weapon (True or False): ");
			boolean hasWeapon = keyboard.nextBoolean();
			suspectEdit.setHasWeapon(hasWeapon);
		}
		if (userInput == 22) {
			System.out.println("Enter the New Weapon Description: ");
			String weapDesc = keyboard.nextLine();
			suspectEdit.setWeaponDescription(weapDesc);
		}
		if (userInput == 23) {
			System.out.println("Enter the New Complexion: ");
			String compl = keyboard.nextLine();
			suspectEdit.setComplexion(compl);
		}
		if (userInput == 24) {
			System.out.println("Enter the New Clothing Description: ");
			String cDesc = keyboard.nextLine();
			suspectEdit.setClothingDescription(cDesc);
		}

		if (userInput == 25) {
			System.out.println("Enter the New Has Vehicle (True or False): ");
			boolean hasVehicle = keyboard.nextBoolean();
			suspectEdit.setHasVehicle(hasVehicle);
		}
		if (userInput == 26) {
			System.out.println("Enter the New Vehicle Description: ");
			String vehicleDesc = keyboard.nextLine();
			suspectEdit.setVehicleDescription(vehicleDesc);
		}
		if (userInput >= 27 || userInput <= 0) {
			System.out.println("Invalid Input!");
		}

	}
*/

	public void addSuspect(Suspect suspect) {

		suspectList.add(suspect);
		DataWriter.saveSuspect();
		
	}

	/**
	 * saves suspect in suspect library
	 */
	public void saveSuspect() {
		DataWriter.saveSuspect();
	}

	/**
	 * searches for suspects by ID num
	 */
	public Suspect getSuspectById(Object id) {
		for (Suspect suspect : suspectList) {
			if (suspect.getSuspectId().equals(id)) {
				return suspect;
			}
		}
		return null;
	}

}
