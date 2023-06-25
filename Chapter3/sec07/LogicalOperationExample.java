package ch03.sec07;

public class LogicalOperationExample {
	public static void main(String[] args) {
		int charCode ='A';
		//int charCode ='a';
		//int charCode ='5';
		
		if((65<=charCode) & (charCode<=90)) {
			System.out.println("대문자시군요.");
		}
		
		if((96<=charCode) && (charCode<=122)) {
			System.out.println("소문자이시군요.");
		}
		
		if((48<=charCode) && (charCode<=57)) {
			System.out.println("0-9 숫자이시군요.");
		}
		
		//------------------------------------------
		
		int value = 6;
		//int value = 7;
		
		if((value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 짝수이시군요");
		}
		
		boolean result = (value%2==0) || (value%3==0);
		if(!result) {
			System.out.println("2 또는 3의 배수가 아니군요.");
		}
	}
}