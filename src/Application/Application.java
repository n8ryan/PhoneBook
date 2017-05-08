package Application;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

import Address.Address;
import Person.Person;

public class Application {
	//static ArrayList<Person> persons = new ArrayList<Person>();
	//static ArrayList<Address> addresses = new ArrayList<Address>();
	static Hashtable<String, Person> persons = new Hashtable<String, Person>();
	static Hashtable<String, Address> addresses = new Hashtable<String, Address>();
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String tel;
		Person person;
		Address address;
		//setup
		String searchField;
		/*Add test cases */
		//John Doe, 114 Market St, St Louis, MO, 63403, 6366435698
		tel = "6366435698";
		person = new Person("John", "Doe");
		address = new Address("114 Market St", "St Louis", "MO", "63403");
		persons.put(tel, person);
		addresses.put(tel, address);
		//John E Doe, 324 Main St, St Charles, MO,63303, 8475390126
		tel = "8475390126";
		person = new Person("John", "E", "Smith");
		address = new Address("324 Main St", "St Charles", "MO", "63303");
		persons.put(tel, person);
		addresses.put(tel, address);
		//John Michael West Doe, 574 Pole ave, St. Peters, MO, 63333, 5628592375
		tel = "5628592375";
		person = new Person("John", "Michael West", "Doe");
		address = new Address("574 Pole ave", "St. Peters", "MO", "63333");
		persons.put(tel, person);
		addresses.put(tel, address);

		//Get Main Choice
		int choice = getOption(input); //initialize choice
		while(choice != 10){
			switch(choice){
				case 1: System.out.println("Enter the telephone number to add: ");
						tel = input.next();
						addRecord(tel);
				        break;
				case 2: System.out.println("Enter the telephone number to del: ");
						tel = input.next();
						deleteRecord(tel);
                		break;
				case 3: System.out.println("Enter the telephone number to update: ");
						tel = input.next();
						updateRecord(tel);
                		break;
				case 4: showAllRecords();
                		break;
				case 5: searchField = "first";
						searchRecords(searchField);
						break;
				case 6: searchField = "last";
						searchRecords(searchField);
						break;
				case 7: searchField = "full";
						searchRecords(searchField);
						break;
				case 8: searchField = "tel";
						searchRecords(searchField);
						break;
				case 9: searchField = "state";
						searchRecords(searchField);
						break;
                default: System.out.println("Invalid Choice");
                		 break;
			}
			
			choice = getOption(input);
		}
		input.close();	
	}
	
	public static int getOption(Scanner input){
		System.out.println("Select Option Number: \n"
				+ "1. Add a new record \n" 
	            + "2. Delete a record for a given telephone number\n"
	            + "3. Update a record for a given telephone number\n"
	            + "4. Show all records in asc order \n"
	            + "Search for a record: \n"	            
				+ "5. Search by first name \n" 
	            + "6. Search by last name \n"
	            + "7. Search by full name \n"
	            + "8. Search by telephone number \n"
	            + "9. Search by city or state \n"
	            + "10. Exit");
		int choice = input.nextInt();
		return choice;
	}
	
	public static void addRecord(String tel){
		System.out.println("Add a record");
		Person person = new Person(tel);
		Address address = new Address(tel);
		
		persons.put(tel, person);
		addresses.put(tel, address);
	}
	public static void deleteRecord(String tel){
		System.out.println("Delete a record");
		if(persons.get(tel) != null){
			persons.remove(tel);
		}
	}
	public static void updateRecord(String tel){
		System.out.println("Update a record");
		persons.remove(tel);
		addresses.remove(tel);
		Person person = new Person(tel);
		Address address = new Address(tel);
		persons.put(tel, person);
		addresses.put(tel, address);
	}
	public static void showAllRecords(){
		String str;
		System.out.println("Show all records: \n");
		Enumeration<String> telephones = persons.keys();
	      
	    while(telephones.hasMoreElements()){
	    	str = (String) telephones.nextElement();
	    	System.out.print(persons.get(str) + ", ");
	    	System.out.print(addresses.get(str) + ", Ph. ");
	    	System.out.println(str);
	    }
		System.out.println();
	}
	public static void searchRecords(String field){
		Scanner input = new Scanner(System.in);
		System.out.println("Search records:\n");
		String str;
        //Scanner input2 = new Scanner(System.in);
        Enumeration<String> telephones;
		switch(field){
			case "first" : System.out.println("Enter the first name:");
                           String firstName = input.nextLine();
				           telephones = persons.keys();
			               while(telephones.hasMoreElements()){
		    				   str = (String) telephones.nextElement();
			            	   if(persons.get(str).getFirstName().equals(firstName)){
				           	    	System.out.print(persons.get(str) + ", ");
				        	    	System.out.print(addresses.get(str) + ", Ph. ");
				        	    	System.out.println(str);
				        	   }
			               }
			               System.out.println();
						   break;
			case "last"  : System.out.println("Enter the last name:");
			               String lastName = input.nextLine();
				           telephones = persons.keys();
			               while(telephones.hasMoreElements()){
							   str = (String) telephones.nextElement();
			         	       if(persons.get(str).getLastName().equals(lastName)){
				           	    	System.out.print(persons.get(str) + ", ");
				        	    	System.out.print(addresses.get(str) + ", Ph. ");
				        	    	System.out.println(str);
				        	   }
			               }
			               System.out.println();
			               break;
			case "full"  : System.out.println("Enter the full name:");
                           String fullName = input.nextLine();
	                       telephones = persons.keys();
                           while(telephones.hasMoreElements()){
                        	   str = (String) telephones.nextElement();
				      	       if(persons.get(str).getFullName().equals(fullName)){
					           	    	System.out.print(persons.get(str) + ", ");
					        	    	System.out.print(addresses.get(str) + ", Ph. ");
					        	    	System.out.println(str);
				      	       }
                           }
                           System.out.println();
                           break;
			case "tel"   : System.out.println("Enter the telephone number:");
            			   String telephone = input.nextLine();
            			  
    					   System.out.print(persons.get(telephone) + ", ");
    					   System.out.print(addresses.get(telephone) + ", Ph. ");
    					   System.out.println(telephone);
    					   System.out.println();
            				   
            			   
            			   break;
			case "state" : System.out.println("Enter the city name (optional):");
            			   String cityName = input.nextLine();
            			   System.out.println("Enter the state 2-letter name (optional):");
            			   String stateName = input.nextLine();
            			   telephones = persons.keys();
            			   if((cityName.equals("")) && (stateName.equals(""))){
            				   System.out.println("You must enter at least one of the paramaters.");
            			   }else if((cityName.equals("")) && (!stateName.equals(""))){
                			   while(telephones.hasMoreElements()){
                				   str = (String) telephones.nextElement();
                				   if(addresses.get(str).getState().equals(stateName)){
                					   System.out.print(persons.get(str) + ", ");
                					   System.out.print(addresses.get(str) + ", Ph. ");
                					   System.out.println(str);
                				   }
                			   }
            			   }else if((!cityName.equals("")) && (stateName.equals(""))){
                			   while(telephones.hasMoreElements()){
                				   str = (String) telephones.nextElement();
                				   if(addresses.get(str).getCity().equals(cityName)){
                					   System.out.print(persons.get(str) + ", ");
                					   System.out.print(addresses.get(str) + ", Ph. ");
                					   System.out.println(str);
                				   }
                			   }
            			   }else{
                			   while(telephones.hasMoreElements()){
                				   str = (String) telephones.nextElement();
                				   if((addresses.get(str).getCity().equals(cityName)) &&
                				   	  (addresses.get(str).getState().equals(stateName))){
                					   System.out.print(persons.get(str) + ", ");
                					   System.out.print(addresses.get(str) + ", Ph. ");
                					   System.out.println(str);
                				   }
                			   }
            			   }
            			   System.out.println();
            				   
            			   break;
		}
		//input.close();
	}
}
