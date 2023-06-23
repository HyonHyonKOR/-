package ch03.sec02;

public class ArithmeticOpeatorExample {
	public static void main(String[] args) {
		byte v1 = 10;
		byte v2 = 4;
		long v3 = 10L;
		
		int result1 = v1 + v2; //모든 피연산자는 int 타입으로 프로그램 실행 시 자동 변환 후 연산
		System.out.println("result 1: " + result1);
		
		long result2 = v1 + v2 - v3; //long 타입으로 프로그램 실행 시 자동 변환 후 연산
		System.out.println("result 2: " + result2);
		
		double result3 =(double)v1/v2; //double 타입으로 강제 변환 후 연산
		System.out.println("result 3: " + result3);
		
		int result4 = v1 % v2;
		System.out.println("result 4: " + result4 );
	}
}