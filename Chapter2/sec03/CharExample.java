package ch02.sec03;

public class CharExample {
	public static void main(String[] args) {
         char c1 = 'A'; //문자 A를 직접 대입-> 유니코드 65로 저장됨 
         char c2 = 65;  //문자 A의 유니코드를 대입 
         
         char c3 = '가'; //문자 가를 직접 저장-> 유니코드 44032로 저장됨
         char c4 = 44032; //문자 가의 유니코드를 직접 대입
         
         System.out.println(c1);
         System.out.println(c2);
         System.out.println(c3);
         System.out.println(c4);
	}
}


//char는 정수를 문자로 출력
//''는 담을 수 없다. ''라는 기호는 유니코드에 없기 때문이다. 
//다만 ' '라는 공백문자(space)는 32번의 유니코드이므로 대입가능하다