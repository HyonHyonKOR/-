package ch16.sec02.exam02;

public class ButtonExample {

	public static void main(String[] args) {
		
		Button btnOk = new Button();
		
		btnOk.setClickListener(() -> {
			System.out.println("OK");
		});
		
		btnOk.click();
		
		Button btnCancel = new Button();
		
		btnCancel.setClickListener(() -> {
			System.out.println("Cancel");
		});
		
		btnCancel.click();
	}

}
