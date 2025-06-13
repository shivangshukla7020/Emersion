import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Enter a positive integer.");
            return;
        }

        int counter = 1;
        while (counter < number) {
            if (number % counter == 0) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
