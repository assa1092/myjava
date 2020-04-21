package chap09.lecture.anonymous.local;

import chap09.lecture.anonymous.MyInterface;

public class MyApp {
	public static void main(String[] args) {
		int localVar = 3;
		
		class Local{
			void method() {
				System.out.println(localVar);
			}
			
		}
		
		Local l = new Local();
		
		MyInterface mi= new MyInterface() {
			@Override
			public void method() {
				System.out.println("구현된 메소드");
				System.out.println(localVar);
				
			}
		};
	}

}
