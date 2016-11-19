package kickstart.controller;

import static org.junit.Assert.*;

import org.junit.Test;

import kickstart.person.Mitarbeiter;
import kickstart.person.PersonenVerwaltung;

public class MitarbeiterControllerTest {


	public MitarbeiterControllerTest() {
	}
	
	@Test
	public void testShouldAddMitarbeiter() {
		Mitarbeiter m1 = MitarbeiterControllerTest().pVerwaltung.createMitarbeiter("name", "username", "password", "role");
		pVerwaltung.saveMitarbeiter(m1);
		assertEquals("Nutzer nicht im MitarbeiterRepo", m1, pVerwaltung.getMitarbeiterRepo().findOne(m1.getId()));	
	}

}
