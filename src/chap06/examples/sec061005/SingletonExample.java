package chap06.examples.sec061005;

public class SingletonExample {
	public static void main(String[] args) {

		// private 때문에 클래스 밖에서는 쓸수 없다...
//		 Singleton obj1 = new Singleton();
//		 Singleton obj2 = new Singleton();
		
		 
		// private 때문에 클래스 밖에서는 쓸수 없기 때문에
		// 클래스 안의 method로 접근...
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다");
		} else {
			System.out.println("다른 Singleton 객체 입니다");
		}
	}

}
