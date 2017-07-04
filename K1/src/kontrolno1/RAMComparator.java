package kontrolno1;

import kontrolno1.Computer;
import kontrolno1.Laptop;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class RAMComparator implements Comparator<List> {
	private Object RAMsize;
	private ArrayList<Laptop> List = new ArrayList<Laptop>();

	/*public boolean equals (Object obj)
	  {
	   if (this==obj) return true;
	   if (this == null) return false;
	   if (this.getTeglo() != ((Laptop) obj).getTeglo()) return false;
	   Laptop emp = (Laptop) obj ;
	   return this.RAMsize.equals(emp.getRAMsize());
	   }
	*/
	private Object getTeglo() {
		// TODO Auto-generated method stub
		return null;
	}
	RAMComparator( String fileName) throws IOException{ 
		String line;
	FileReader fileReader = new FileReader(fileName);
    BufferedReader bufferedReader = new BufferedReader(fileReader);
	{
	while((line = bufferedReader.readLine()) != null) {
		String temp[] = line.split(" ");
		List.add(new Laptop1());
		List.get(List.size()-1).setRAMsize(Integer.parseInt(temp[0]));
		List.get(List.size()-1).setSize(temp[1]);
		List.get(List.size()-1).setProcessor(temp[2]);
		List.get(List.size()-1).setTeglo(Integer.parseInt(temp[3]));
		//System.out.println(line);
    }   
    bufferedReader.close();   
}
	public void importLaptop(Laptop l){
		List.add(l);
	}
	public void sortsize(){
		 Collections.sort(List, new Comparator<Laptop>() {
		        @Override public int compare(laptop l1, laptop l2) {
		            return l1.getSize().compareTo(l2.getSize());
}}}
   public void sortRAM(){
		   		 Collections.sort(List, new Comparator<Laptop>() {
		   		        @Override public int compare(laptop l1, laptop l2) {
		   		            return l1.getRAMsize().compareTo(l2.getRAMsize());
		   }
		 }
	}

		   		     public void get_list(){
		   				System.out.println("");
		   				for(int i=0; i<List.size(); i++){
		   					System.out.println(List.get(i).getProcessor() + "\t" + List.get(i).getRAMsize() + "\t\t" + List.get(i).getSize() + "\t" + List.get(i).getTeglo());
		   				}
		   			}
		   		 }
