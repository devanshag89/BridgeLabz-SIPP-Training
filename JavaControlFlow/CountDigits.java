package JavaControlFlow;
import java.util.*;
public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int n = number;
		int digits = 0;
		
		while(n!=0) {
			digits++;
			n = n/10;
		}
		
		System.out.print("The number of digits in "+number+" are "+digits);
	}

}
