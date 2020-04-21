package chap09.lecture.nestedClass;

public class MyApp {
	public static void main(String[] args) {
		NestedClass.staticM=3;
		NestedClass n = new NestedClass();
		n.instanceM=3;
		
		NestedClass.StaticClass ns =  new NestedClass.StaticClass();
//		NestedClass.OtherClass no = new NestedClass.OtherClass();
		// 인스턴스 클래스는 바깥클래스 먼저 생성후 안에있는 클래스로 접근가능
		NestedClass nc =  new NestedClass();
		NestedClass.OtherClass no = nc.new OtherClass(); 
		
	}

}
