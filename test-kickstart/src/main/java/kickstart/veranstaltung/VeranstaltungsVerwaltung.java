package kickstart.veranstaltung;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class VeranstaltungsVerwaltung {

	private final VeranstaltungsRepository vRepo;
	
	// Konstruktor
	@Autowired
	public VeranstaltungsVerwaltung(VeranstaltungsRepository vRepo){
		Assert.notNull(vRepo, "vRepo must not be null!");
		this.vRepo = vRepo;
	}
	
	// Methoden
	
}
