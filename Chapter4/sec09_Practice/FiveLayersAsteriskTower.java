package ch04.sec09_Practice;

public class FiveLayersAsteriskTower {
	public static void main(String[] args) {
		String result = "";
		for(int i=1;i<=5;i++) {
		  result+="*";
          System.out.println(result);
		}
	}
}


/*
 * public class Example {
	  public static void main(String[] args) {
 	       for(int i=1; i<= 5; i++) {
 				for(int j=1; j<=i; j++) {
                    System.out.print("*");
 					if(j==i) {
 					System.out.println();
 					}
 				}
 			}
		}
	} 
 */
