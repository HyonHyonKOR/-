package ch09.sec02.exam02;

public class OuterExample {

	public static void main(String[] args) {
		//Outer 객체 생성
		Outer outer = new Outer();
		
		//인스턴스 메소드 호출
		outer.useInner();
		
		
	}

}
