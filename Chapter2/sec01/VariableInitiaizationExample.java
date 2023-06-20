package ch02.sec01;
     
/*ErrorCode

public class VariableInitiaizationExample {
	public static void main(String[] args) {
       //변수 value 선언
		int value;
	
	   //연산 결과를 변수 result의 초기값으로 대입
		int result = value + 10;  // <-값이 없으므로 컴파일 에러 발생
 		
	   //변수 result 값을 읽고 콘솔에 출력
	   System.out.println(result);
	   
	   
		
	}

}     */

public class VariableInitiaizationExample {
	public static void main(String[] args) {
       //변수 value 선언 후 5를 대입(저장)
		int value=5;
	
	   //연산 결과를 변수 result의 초기값으로 대입
		int result = value + 10;  // <-값이 없으므로 컴파일 에러 발생
 		
	   //변수 result 값을 읽고 콘솔에 출력
	   System.out.println(result);
	}
	
}
