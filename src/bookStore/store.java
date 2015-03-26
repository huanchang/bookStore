package bookStore;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class store {
	private int customerNO;
	private int bookNO;
	private int MAXCUSTOMER = 1000;
	private int MAXBOOK = 1000;
	static Scanner input = new Scanner( System.in );
	
	final static Charset ENCODING = StandardCharsets.UTF_8;
	final static String DATAFILE = "src/data/storeDatabase.txt";
	
	
	private Vector< customer > Customers = new Vector< customer >(MAXCUSTOMER);
	private Vector< Book > Books = new Vector< Book >(MAXBOOK);
	
	store() {
		// customer class
		customerNO = 0;
		bookNO = 0;
	}
	
	public void prompt(){
		// Usage instruction as main index
		System.out.println( "Service commands: ");
		System.out.println( "\t A-New Customer, B-New Book , R-Return Customer, L- List All, Q-Quit");
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
	
	public void listCustomers(){
		// list information of all customers
		for( int i  = 0; i < customerNO; ++i ){
			Customers.get( i ).print();
		}
	}
	
	public void listBooks(){
		// list information of all books
		for( int i  = 0; i < bookNO; ++i ){
			Books.get( i ).print();
		}
	}
	
	public customer loadCustomer( String line){
		// load a new customer from string
		// Not finished
		customer newCustomer  = new customer();
		return newCustomer;
	}
	
	public Book loadBook( String line){
		// load a new Book from string
		// Not finished
		Book newBook = new Book();
		return newBook;
	}
	
	
	public void readFromFile( String fileName){
		// load data from local file
		Path path = Paths.get( fileName );
		try( BufferedReader reader  = Files.newBufferedReader( path, ENCODING)){
			String line = null;
			while( ( line = reader.readLine() ) != null ){
				// import data from file
				if ( line.matches("C(.*)") ){
					System.out.println(" Customer: "+ line);	
					Customers.add( loadCustomer( line ) );
					++customerNO;
				}
				else if  ( line.matches("B(.*)") ){
					System.out.println(" Book: "+ line);
					Books.add( loadBook( line ) );
					++bookNO;
				}
				
			}//while
			
		}
		catch( Exception e){
			e.printStackTrace();
		}
		
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
			for( int i  = 0; i < bookNO; ++i ){
				Books.get( i ).print( out );
			}
			if( out != null ){
				out.close();
			}
		}
		catch( Exception e){

			e.printStackTrace();
			
		}
	}
	
	
	// clean up the input scanner
	private void cleanUp(){
		input.close();
	}

	
	public void open(){
		// Open the store
		System.out.println( "Store is opening:)");
		this.readFromFile( DATAFILE );
		this.prompt();
		String command;
		while( ( command = input.next().toUpperCase() ).compareTo("Q") != 0 ){
			switch( command ){
			case "A":
				this.newCustomer();
				break;
			case "B":
				this.newBook();
				break;
			case "L":
				this.listCustomers();
				this.listBooks();
				break;
			case "Q":
				break;
			default:
				System.out.println( "Invalid Input." );
			}
			// prompt
			this.prompt();
		}
		// Close the store
		this.close();
	}
	
	public void close(){
		//Close store
		//Write data into file
		writeToFile( DATAFILE );
		//Prompt
		System.out.println( "Closing store." );
		// close scanner
		this.cleanUp();
	}
	

}
