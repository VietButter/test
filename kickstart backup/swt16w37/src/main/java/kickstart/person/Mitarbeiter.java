package kickstart.person;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.salespointframework.useraccount.UserAccount;

import kickstart.person.Person;

@Entity
public class Mitarbeiter extends Person {
	
	private @OneToOne UserAccount userAccount;
	
	// Konstruktor
	public Mitarbeiter(){		
	}
	
	public Mitarbeiter(String name, UserAccount userAccount) {
		super.name = name;
		this.userAccount = userAccount;
	}
	
	// Methoden
	public UserAccount getUserAccount() {
		return userAccount;
	}
}
