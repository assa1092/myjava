package chap11.exercies.ex03;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	
	@Override
	public int hashCode() {
		
		return studentNum.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(studentNum.equals(student.getStudentNum())) {
				return true;
			}
			
		}
		return false;
		
	}
}
