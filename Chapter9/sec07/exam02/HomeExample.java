package ch09.sec07.exam02;

public class HomeExample {

	public static void main(String[] args) {
		
		Home myhome = new Home();
		
		myhome.use1();
		myhome.use2();
		
		
		myhome.use3(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Turn on Audio");
				
			}
			@Override
			public void turnOff() {
				System.out.println("Turn off Audio");
			}	
			
			
		   });
		
		}
	}

