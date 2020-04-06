package chap06.lecture.method.parameter;

public class Method2App {
	public static void main(String[] args) {
		Method2 m1 =  new Method2();
		m1.method1();
		m1.method2(3);
		m1.triple(9);
		m1.plus(9,10);
		m1.triple2(3.14);
		m1.triple2(3); 	//double 아닌 int 로 받아도 형변환이 되서 double 로 된다..
	}

}
