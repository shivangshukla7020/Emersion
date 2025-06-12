import java.util.Scanner;
public class KmToMilesInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter kilometers you walked (or ran heroically): ");
        double km = scan.nextDouble();
        double miles = km / 1.6; // close enough, right?
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km.");
    }
}
