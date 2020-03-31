package chap03.ternary;

public class Conditinal {
	public static void main(String[] args) {
		// 1항 ? 2항 : 3항 →2항 또는 3항
		
		// 1항이 true 이면 2항
		// 1항이 false 이면 3항
		
		int i = (true ? 3 : 4);
		System.out.println(i);
		i = (false ? 3 : 4);
		System.out.println(i);
	}

}
