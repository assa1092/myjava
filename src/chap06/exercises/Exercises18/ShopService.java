package chap06.exercises.Exercises18;

public class ShopService {
	
	private static ShopService shopService = new ShopService();
	
	
	private ShopService() {}

	 static ShopService getInstance() {
		return shopService;
	}
	
	
	
	
	
}
