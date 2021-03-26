import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

/**
 * Author: Sydney Oklota holds all persons of interest
 */
public class PersonOfInterestList {

	private static PersonOfInterestList personOfInterest = null;
	private static ArrayList<PersonOfInterest> personOfInterestList = new ArrayList<PersonOfInterest>();

	/*
	 * loads in POI library
	 */
	private PersonOfInterestList() {
		personOfInterestList = new DataLoader().loadPersonOfInterests();
	}

	/*
	 * creates new POI
	 */
	public static PersonOfInterestList getInstance() {
		if (personOfInterest == null) {
			personOfInterest = new PersonOfInterestList();
		}
		return personOfInterest;

	}

	/*
	 * returns POIList
	 */
	public ArrayList<PersonOfInterest> getPersonOfInterestList() {
		return personOfInterestList;
	}

	/*
	 * searches for POI by first and last name
	 */
	public PersonOfInterest searchPOIByName(String Fname, String Lname) {
		boolean found = false;

		for (PersonOfInterest personOfInterest : personOfInterestList) {
			if (personOfInterest.getFirstName().equalsIgnoreCase(Fname)
					&& personOfInterest.getLastName().equalsIgnoreCase(Lname)) {
				found = true;
				return personOfInterest;
			}
		}

		if (!found)

		{
			System.out.println("The person of interest entered was not found in our database!");
		}
		return null;
	}

	/*
	 * allows user to edit POI information
	 */
	public void editPOIByName(String Fname, String Lname) {
		PersonOfInterest poiEdit = searchPOIByName(Fname, Lname);
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Would you like to edit: ");
		System.out.println("1) Statement");
		System.out.println("2) Has Alibi");
		System.out.println("3) Is Suspect");

		int userInput = keyboard.nextInt();

		if (userInput == 1) {
			System.out.println("Enter the New Statement: ");
			String statement = keyboard.nextLine();
			poiEdit.setStatement(statement);
		}
		if (userInput == 2) {
			System.out.println("Enter the New Has Alibi Value (True or False): ");
			boolean hasAl = keyboard.nextBoolean();
			poiEdit.setHasAlibi(hasAl);
		}
		if (userInput == 3) {
			System.out.println("Enter the New Is Suspect Value (True or False): ");
			boolean isSus = keyboard.nextBoolean();
			poiEdit.setSuspect(isSus);
		}
		if (userInput >= 4 || userInput <= 0) {
			System.out.println("Invalid Input!");
		}

	}

	/**
	 * saves POI in POI library
	 */
	public void savePOI() {
		DataWriter.savePersonOfInterest();
	}

	/**
	 * searches for POI by ID num
	 */
	public PersonOfInterest getPOIById(Object id) {
		for (PersonOfInterest personOfInterest : personOfInterestList) {
			if (personOfInterest.getPersonId().equals(id)) {
				return personOfInterest;
			}
		}
		return null;
	}

	public void addPersonOfInterest(UUID personOfInterestId, UUID suspectId, UUID crimeId, String firstName,
			String lastName, int age, String contactInfo, boolean isMinor, String statement, boolean hasAlibi,
			boolean isSuspect) {
		personOfInterestList.add(new PersonOfInterest(personOfInterestId, suspectId, crimeId, firstName, lastName, age,
				contactInfo, isMinor, statement, hasAlibi, isSuspect));
		DataWriter.savePersonOfInterest();
	}

}
