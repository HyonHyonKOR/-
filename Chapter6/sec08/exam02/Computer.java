package ch06.sec08.exam02;

public class Computer {
	//가변길이 매개변수 value를 가진 int값을 리턴하는 sum메소드를 선언
	int sum(int ...value) {   //가변길이 매개변수 value는 아직 내부적으로는 
		                      //길이가 정해지지 않는 int형 배열 value이다 ->int[] value
		int sum=0;   //value의 인덱스의 합을 담은 int형 변수 sum를 선언한다. 
		             //위의 sum은 변수명이 아닌 메소드명의 sum이므로 중복이 아니다. 그러므로 변수에서도 사용가능하다.
		
	    for(int i=0; i<value.length;i++) {
	    	sum += value[i]; 
	    }
	    
	    
	    //합산 결과를 return
	    return sum;   
	}  
}
