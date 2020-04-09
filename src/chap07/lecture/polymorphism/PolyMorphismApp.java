package chap07.lecture.polymorphism;

public class PolyMorphismApp {
	public static void main(String[] args) {
		Tiger t= new Tiger();
		Cat c = new Cat();
		
		t.cry();
		c.cry();

		// 부모 클래스로 타입 변환은 가능
		KindaCat c1 = t;
		KindaCat c2 = c;
		
		c1.cry();
		c2.cry();
		
		// 반대로는 X
//		t = c1;
//		c = c2;
	}

}
