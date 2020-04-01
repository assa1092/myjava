package chap04.switchcase;

public class SwitchCase {
	public static void main(String[] args) {
		int i =3;
		
		switch (i) {
		case 1:
			System.out.println("실행되지않는 블럭");
			break;
		case 2:
			System.out.println("실행되지않는 블럭");
			break;
		case 3:
			System.out.println("실행되는 블럭");
			//break;
		case 4:
			System.out.println("case 4 블럭");
			break;

		default:
			break;
		}
		
	}

}
