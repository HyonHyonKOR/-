package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A{
	
	
	//생성자 선언
	public D() {
		super();        //부모 클래스의 생성자의 접근 제한자가 protected이므로 직접 생성자를 기재해야한다. (public,default만 기본)
		//A 생성자 호출    //하지만 super();을 통해서는 접근 가능하다.
	}
	
	//메소드 선언
	public void method1() {
		//A 필드값 변경
		this.field = "value"; //this는 A의 객체이다.
		//A 메소드 호출
		this.method();
	}
	
	//메소드 선언
	public void method2() {    //new 연산자를 통한 A 생성자의 직접적인 호출은 불가능하다
		//A a = new A();             
		//a.field = "value"
		//a.method();		
	}
}	
