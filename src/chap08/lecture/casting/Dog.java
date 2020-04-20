package chap08.lecture.casting;

public class Dog implements Pet {
	@Override
	public void sit() {
		System.out.println("개가 앉습니다");
		
	}
	
	public void bark() {
		System.out.println("월월~~~");
	}

}
