package bookStore;

import java.io.PrintWriter;
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
	private Date createDate;
	private Date lastModifyDate;
	
	Book(){
		// constructor with no arguments
		id = 0;
		title  = new String( "Unknown" );
		author = new String( "Unknown" );
		publisher = new String( "N/A" );
		type = new String( "N/A" );
		publishDate = new Date( System.currentTimeMillis() );
		price = 0.0;
		discount = 0.0;
		createDate = new Date( System.currentTimeMillis() );
		lastModifyDate = new Date( System.currentTimeMillis() );
	}
	
	Book( int ID, String Title, String Author, String T, String Pub, double p, double dis){
		// constructor with arguments
		id = ID;
		title  = Title;
		author = Author;
		publisher = Pub;
		type = T;
		publishDate = new Date( System.currentTimeMillis() );
		price = p;
		discount = dis;
		createDate = new Date( System.currentTimeMillis() );
		lastModifyDate = new Date( System.currentTimeMillis() );
	}
	
	public void print(){
		// print out book information
		System.out.print( "Book title: " + title );
		System.out.print( ",type: " + type );
		System.out.print( ",Publish by " + publisher + " "+ publishDate );
		if( discount > 0 ){
			System.out.println( ",Price: " + price * ( 1 - discount ) +"( Original price: " + price + ", " + discount * 100 + "% OFF" );
		}
		else{
			System.out.println( ",Price: " + price );
		}

	}
	
	public void print( PrintWriter  out ){
		// write out book information into file
		out.print( "B," );
		out.print( title + "," + author + "," + type + "," + publisher + ","+ publishDate );
		out.println( "," + price +"," + discount );
		
	}
	
	
	
}
