package Level1Problems;
import java.util.*;
public class Que14 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double feet = sc.nextDouble();
        double yards = feet / 3, miles = yards / 1760;
        System.out.println("Distance: " + String.format("%.2f", feet) + " feet = " + String.format("%.2f", yards) + " yards = " + String.format("%.5f", miles) + " miles");
    }

}
