package kickstart.person;

import javax.persistence.Entity;
import javax.persistence.Table;

import kickstart.adresse.Adresse;

@Entity
@Table(name="KUNDE")
public class Kunde extends Person {
	
	// Konstruktor
	public Kunde(){		
	}
	
	public Kunde(String name, Adresse adresse){
		super.name = name;
		this.setAdresse(adresse);
	}
	// Methoden
}
