package ch08.sec07;

public interface Service {
	
	//default method 
		default void defaultMethod1() {
			System.out.println("defaultMethod1");
			defaultCommon();
		}
		
		default void defaultMethod2() {
			System.out.println("defaultMethod2");
			defaultCommon();
		}
		
	//private method
		private void defaultCommon() {
			System.out.println("defaultMethod1SameCode");
			System.out.println("defaultMethod2SameCode");
		}
		
	//default method 
		static void defaultStaticMethod1() {
			System.out.println("defaultStaticMethod1");
			defaultStaticCommon();
		}
		
		static void defaultStaticMethod2() {
			System.out.println("defaultStaticMethod2");
			defaultStaticCommon();
		}
		
	//private method
		private static void defaultStaticCommon() {
			System.out.println("defaultStaticMethod1SameCode");
			System.out.println("defaultStaticMethod2SameCode");
		}
}
