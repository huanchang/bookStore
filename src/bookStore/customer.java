package bookStore;

import java.io.PrintWriter ;

public class customer {
	// customer class implementation
	private int id;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private Address address;
	private double balance;
	
	// Interface
	customer(){
		id = 0;
		email = new String( "" );
		password = new String( "" );
		firstName = new String( "" );
		lastName = new String( "" );
		address = new Address();
		balance = 0.0;
	}
	
	customer( int ID, String EMAIL, String PWD, String fName, String lName, Address add){
		id = ID;
		email = EMAIL;
		password = PWD;
		firstName = fName;
		lastName = lName;
		address = add;
		balance = 0.0;
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
		System.out.println( "Customer Info" );
		System.out.println( "Customer ID: " + id );
		System.out.println( "Customer Email: " + email );
		System.out.println( "Customer name: " + firstName + " " + lastName );
		address.print();
		System.out.println( "Customer balance: " + balance );
	}
	
	public void print( PrintWriter  out ){
		out.println( "Customer Info" );
		out.println( "Customer ID: " + id );
		out.println( "Customer Email: " + email );
		out.println( "Customer name: " + firstName + " " + lastName );
		address.print( out );
		out.println( "Customer balance: " + balance );
	}
	
}
