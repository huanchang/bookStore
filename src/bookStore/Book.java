package bookStore;

import java.util.*;

public class Book {
	private int id;
	private String title;
	private String author;
	private Date publishDate;
	private String publisher;
	private String type;
	private double price;
	private double discount;
	
	Book(){
		id = 0;
		title  = new String( "" );
		author = new String( "" );
		publisher = new String( "" );
		type = new String( "" );
		publishDate = new Date( System.currentTimeMillis() );
		price = 0.0;
		discount = 0.0;
	}
	
	Book( int ID, String Title, String Author, String Pub, String T, double p, double dis){
		id = ID;
		title  = Title;
		author = Author;
		publisher = Pub;
		type = T;
		publishDate = new Date( System.currentTimeMillis() );
		price = p;
		discount = dis;
	}
	
	public void print(){
		// print out book information
		System.out.println( "Book Info" );
		System.out.println( "Book title: " + title );
		System.out.println( "Book type: " + type );
		System.out.println( "Publish by " + publisher + " "+ publishDate );
		if( discount > 0 ){
			System.out.println( "Price: " + price * ( 1 - discount ) +"( Original price: " + price + ", " + discount * 100 + "% OFF" );
		}
		else{
			System.out.println( "Price: " + price );
		}

	}
}
