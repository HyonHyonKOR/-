package ch04.sec03;
//JAVA 12
public class SwitchExpressionExample {
	public static void main(String[] args) {
		char grade = 'b';
		
		switch(grade) {
			case 'a','A'->{
				System.out.println("우수 회원입니다.");
			}
			case 'b','B'->{
				System.out.println("일반 회원입니다.");
			}
			default -> {
				System.out.println("손님입니다.");
			}
		}
		
		switch(grade) {
		case 'a','A'-> System.out.println("우수 회원입니다.");
		case 'b','B'-> System.out.println("일반 회원입니다.");
		default     -> System.out.println("손님입니다.");
		}
	}
}