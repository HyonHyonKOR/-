package ch16.sec03;

public class LambdaExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		person.action1((name, job) -> {
			System.out.print(name + " is ");
			System.out.println(job + "mer");
		});
		
		person.action1((name, job) -> System.out.println(name +" isn't " +
		job + "mer"));
		
		
		person.action2(content -> System.out.println("say " + content + " to me"));
	}
}
