package ch13.sec02.exam01;

public class GenericExample {

	public static void main(String[] args) {
	
	Product<Tv, String> product1 = new Product<>() ;
	
	product1.setKind(new Tv());
	product1.setModel("Smart TV");
	
	Tv tv = product1.getKind();
	String model = product1.getModel();
	
	System.out.println(tv + " " + model);
	
	Product<Car, String> product2 = new Product<>();
	
	product2.setKind(new Car());
	product2.setModel("HONDA");
	
	Car car = product2.getKind();
	String model2 = product2.getModel();
	
	System.out.println(car + " " + model2);

	}

}
