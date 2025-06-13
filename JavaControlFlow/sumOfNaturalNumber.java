package JavaControlFlow;
import java.util.*;
public class sumOfNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number>0) {
			int sum1 = number*(number+1)/2;
			int sum2 = 0;
			while(number!=0) {
				sum2 += number;
				number--;
			}
			
			
			if(sum1==sum2) {
				System.out.print("Both results are correct and same and the sum is "+sum1);
			}
		}
		
		else System.out.print("Not a natural number");
	}

}
