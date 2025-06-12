package JavaControlFlow;
import java.util.*;
public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year>=1582) {
			if(year%4==0 && year%100!=0) {
				System.out.print("Its a Leap Year.");
				return;
			}
			else if(year%400==0) {
				System.out.print("Its a Leap Year");
				return;
			}
		}
		
		System.out.print("Not a Leap Year");
	}
}
