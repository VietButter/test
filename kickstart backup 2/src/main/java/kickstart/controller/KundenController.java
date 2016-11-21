package kickstart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kickstart.person.PersonenVerwaltung;

@Controller
public class KundenController {
	
	private final PersonenVerwaltung pVerwaltung;
	
	// Konstruktor
	@Autowired
	public KundenController(PersonenVerwaltung pVerwaltung){
		this.pVerwaltung = pVerwaltung;
	}
	
	// Methoden
	@RequestMapping("/kundenListe")
	public String kunden(Model model) {
		
		model.addAttribute("kundenListe", pVerwaltung.getKundenRepo().findAll());
		
		return "person/kundenListe";
	}
}
