package chap03.exercises;

public class Exercise05 {
	public static void main(String[] args) {
		int value = 356;
		System.out.println(value/100*100);
		value -=value%100;
		System.out.println(value);
	}

}
