package ch06.sec13.exam03.package1;
     
    //public class A 선언
public class A {
	//public 인스턴트 필드 선언
	public int field1;
	//default 인스턴트 필드 선언
	int field2;
	//private 인스턴트 필드 선언
	private int field3;

	
	//메소드 선언
	public void method1() {
		
	}
	
	void method2() {
		
	}
	
	private void method3() {
		
	}
	
	
	//생성자 선언
	public A() {
	   field1 = 1;
	   field2 = 1;
	   field3 = 1;   //같은 객체이므로 가장 보안이 높은 private까지 다 접근,사용,호출 가능
	    
	   method1();
	   method2();
	   method3();
		
	}
	

}
