package ch02.sec01;

public class VariableExchangeExample {
	public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x:" + x + ",y:" + y);
        
        int temp = x;  //int형 변수 temp에는 int형 변수 x의 값을 담는다. temp=3
        x = y; // (int형 변수) x에는 (int형 변수) y의 값을 담는다 x->5   reference: line 6
        y = temp; // (int형 변수)y에는 (int형 변수) temp의 담는다 y->3  reference: line 9
        System.out.println("x:" + x + ",y:" + y);
		
		
	}

}
