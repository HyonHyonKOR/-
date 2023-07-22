package ch09.sec06.exam04;

public class MagicTest {

	public static void main(String[] args) {

		Magic fire = new Magic();
		
		class Fire implements Magic.Throwable{
			@Override
			public void elementball() {
				System.out.println("Fireball");
			}
		}
		
		fire.setElement(new Fire());
		
		fire.magicBall();
		
	}

}
