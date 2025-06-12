package Level1Problems;
import java.util.*;
public class Que8 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter km: ");
        double km = sc.nextDouble(), miles = km / 1.6;
        System.out.println("The total miles is " + String.format("%.2f", miles) + " mile for the given " + String.format("%.2f", km) + " km");
    }

}
