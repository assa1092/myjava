package chap06.examples.sec060602;

public class MyMovieApp {
	public static void main(String[] args) {
		Movie m1 = new Movie();
		m1.title = "기생충";
		m1.director = "봉준호";
//		m1.actor = "송강호";
		m1.actor = new Actor();
		m1.actor.name = "송강호";
		m1.actor.age = 12;	
		
		System.out.println(m1.title);
		System.out.println(m1.director);
		System.out.println(m1.actor.name);
		System.out.println(m1.actor.age);
		
	}

}
