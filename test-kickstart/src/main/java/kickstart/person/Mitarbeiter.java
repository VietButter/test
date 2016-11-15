package kickstart.person;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.salespointframework.useraccount.UserAccount;

@Entity
public class Mitarbeiter extends Person {
	
	private @OneToOne UserAccount userAccount;
	
	// Konstruktor
	public Mitarbeiter(String name, UserAccount userAccount) {
		super.name = name;
		this.userAccount = userAccount;
	}
	
	// Methoden
	public UserAccount getUserAccount() {
		return userAccount;
	}
}
