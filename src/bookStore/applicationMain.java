package bookStore;

import java.util.*;

public class applicationMain {
	static Scanner input = new Scanner( System.in );
	
	
	public static void main( String args[] ){
		// main function of book store
		store myStore = new store();
		store.prompt();
		myStore.newCustomer();
		myStore.newBook();
		myStore.writeToFile( "storeDatabase.txt" );
		cleanUp();
	}
	
	
	private static void cleanUp(){
		input.close();
	}
}
