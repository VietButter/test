package kickstart.person;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.salespointframework.useraccount.UserAccount;

import kickstart.person.Person;

@Entity
@Table (name="MITARBEITER")
public class Mitarbeiter  {
	
	protected String name;
	private @Id @GeneratedValue long id;
	private @OneToOne UserAccount userAccount;
	
	// Konstruktor
	public Mitarbeiter(){		
	}
	
	public Mitarbeiter(String name, UserAccount userAccount) {
		this.name = name;
		this.userAccount = userAccount;
	}
	
	// Methoden
	public UserAccount getUserAccount() {
		return userAccount;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}
}
