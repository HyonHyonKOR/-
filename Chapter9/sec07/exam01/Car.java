package ch09.sec07.exam01;

public class Car {
	//field
	private Tire tire1 = new Tire();
	
	//field + anonymous object
	private Tire tire2 = new Tire() {
	    @Override
		public void roll() {
	    System.out.println("tire ???1 is rolling ");	
	      }
	    };
		
    //method(use field)	    
    public void run1() {
	   tire1.roll();
	   tire2.roll();
      }
   
    //method + anonymous object (use local variable)
    public void run2() {
	   Tire tire = new Tire() {
	   @Override
	   public void roll() {
			System.out.println("tire ???2 is rolling ");
		  }
	   };	   
	    tire.roll(); 
	  }
	   
	   
    //method + anonymous object (use Parameter)
    public void run3(Tire tire) {
	   tire.roll();
    }

}//class
  
   
