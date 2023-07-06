package ch05.exam;

import java.util.Scanner;

public class AnalyzeStudentScores {                                                 
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	int students =0;
	int total=0;
	int max=0;
	double avg =0.0;
	int[] scores = null;
	
	while(true) {
	System.out.println("----------------------------------------------");
	System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트 | 4.분석 | 5.종료 ");
	System.out.println("----------------------------------------------");
	System.out.print("선택>");
	int choiceNumber =Integer.parseInt(scanner.nextLine());
	
	switch(choiceNumber) {
	case 1: 
	System.out.print("학생수>");
	students =Integer.parseInt(scanner.nextLine());
	continue;
		
	case 2:
	scores = new int[students];
	for(int i=0; i<scores.length; i++) {
		System.out.print("scores[" + i +"]>");
		int score =Integer.parseInt(scanner.nextLine());
		scores[i]=score;
		total += score;
	}
	continue;
		
	case 3:
	for(int i=0; i<scores.length; i++) {
	System.out.print("scores[" + i +"]>" + scores[i] +'\n');
	}
	continue;
		
	case 4:	
	for(int i=0; i<scores.length; i++) {
	 if(max<scores[i]) {
	    max=scores[i];	 
	   }
	}
	
	avg =(double)total/scores.length;
	System.out.println("최고 점수:" + max);
	System.out.println("평균 점수:" + avg);	
	continue;	
	
	case 5:
	break;	
	}
	break;
	}
	System.out.println("프로그램 종료");
	scanner.close();
	}
}