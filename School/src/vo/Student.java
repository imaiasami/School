package vo;

public class Student extends Person {
	private String stdNo;		// 학번
	// 참조형 타입에서 형변환이 가능한데 상속관계일때 가능하며, 
		public Student(String name, String ssn, int age, String stdNo) {
		super(name, ssn, age);
		this.stdNo = stdNo;
	}

	//자식을 부모에 담을 수 있다. 부모를 자식에 담을 수도 있다.

	public String getStdNo() {
		return stdNo;
	}

	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", stdNo: " + stdNo;
	}

}








