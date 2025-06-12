package JavaControlFlow;
import java.util.*;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number>1) {
			boolean isPrime = true;
			for(int i=2;i<number;i++) {
				if(number%i==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.print("Its a Prime Number");
				return;
			}
		}
		
		System.out.print("Not a Prime Number");
		sc.close();
	}
}
