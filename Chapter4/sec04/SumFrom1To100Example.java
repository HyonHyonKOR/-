package ch04.sec04;

public class SumFrom1To100Example {
	public static void main(String[] args) {
		int answer=0;
		int i;
		
		
		for(i=1;i<=100;i++) {
			answer+=i;
		}
		System.out.println("1~"+ (i-1) + "의 합: "+ answer);
	}
}