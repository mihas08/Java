package domashna5;



public class LibraryBook implements ILibraryBook, Comparable<Object> {

private Reader chitatel;
private String kniga;
private boolean status;

public LibraryBook(String k, boolean s){
	
	kniga = k; status = s;
}

public Reader getChitatel() {
	return chitatel;
}

public void setChitatel(Reader chitatel) {
	this.chitatel = chitatel;
}

public String getKniga() {
	return kniga;
}

public void setKniga(String kniga) {
	this.kniga = kniga;
}

public boolean isStatus() {
	return status;
}

public void setStatus(boolean status) {
	this.status = status;
}


public String toString() {
	return "LibraryBook [chitatel=" + chitatel + ", kniga=" + kniga
			+ ", status=" + status + "]";
}

public int compareTo ( Object obj )
{
	return kniga.compareTo(((LibraryBook)obj).kniga) ;
}

public void get(Reader rdr){
	
	chitatel = rdr;
	status = true;
}

public void ret(){
	
	status = false;
	chitatel = null;
}	
}