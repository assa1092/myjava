package chap06.exercises.Exercises13;

public class Member {

	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String id;
	String password;
	int age;
	
	void member(String name, String id) {
		this.name = name;
		this.id = id;
	}

}
