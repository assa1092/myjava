package chap07.lecture.protectedKeyword.package2;

import chap07.lecture.protectedKeyword.package1.Parent;

public class OtherChild {
	public static void main(String[] args) {
		
		// 다른 패키지에 있기때문에 import 해줘야 한다....
		Parent p = new Parent();
		
		
//		p.defaultField = 3;
//		p.protectedField =3;
		
	}

}
