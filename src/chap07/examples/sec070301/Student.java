package chap07.examples.sec070301;

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		// parameter 없는 생성자 없으면 문제가 생긴다...
		// parameter 없는 생성자를 만들던지 
		// 아니면 묵시적으로 super()생성자를 사용해야한다...
		
		super(name, ssn);		// 부모 생성자 호출
		this.studentNo = studentNo;
	}

}
