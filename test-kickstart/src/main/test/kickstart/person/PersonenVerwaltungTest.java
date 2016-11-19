package kickstart.person;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.salespointframework.useraccount.UserAccountManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.salespointframework.useraccount.UserAccount;
import org.salespointframework.useraccount.UserAccountManager;

public class PersonenVerwaltungTest {
	
	private UserAccountManager uaManager;
	private MitarbeiterRepository mRepo;
	private PersonenVerwaltungTest pVerwaltung;
	
	public void PersonenVerwaltung(UserAccountManager uaManager, MitarbeiterRepository mRepo){
		Assert.notNull(uaManager, "UserAccountManager must not be null!");
		Assert.notNull(mRepo, "UserAccountManager must not be null!");
		
		this.uaManager = uaManager;
		this.mRepo = mRepo;
	}
	
	public PersonenVerwaltungTest(){
	}
	
	@Before
	public void init(){
		public PersonenVerwaltungTest(UserAccountManager uaManager, MitarbeiterRepository mRepo){
			Assert.notNull(uaManager, "UserAccountManager must not be null!");
			Assert.notNull(mRepo, "UserAccountManager must not be null!");
			
			this.uaManager = uaManager;
			this.mRepo = mRepo;
		}
		pVerwaltung = new PersonenVerwaltungTest();
	}
	
	@Test
	public void testShouldAddMitarbeiter() {
		System.out.print(pVerwaltung.getMitarbeiterRepo().findAll());
	}
	private UserAccountManager getMitarbeiterRepo() {
		// TODO Auto-generated method stub
		return null;
	}
}
