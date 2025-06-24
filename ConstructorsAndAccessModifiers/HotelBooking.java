package ConstructorsAndAccessModifiers;

public class HotelBooking {
	private String guestName;
	private String roomType;
	private int nights;
	
	public HotelBooking() {
		this.guestName = "none";
		this.roomType = "nome";
		this.nights = 0;
	}
	
	public HotelBooking(String name,String type,int n) {
		this.guestName = name;
		this.roomType = type;
		this.nights = n;
	}
	
	public HotelBooking(HotelBooking b) {
		this.guestName = b.guestName;
		this.roomType = b.roomType;
		this.nights = b.nights;
	}
	
	public void display() {
		System.out.println(guestName+" "+roomType+" "+nights);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HotelBooking h1 = new HotelBooking();
		
		HotelBooking h2 = new HotelBooking("Devansh","Single Bed",5);
		
		HotelBooking h3 = new HotelBooking(h2);
		
		h1.display();
		h2.display();
		h3.display();

	}

}
