package ch11.sec03.exam02;

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
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("please check again");	
		}
			System.out.println("finish");
			System.out.println();
		}
		


	}

}

