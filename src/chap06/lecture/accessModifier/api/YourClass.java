package chap06.lecture.accessModifier.api;

public class YourClass {
	MyClass m = new MyClass();
	
	//public 붙여서 자기 자신이 접근가능
	public int i ;
	int j;
	private int k;
	
	
	void method() {
		this.i = 3;
		this.j = 4;
		this.k = 5;
	}

}
