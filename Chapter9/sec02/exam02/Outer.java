package ch09.sec02.exam02;

public class Outer {
	//인스턴스 멤버 클래스
	class Inner{
		//인스턴스 필드
		int field = 1;
		
		//정적 필드(Java 17부터 허용)
		//static int field2 =2;
		
		//생성자
		Inner(){
			System.out.println("Inner-Constructer Executed");
		}
		
		//인스턴스 메소드
		void innerMethod1() {
			System.out.println("InnerMethod1 Executed");
		}
		
		//정적 메소드
		//static void innerMethod2() {
			//System.out.println("InnerMethod2 Executed");
		}
	
		void useInner() {
			//Inner의 객체 생성 및 메소드 사용
			Inner inner = new Inner();
			System.out.println(inner.field);
			inner.innerMethod1();
			
			//Inner 클래스의 정적 필드 및 메소드 사용
			//System.out.println(Inner.field2);
			//Inner.innerMethod2();
		}
	}