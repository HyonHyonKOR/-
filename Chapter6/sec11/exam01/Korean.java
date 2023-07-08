package ch06.sec11.exam01;

public class Korean {
	//인스턴스 field final 선언
	final String nation ="대한민국";
	final String ssn;
	
	//인스턴스 필드 선언
	String name;
	
	//생성자 선언
	Korean(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
	}
}
