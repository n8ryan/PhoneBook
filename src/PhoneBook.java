import java.util.Scanner;


public class PhoneBook {
	/** Write a program to simulate the actions of a phonebook.
     * Your program should be able to :
     *	1. Add new entries 
	 *	2. Search for an existing entry
	 *	3. Search by first name *
	 *	4. Search by last name *
	 *	5. Search by full name 
	 *		*note name is not unique therefore the result should be an array of Person Objects.
	 *	6. Search by telephone number
	 *	7. Search by city or state
	 *	8. Delete a record for a given telephone number
	 *	9. Update a record for a given telephone number
	 *	10. Show all records in asc order
	 *	11. An option to exit the program 
	 *	
	 * Your program should operate on the console. 
	 * It should display all the choices when the program loads. 
	 * 
	 * Eg.	1. Add new record
	 *		2. Delete a record
     *     		Etc.. where 1 representing the action for adding a record and 2 representing the action
     *     		for deleting a record.
     *     
	 * Your program should run until the user selects the exit option. 
	 * Your program should have a minimum of 2 classes a Person class, an Address  class.
	 *
	 * Test case :
	 *	John Doe, 114 Market St, St Louis, MO, 63403, 6366435698
	 *	John E Doe, 324 Main St, St Charles, MO,63303, 8475390126
	 *	John Michael West Doe, 574 Pole ave, St. Peters, MO, 63333, 5628592375
	 *
	 *	Searching for John should return a list of all 3 records above, 
	 *	displaying the telephone number in this order (636)-453-8563.
	 *
	 *
	 * Optional add additional features to your program, for storing cell, home, work and fax numbers. 
	 * Also features for storing events like birthday, anniversary, email… etc   
	 */

	public static void main(String[] args) {
		//Get Main Choice
		Scanner input = new Scanner(System.in);
		String s;
		int choice = getOption(input); //initialize choice
		while(choice != 6){
			switch(choice){
				case 1: s = "Add new entry";
				        break;
				case 2: s = "Search for an existing entry";
		                break;
				case 3: s = "Delete a record";
                		break;
				case 4: s = "Update a record";
                		break;
				case 5: s = "Show all records in ascending order";
                		break;
                default: s = "Invalid Choice";
                		 break;
			}
			System.out.println(s);
			choice = getOption(input);
		}
		input.close();	
	}
	public static int getOption(Scanner input){
		//Get user input
		//Scanner input = new Scanner(System.in);
		System.out.println("Select Option: \n"
				+ "1. Add new entry \n" 
	            + "2. Search for an existing entry \n"
	            + "3. Delete a record \n"
	            + "4. Update a record \n"
	            + "5. Show all records in ascending order \n"
	            + "6. Exit");
		int choice = input.nextInt();
		//input.close();
		return choice;
	}

}
class Person{
	private String firstName;
	private String lastName;
	private String middleName;
	public void setName(String name){
		int strLen = name.length();
		String[] parts = name.split(" ");
		firstName.equals(parts[0]);
		lastName.equals(parts[strLen-1]);
		int beginIndex = parts[0].length();
		int endIndex = strLen - lastName.length();
		middleName.equals(name.substring(beginIndex, endIndex));
		
	}
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public String getMiddleName(){
		return this.middleName;
	}

}
class Address{
	private String street;
	private String city;
	private String state;
	private String zipCode;
	
	public String getStreet(){
		return street;
	}
	public String getCity(){
		return city;
	}
	public String getState(){
		return state;
	}
	public String getZipCode(){
		return zipCode;
	}
	public String getFullAddress(){
		return street + ", " + city + ", " + state + " " + zipCode;
	}
	public void setStreet(String s){
		street = s;
	}
	public void setCity(String s){
		city = s;
	}
	public void setState(String s){
		state = s;
	}
	public void setZipCode(String s){
		zipCode = s;
	}
	

}
