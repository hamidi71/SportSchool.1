package nl.Programit.urenregistratieModel1;

import java.sql.Time;
import java.util.Date;

public abstract class Afspraak {
	//private String plaats;
	private Date datum;
	private Time beginTijd;//kijker wat is timer
	private Time eindTijd;//TimeSlot
	
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	public Time getBeginTijd() {
		return beginTijd;
	}
	public void setBeginTijd(Time beginTijd) {
		this.beginTijd = beginTijd;
	}
	public Time getEindTijd() {
		return eindTijd;
	}
	public void setEindTijd(Time eindTijd) {
		this.eindTijd = eindTijd;
	}
		
	
}
