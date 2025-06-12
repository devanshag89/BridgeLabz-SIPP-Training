package JavaControlFlow;
import java.util.*;
public class sumOfNaturalNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number>0) {
			int sum = 0;
			for(int i=1;i<=number;i++) {
				sum += i;
			}
			
			System.out.print("The sum of "+number+" natural numbers is "+ sum);
		}
		
		else {
			System.out.print(number+" is not a natural number");
		}
	}
}
