package ch09.sec06.exam04;

public class Magic {
	
	public static interface Throwable{
		
		void elementball();
	}

	
	private Throwable ele;
	
	public void setElement(Throwable ele) {
		this.ele = ele;
	}
	
	public void magicBall() {
		this.ele.elementball();
	}
	
}

