package chap06.examples.sec061005;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	
	// private 이 클래스 안에서만 사용 가능
	private Singleton(){}
	
	static Singleton getInstance() {
		return singleton;
	}
	

}
