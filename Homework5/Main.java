package domashna5;

import java.util.Arrays;
public class Main {
	public static void fill(LibraryBook[] lib){
		LibraryBook Ib0 = new LibraryBook("kniga0",false);
		LibraryBook Ib1 = new LibraryBook("book1",false);
		lib[1] = Ib0;
		Reader rdr1 = new Reader("Mihaela","61460159");
		lib[1].get(rdr1);
		lib[1] = Ib0;
		lib[0] = Ib1;
		Reader rdr2 = new Reader("Georgi","61460160");
		lib[0].get(rdr2);
	}
	public static void main(String[] args){
		LibraryBook[] lib = new LibraryBook[2];
		fill(lib);
		
		System.out.println("VSICHKI"+Arrays.toString(lib));
		Arrays.sort(lib);
		System.out.println("VSICHKI"+Arrays.toString(lib));
		lib[0].ret();
		System.out.println(lib[0]);
		if(lib[0].compareTo(lib[0])==0){
			System.out.println(lib[0]+"RAVNO S"+lib[1]);
		}
		else{
			System.out.println(lib[0]+"NE E RAVNO S"+lib[1]);
		}
		lib[1].setKniga(lib[0].getKniga());
		if(lib[0].compareTo(lib[1])==0){
			System.out.println(lib[0]+"RAVNO S"+lib[1]);
		}
		else{
			System.out.println(lib[0]+"NE E RAVNO S"+lib[1]);
		}
		if(lib[0].equals(lib[1])){
			System.out.println(lib[0]+"RAVNO S"+lib[1]);
		}
		else{
			System.out.println(lib[0]+"NE E RAVNO S"+lib[1]);
		}
		System.out.println(" ALL"+Arrays.toString(lib));
	}

}