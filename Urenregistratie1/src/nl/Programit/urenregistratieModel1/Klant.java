package nl.Programit.urenregistratieModel1;

public class Klant extends Persoon {
	private int klantIdNummer;
	private Abonnement mijnAbonnement;
	//private SportSchool mijnSportShool; nog niet zeker of dat nodig is
	public int getKlantIdNummer() {
		return klantIdNummer;
	}

	public void setKlantIdNummer(int klantIdNummer) {
		this.klantIdNummer = klantIdNummer;
	}

	public Abonnement getMijnAbonnement() {
		return mijnAbonnement;
	}

	public void setMijnAbonnement(Abonnement mijnAbonnement) {
		this.mijnAbonnement = mijnAbonnement;
	}




}
