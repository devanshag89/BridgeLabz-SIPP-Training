package ConstructorsAndAccessModifiers;

public class Product {
	private String productName;
	private int price;
	
	private static int totalProducts;
	
	public Product(String name,int price) {
		this.productName = name;
		this.price = price;
		totalProducts++;
	}
	
	public void displayProduct() {
		System.out.println(this.productName+" "+this.price);
	}
	
	public static void totalProducts() {
		System.out.println(totalProducts);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("Laptop",40000);
		Product p2 = new Product("Mouse",1000);
		
		p1.displayProduct();
		p2.displayProduct();
		Product.totalProducts();
	}

}
