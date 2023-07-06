package ch05.exam;

public class MaxValueInArray {
	public static void main(String[] args) {
		
		int answer =0;
		int[] array = {1,5,3,8,2};
		for(int i=0; i<array.length-1;i++) {
			if(array[i]>=array[i+1]) {
			answer = array[i];	
			}
			else {
			answer = array[i+1];	
			}			
		}
		System.out.println(answer);
	}
}