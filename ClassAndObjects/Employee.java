package ClassAndObjects;

public class Employee {
	String name;
	int id;
	int salary;
	
	public void showDetails() {
		System.out.print("Name: "+name+" Id: "+id+" Salary: "+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.name = "Devansh";
		e.id = 1;
		e.salary = 5000;
		
		e.showDetails();
	}

}
