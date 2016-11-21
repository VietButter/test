package kickstart.person;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.salespointframework.useraccount.UserAccount;

import kickstart.person.Person;

@Entity
@Table(name="MITARBEITER")
public class Mitarbeiter extends Person {
	
	private @OneToOne UserAccount userAccount;
	
	// Konstruktor
	// default Konstruktor wird für hybernate benötigt
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
