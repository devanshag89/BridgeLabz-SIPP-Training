package ConstructorsAndAccessModifiers;

public class Circle {
	private double radius;
	
	public Circle() {
		this.radius = 0.0;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public void display() {
		System.out.print("Radius: "+radius);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		Circle c2 = new Circle(4.2);
		
		c1.display();
		c2.display();
	}

}
