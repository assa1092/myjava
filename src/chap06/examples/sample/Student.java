package chap06.examples.sample;

public class Student {
	String name;
	int korean;
	int english;
	int math;
	
	Student(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		
	}

	int getMaxScore() {
		int max = korean > english ? korean : english;
		max  = max> math ? max :math;

		return max;
	}

	double getAvg() {
		double avg = korean + english+math/3.0;
		
		return avg;
	}

}
