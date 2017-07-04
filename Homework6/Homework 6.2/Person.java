package Homework;
class Person implements Comparable {

	  private String firstName;
	  private String lastName;
	  private int age;
	  private String Fnumber;

	  public String getFirstName() {
	    return firstName;
	  }

	  public void setFirstName(String firstName) {
	    this.firstName = firstName;
	  }

	  public String getLastName() {
	    return lastName;
	  }

	  public void setLastName(String lastName) {
	    this.lastName = lastName;
	  }

	  public int getAge() {
	    return age;
	  }

	  public void setAge(int age) {
	    this.age = age;
	  }
	
	  public String getFnumber() {
		    return Fnumber;
		  }
	  
	  public void setFnumber(String Fnumber){
        this.Fnumber=Fnumber;		  
	  }

	  public int compareTo(Object anotherPerson) throws ClassCastException {
	    if (!(anotherPerson instanceof Person))
	      throw new ClassCastException("A Person object expected.");
	    int anotherPersonAge = ((Person) anotherPerson).getAge();  
	    return this.age - anotherPersonAge;    
	  }
	  
	  @Override
	    public String toString() {      
	        return "First Name: " + firstName + ", Last Name: " + lastName + ", Age: " + age;
	    }
}