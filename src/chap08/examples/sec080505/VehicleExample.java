package chap08.examples.sec080505;

public class VehicleExample {
	public static void main(String[] args) {
		//Vehicle vehicle = new Bus();
		Vehicle vehicle = new Taxi();
		
		vehicle.run();
//		vehicle.checkFare();		// Vehicle 인터페이스에는 checkFare()가 없음.
		
		System.out.println(vehicle instanceof Bus);
		System.out.println(vehicle instanceof Taxi);
		System.out.println(vehicle instanceof Vehicle);
		
		if(vehicle instanceof Bus) {
			
			Bus bus =  (Bus) vehicle;	// 강제 타입변환
			
			bus.run();
			bus.checkFare();			// Bus 클래스의 checkFare()를 호출
			
		}
		
	}

}
