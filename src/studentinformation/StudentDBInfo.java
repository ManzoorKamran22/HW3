package studentinformation; //Singleton concept

public class StudentDBInfo {
private StudentDBInfo() {}
	
	public static StudentDBInfo getInstance() {
		StudentDBInfo dbLicense = new StudentDBInfo();
		return dbLicense;
	}
	
	public void databaseName() {
		System.out.println("We have Oracle Database---Where all the students information is stored");
	}	

}
