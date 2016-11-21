package kickstart.adresse;

public class Adresse {
	private String strasse;
	private String ort;
	private int plz;
	
	public Adresse(String strasse, String ort, int plz) {
		this.strasse = strasse;
		this.ort = ort;
		this.plz = plz;
	}
	
	public String getStrasse() {
		return strasse;
	}
	
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	
	public String getOrt() {
		return ort;
	}
	
	public void setOrt(String ort) {
		this.ort = ort;
	}
	
	public int getPlz() {
		return plz;
	}
	
	public void setPlz(int plz) {
		this.plz = plz;
	}
	
	
}
