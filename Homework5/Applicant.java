package domashna5;

import java.util.GregorianCalendar;

public class Applicant {

	protected String name;
	protected GregorianCalendar date;
	protected double usp;

	public Applicant(GregorianCalendar birth, String nam, double uspeh)
	{
		date = birth;
		name = nam;
		usp = uspeh;
	}

	public String toString()
	{
		return "Ime: "+name+" , Data: "+date+" , Uspeh: "+usp;
	}
	
	public void SetApp(GregorianCalendar birth, String nam, double uspeh)
	{
		date = birth;
		name = nam;
		usp = uspeh;
	}
	
	public String GetName() { return name; }
	public GregorianCalendar GetDate() { return date; }
	public double GetUsp() { return usp; }
	
}


