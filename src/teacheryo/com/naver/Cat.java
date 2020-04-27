package teacheryo.com.naver;

public class Cat {
	private int id;
	private String name;
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}
	Cat( int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void run(String where) {
		System.out.println(where + "로 달린다.");
	}
	public void sleep() {
		System.out.println("잔다.");
	}

	

}
