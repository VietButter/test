package kickstart.person;

import org.salespointframework.useraccount.Role;
import org.salespointframework.useraccount.UserAccount;
import org.salespointframework.useraccount.UserAccountManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class PersonenVerwaltung {
	
	private final UserAccountManager uaManager;
	private final MitarbeiterRepository mRepo;
	
	// Konstruktor
	@Autowired
	public PersonenVerwaltung(UserAccountManager uaManager, MitarbeiterRepository mRepo){
		Assert.notNull(uaManager, "UserAccountManager must not be null!");
		Assert.notNull(mRepo, "UserAccountManager must not be null!");
		
		this.uaManager = uaManager;
		this.mRepo = mRepo;
	}
	
	// Methoden
	public Mitarbeiter createMitarbeiter(String name, String username, String password, String role){
		UserAccount ua = uaManager.create(username, password, Role.of(role));
		uaManager.save(ua);
		Mitarbeiter m = new Mitarbeiter(name, ua);
		return m;
	}
	
	public void saveMitarbeiter(Mitarbeiter mitarbeiter){
		mRepo.save(mitarbeiter);
	}
	
	public MitarbeiterRepository getMitarbeiterRepo(){
		return mRepo;
	}
}
