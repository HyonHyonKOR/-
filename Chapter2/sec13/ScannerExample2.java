package ch02.sec13;

import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			
			int result = inputTwoNumbersFromUserAndReturnSum(scanner);
				
			System.out.println("x + y: " + result);
			System.out.println();
		
			handleUserInput(scanner);
		
			System.out.println("종료");
		}catch(Exception e) {
			System.out.println("sex");
		}
	}

	private static void handleUserInput(Scanner scanner) {
		while(true) {
			System.out.println("입력 문자열: ");
			String data = scanner.nextLine();
			if(data.equals("q")) {
				break;
			}
			System.out.println("출력 문자열 :" + data);	
			System.out.println();	
		}
	}

	private static int inputTwoNumbersFromUserAndReturnSum(Scanner scanner) {
		while(true) {
			int x,y;
			System.out.println("X 값 입력: ");   //console 3 -> scanner.nextLine()を通して"3" -> strX="3";
			String strX = scanner.nextLine();
				try {
					x = Integer.parseInt(strX);
					System.out.println("Y 값 입력: ");
					String strY = scanner.nextLine();  //console 5 -> scanner.nextLine()を通して"3" -> strY="5"; 
					y = Integer.parseInt(strY);
					return x+y;
					}
				catch(NumberFormatException e) {
					System.out.println("다시 입력해주세요.");
				}
}
	}
}