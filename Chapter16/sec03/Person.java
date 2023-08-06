package ch16.sec03;

public class Person {
	public void action1(Workable workable) {
		workable.work("jack", "program");
	}
	
	public void action2(Speakable speakable) {
		speakable.speak("Hi");
	}
}
