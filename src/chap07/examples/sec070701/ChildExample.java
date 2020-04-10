package chap07.examples.sec070701;

public class ChildExample {
	public static void main(String[] args) {
		
		//그림 11.다형성 예제..참고..
		
		Child child = new Child();
		
		Parent parent = child;
		
		Parent parent2 = new Child2();
		
		parent.method1();
		parent.method2();
		
		parent2.method1();
		parent2.method2();
				
//		parent.method3();
	}

}
