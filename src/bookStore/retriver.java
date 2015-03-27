package bookStore;

// Retrier class to convert from string to specific class and return a new class instance constructed with string content
public class retriver {
	public customer retriveCustomer( String str ){
		// retrieve customer information from string into class	
		String[] results = str.split(",");
		customer newCustomer = new customer( string2Int( results[1] ), results[2], results[3], results[4], results[5], new Address() );
		return newCustomer;
	}
	
	public Book retriveBook( String str ){
		// retrieve Book information from string into class
		String[] results = str.split(",");
		Book newBook = new Book( string2Int( results[1] ), results[2], results[3], results[4], results[5], string2Double( results[6] ), string2Double( results[7] ) );
		
		return newBook;
		
	}
	
	public int string2Int( String str ){
		// transfer string into integer
		int result = 0;
		final int length = str.length();
		// loop to retrieve all digits
		for( int i = 0; i < length; ++i ){
			result = result * 10 + str.charAt(i) - '0';
		}
		return result;
	}
	
	public double string2Double( String str ){
		// transfer string into double
		double result = 0;
		boolean flag = false;// mark if it is in decimal part
		final int length = str.length();
		// loop to retrieve all digits
		double d = 0.1;
		
		for( int i = 0; i < length; ++i ){
			if ( str.charAt(i) == '.' ){
				flag = false;
			}
			else if ( flag ){
				result = result * 10 + str.charAt(i) - '0';
			}
			else{
				result += ( str.charAt(i) - '0' ) * d;
				d /= 10;
			}
		}
		return result;
	}

}
