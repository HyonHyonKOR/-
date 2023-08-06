package ch16.sec02.exam01;

public class LambdaExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.action(() -> {
			System.out.println("Go to work");
			System.out.println("Programming");
		});
		
		person.action(()->System.out.println("get back home"));
	}

}
