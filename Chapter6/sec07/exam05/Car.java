package ch06.sec07.exam05;

public class Car {
	//필드를 선언한다
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(String model){
		//21라인 생성자 호출
		this(model,"은색",250);
		System.out.println("인스턴스 1 생성 완료");
	}
	
	Car(String model,String color){
		//21라인 생성자 호출
		this(model,color,250);
	}
	
	
	Car(String model,String color,int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed=maxSpeed;
	}

}
