package chap06.lecture.constructor;

public class MyPersonApp {
	public static void main(String[] args) {
		Person p1 =  new Person("아이언맨", 40);
//		p1.name = "아이언 맨";
//		p1.age = 40;
//		System.out.println(p1.name);
//		System.out.println(p1.age);
		
		
		Person p2 = new Person("블랙팬서", 50);
//		p2.name = "블랙팬서";
//		p2.age =  50;
//		System.out.println(p2.name);
//		System.out.println(p2.age);
		
		p2.name = "블랙위도우";
//		System.out.println(p2.name);
		
				
	}

}
