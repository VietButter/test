package kickstart.person;

import org.salespointframework.useraccount.UserAccount;

public class PersonenVerwaltung {
	
	// Konstruktor
	public PersonenVerwaltung(){		
	}
	
	// Methoden
	public Mitarbeiter createMitarbeiter(String name, UserAccount userAccount){
		Mitarbeiter m = new Mitarbeiter(name, userAccount);
		return m;
	}
	
}
