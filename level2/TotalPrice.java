import java.util.Scanner;
public class TotalPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double unitPrice = input.nextDouble();
        int quantity = input.nextInt();
        double total = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + total + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}
