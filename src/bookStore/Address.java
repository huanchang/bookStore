package bookStore;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Address {
	private String street ;
	private String city;
	private String state;
	private String zipcode;
	Address(){
		street = new String("");
		city = new String("");
		state = new String("");
		zipcode = new String( "" );
	}
	Address( String str, String c, String sta, String zip ){
		street = str;
		city = c;
		state = sta;
		zipcode = zip;
	}
	
	public void print(){
		System.out.println("Street: " + street + ", " + city + ", " + state + " " + zipcode);
	}
	
	public void print( PrintWriter out ){
		out.println("Street: " + street + ", " + city + ", " + state + " " + zipcode);
	}
	
}
