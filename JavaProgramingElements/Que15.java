package Level1Problems;
import java.util.*;
public class Que15 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double unit = sc.nextDouble();
        int qty = sc.nextInt();
        double total = unit * qty;
        System.out.println("The total purchase price is INR " + String.format("%.2f", total) + " if the quantity " + qty + " and unit price is INR " + String.format("%.2f", unit));
    }

}
