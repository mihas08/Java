package Homework;
import Homework.Person;
import java.util.Arrays;
import Homework.Student;

import java.io.*;
import java.util.*; 

public class StudentGroup {
	 private FileReader in;
	private String NumberGr;
	private ArrayList<Student> students ;
	public StudentGroup(String NumberGr) {
		this.NumberGr=NumberGr;
		this.students= new ArrayList<Student>();
		}
	public ArrayList<Student> getstudents(){
		return this.students;
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		WordFromFile file = new WordFromFile("d:\\proba.txt");
		System.out.println(file.getWord());
	  
	    Person[] persons = new Person[4];
	    persons[0] = new Person();
	    persons[0].setFirstName("Elvis");
	    persons[0].setLastName("Goodyear");
	    persons[0].setAge(56);
	    persons[0].setFnumber("61460159");

	    persons[1] = new Person();
	    persons[1].setFirstName("Stanley");
	    persons[1].setLastName("Clark");
	    persons[1].setAge(8);
	    persons[1].setFnumber("61460160");

	    persons[2] = new Person();
	    persons[2].setFirstName("Jane");
	    persons[2].setLastName("Graff");
	    persons[2].setAge(16);
	    persons[2].setFnumber("61460161");

	    persons[3] = new Person();
	    persons[3].setFirstName("Nancy");
	    persons[3].setLastName("Goodyear");
	    persons[3].setAge(69);
	    persons[3].setFnumber("61460162");

	    System.out.println("Natural Order");
	    for (int i=0; i<4; i++) {
	      Person person = persons[i];
	      String lastName = person.getLastName();
	      String firstName = person.getFirstName();
	      int age = person.getAge();
	      System.out.println(lastName + ", " + firstName + ". Age:" + age);
	    }

	    Arrays.sort(persons, new LastNameComparator());
	    System.out.println();
	    System.out.println("Sorted by last name");

	    for (int i=0; i<4; i++) {
	      Person person = persons[i];
	      String lastName = person.getLastName();
	      String firstName = person.getFirstName();
	      int age = person.getAge();
	      String Fnumber = person.getFnumber();
	      System.out.println(lastName + ", " + firstName + ". Age:" + age + Fnumber);
	    }

	    Arrays.sort(persons, new FirstNameComparator());
	    System.out.println();
	    System.out.println("Sorted by first name");

	    for (int i=0; i<4; i++) {
	      Person person = persons[i];
	      String lastName = person.getLastName();
	      String firstName = person.getFirstName();
	      int age = person.getAge();
	      String Fnumber = person.getFnumber();
	      System.out.println(lastName + ", " + firstName + ". Age:" + age + Fnumber);
	    }

	    Arrays.sort(persons);
	    System.out.println();
	    System.out.println("Sorted by age");

	    for (int i=0; i<4; i++) {
	      Person person = persons[i];
	      String lastName = person.getLastName();
	      String firstName = person.getFirstName();
	      int age = person.getAge();
	      String Fnumber = person.getFnumber();
	      System.out.println(lastName + ", " + firstName + ". Age:" + age + Fnumber);
	    }
	    
	    Arrays.sort(persons);
	    System.out.println();
	    System.out.println("Sorted by Fnumber");

	    for (int i=0; i<4; i++) {
	      Person person = persons[i];
	      String lastName = person.getLastName();
	      String firstName = person.getFirstName();
	      int age = person.getAge();
	      String Fnumber = person.getFnumber();
	      System.out.println(lastName + ", " + firstName + "," + age + "," + Fnumber);
	    }
	  }
	}
