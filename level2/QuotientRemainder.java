import java.util.Scanner;
public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int q = number1 / number2;
        int r = number1 % number2;
        System.out.println("The Quotient is " + q + " and Reminder is " + r + " of two number " + number1 + " and " + number2);
    }
}
