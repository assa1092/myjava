package chap09.lecture.anonymous;

public class MyApp {
	public static void main(String[] args) {
		Parent p1 =  new Parent();
		Parent p2 = new Child();
		Parent p3 =  new Parent() {
			@Override
			void method() {
				System.out.println("annonymous method");
				
			}
		};
		
		p1.method();
		p2.method();
		p3.method();
	}

}
