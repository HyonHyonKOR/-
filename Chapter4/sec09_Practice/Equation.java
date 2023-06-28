package ch04.sec09_Practice;

//Find X,Y when 4X+5Y=60

public class Equation {
	public static void main(String[] args) {
		for(int x=1;x<=10; x++) {
			int fourX = 4*x;
				for(int y=1; y<=10; y++){
				int fiveY= 5*y;
				if(fourX + fiveY==60) {
				System.out.println("("+x+","+y+")"); 
			 }
		   }
		}
		
		
// <ANSWER>
//		for(int x=1;x<=10; x++) {
//			for(int y=1; y<=10; y++){
//				if(4*x + 5*y==60) {
//				System.out.println("("+x+","+y+")"); 
//			 }
//		   }
//		}
	}
}