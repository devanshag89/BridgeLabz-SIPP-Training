package ConstructorsAndAccessModifiers;

public class Student {
	
	public int rollNo;
	protected String name;
	private double CGPA;
	
	public Student(int rollNo,String name,double CGPA) {
		this.rollNo = rollNo;
		this.name = name;
		this.CGPA = CGPA;
	}
	
	public double getCGPA() {
		return this.CGPA;
	}
	
	public void setCGPA(double CGPA) {
		this.CGPA = CGPA;
	}
	
	public void displayStudent() {
		System.out.println(name+" "+rollNo+" "+CGPA);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(1,"Devansh",8.64);
		
		s.displayStudent();
		s.setCGPA(8.69);
		System.out.println(s.getCGPA());
		
		PostgraduateStudent ps = new PostgraduateStudent(2,"Akshay",7.9,"CSE");
		
		ps.displayPostGraduateStudent();
	}

}

class PostgraduateStudent extends Student{
	private String specialization;
	
	public PostgraduateStudent(int rollNo,String name,double CGPA,String special) {
		super(rollNo,name,CGPA);
		this.specialization = special;
	}
	
	public void displayPostGraduateStudent() {
		System.out.print(name+" "+rollNo+" "+getCGPA()+" "+specialization);
	}
}
