package ch09.sec06.exam03;

public class ButtonExample {

	public static void main(String[] args) {
		
		Button btnOk = new Button();
		
		
		class OkListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("OK");
			}
	 	  }
		
	   
		btnOk.setClickListener(new OkListener());
		
	   
	    btnOk.click();
	    
	   //-----------------------------------------------------

	    
	    Button btnCan = new Button();
	    
	    class CancelListner implements Button.ClickListener{
	    	@Override
	    	public void onClick() {
	    		System.out.println("CANCEL");
	    	}
	    }
	    
	    btnCan.setClickListener(new CancelListner());
	    
	    btnCan.click();
	    
	}

}
