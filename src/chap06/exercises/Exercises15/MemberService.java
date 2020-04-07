package chap06.exercises.Exercises15;

public class MemberService {
	String name;
	String id;
	String password;
	int age;
	
	void members(String name, String id) {
		this.name = name;
		this.id = id;
		
	}
	boolean login(String id, String password) {
		if(id =="hong" && password=="12345") {
			return true;
		}
		return false;
		
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
		
	}

}
