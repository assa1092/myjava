package chap07.lecture.polymorphism.abstractKeyword;

public class AbstractApp {
	public static void main(String[] args) {
		
		//KindaCat 추상클래스로 만들어서 객체를 만들수 없다...
//		KindaCat k1 = new KindaCat();
//		k1.cry();
		
		KindaCat k2 =new Tiger();
		k2.cry();
		
		Tiger t = new Tiger();
		Cat c =  new Cat();
		t.cry();
		c.cry();
	}

}
