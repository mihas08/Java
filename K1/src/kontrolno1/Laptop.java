package kontrolno1;
import java.util.Comparator;

public abstract class Laptop extends Computer implements Comparable {
	private String Size;
	private int teglo;
	Laptop(){}
	Laptop(String s,int t){Size=s; teglo=t;}
	public int getTeglo() {
		return teglo;
	}
	public String getSize() {
		return Size;
	}
	public void setTeglo(int teglo) {
		this.teglo = teglo;
	}
	public void setSize(String size) {
		Size = size;
	}
	public boolean equals(Object obj) {
		return Size.equals(((Laptop)obj).Size);
	}
	
	public int compareTo(Object obj) {
		if(this.teglo < ((Laptop) obj).getTeglo()) 
			return 1;
		else if (this.teglo < ((Laptop) obj).getTeglo()) 
			return 0;
		else 
			return -1;
	}
	public String toString() {
        return "Laptop [getTeglo()=" + getTeglo() + ", GetSize()="
                + getSize() + ", toString()=" + super.toString() + "]";
    }
}

	 
	  