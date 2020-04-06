package chap06.lecture.method.parameter;

public class Method2 {
	
	void method1() {
		// 파라미터 없음
		System.out.println("파라미터 없는 메소드");
	}
	
	void method2(int i) {
		// 파라미터 int 하나
		System.out.println("파라미터 int 하나");
	}
	
	void triple(int i) {
		System.out.println(i*3);
	}
	
	void plus(int i, int j) {	//parameter, 인자 
		int k=0;
		System.out.println(i+j); //argument
	}
	
	void triple2(double d) {
		System.out.println(d*3.0);
	}

}
