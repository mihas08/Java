package domashna5;

import java.util.GregorianCalendar;

public class Reader extends Student implements Comparable<Object> , IReader {

	public Reader(String nm,String fn){super(new GregorianCalendar(),nm,0.0,fn);}
	public Reader(GregorianCalendar dat, String nam, double uspeh, String f_nom){super(dat,nam,uspeh,f_nom);}

	public String toString() {
		return "Chitatel [ime=" + name + ", data=" + date + ", uspeh=" + usp
				+ ", getFaknum()=" + getFaknum() + ", toString()="
				+ super.toString() + ", GetName()=" + GetName()
				+ ", GetData()=" + GetDate() + ", GetUsp()=" + GetUsp() +  "]";
	}
	
    String getName(){
    	return super.GetName();
    }
    
    double getUspeh(){
    	return super.GetUsp();
    }
    
    GregorianCalendar getData(){
    	return super.GetDate();
    }
    
    String getFaN(){ 
    	return super.getFaknum();
    }
    
    
    void setDatas(GregorianCalendar a, String n, double u, String f){
    	super.SetApp(a, n, u);
    	super.setFaknum(f);
    	
    	
    }
    
	public void get(LibraryBook lb)
	{
		lb.get(this);
	}
	public void ret(LibraryBook lb){
		
		lb.ret();
	}
	
}
