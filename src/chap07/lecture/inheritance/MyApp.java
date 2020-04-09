package chap07.lecture.inheritance;

public class MyApp {
	public static void main(String[] args) {
		Child c = new Child();
		c.i = 30;
		c.method();
		
		// 상속에 상속 가능하다...
		GrandChild g = new GrandChild();
		g.i=40;
		g.method();
	}

}
