package ch04.sec09_Practice;

import java.util.Scanner;

public class WhileScanner {
	public static void main(String[] args) {
		
		int inputMoney=0;
		int outputMoney=0;
				
		Scanner scanner = new Scanner(System.in);
		String choiceNumber="";
		
		do {
		System.out.println("-------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 |");
		System.out.println("-------------------------------");
		System.out.print("선택> ");
	    choiceNumber = scanner.nextLine();
	    	if(choiceNumber.equals("1")) {
	    		System.out.print("예금액>"); 
	    		String input = scanner.nextLine();
	    		inputMoney= Integer.parseUnsignedInt(input);
	    		System.out.println();
	    		continue;
	    		}
	    	else if(choiceNumber.equals("2")) {
	    		System.out.print("출금액>");	
	    		String output = scanner.nextLine();
	    		outputMoney= Integer.parseUnsignedInt(output);
	    		System.out.println();
	    		continue;
	    		}
	    	else if(choiceNumber.equals("3")) {
	    		System.out.print("잔고> " + (inputMoney-outputMoney));	
	    		System.out.println();
	    		System.out.println();
		    	continue;	
	    		}
	    }
		while(!choiceNumber.equals("4"));
		System.out.println();
		System.out.println("프로그램 종료");
		scanner.close();
	}
}