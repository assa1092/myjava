package chap07.examples.sec070702;

public class HankookTire extends Tire {
	//field
	//constructor
	
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);

	}

	//method
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}
	
	

}
