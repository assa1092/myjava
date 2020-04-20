package chap08.lecture.casting;

public class MyApp {
	public static void main(String[] args) {
		Pet p1 = new Dog();
		Pet p2 = new Cat();
		
		p1.sit();
		p2.sit();
		
		Dog d = (Dog) p1;	// 강제 형 변환
		d.bark();
		d.sit();
	}

}
