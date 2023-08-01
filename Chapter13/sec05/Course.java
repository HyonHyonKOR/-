package ch13.sec05;

public class Course {
	//Personであれば、皆登録可能
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName());
	}
	
	//Studentであれば、登録可能
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName());
	}
	
	
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName());
	}
	
	

}
