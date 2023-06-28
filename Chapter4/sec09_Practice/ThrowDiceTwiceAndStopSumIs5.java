package ch04.sec09_Practice;

public class ThrowDiceTwiceAndStopSumIs5 {
	public static void main(String[] args) {
		while(true){
			int Dice1 = (int)(Math.random()*6+1);
			int Dice2 = (int)(Math.random()*6+1);
			System.out.println("("+Dice1+","+Dice2+")");
			if(Dice1+Dice2==5)	
			break;	
         	}
		System.out.println("합이 5이므로 종료합니다.");
	}
}