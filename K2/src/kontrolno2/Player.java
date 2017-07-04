package kontrolno2;

import java.util.GregorianCalendar; 

public class Player extends Applicant implements Comparable {
private String rejting;


public Player(){}
public Player(GregorianCalendar b, String n, double r,String rj ){
	super(b,n,r);
	rejting=rj;
}

public String getRejting() {
	return rejting;
}
public void setRejting(String rejting) {
	this.rejting = rejting;
}

public boolean equals(Player o){ return this.equals(o); }
public String toString(Player o){ return this.toString(); }
public int compareTo(Player o){ return this.compareTo(o); }


}
