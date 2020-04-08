package chap06.lecture.packageKeyword;


import java.awt.List;
//import java.util.List;
//import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;

// 다른 패키지의 클래스를 가져다 쓴다고 선언해 준것
import chap06.lecture.packageKeyword.subPackage.YourClass;

public class MyApp {
	public static void main(String[] args) {
		// 원래는 이렇게 써야하는데
		// 구분을 안해도 명확할시에는 생략도 가능
		chap06.lecture.packageKeyword.MyClass c1 = 
				new chap06.lecture.packageKeyword.MyClass();
		MyClass c2 = new MyClass();
		
		
		// 다른 패키지에 있는 클래스를 쓸려면 경로를 지정해야한다.
		chap06.lecture.packageKeyword.subPackage.YourClass c3 = 
				new chap06.lecture.packageKeyword.subPackage.YourClass();
		
		// 위에 import 로 경로를 알려주었으므로 그냥 써도된다.
		YourClass c4 = new YourClass();
		
		chap06.lecture.packageKeyword.subPackage.MyClass c5 = 
				new chap06.lecture.packageKeyword.subPackage.MyClass();
		
		java.util.Scanner scanner1 = new java.util.Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		
//		java.awt.List list;
//		java.util.List list2;
		
		List list3;
		
		String str="";
		
		double d=Math.random();
		int i = abs(10-11);
		
		
	}

}
