package chap07.examples.sec070401;

public class Computer extends Calculator {
	@Override
	// 부모클래스의 메소드를 재정의 
	// 리턴타입 메소드명 파라미터 모두 똑같이 써야한다...
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r ;
	}

}
