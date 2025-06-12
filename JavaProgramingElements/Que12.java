package Level1Problems;
import java.util.*;
public class Que12 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble(), height = sc.nextDouble();
        double areaCm = 0.5 * base * height, areaIn = areaCm / 6.4516;
        System.out.println("Area: " + String.format("%.2f", areaCm) + " cm², " + String.format("%.2f", areaIn) + " in²");
    }

}
