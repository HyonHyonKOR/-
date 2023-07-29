package ch12.sec04;

public class InExample {

	public static void main(String[] args) throws Exception{
		int speed = 0;
		int keyCode = 0;
		
		while(true) {
			//Enter 
			if(keyCode != 13 && keyCode !=10) {
				if(keyCode == 49) {
					speed++;
				}else if(keyCode == 50) {
					speed--;
				}else if(keyCode == 51) {
					break;
				}
				
				System.out.println("-----------------------");
				System.out.println("1. speedup| 2. speeddown| 3. suspend");
				System.out.println("-----------------------");
				System.out.println("speed(now)=" + speed);
				System.out.print("select: ");
			}
			
			//read only one character
			keyCode = System.in.read();
			
		}//while finish
		System.out.println("program exit");

	}
}
