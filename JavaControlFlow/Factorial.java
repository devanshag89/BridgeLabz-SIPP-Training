package JavaControlFlow;
import java.util.*;
public class Factorial {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Integer = sc.nextInt();
		
		
		int factorial = 1;
		
		for(int i=1;i<=Integer;i++) {
			factorial *= i;
		}
		
		System.out.print(factorial);

	}

}
