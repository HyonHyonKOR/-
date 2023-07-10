package ch07.sec04.exam02;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirPlane sa = new SupersonicAirPlane();
		sa.takeOff();
		sa.fly(); 
		sa.flyMode = SupersonicAirPlane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirPlane.NORMAL;
		sa.fly();
		sa.land();	
	}
}

//두 개의 상수를 통해서 상태 필드를 설정하고, 메소드는 두 개의 케이스를 나눈다.  