package ch09.sec07.exam03;

public class ButtonExample {

	public static void main(String[] args) {
		
		Button btnOk = new Button();		
	   
		btnOk.setClickListener(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("Click OK Button");
			}
		});
		
	
	    btnOk.click();
	    
	    Button btnCan = new Button();
	    
	    btnCan.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Click Cancel Button");
				
			}
		});
	    
	    btnCan.click();
	    
	    new Thread(new PrintNewThing());
	}

}

class PrintNewThing implements Runnable{
	@Override
	public void run() {
		System.out.println(1);
	}
}