package chap06.examples.sec060401;

public class StudentExample {
	public static void main(String[] args) {
		
		// Student라는 Class를 사용하기전에
		// Student Class 를 먼저 만들어준다.==> Student.java 로 저장...
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
	}

}
