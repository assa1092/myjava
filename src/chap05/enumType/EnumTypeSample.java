package chap05.enumType;

public class EnumTypeSample {
	public static void main(String[] args) {
		Language l1= Language.KOREAN;
		Language l2 = Language.CHINESE;
		
		Language l3 = Language.KOREAN;
		
		System.out.println(l1==l3);
		
	}

}
