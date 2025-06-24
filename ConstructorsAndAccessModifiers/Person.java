package ConstructorsAndAccessModifiers;

public class Person {
	private String name;
	private int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(Person p) {
		this.name = p.name;
		this.age = p.age;
	}
	
	public void display() {
		System.out.println("Name: "+this.name+" Age: "+this.age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Devansh",21);
		Person p2 = new Person(p1);
		
		p1.display();
		p2.display();
	}

}
