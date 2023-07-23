package ch09.sec07.exam02;

public class Home {
	//field + Anonymous 
	private RemoteControl rc = new RemoteControl() {
		@Override
		public void turnOn() {
		  System.out.println("Turn on TV");	
		}
		@Override
		public void turnOff() {
		  System.out.println("Turn off TV");	
		}
	};
	
	//method (use field)
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	//method (use local variable)
	public void use2() {
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Turn on Aircon");	
			}
			@Override
			public void turnOff() {
			    System.out.println("Turn off Aircon");	
			}
		};
		rc.turnOn();
		rc.turnOff();
	}
	
	//method (use parameter)
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
