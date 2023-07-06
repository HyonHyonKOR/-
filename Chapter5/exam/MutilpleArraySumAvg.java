package ch05.exam;

public class MutilpleArraySumAvg {

	public static void main(String[] args) {
		
		int total=0;
		int totalStudent=0;
		
		int[][] array = {
			{95,86},	
			{83,92,96},
			{78,83,93,87,88}
		};
		
		for(int i=0; i<array.length;i++) {
			   totalStudent += array[i].length;
			for(int k=0; k<array[i].length; k++) {
			   total += array[i][k];
			}
		}
		
		double avg= (double)total/totalStudent;
		
		System.out.println(total);
		System.out.println(avg);
		
		
	}
}