package chap09.lecture.nestedInterface;

public class MyApp {
	public static void main(String[] args) {
		ImplClass c=  new ImplClass();
		Outter.NestedInterface on = c;
	}

}
