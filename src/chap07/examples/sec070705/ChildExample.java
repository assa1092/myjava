package chap07.examples.sec070705;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent =  new Child();
		
		parent.field1="data1";
		parent.method1();
		parent.method2();
		System.out.println(parent.field1);
		
		
		// 자동 타입 변환이 되어서. parent 타입을 가진다.
//		parent.field2 = "data2";
//		parent.method3();
		
		Child child = (Child)parent;
		child.field2 = "yyy";
		child.method3();
		System.out.println(child.field2);
	}

}
