package chap06.lecture.sample;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
//		Student s1 = new Student("a", 50, 20, 60);
//		Student s2 = new Student("b", 40, 77, 92);
//		
//		System.out.println(s1.getMaxScore());
//		System.out.println(s1.getAvg());
//		
//		System.out.println();
//		
//		System.out.println(s2.getMaxScore());
//		System.out.println(s2.getAvg());
		
		
		Student[] students = new Student[100];
		int size = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.학생추가 | 2.통계 | 3. 종료");
			System.out.println("----------------------------");
			System.out.print("선택 > : ");
			
			String menu = scanner.nextLine();
			
			switch (menu) {
			
			case "1":
				System.out.print("이름> ");
				String name = scanner.nextLine();
				System.out.print("국어>");
				int korean = Integer.parseInt(scanner.nextLine());
				System.out.print("영어>");
				int english = Integer.parseInt(scanner.nextLine());
				System.out.print("수학>");
				int math = Integer.parseInt(scanner.nextLine());
				
				students[size] = new Student(name, korean, english, math);
				
				size++;
				
				
				break;
			case "2":
				System.out.println("이름\t국어\t영어\t수학\t최고\t평균");
				for(int i=0; i<size ; i++) {
					System.out.println(students[i].name + 
										  "\t" + students[i].korean
										+ "\t" + students[i].english
										+ "\t" + students[i].math 
										+ "\t" + students[i].getMaxScore()
										+ "\t" + students[i].getAvg()	);
				}
				
				break;
			case "3":
				run = false;
				System.out.println("프로그램 종료");
				
				break;
				

			
			}
					
		}
		
		
		
		
		
		
	}

}
