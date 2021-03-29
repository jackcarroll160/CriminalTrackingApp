/*
 * @author Kyle Persyn
 * This class is going to be the person parent class that witness, victim, and 
 * person of interest branch off of!
 */
public abstract class Person {

	protected String firstName;
	protected String lastName;
	protected int age;
	protected String contactInfo;
	protected String isMinor;
	
	public Person(String firstName, String lastName, int age, String contactInfo, String isMinor2)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.contactInfo = contactInfo;
		this.isMinor = isMinor2;
	}
	
	
	/** 
	 * @return String
	 */
	/*
	 * This is the class that will return the first name of the person
	 * @return a String that holds the first name
	 */
	public String getFirstName()
	{
		return firstName;
	}
	
	
	/** 
	 * @return String
	 */
	/*
	 *  This is the class that will return the last name of the person
	 * @return a String that holds the last name
	 */
	public String getLastName()
	{
		return lastName;
	}
	
	
	/** 
	 * @param Fname
	 */
	/*
	 *   This is the class that will set the first name of the person
	 * @param a String that holds the first name
	 */
	public void setFirstName(String Fname)
	{
		this.firstName = Fname;
	}
	
	
	/** 
	 * @param Lname
	 */
	/*
	 * This is the class that will set the last name of the person
	 * @param a String that holds the last name
	 */
	public void setLastName(String Lname)
	{
		this.lastName = Lname;
	}
	
	
	/** 
	 * @return int
	 */
	/*
	 * This is the class that will return the age of the person
	 * @return an int that holds the Age
	 */
	public int getAge()
	{
		return age;
	}
	
	
	/** 
	 * @param ageNum
	 */
	/*
	 * This is the class that will set the age of the person
	 * @param an int that holds the age of the person
	 */
	public void setAge(int ageNum)
	{
		this.age = ageNum;
	}
	
	
	/** 
	 * @return String
	 */
	/*
	 * This is the class that will return the contact info of the person
	 * @return a string with the contact info
	 */
	public String getContactInfo()
	{
		return contactInfo;
	}
	
	
	/** 
	 * @param contactInformation
	 */
	/*
	 * This is the class that will set the contact info of the person
	 * @param a String that holds the contact information
	 */
	public void setContactInfo(String contactInformation)
	{
		this.contactInfo = contactInformation;
	}
	
	
	/** 
	 * @return String
	 */
	/*
	 * This is the class that will return a boolean of the person on if they are a minor
	 * @return a boolean with true if they are a minor
	 */
	public String getIsMinor()
	{
		return isMinor;
	}
	
	
	/** 
	 * @param minor
	 */
	/*
	 * This is the class that will set the minor boolean of the person
	 * @param a boolean that holds true if they are a minor
	 */
	public void setIsMinor(String minor)
	{
		this.isMinor = minor;
	}
}
