import java.util.Date;
import java.text.*;

public class Birthday {
	private String name;
	private int D, M;
	public Birthday(){}
	public Birthday(String nameP, int DP, int MP){ name = nameP; D = DP; M = MP;  }
	
	boolean hasBirthDay(){
		Date today = new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("d.M");
		return (D+"."+M).equals(ft.format(today));
	}
	
	Boolean hasBirthDaysoon(){
		Date today = new Date();
		Date today2 = new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("d");
		SimpleDateFormat ft2 = new SimpleDateFormat ("M");
		
		if(Integer.parseInt(ft2.format(today2))==M){
			if(Integer.parseInt(ft.format(today))<D){
				System.out.println(name + " has a birthday in " + (D-Integer.parseInt(ft.format(today))) + " days! (" + D + ")");
				return true;
			}
		}
		return false;
	}
	
	public static void main(String [] args){
		Birthday Student1 = new Birthday("Mihaela", 21, 3);
		Birthday Student2 = new Birthday("Raodslav", 23, 3);
		Birthday Student3 = new Birthday("Dimitrina", 15, 3);
		
		System.out.println("Users that have birthdays today:");
		if(Student1.hasBirthDay()) System.out.println("Pavel has a birthday today!");
		if(Student2.hasBirthDay()) System.out.println("Kolio has a birthday today!");
		if(Student3.hasBirthDay()) System.out.println("Hatanas has a birthday today!");
		else if(!Student1.hasBirthDay() && !Student2.hasBirthDay() && !Student3.hasBirthDay()) 
			System.out.println("Nobody has a birthday today.");
		    System.out.println("");
		
		System.out.println("Users, who have birthday soon:");
		Student1.hasBirthDaysoon();
		Student2.hasBirthDaysoon();
		Student3.hasBirthDaysoon();
	}
}
