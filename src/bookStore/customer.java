package bookStore;

import java.io.PrintWriter ;
import java.util.*;

public class customer {
	// customer class implementation
	private int id;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private Address address;
	private double balance;
	private Date createDate;
	private Date lastModifyDate;
	
	// Interface
	customer(){
		id = 0;
		email = new String( "Unknown" );
		password = new String( "N/A" );
		firstName = new String( "Unknown" );
		lastName = new String( "Unknown" );
		address = new Address();
		balance = 0.0;
		createDate = new Date( System.currentTimeMillis() );
		lastModifyDate = new Date( System.currentTimeMillis() );
	}
	
	customer( int ID, String EMAIL, String PWD, String fName, String lName, Address add){
		id = ID;
		email = EMAIL;
		password = PWD;
		firstName = fName;
		lastName = lName;
		address = add;
		balance = 0.0;
		createDate = new Date( System.currentTimeMillis() );
		lastModifyDate = new Date( System.currentTimeMillis() );
	}
	
	public boolean verify( String pwd ){
		// verify customer password
		if( pwd.equals( password ) ){
			return true;
		}
		else{
			return false;
		}
	}
			
	public void print(){
		System.out.print( "Customer ID: " + id );
		System.out.print( ", Email: " + email );
		System.out.print( ", Name: " + firstName + " " + lastName );
		System.out.print( ", Customer balance: " + balance );
		address.print();
		
	}
	
	public void print( PrintWriter  out ){
		out.print( "C," + id );
		out.print( "," + email );
		out.print( "," + firstName + "," + lastName );
		address.print( out );
		out.println( "," + balance + this.createDate + "," + this.lastModifyDate );
		
	}
	
}
