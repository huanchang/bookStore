package bookStore;

import java.io.*;
import java.util.*;

public class store {
	private int customerNO;
	private int bookNO;
	private int MAXCUSTOMER = 1000;
	private int MAXBOOK = 1000;
	
	
	private Vector< customer > Customers = new Vector< customer >(MAXCUSTOMER);
	private Vector< Book > Books = new Vector< Book >(MAXBOOK);
	
	store() {
		// customer class
		customerNO = 0;
		bookNO = 0;
	}
	
	public static void prompt(){
		// Usage instruction as main index
		System.out.println( "Service commands: ");
		System.out.println( "\t A-New Customer, B- Return Customer, Q-Quit");
		System.out.print( "Enter commands: ");
	}
	
	public void newCustomer(){
		customer newCustomer = new customer();
		Customers.add( newCustomer );
		++customerNO;
		Customers.get(0).print();
		System.out.println("Customer number is " + customerNO );
	}
	
	public void newBook(){
		Book newBook = new Book();
		Books.add( newBook );
		++bookNO;
		Books.get(0).print();
		System.out.println("Book number is " + bookNO );
	}
	
	
	public void readFromFile( String fileName){
		// load data from local file
		
	}
	
	public void writeToFile( String fileName ){
		// write data to local file
		
		PrintWriter out = null;
		// try to write data into fileName file
		try{
			out = new PrintWriter( fileName );
			
			for( int i  = 0; i < customerNO; ++i ){
				Customers.get( i ).print( out );
			}
			if( out != null ){
				out.close();
			}
		}
		catch( Exception e){

			e.printStackTrace();
			
		}
	}

	

}
