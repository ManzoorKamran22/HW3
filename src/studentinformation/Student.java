package studentinformation;

public abstract class Student {
	
	private String stuName;
	private int stuID;
	private int stuAge;
	private String stuGender;
	
	//Default Constructor
	public Student() {};
	
	//Constructor
	public Student(String stuName, int stuID, int stuAge, String stuGender)	//constructor
	{
		this.stuName = stuName;
		this.stuID = stuID;
		this.stuAge = stuAge;
		this.stuGender = stuGender;
	}

	
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
		//return stuName;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
		//return stuAge;
	}
	public int getStuID() {
		return stuID;
	}
	public void setStuID(int stuID) {
		this.stuID = stuID;
		//return stuID;
	}
	public String getStuGender() {
		return stuGender;
	}
	public void setStuGender(String stuGender) {
		this.stuGender = stuGender;
		//return stuGender;
	}
	
	//Abstract method
	public abstract boolean isPassing();
	


}
