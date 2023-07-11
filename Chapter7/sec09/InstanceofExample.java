package ch07.sec09;

public class InstanceofExample {
	//main() 메소드에서 바로 호출하기 위해 정적 메소드 선언
	public static void personInfo(Person person) {   //Person 타입의 인수를 받기 위해 매개변수를 만든다.
		System.out.println("name:" + person.name);   //메소드 실행 시 인수로 받은 객체에 접근하여 객체의 필드 name을 읽는다.
		person.walk();  //객체에 접근하여 객체의 메소드 walk를 실행한다.
		
		
    //person이 참조하는 객체가 Student 타입인지 확인	
	if(person instanceof Student) { //person이 참조하는 객체가 Student 타입의 객체라면
	//Student 객체일 경우 강제 타입 변환 
     Student student = (Student)person;   //Person 타입 person을 Student로 강제 형변환을 시키고 person이 참조하는 객체를 student에 담는다. 
	//Student만 가지고 있는 필드 및 메소드 사용
	 System.out.println("StudentNo: " + student.studentNo); //student에 접근하여 객체의 필드 studentNo의 데이터를 읽는다 (출력)
	 student.study();  //student에 접근하여 Student 객체의 동작을 한다(공부)
	  }	
	}
	
	public static void main(String[] args) {
	//person 객체를 매개값으로 제공하고 personInfo() 메소드 호출
	Person p1 = new Person("홍길동");
	personInfo(p1);
	
	System.out.println();
	
	
	//매개변수의 다형성을 활용해 Student 객체를 Person 타입으로 자동 형변환(컴파일러 상, 실제 객체는 Student임)후 personInfo() 메소드 호출	
	Person p2 = new Student("김길동",10);
	personInfo(p2);
	}
  }