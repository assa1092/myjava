package chap10.examples.sec100601;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException | FileNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		} 
	}
	
	public static void findClass() throws ClassNotFoundException, FileNotFoundException{
		Class clazz =  Class.forName("java.lang.String2");
		
		FileInputStream fis= new FileInputStream("");
		
		
	}

}
