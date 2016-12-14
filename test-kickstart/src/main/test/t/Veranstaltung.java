package t;

import org.salespointframework.time.Interval;

public class Veranstaltung {
	private Interval interval;

	public Interval getInterval() {
		return interval;
	}

	public void setInterval(Interval interval) {
		this.interval = interval;
	}
	
	public Veranstaltung() {
		
	}
	
	public Veranstaltung(Interval interval) {
		super();
		this.interval = interval;
	}
}
