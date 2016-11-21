package kickstart;

import org.salespointframework.core.DataInitializer;
import org.salespointframework.useraccount.Role;
import org.salespointframework.useraccount.UserAccount;
import org.salespointframework.useraccount.UserAccountManager;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import kickstart.person.Mitarbeiter;
import kickstart.person.MitarbeiterRepository;
import kickstart.person.PersonenVerwaltung;

@Component
public class Init implements DataInitializer {
	
//	private final MitarbeiterRepository mRepo;
//	private final UserAccountManager uaManager;
	private final PersonenVerwaltung pVerwaltung;
	
	// Konstruktor
	
	
//	public Init(MitarbeiterRepository mRepo, UserAccountManager uaManager){
	public Init(PersonenVerwaltung pVerwaltung){
		/*
		Assert.notNull(mRepo, "not null");
		Assert.notNull(uaManager, "not null");
		
		this.mRepo = mRepo;
		this.uaManager = uaManager;
		*/
		this.pVerwaltung = pVerwaltung;
	}		
	
	// Methoden
	@Override	// methode initialize() wird von Spring beim start automatisch ausgeführt.
	public void initialize() {
		//initUser(mRepo, uaManager);
		initUser(pVerwaltung);
	}
		
				// Hier kann man seinen Sachen testen
//	private void initUser(MitarbeiterRepository mRepo, UserAccountManager uaManager) {
	private void initUser(PersonenVerwaltung pVerwaltung){	
		/*
		UserAccount ua1 = uaManager.create("username_Hans_m1", "passwort_m1", Role.of("boss"));
		Mitarbeiter m1 = new Mitarbeiter("name_Hans_m1", ua1);
		UserAccount ua2 = uaManager.create("username_Peter_m2", "passwort_m2", Role.of("boss"));
		Mitarbeiter m2 = new Mitarbeiter("name_Peter_m2", ua2);
		
		mRepo.save(m1);
		mRepo.save(m2);
		
		System.out.println();
		System.out.println("username: " + m1.getUserAccount().getUsername() + " |Der Rückgabewert ist hier vom typ: String");
		System.out.println("username: " + m1.getUserAccount().getId() + " |Der Rückgabewert ist hier vom typ: UserAccountIdentifier");
		System.out.println("Id von Mitarbeiter m1: " + m1.getId());		
		System.out.println("Id von Mitarbeiter m2: " + m2.getId());
		System.out.println("exestiert Mitarbeiter mit id 2 ? " + mRepo.exists((long) 2));		
		System.out.println("toString() Mitarbeiter mit id 2: " + mRepo.findOne((long) (2)).toString());
		System.out.println("finde Mitarbeiter mit Name x: " + mRepo.findByName("x"));
		System.out.println("finde Mitarbeiter mit Name name_Peter_m2: " + mRepo.findByName("name_Peter_m2"));
		System.out.println();
		*/
		Mitarbeiter m1 = pVerwaltung.createMitarbeiter("nameHans", "userHans", "22", "dfdf");
		pVerwaltung.saveMitarbeiter(m1);
		System.out.println("");
		System.out.println(m1.getId());
		System.out.println(m1.getName());
		System.out.println(m1.getUserAccount().getUsername());
		System.out.println(m1.getUserAccount().getPassword());
		System.out.println("");
	}
}
