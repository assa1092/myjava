package chap11.examples.sec110302;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	
	@Override
	public int hashCode() {
		System.out.println("hashCode()");
		
		return number;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equalsCode()");
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}

}
