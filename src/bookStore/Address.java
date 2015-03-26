package bookStore;

import java.io.*;
import java.io.PrintWriter;

public class Address {
	private String street ;
	private String city;
	private String state;
	private String zipcode;
	Address(){
		street = new String("Unknow");
		city = new String("N/A");
		state = new String("N/A");
		zipcode = new String( "N/A" );
	}
	Address( String str, String c, String sta, String zip ){
		street = str;
		city = c;
		state = sta;
		zipcode = zip;
	}
	
	public void print(){
		System.out.println("Address: " + street + ", " + city + ", " + state + " " + zipcode);
	}
	
	public void print( PrintWriter out ){
		out.print( "," + street + "," + city + "," + state + "," + zipcode);
	}
	
}
