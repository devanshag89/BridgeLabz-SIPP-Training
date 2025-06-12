package Level1Problems;

public class Que7 {
	public static void main(String[] args) {
        double r = 6378;
        double km3 = (4.0 / 3) * Math.PI * Math.pow(r, 3);
        double mile3 = km3 / Math.pow(1.6, 3);
        System.out.println("The volume of earth in cubic kilometers is " + String.format("%.2f", km3) + " and cubic miles is " + String.format("%.2f", mile3));
    }

}
