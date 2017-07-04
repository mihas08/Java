package kontrolno1;
import java.util.*;
import kontrolno1.Laptop;
import kontrolno1.RAMComparator;
import kontrolno1.Computer;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;

public class Main{
public static void Main (String args[]) {
	private ArrayList<Laptop> List = new ArrayList<Laptop>();
	
	@SuppressWarnings("unchecked")
	
	Laptop[] laptop = new Laptop[2];
    laptop[0] = new Laptop();
    laptop[0].setProcessor("intel");
    laptop[0].setRAMsize("8gb");
    laptop[0].setSize("15.5");
    laptop[0].setTeglo(2);
    
    laptop[0] = new Laptop();
    laptop[0].setProcessor("intel");
    laptop[0].setRAMsize("4gb");
    laptop[0].setSize("16.6");
    laptop[0].setTeglo(1);
    
    System.out.println("Natural Order");
    for (int i=0; i<2; i++) {
      Laptop[] laptop1;
	Laptop laptop = laptop1[i];
      String processor= laptop.getProcessor();
      String RAMsize = laptop.getRAMsize();
      int teglo = laptop.getTeglo();
      String Size=laptop.getSize();
      System.out.println(processor + " "+ RAMsize+ " " + teglo + " " + Size );
    }
    
    RAMComparator lp = new RAMComparator (2, "D:\\computer.txt");
	System.out.println("Print list");
	pl.get_list();
	System.out.println("      ");
	lp.get_list();
	lp.sortsize();
	System.out.println("   ");
	lp.get_list();
	lp.sortRAM();
    
    
		        
}