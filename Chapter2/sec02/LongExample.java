package ch02.sec02;

public class LongExample {
	public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L;
//      long var3 = 1000000000000;  컴파일러는 기본적으로 int형으로 간주한다. int의 범위인 21억을 초과했기때문에 오류 발생 
        long var4 = 1000000000000L;
        
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
