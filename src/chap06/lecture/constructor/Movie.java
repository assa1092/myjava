package chap06.lecture.constructor;

public class Movie {
	String title;
	String director;
	
	// 생성자 : 객체를 초기화 함
	// 객체가 생성되는 순간 실행된다.
	// 보통 필드를 초기화 한다.
	// 생성자가 할일이 없으면 만들지 않아도 된다.
	// 기본적으로 만들어지기때문에...
	public Movie(){
		System.out.println("객체를 초기화 합니다.");
		title = "제목 없음";
		director = "감독 없음";
	}

}
