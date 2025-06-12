import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        int feet = input.nextInt();

        double yards = feet / 3.0;
        double miles = yards / 1760.0;

        System.out.printf("That's %.2f yards and %.4f miles. You're going places!\n", yards, miles);
    }
}
