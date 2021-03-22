/*
 * @author Kyle Persyn
 * This class is going to be the UserActions interface that will assist in searching and editing
 */
public interface UserActions {

	/*
	 * This method will allow the user to search for criminals by a first and last name entered
	 * @param a Sring that holds the first name
	 * @param a String that holds the last name
	 */
	public Criminal searchCriminalsByName(String Fname, String Lname);
	
	/*
	 * This method will allow for the user to edit a criminal by entering a first and last name
	 * @param a Sring that holds the first name
	 * @param a String that holds the last name
	 */
	public void editCriminalsByName(String Fname, String Lname);
}
