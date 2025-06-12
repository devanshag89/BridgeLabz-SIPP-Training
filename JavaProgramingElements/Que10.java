package Level1Problems;
import java.util.*;
public class Que10 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cm = sc.nextDouble(), inches = cm / 2.54, feet = inches / 12;
        System.out.println("Your Height in cm is " + String.format("%.2f", cm) + " while in feet is " + String.format("%.2f", feet) + " and inches is " + String.format("%.2f", inches));
    }

}
