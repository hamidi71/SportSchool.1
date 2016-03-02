package nl.Programit.urenregistratieModel1;
import java.util.Date; 

public abstract class Persoon {	
	private String voorNaam;
	private String achterNaam;
	private String straatNaam;
	private String postCode;
	private String woonPlaats;
	private int huisNummer;
	private Date geboorteDatum;
	private String rekeningNummer;
	
	public String getVoorNaam() {
		return voorNaam;
	}
	public void setVoorNaam(String voorNaam) {
		this.voorNaam = voorNaam;
	}
	public String getAchterNaam() {
		return achterNaam;
	}
	public void setAchterNaam(String achterNaam) {
		this.achterNaam = achterNaam;
	}
	public String getStraatNaam() {
		return straatNaam;
	}
	public void setStraatNaam(String straatNaam) {
		this.straatNaam = straatNaam;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getWoonPlaats() {
		return woonPlaats;
	}
	public void setWoonPlaats(String woonPlaats) {
		this.woonPlaats = woonPlaats;
	}
	public int getHuisNummer() {
		return huisNummer;
	}
	public void setHuisNummer(int huisNummer) {
		this.huisNummer = huisNummer;
	}



	public Date getGeboorteDatum() {
		return geboorteDatum;
	}



	public void setGeboorteDatum(Date geboorteDatum) {
		this.geboorteDatum = geboorteDatum;
	}



	public String getRekeningNummer() {
		return rekeningNummer;
	}



	public void setRekeningNummer(String rekeningNummer) {
		this.rekeningNummer = rekeningNummer;
	}




}