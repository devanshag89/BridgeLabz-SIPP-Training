package JavaControlFlow;
import java.util.*;
public class VotingEligiblity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age>=18) {
			System.out.print("Eligible to vote");
		}
		else {
			System.out.print("Not eligible to vote");
		}
	}

}
