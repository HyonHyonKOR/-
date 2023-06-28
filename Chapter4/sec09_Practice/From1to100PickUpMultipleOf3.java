package ch04.sec09_Practice;

public class From1to100PickUpMultipleOf3 {
	public static void main(String[] args) {
		int result = 0;
		for(int i=3; i<=100; i+=3){
			result+=i;
		}
		System.out.println(result);
		
		
		int sum = 0;
		for(int j=1; j<=100; j++) {
		if(j%3==0) {
			sum+=j;
		 }
		}
		System.out.println(sum);
	}
}