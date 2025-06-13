import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            double input = sc.nextDouble();
            if (input == 0.0) break;
            total += input;
        }

        System.out.println("Total sum is " + total);
    }
}
