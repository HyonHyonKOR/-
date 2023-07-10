package ch07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		//Driver 객체 생성
		Driver driver = new Driver();
		
		//drive는 인스턴스 메소드이므로 Bus의 객체 생성 후, 매개변수에 객체의 참조값을 대입  
		Bus bus = new Bus();
		driver.drive(bus);
		
		//drive는 인스턴스 메소드이므로 taxi의 객체 생성 후,매개변수에 객체의 참조값을 대입
		Taxi taxi = new Taxi();
		driver.drive(taxi);
	}
}
