import java.util.Scanner;

public class TotalPurchasePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double unitPrice = sc.nextDouble();
        int quantity = sc.nextInt();

        double total = unitPrice * quantity;

        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and the unit price is INR %.2f\n", total, quantity, unitPrice);
    }
}
