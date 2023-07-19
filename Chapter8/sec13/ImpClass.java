package ch08.sec13;

public class ImpClass implements Interface3{
	@Override
	public void method1() {
		System.out.println("grandparents");
	}
	
	@Override
	public void method2() {
		System.out.println("parents");
	}
	
	@Override
	public void method3() {
		System.out.println("grandson");
	}

}
