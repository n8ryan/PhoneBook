package Address;

import java.util.Scanner;

public class Address {
	private String street;
	private String city;
	private String state;
	private String zipCode;
	
	public Address (String street, String city, String state, String zipCode){
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	public Address (String telephone){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter street:");
		this.street = input.nextLine();

		System.out.println("Enter city:");
		this.city = input.nextLine(); 

		System.out.println("Enter state:");
		this.state = input.nextLine(); 

		System.out.println("Enter zip code:");
		this.zipCode = input.nextLine(); 
		
		//input.close();

	}
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
	public void setStreet(String street){
		this.street = street;
	}
	public void setCity(String city){
		this.city = city;
	}
	public void setState(String state){
		this.state = state;
	}
	public void setZipCode(String zipCode){
		this.zipCode = zipCode;
	}
	public String toString() { 
		//114 Market St, St Louis, MO, 63403, 6366435698
        return this.getStreet() + ", "  + this.getCity() + ", " + this.getState(); 
    } 


}
