package ch12.sec11.exam03;

public class GetResourceExample {

	public static void main(String[] args) {
		Class classInfo = Car.class;
		
		String photo1Path = classInfo.getResource("photo1.jpg").getPath();
		String photo2Path = classInfo.getResource("images/photo2.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);

	}

}
