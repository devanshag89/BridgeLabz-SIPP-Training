package ConstructorsAndAccessModifiers;

public class Course {
	private String courseName;
	private int duration;
	private int fees;
	
	private static String institution = "GLA UNIVERSITY";
	
	public Course(String name,int dur,int fees) {
		this.courseName = name;
		this.duration = dur;
		this.fees = fees;
	}
	
	public void displayCourse() {
		System.out.println(courseName+" "+duration+" "+fees+" "+institution);
	}
	
	public static void changeInstitution(String ins) {
		institution  = ins;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course c = new Course("B.Tech",4,1100000);
		
		c.displayCourse();
		
		Course.changeInstitution("GL BAJAJ");
		
		c.displayCourse();

	}

}
