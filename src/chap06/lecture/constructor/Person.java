package chap06.lecture.constructor;

public class Person {
	String name;
	int age;
	
	Person (String name, int age){
		this.name = name;
		//name = n;
		this.age = age;
		
		System.out.println(this.name);
		System.out.println(this.age);
	}
	

}
