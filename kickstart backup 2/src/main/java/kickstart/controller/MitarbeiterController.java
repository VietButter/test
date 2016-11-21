package kickstart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import kickstart.person.Mitarbeiter;
import kickstart.person.MitarbeiterFormular;
import kickstart.person.PersonenVerwaltung;


@Controller
public class MitarbeiterController {
	
	private final PersonenVerwaltung pVerwaltung;
	
	// Konstruktor
	@Autowired
	public MitarbeiterController(PersonenVerwaltung pVerwaltung){
		this.pVerwaltung = pVerwaltung;
	}
	
	// Methoden
	@RequestMapping("/mitarbeiterListe")
	public String mitarbeiter(Model model) {
		
		model.addAttribute("mitarbeiterListe", pVerwaltung.getMitarbeiterRepo().findAll());
		model.addAttribute("kundenListe", pVerwaltung.getKundenRepo().findAll());				// nur zum testen hier sollte eigentlich in den KundenController
		
		return "person/mitarbeiterListe";
	}
	
	@RequestMapping("/MitarbeiterFormular")
	public String registerMitarbeiter(Model model) {
		
		model.addAttribute("mitarbeiterDaten", new MitarbeiterFormular());
		
		return "person/MitarbeiterFormular";
	}
	
	@RequestMapping("/addMitarbeiter")
	public String newMitarbeiter(@ModelAttribute("mitarbeiterDaten") MitarbeiterFormular mitarbeiterDaten) {
		
		Mitarbeiter m = pVerwaltung.createMitarbeiter(mitarbeiterDaten.getName(), mitarbeiterDaten.getUsername(), mitarbeiterDaten.getPassword(), mitarbeiterDaten.getRole());
		pVerwaltung.saveMitarbeiter(m);
		
		return "redirect:/mitarbeiterListe";
	}
}
