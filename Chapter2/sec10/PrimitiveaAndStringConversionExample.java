package ch02.sec10;

public class PrimitiveaAndStringConversionExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value 1: " + value1);
		System.out.println("value 2: " + value2);
		System.out.println("value 3: " + value3);
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		char char1  = str3.charAt(0);
		
		System.out.println("value 4: " + str1.getClass());
		System.out.println("value 5: " + str2.getClass());
		System.out.println("value 6: " + str3.getClass());
 		System.out.println("value 7: " + char1);
	}
}
