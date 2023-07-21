package ch09.sec04.exam03;

public class A {
	
  public void method1(int arg) { //final int arg
	  
	  int var = 1;              //final int var
	  
	  class B{
		  
		  void method2() {
			  System.out.println(arg);
			  System.out.println(var);
			  
			  //arg = 2;  compile error   
			  //var = 2;  compile error
			  
		  }
	  }
	  
	  B b = new B();
	  b.method2();
	  
	  //arg = 3; compile error
	  //var = 3; compile error
	  
  }

}
