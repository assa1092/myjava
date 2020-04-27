package chap09.lecture.loCalClass;

public class Outter {
	Object method(final int param) {
		final int localVar = 3;
		class Local{
			int i = localVar;
			int p =  param;
		}
//		localVar = 4;
//		param = 5;
		Local l =   new Local();
		return l;
	}
}
