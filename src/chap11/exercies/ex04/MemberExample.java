package chap11.exercies.ex04;

public class MemberExample {
	public static void main(String[] args) {
		Member member = new Member("blue","이파란");
		
		String strObj = member.toString();
		System.out.println(strObj);
		System.out.println(member);
	}

}
