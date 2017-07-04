package kontrolno2;

import java.util.GregorianCalendar;

public class Applicant implements Comparable {

	private String name;  
	private GregorianCalendar bday;  
	private double rate;
	
	public Applicant(){}
	public Applicant(GregorianCalendar bd, String n, double r){ name = n; bday = bd; rate = r; }
	
	String get_name(){ return name; }
	GregorianCalendar get_bday(){ return getBday(); }
	double get_rate(){ return rate; }
	
	void set_name(String n){ name = n; }
	void set_bday(GregorianCalendar bd){ bday = bd; }
	void set_rate(double r){ rate = r; }
	
	public String rateToString() { return Double.toString(rate); }
	
	
	@Override
	public int compareTo(Object arg0) {
			return 0;
		}
	public GregorianCalendar getBday() {
		return bday;
	}
	public void setBday(GregorianCalendar bday) {
		this.bday = bday;
	}

}