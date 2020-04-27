package teacheryo.kr.co.ca;

import teacheryo.com.naver.Cat;

public class Person {
	private String ssn;
	private String name;
	private Cat[] cArr;
	
	public Person() {}
	
	
	public Person(String ssn, String name, Cat[] cArr) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.cArr = cArr;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Cat[] getcArr() {
		return cArr;
	}
	public void setcArr(Cat[] cArr) {
		this.cArr = cArr;
	}
	
	
	
}
