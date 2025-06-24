package ConstructorsAndAccessModifiers;

public class Book {
	private String title;
	private String author;
	private int price;
	
	public Book() {
		this.title = "unknown";
		this.author = "unknown";
		this.price = 0;
	}
	
	public Book(String title,String author,int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book();
		System.out.print(b.title+" "+b.author+" "+b.price);
	}

}
