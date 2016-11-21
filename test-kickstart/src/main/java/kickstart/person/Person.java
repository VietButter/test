package kickstart.person;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract class Person {
	
	protected String name;
	private @Id @GeneratedValue long id;
	
	// Methoden
	public long getId() {
		return id;
	}
	
	public String getName(){
		return name;
	}
}
