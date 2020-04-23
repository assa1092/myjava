package chap11.examples.sec110301;

public class Member {
	public String id;
	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		// 매개값이 Member 타입인지 확인
		if(obj instanceof Member) {
			Member member = (Member) obj;
			// Member타입으로 강제 타입변환하고 
			// id필드값이 동일한지 검사한후, 동일하다면 true 리턴.
			if(id.equals(member.id)) {
				return true;
			}
		}
		// 매개값이 Member 타입이 아니거나 id 필드값이 다른 경우 false 리턴
		return false;
		
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id.hashCode();
	}
	
}
