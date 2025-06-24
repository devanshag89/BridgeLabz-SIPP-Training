package ConstructorsAndAccessModifiers;

public class CarRental {
	
	private String customerName;
	private String carModel;
	private int rentalDays;
	private int costPerDay = 50;
	
	public CarRental(String name,String model,int days) {
		this.customerName = name;
		this.carModel = model;
		this.rentalDays = days;
	}
	
	public int getCost() {
		int cost = this.rentalDays*this.costPerDay;
		return cost;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarRental c = new CarRental("Devansh","Ertiga",5);
		System.out.print(c.getCost());
	}

}
