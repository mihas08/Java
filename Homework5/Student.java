package domashna5;

import java.util.GregorianCalendar;
public class Student extends Applicant implements Comparable<Object> {

	private String faknum;
	
	public Student(String nam, String f_nom)
	{
		super(new GregorianCalendar(),nam,0.0);
		faknum = f_nom;
	}
	public Student(GregorianCalendar dat, String nam, double uspeh, String f_nom) 
	{
		super(dat, nam, uspeh);
		faknum = f_nom;
	}
	
	public String getFaknum() {
		return faknum;
	}
	
	public void setFaknum(String faknum) {
		this.faknum = faknum;
	}
	
	public int compareTo ( Object obj )
	{
		return faknum.compareTo(((Student)obj).faknum) ;
	}

	public String toString() {
		return "Student [faknum=" + faknum + "]";
	}

	public boolean equals(Object obj) {
		
		return faknum.equals(((Student)obj).faknum);

	}
	
	
	
}

