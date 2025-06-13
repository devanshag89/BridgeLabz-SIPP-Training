package JavaControlFlow;
import java.util.*;
public class sumUntill0orNegative {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		while(true) {
			int n = sc.nextInt();
			if(n<=0) {
				System.out.print(sum);
				break;
			}
			
			sum += n;
		}
	}
}
