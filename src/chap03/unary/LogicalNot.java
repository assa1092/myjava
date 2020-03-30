package chap03.unary;

public class LogicalNot {
	public static void main(String[] args) {
		boolean a = true;
		
		boolean b= !a;
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		
		boolean c = false;
		b = !c;
		System.out.println("b = " +b);
		System.out.println("c = " +c);
		
		
	}

}
