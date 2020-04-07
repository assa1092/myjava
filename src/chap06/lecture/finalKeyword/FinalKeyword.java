package chap06.lecture.finalKeyword;

public class FinalKeyword {
	// 변수 앞에 붙으면
	// 값을 할당할 기회를 한번만 갖는다.
	
	final int i;
	// 변수 만들때 값을 할당 하거나
	// 생성자를 통해서 값을 할당한다.
	FinalKeyword(){
		i = 90;
	}
	
	
	void method(final int k) {
//		k=90; // final 이 붙어서 들어온값 변경 불가...
		final int i;
		i =30;
//		i = 20;	// final 이 붙어서 다시 변경할수 없다.
		
		final int j = 60;
//		j=70; // final 이 붙어서 다시 변경할수 없다.
	}
	

}
