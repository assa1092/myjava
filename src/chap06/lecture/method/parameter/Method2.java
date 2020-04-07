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
	
	// int...n 은 첫번째 파라미터로 들어갈수없다... 무조건 젤 뒤쪽...
	void max2(boolean b, int...n ) {
		
	}
	
	
	
	// 어떤 타입의 값을 몇개나 받을지 정확히 모를때...
	// int... n // 배열 타입
	void max(int... n) {
		int intmax=0;
		System.out.println();
		for (int i = 0; i <n.length;i++) {
			System.out.println(n[i]);
						
		}
		for (int v : n) {
			intmax = intmax < v ? v : intmax;
		}
		System.out.println("최고점수는 : "+intmax);
	}

}
