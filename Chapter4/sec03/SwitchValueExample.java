package ch04.sec03;
//JAVA 12
public class SwitchValueExample {
	public static void main(String[] args) {
		String grade = "B";
		
		//before JAVA 12 
		int score1 =0;
		switch(grade) {
			case "a","A" :
				score1= 100;
				break;
			case "b","B" :
				int result =100-20;
				score1= result;
				break;
			default:
				score1=60;			
		}
		System.out.println("score1: " + score1);
		
		//after java12
		int score2 =switch(grade) {
			case "A","a" -> 100;
			case "B","b" ->{
				int result = 100-20;
				yield result;
			}
		   default ->60;
		};
		System.out.println("score2: " + score2);
	}
}