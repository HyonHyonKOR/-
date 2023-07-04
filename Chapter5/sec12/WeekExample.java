package ch05.sec12;

import java.util.Calendar;

public class WeekExample {
	public static void main(String[] args) {
		
		Week whatDayisToday = null;   //Week의 7개의 열거상수 중 하나를 담는 열거 Week의 열거형 변수 today를 작성한다. 아직은 참조값(상수의 어드레스)는 미정이다. 
		
		Calendar cal = Calendar.getInstance(); //Calendar의 인스턴스를 생성하고 Calendar형 변수 cal에 인스턴스의 참조주소를 대입한다.
	    
		int dayNumber = cal.get(Calendar.DAY_OF_WEEK);	// 변수 cal은 Calendar의 인스턴스를 참조하므로 Calendar 클래스의 멤버변수와 메소드를 이용가능하다.
		                                                //Calendar의 Day of week은 요일을 숫자라 환산하므로 그 값을 int형 정수에 담는다.
		
		switch(dayNumber) {           //담는 변수에 따라 정해진 값을 리턴하기 위해, 변수별로 리턴할 값을 담는다. Switch-case를 사용한다.
			case 1: whatDayisToday = Week.SUNDAY; break;
			case 2: whatDayisToday = Week.MONDAY; break;
			case 3: whatDayisToday = Week.TUESDAY; break;
			case 4: whatDayisToday = Week.WEDNESDAY; break;
			case 5: whatDayisToday = Week.THURSDAY; break;
			case 6: whatDayisToday = Week.FRIDAY; break;
			case 7: whatDayisToday = Week.SATURDAY; break;
			
		}
			if(whatDayisToday == Week.SUNDAY) {
				System.out.println("일요일에는 축구를 합니다.");
			}else {
				System.out.println("열심히 자바를 공부합니다.");
			}
	} 
}