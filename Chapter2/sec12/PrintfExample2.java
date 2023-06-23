package ch02.sec12;

public class PrintfExample2 {
	public static void main(String[] args) {
		
		int number = 10;
		double score = 12.345;
		String text = String.valueOf(number);
		
		System.out.printf("%b %n", 3<1); //boolean 
		System.out.printf("%d %n", number); //decimal
		System.out.printf("%o %n", number); //octal
		System.out.printf("%x %n%n", number); //hexadecimal
		System.out.printf("%,d %n", 10000000); //decimal
		System.out.printf("%+d %n", number); //decimal
		System.out.printf("%+d %n", -number); //decimal 
		
		System.out.printf("%f %n", score); // 浮動小数点(floating point)
		System.out.printf("%e %n%n", score); // 指数(exponent)
		
		System.out.printf("%c %n",65); //char(UNICODE)
		System.out.printf("%s %n%n", text); //String
		
		System.out.printf("[%10d] %n", number);
		System.out.printf("[%-10d] %n", number);
		System.out.printf("[%010d] %n", number);
		System.out.printf("[%10.5f] %n", score);
		System.out.printf("[%010.5f] %n", score);
	}
}