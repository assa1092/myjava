package chap06.lecture.constructor;

public class MyMovieApp {
	public static void main(String[] args) {
		Movie m1 = new Movie();		
		System.out.println(m1.title);
		System.out.println(m1.director);
		m1.title= "기생충";
		m1.director = "봉준호";
		System.out.println(m1.title);
		System.out.println(m1.director);
		
		Movie m2 = new Movie();
		m2.title = "쥬만지";
		m2.director = "스필버그";
		
		Movie m3 = new Movie();
		System.out.println(m3.title);
		System.out.println(m3.director);
	}

}
