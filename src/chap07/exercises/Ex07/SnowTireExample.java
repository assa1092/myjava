package chap07.exercises.Ex07;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();		// snowTire의 인스턴스생성 
		Tire tire = snowTire;					// snowTire의 인스턴스를 갖는다.
		
		
		// 둘다 같은 인스턴스
		snowTire.run();
		tire.run();		// 자식클래스에서 재정의된 메서드가 호출
	}
}
