package ch07.sec08.exam02;

public class Taxi extends Vehicle {
	//인스턴스 메소드 재정의
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
