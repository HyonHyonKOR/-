package ch11.sec02.exam02;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
     
		try {
			Class.forName("java.lang.String");
		    System.out.println("String is Exist");
	    } catch (ClassNotFoundException e) {
	    	System.out.println("String is not Exist");
	    	e.printStackTrace();
	    }
		
		System.out.println();
		
		try {
			Class.forName("java.lang.String2");
			System.out.println("String2 is Exist");
		} catch (ClassNotFoundException e) {
			System.out.println("String2 is not exist");
			e.printStackTrace();
		}		
		
	}
}
