package kontrolno2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Set;
import java.util.TreeSet;

public class Team implements IOInterface{
	private Set<Player> studentTreeSet = new TreeSet<Player>();
	private String SFileNameIn, SFileNameOut;
	
	String get_SFileNameIn(){ return SFileNameIn; } 
	void set_SFileNameIn(String f){ SFileNameIn = f; }
	String get_SFileNameOut(){ return SFileNameOut; }
	void set_SFileNameOut(String f){ SFileNameOut = f; }
	
	ArrayList<Player> playerArrayList = new ArrayList<Player>();
	
	public void sortByBD(){
		 Collections.sort(playerArrayList, new Comparator<Player>() {
		        @Override public int compare(Player p1, Player p2) {
		            return p1.get_bday().compareTo(p2.get_bday());
		        }
		 });
	}
	
	@Override
	public void read() throws NumberFormatException, IOException, ParseException{
		
	    FileReader fileReader = new FileReader(SFileNameIn);
	    BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line;
		while((line = bufferedReader.readLine()) != null) {
			String temp[] = line.split(" ");
			playerArrayList.add(new Player());
			
			DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		    dateFormat.setLenient(false);
		    Date d = dateFormat.parse(temp[0]);
		    GregorianCalendar cal = new GregorianCalendar();
		    cal.setTime(d);
		    
		    playerArrayList.get(playerArrayList.size()-1).set_bday(cal);
		    playerArrayList.get(playerArrayList.size()-1).set_name(temp[1]);
		    playerArrayList.get(playerArrayList.size()-1).set_rate(Double.parseDouble(temp[2]));
		    playerArrayList.get(playerArrayList.size()-1).setRejting(temp[3]);
			
	    }   
	    bufferedReader.close();   
	}
	@Override
	public void write() throws FileNotFoundException, UnsupportedEncodingException{
		PrintWriter writer = new PrintWriter(this.get_SFileNameOut(), "UTF-8");
		for(Player name:playerArrayList)
			writer.println(name.get_bday().get(Calendar.DATE) + "." + (name.get_bday().get(Calendar.MONTH)+1) + "." 
		+ name.get_bday().get(Calendar.YEAR) + " " + name.get_name() + " " + name.get_rate() + " " + name.getRejting());
		writer.close();
	}
	
	public void get_list(){
		for(Player name:playerArrayList)
			System.out.println(name.get_bday().get(Calendar.DATE) + "." + (name.get_bday().get(Calendar.MONTH)+1) + "." 
		+ name.get_bday().get(Calendar.YEAR) + " " + name.get_name() + " " + name.get_rate() + " " + name.getRejting());
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException, ParseException{
		Team KST2B = new Team();
		KST2B.set_SFileNameIn("db_in.txt");
		KST2B.read();
		KST2B.set_SFileNameOut("db_out.txt");
		KST2B.write();
		KST2B.sortByBD();
		KST2B.get_list();
	}
	
}
