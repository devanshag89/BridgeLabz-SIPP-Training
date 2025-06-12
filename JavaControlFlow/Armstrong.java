package JavaControlFlow;
import java.util.*;
public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int originalNumber = number;
		int sum = 0;
		
		while(number!=0) {
			int r = number%10;
			sum+= r*r*r;
			number = number/10;
		}
		
		if(sum==originalNumber) {
			System.out.print("Its a Armstrong Number");
		}
		else {
			System.out.print("Not a Armstrong Number");
		}
	}
}
