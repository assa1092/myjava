package chap07.lecture.polymorphism.sample;

import java.util.Scanner;

public class Overwatch {
	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);
		System.out.println("캐릭터>");
		String select =  scanner.nextLine();
		
		Hero hero = getHero(select);
		
		hero.onclick();
		
	}

	private static Hero getHero(String select) {
			if(select.equals("1")){
				return new Hanzo();
				
			}else {
				return new Mercy();
			}
		
	}

}
