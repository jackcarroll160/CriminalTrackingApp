/*
 * @author Kyle Persyn
 * This class is going to be the UserActions interface that will assist in searching and editing
 */
public interface UserActions {

	/*
	 * 
	 */
	public void searchCriminalsByName(String Fname, String Lname);
	
	/*
	 * 
	 */
	public void editCriminalsByName(String Fname, String Lname);
}
