/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package kickstart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import kickstart.person.Mitarbeiter;
import kickstart.person.MitarbeiterRegFormular;
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
	@RequestMapping("/")
	public String mitarbeiter(Model model) {
		
		model.addAttribute("mitarbeiterListe", pVerwaltung.getMitarbeiterRepo().findAll());
		
		return "person/mitarbeiterListe";
	}
	
	@RequestMapping("/newMitarbeiterFormular")
	public String registerMitarbeiter(Model model) {
		
		model.addAttribute("mitarbeiterDaten", new MitarbeiterRegFormular());
		
		return "person/newMitarbeiterFormular";
	}
	
	@RequestMapping("/add")
	public String newMitarbeiter(@ModelAttribute("mitarbeiterDaten") MitarbeiterRegFormular mitarbeiterDaten) {
		
		Mitarbeiter m = pVerwaltung.createMitarbeiter(mitarbeiterDaten.getName(), mitarbeiterDaten.getUsername(), mitarbeiterDaten.getPassword(), mitarbeiterDaten.getRole());
		pVerwaltung.saveMitarbeiter(m);
		
		return "redirect:/";
	}
	
}
