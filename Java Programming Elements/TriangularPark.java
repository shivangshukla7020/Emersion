import java.util.Scanner;

class TriangularPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side1 (m): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side2 (m): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side3 (m): ");
        double side3 = sc.nextDouble();

        double perimeter = side1 + side2 + side3; // in meters
        double totalDistance = 5000; // in meters
        double rounds = totalDistance / perimeter;

        System.out.println("The total number of rounds the athlete must run is " + Math.ceil(rounds));
    }
}
