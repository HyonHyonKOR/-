package ch11.sec03.exam01;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		String[] array = {"100" , "1oo"};
		
		for(int i=0; i<=array.length; i++) {
			try {
			System.out.println(array[i]);
			int value = Integer.parseInt(array[i]);
			System.out.println("array[" + i +"]: " + value);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
			System.out.println("please check Array's length again");
		}catch(NumberFormatException e) {
			System.out.println(e.toString());
			System.out.println("Some index can't be converted to int data type. please check again");	
		}
			System.out.println("finish");
			System.out.println();
		}
		


	}

}
