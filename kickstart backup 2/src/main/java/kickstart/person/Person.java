package kickstart.person;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import kickstart.adresse.Adresse;

@Entity
public abstract class Person {
	
	@Id @GeneratedValue
	private long id;
	protected String name;
	@ManyToOne(cascade=CascadeType.ALL)
	private Adresse adresse;
	
	// Methoden
	public long getId() {
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
}
