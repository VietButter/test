package kickstart.person;

import org.salespointframework.useraccount.Role;
import org.salespointframework.useraccount.UserAccount;
import org.salespointframework.useraccount.UserAccountManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kickstart.adresse.Adresse;

@Component
public class PersonenVerwaltung {
	private final UserAccountManager uaManager;
	private final MitarbeiterRepository mRepo;
	private final KundenRepository kRepo;
	
	// Konstruktor
	@Autowired
	public PersonenVerwaltung(UserAccountManager uaManager, MitarbeiterRepository mRepo, KundenRepository kRepo){
		this.uaManager = uaManager;
		this.mRepo = mRepo;
		this.kRepo = kRepo;
	}
	
	// Methoden
	public Mitarbeiter createMitarbeiter(String name, String username, String passwort, String roles){
		UserAccount ua = uaManager.create(username, passwort, Role.of(roles));
		uaManager.save(ua);
		Mitarbeiter m = new Mitarbeiter(name, ua);
		return m;
	}
	
	public Kunde createKunde(String name, String strasse, String ort, String plz){
		Adresse a = new Adresse(strasse, ort, plz);
		Kunde k = new Kunde(name, a);
		return k;
	}
	
	public void saveMitarbeiter(Mitarbeiter mitarbeiter){
		mRepo.save(mitarbeiter);
	}
	
	public void saveKunde(Kunde kunde){
		kRepo.save(kunde);
	}
	
	public MitarbeiterRepository getMitarbeiterRepo(){
		return mRepo;
	}

	public KundenRepository getKundenRepo() {
		return kRepo;
	}
}
