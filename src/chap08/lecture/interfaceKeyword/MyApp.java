package chap08.lecture.interfaceKeyword;

public class MyApp {
	// 그림 13. 다형성 - 인터페이스
	public static void main(String[] args) {
		Cat cat = new Cat();
		Malamute malamute =  new Malamute();
		
		KindaCat c1 = cat;
		KindaDog d1 = malamute;
		
		c1.cry();
		d1.howling();
		
		// 인터페이스도 자동형변환 가능
		SledDog d2 = malamute;
		d2.pull();
		
		Pet d3 = malamute;
		d3.sit();
		
		Pet c2 = cat;
		c2.sit();
		
		
		
	}

}
