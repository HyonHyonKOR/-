package ch08.sec07;

public class ServiceExample {
	public static void main(String[] args) {
		//인터페이스 변수 선언과 구현 객체 대입
		Service service = new ServiceIml();
		
		//디폴트 메소드 호출
		service.defaultMethod1();
		System.out.println();
		service.defaultMethod2();
		System.out.println();
		
		//정적 메소드 호출
		Service.defaultStaticMethod1();
		System.out.println();
		Service.defaultStaticMethod2();
		System.out.println();
		
	}

}
