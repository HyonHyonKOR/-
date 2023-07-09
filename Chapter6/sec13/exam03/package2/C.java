package ch06.sec13.exam03.package2;  //다른 패키지에서 클래스의 필드와 메소드 접근

import ch06.sec13.exam03.package1.*;   

public class C {
	public C() {
		//객체 생성
		A a = new A();
		
		//필드값 변경
		a.field1 = 1;
//		a.field2 = 1;  //(default이므로 필드 접근 불가)
//		a.field3 = 1;  //(private이므로 필드 접근 불가)
		
		//메소드 호출
		a.method1();
//		a.method2();  //(default이므로 메소드 접근 불가)
//		a.method3();  //(private이므로 메소드 접근 불가)
	}

}
