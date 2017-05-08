package Person;

import java.util.Scanner;

public class Person {
	private String fullName;
	private String firstName;
	private String lastName;
	private String middleName;
	
	public Person(String firstName, String middleName, String lastName){
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName =lastName;
		//this.telephone = telephone;
		this.fullName = (firstName + " " + middleName + " " + lastName);
	}
	public Person(String firstName, String lastName){
		this.firstName = firstName;
		this.middleName = " ";
		this.lastName = lastName;
		//this.telephone = telephone;
		
		this.fullName = (firstName + " " + lastName);
	}
	public Person(String telephone){
		//this.telephone = telephone;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter First Name:");
		this.firstName = input.nextLine(); 

		System.out.println("Enter Last Name:");
		this.lastName = input.nextLine(); 

		System.out.println("Enter Middle Name(s):");
		this.middleName = input.nextLine(); 
		
		this.fullName = this.firstName + " " + this.middleName + " " + this.lastName;
		//input.close();
	}
	
	public String getFullName() {
		return this.fullName;
	}
	public void setFullName(String fullName){
		this.fullName = fullName;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getMiddleName(){
		return this.middleName;
	}
	public void setMiddleName(String middleName){
		this.middleName = middleName;
	}
	/*public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	*/
	public String toString() { 
        return this.fullName; 
    } 



}
