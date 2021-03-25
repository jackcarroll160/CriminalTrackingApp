import java.util.ArrayList;
import java.util.UUID;
import java.util.Scanner;

/*
 * @author Kyle Persyn
 * This class is going to be the CriminalList  class that will hold all of the criminals
 */
public class CrimeList{

	private static ArrayList<Crime> crimeList = new ArrayList<Crime>();
	private static CrimeList crime = null;
	
	/*
	 * This is the constructor where the criminal array list will be constructed
	 */
	private CrimeList()
	{
		crimeList = new DataLoader().loadCrime();
	}
	
	/*
	 * This is the getInstance method that will create a new criminal as long as criminal List is not null
	 * @return An instance of library
	 */
	public static CrimeList getInstance()
	{
		if (crime == null) {
			crime = new CrimeList();
		}
		return crime;
	}
	
	public boolean haveCrime(UUID crimeId) {
		for (Crime crime : crimeList) {
			if (crime.getCrimeId().equals(crimeId)) {
				return true;
			}
		}
		return false;
	}
	
	
	/*
	 * 
	 */
	public Crime searchCrimeByName(UUID CrimeID)
	{
		boolean found = false;
		
		for (Crime crime : crimeList)
		{
			if(crime.getCrimeId() == CrimeID)
			{
				found = true;
				return crime;
			}
		}
		
		if (!found)
		{
			System.out.println("The Crime entered was not found in our database!");
		}
		return null;
	}

	/*
	 * 
	 */
	public ArrayList<Crime> getCrime()
	{
		return crimeList;
	}


    public void editCrimeByName(UUID CrimeID)
    {
        Crime crimeEdit = searchCrimeByName(CrimeID);
		Scanner keyboard = new Scanner (System.in);

		System.out.println("Would you like to edit: ");
		System.out.println("1) Description" ); 
		System.out.println("2) Date Of Crime");
		System.out.println("3) Time Of Crime");
		System.out.println("4) Is Case Open");

		int userInput = keyboard.nextInt();

		if(userInput == 1)
		{
			System.out.println("Enter the New Description: " );
			String Desc = keyboard.nextLine();
			crimeEdit.setDescription(Desc);
		}
		if(userInput == 2)
		{
			System.out.println("Enter the New Date Of Crime: " );
			String date = keyboard.nextLine();
			crimeEdit.setDateOfCrime(date);
		}
		if(userInput == 3)
		{
			System.out.println("Enter the New Time Of Crime: " );
			String time = keyboard.nextLine();
			crimeEdit.setTimeOfCrime(time);
		}
		if(userInput == 4)
		{
			System.out.println("Enter the New Is Case Open Value (True or False): " );
			boolean open = keyboard.nextBoolean();
			crimeEdit.setCaseOpen(open);
		}
		if(userInput >= 5 || userInput <=0)
		{
			System.out.println("Invalid Input!");
		}
	
	}
	
	public boolean addCrime(UUID crimeId2, UUID criminalId2, String description, String dateOfCrime, String timeOfCrime,
	boolean caseOpen, ArrayList<Witness> witnessId, ArrayList<Victim> victimId, ArrayList<Suspect> suspectId,
	ArrayList<PersonOfInterest> personOfInterestId, String officers)  {
		if(haveCrime(crimeId2))return false;

		crimeList.add(new Crime(crimeId2, criminalId2, description, dateOfCrime, timeOfCrime, caseOpen, witnessId, victimId, suspectId, personOfInterestId, officers));
		return true;
	}

	public void saveCrime() {
		DataWriter.saveCrime();
	}
}


