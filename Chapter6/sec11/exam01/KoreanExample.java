package ch06.sec11.exam01;

public class KoreanExample {
	public static void main(String[] args) {
		//객체 생성 시 주민등록번호와 이름 전달
		Korean k1 = new Korean("강철중","650825-1111111");
		
		//필드값 읽기
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		//final 필드는 값을 변경할 수 없음
		//k1.nation = "USA";
		//k1.ssn = "680825-1111111"
	}

}
