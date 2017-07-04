package Homework;

public class Student extends Person implements Comparable {
	private String Fnumber;
	
	public String getFnumber() {
	    return Fnumber;
	  }

	  public void setFirstName(String Fnumber) {
	    this.Fnumber = Fnumber;
	  }
	  
	  public int compareTo ( Object obj )
		{
			return Fnumber.compareTo(((Student)obj).Fnumber) ;
		}
	 public boolean equals(Object obj) {
			
			return Fnumber.equals(((Student)obj).Fnumber);
		}
}
