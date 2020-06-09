package tirgol3;
/*
 * קורס בתואר
 * תכונות: נושא, מרצה,ציון,תאריך בחינה,קוד קורס
 * ציון תקין - גדול מ40 עד 100
 * 
 */
public class Course {
	private String subject;
	private String teacher;
	private double grade;
	private String dataOfExem;
	private int courseCode;
	

	public Course(String subject, String teacher, double grade, 
			String dataOfExem, int courseCode) {
		this.subject = subject;
		this.teacher = teacher;
//		this.grade = grade;
		
		setGrade(grade);
//
		this.dataOfExem = dataOfExem;
		this.courseCode = courseCode;
	}
	
	
	
	public void setGrade(double newGrade) {
		 //ציון תקין - גדול מ40 עד 100
		 if(newGrade<40) {
			 System.out.println("grade given too low");
			 this.grade=40;
		 }
		 else
			 if(newGrade>100) {
				 System.out.println("grade given too high");
				 this.grade=100;
		 }
			 else
				 this.grade=newGrade;
	}







}
