package Level1Problems;
import java.util.*;
public class Que9 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fee = sc.nextDouble(), discountPercent = sc.nextDouble();
        double discount = fee * discountPercent / 100;
        System.out.println("The discount amount is INR " + String.format("%.2f", discount) + " and final discounted fee is INR " + String.format("%.2f", fee - discount));
    }

}
