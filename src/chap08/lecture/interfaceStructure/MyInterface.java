package chap08.lecture.interfaceStructure;

public interface MyInterface {
	
	// 필드 (public static final)	
	// 선언과 동시에 값을 가진다
	public static final int i =3;
	int j=4;
	
	
	
	// 추상메소드(public abstract)
	
	abstract int methodName(int i);		// public abstract 를 쓰지않아도 추상메소드
	public abstract int methodName2();	// 메소드 선언부만 작성
	

	
	// static 메소드 (public)
	
	// 몸통이 있는 메소드
	// 인스턴스가 없어도 실행시킬수있는 메소드
	
	// 객체 생성없이 실행가능
	// 메소드 선언과 동시에 내용까지 작성가능하다
	static void methodName3() {
		System.out.println("스태틱 메소드");
		
	}
	public static void methodName5() {
		System.out.println("스태틱 메소드");
	}
	
	
	
	// default 메소드 (public)
	
	//메소드 선언과 동시에 내용까지 작성가능하다
	default void methodName4() {
		System.out.println("인스턴스 디폴트 메소드");
	}
	
	public default void methodName6() {
		System.out.println("인스턴스 디폴트 메소드");
	}
	
	
	
	

}
