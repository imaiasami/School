package vo;

public class Teacher extends Person {
	
	private String major;		// 전공과목
	
	public Teacher(String name, String ssn, int age, String major) {
		super(name, ssn, age);
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", major: " + major;
	}

}
