package chap06.lecture.accessModifier.api;

 class MyClass {
	 
	 void method() {
		 YourClass y = new YourClass();
		 y.i=3;
		 y.j=4;
//		 y.k=5;	// private 가 붙어서 접근 불가...
	 }

}
