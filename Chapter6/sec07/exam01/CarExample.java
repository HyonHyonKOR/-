package ch06.sec07.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("그랜저", "검정", 250);
		//Car myCar = new Car(); -> 기본 생성자 호출 못함. -> 왜? 이미 생성자가 선언된 상태니까. 
		System.out.println(myCar);
	}   

}
