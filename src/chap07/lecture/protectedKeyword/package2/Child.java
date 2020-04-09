package chap07.lecture.protectedKeyword.package2;

import chap07.lecture.protectedKeyword.package1.Parent;

public class Child extends Parent {
	void method() {
		// 다른 패키지에 있어서 접근불가
//		this.defaultField = 3;
		// 상속 받아서 접근가능...
		this.protectedField=3;
	}

}
