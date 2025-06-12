package JavaControlFlow;
import java.util.*;
public class SpringSeason {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int month = sc.nextInt();
		
		if(month>=3 && month<=6) {
			if((month==3 && day<20) || (month==6 && day>20)) {
				System.out.print("Not a Spring season");
				return;
			}
			
			System.out.print("Its a Spring Season");
			return;
		}
		
		System.out.print("Not a Spring season");
	}
}
