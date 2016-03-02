package nl.Programit.urenregistratieModel1;

public class Trainer extends Persoon{
	private int employeeId;
	private int gewerkteSessies;
	private SportSchool mijnSportSchool;

	public void incrementGewerkteSessies(int i){
		gewerkteSessies += i;
	}
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getGewerkteSessies() {
		return gewerkteSessies;
	}

	public void setGewerkteSessies(int gewerkteSessies) {
		this.gewerkteSessies = gewerkteSessies;
	}

	public SportSchool getMijnSportSchool() {
		return mijnSportSchool;
	}

	public void setMijnSportSchool(SportSchool mijnSportSchool) {
		this.mijnSportSchool = mijnSportSchool;
	}
}
