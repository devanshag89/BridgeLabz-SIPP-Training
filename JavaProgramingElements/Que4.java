package Level1Problems;

public class Que4 {
	public static void main(String[] args) {
        int cp = 129, sp = 191;
        int profit = sp - cp;
        double percent = (profit * 100.0) / cp;
        System.out.println("The Cost Price is INR " + cp + " and Selling Price is INR " + sp);
        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + String.format("%.2f", percent) + "%");
    }

}
