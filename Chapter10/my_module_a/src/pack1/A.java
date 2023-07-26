package pack1;

import pack2.B1;
import pack3.C;

public class A {
	//field
	//constructor
	//method
	public void method() {
		System.out.println("A-method");
		
		B1 b = new B1();
		b.method();
	}	
	
	public C getC() {
		C c = new C();
		return c;
	}
	
}
