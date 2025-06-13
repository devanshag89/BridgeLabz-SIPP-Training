package JavaControlFlow;
import  java.util.*;
public class positiveNegativeZeroCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number==0) {
			System.out.print("Zero");
		}
		else if(number<0) {
			System.out.print("Negative");
		}
		else {
			System.out.print("Positive");
		}
	}

}
