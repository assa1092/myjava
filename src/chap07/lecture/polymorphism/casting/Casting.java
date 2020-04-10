package chap07.lecture.polymorphism.casting;

import chap07.lecture.polymorphism.Cat;
import chap07.lecture.polymorphism.KindaCat;
import chap07.lecture.polymorphism.Tiger;

public class Casting {
	// 그림 12. 타입 캐스팅 참고...
	public static void main(String[] args) {
		Cat c = new Cat();
		Tiger t = new Tiger();
		
		KindaCat k1= c;
		KindaCat k2 = t;
		
		Cat c1 =(Cat)k1;
		Tiger t1 = (Tiger)k2;
		
		System.out.println(k1 instanceof Tiger);
		if(k1 instanceof Tiger) {
			Tiger t2 = (Tiger) k1;
			
		}
		System.out.println(k1 instanceof Cat);
		System.out.println(k1 instanceof KindaCat);		//타입확인 연산자 instanceof
		
		
		

	}

}
