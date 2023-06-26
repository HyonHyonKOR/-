package ch03.sec12;

public class OperatorPriority {
	public static void main(String[] args) {
		int a=1;
		int b=2;
		
		int result1 = a--*b;  
		int result2 = a*b;
		int result3 = ++a*b;
		int result4 = -a*b;
		boolean result5 = !(a>b);
		
		System.out.println("result1: "+ result1);
		System.out.println("result2: "+ result2);
		System.out.println("result3: "+ result3);
		System.out.println("result4: "+ result4);
		System.out.println("result5: "+ result5);
	}
}