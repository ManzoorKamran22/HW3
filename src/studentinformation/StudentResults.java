package studentinformation;

public class StudentResults extends Student implements Exams {
	
	public static double midtermExam;
	public static double finalExam;
	public double percent;
	
	public StudentResults() {}
	
	public StudentResults(String stuName, int stuID, int stuAge, String stuGender) {
		  
		  super(stuName, stuID, stuAge, stuGender);
		 }

	
	@Override
	public void gpaCal() {
		double total = (midtermExam + finalExam);
		this.percent = total*100/200;
		System.out.println ("Your Final Grade Percentage is: "+ percent + "%");
	}

	@Override
	public boolean isPassing() {
		if (this.percent > 75) 
			return true;
		else 
			return false;
	}

}
