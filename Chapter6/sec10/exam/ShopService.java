package ch06.exam;

public class ShopService {
	
	private static final ShopService singleton = new ShopService();
	
	
	private ShopService() {
		
	}
	
	public static ShopService getInstance() {
		return singleton;
		
	}

}
