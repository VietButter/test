package kickstart.veranstaltung;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import kickstart.adresse.Adresse;

@Entity
@Table(name = "VERANSTALTUNG")
public class Veranstaltung {
	
	private @Id @GeneratedValue long id;
	private double preis;
	
	private Date datum;	
	private double beginn;
	private double schluss;
//	private Adresse anschrift;
	private String bemerkung;
	private long kundenId;
//	private List<Long> mitarbeiterIdListe;
	
	// Konstruktor
	public Veranstaltung(){
		
	}
	
	// Methoden
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	public double getBeginn() {
		return beginn;
	}
	public void setBeginn(double beginn) {
		this.beginn = beginn;
	}
	public double getSchluss() {
		return schluss;
	}
	public void setSchluss(double schluss) {
		this.schluss = schluss;
	}
	/*
	public Adresse getAnschrift() {
		return anschrift;
	}
	public void setAnschrift(Adresse anschrift) {
		this.anschrift = anschrift;
	}*/
	
	public String getBemerkung() {
		return bemerkung;
	}
	public void setBemerkung(String bemerkung) {
		this.bemerkung = bemerkung;
	}
	public long getKundenId() {
		return kundenId;
	}
	public void setKundenId(long kundenId) {
		this.kundenId = kundenId;
	}
	/*
	public List<Long> getMitarbeiterIdListe() {
		return mitarbeiterIdListe;
	}
	public void setMitarbeiterIdListe(List<Long> mitarbeiterIdListe) {
		this.mitarbeiterIdListe = mitarbeiterIdListe;
	}*/
}
