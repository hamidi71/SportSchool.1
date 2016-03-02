package nl.Programit.urenregistratieModel1;

public class Abonnement {
	private static final int START_1 = 12; // aantal sessies bij abonnement type 1
	private static final int TYPE_1 = 1;
	private final int AbonnementNummer;
	private final int klantIdNummer;
	private int employeeId;
	private int sessiesOver;
	private int sessieType; // bepaalt aantal sessies per week, voorlopig fixed 1

//Begindatum
	//Sessies over totaal

	//Constructor
	public Abonnement(int klantIdNummer, int AbonnementNummer){
		this.AbonnementNummer = AbonnementNummer;
		this.klantIdNummer = klantIdNummer;
		this.sessiesOver = START_1; // voorlopig maar 1 type
		this.sessieType = TYPE_1;
	}

	public void decreaseSessiesOver(int sessie) { // normaal 1
		sessiesOver -= sessie;
	}

	// getters and setters
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getSessieType() {
		return sessieType;
	}

	public void setSessieType(int sessieType) {
		this.sessieType = sessieType;
	}

	public int getSessiesOver() {
		return sessiesOver;
	}

	public void setSessiesOver(int sessiesOver) {
		this.sessiesOver = sessiesOver;
	}

}
