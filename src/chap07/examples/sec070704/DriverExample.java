package chap07.examples.sec070704;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Texi texi = new Texi();
		
		driver.drive(bus);		// 자동 타입 변환 : Vehicle vehicle = bus;
		driver.drive(texi);		// 자동 타입 변환 : Vehicle vehicle = texi;
		

	}
	
	// Vehicle 타입으로 반환해야하지만 
	// Vehicle 상속받은 Texi가 타입변환이 되어서 가능하다
	public static Vehicle getVehicle() {
		Texi t = new Texi();
		return t;
	}

}
