package ch08.sec13;

public class SealedExample {

	public static void main(String[] args) {
		ImpClass imp = new ImpClass();
		
		Interface interface1= imp;
		interface1.method1();
		
		System.out.println();
		
		Interface2 interface2 = imp;
		interface2.method1();
		interface2.method2();
		
		System.out.println();
		
		Interface3 interface3 = imp;
		interface3.method1();
		interface3.method2();
		interface3.method3();
		
	}

}
