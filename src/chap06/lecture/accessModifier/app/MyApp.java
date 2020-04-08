package chap06.lecture.accessModifier.app;

import chap06.lecture.accessModifier.api.YourClass;

public class MyApp {
	YourClass y = new YourClass();
//	chap06.lecture.accessModifier.api.MyClass m
	
	void method() {
		y.i = 3;
//		y.j = 4;
//		y.k = 5 // private 붙어서 접근 불가...
	}

}
