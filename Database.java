import java.util.ArrayList;


public class Database {

    // crime
    public static ArrayList<Crime> getCrime() {
        return new ArrayList<Crime>();

    }

    // criminal
    public static ArrayList<Criminal> getCriminals() {
        return new ArrayList<Criminal>();

    }
    
    // poi
    public static ArrayList<PersonOfInterest> getPOI() {
        return new ArrayList<PersonOfInterest>();

    }

    // suspects
    public static ArrayList<Suspect> getSuspect() {
        return new ArrayList<Suspect>();

    }

    // user
    public static ArrayList<User> getUserList() {
        return new ArrayList<User>();

    }

    // victim
    public static ArrayList<Victim> getVictims() {
        return new ArrayList<Victim>();

    }

    // witness
    public static ArrayList<Witness> getWitnesses() {
        return new ArrayList<Witness>();

    }

}
