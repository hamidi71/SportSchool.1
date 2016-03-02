package nl.Programit.urenregistratieModel1;

import java.util.ArrayList;

public class SportSchool {
	private static final VINK = 1;
	private int sportSchoolId;//Sport school Id
	private String SportSchoolNaam;


	public void sessieAfvinken (SportSessie s){
		(searchKlant(s.getKlant()).getMijnAbonnement()).decreaseSessiesOver(VINK); // ga ervan uit dat er nog sessies over zijn
		(searchTrainer(s.getTrainer())).incrementGewerkteSessies(VINK);
		s.setBevestigd(true);
	};

	private ArrayList <Trainer> trainers =new ArrayList<>();

	public Trainer searchTrainer (int trainerId){
		for(Trainer t: trainers){
			if (t.getEmployeeId() == trainerId)
				return t;
		}
		return null;
	}

	private ArrayList <SportSessie> sessies =new ArrayList<>();
	public SportSessie searchSessie (int trainer, int klant){
		for( SportSessie s: sessies){
			if (s.trainer == trainer && s.klant == klant )
				return s;
		}
		return null;
	}

	private ArrayList <Klant> klanten =new ArrayList<>();

	public Klant searchKlant (int klantId){
		for(Klant k: klanten){
			if (k.getKlantIdNummer() == klantId)
				return k;
		}
		return null;
	}

	private ArrayList <Abonnement> abonnementen =new ArrayList<>();
	public  Abonnement searchAbonnement (int abonnement){
		for(Abonnement a: abonnementen){
			if (a.AbonnementNummer == abonnement)
				return a;
		}
		return null;
	}

	public int getSportSchoolId() {
		return sportSchoolId;
	}

	public void setSportSchoolId(int sportSchoolId) {
		this.sportSchoolId = sportSchoolId;
	}

	public String getSportSchoolNaam() {
		return SportSchoolNaam;
	}

	public void setSportSchoolNaam(String sportSchoolNaam) {
		SportSchoolNaam = sportSchoolNaam;
	}



}
