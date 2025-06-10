import java.util.Scanner;

class Practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Practice p = new Practice();

        p.welcomeToBridgeLabs();
        p.addTwoNumbers(sc);
        p.celsiusToFahrenheit(sc);
        p.areaOfCircle(sc);
        p.volumeOfCylinder(sc);
        p.simpleInterest(sc);
        p.perimeterOfRectangle(sc);
        p.powerCalculation(sc);
        p.averageOfThreeNumbers(sc);
        p.kilometersToMiles(sc);

        sc.close();
    }

    void welcomeToBridgeLabs() {
        System.out.println("Hey there! Welcome to Bridgelabz!");
    }

    void addTwoNumbers(Scanner sc) {
        System.out.print("Enter two numbers to add: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Their sum is: " + (a + b));
    }

    void celsiusToFahrenheit(Scanner sc) {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("That's " + fahrenheit + "°F");
    }

    void areaOfCircle(Scanner sc) {
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area is: " + area);
    }

    void volumeOfCylinder(Scanner sc) {
        System.out.print("Enter the radius and height of the cylinder: ");
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("The volume is: " + volume);
    }

    void simpleInterest(Scanner sc) {
        System.out.print("Enter Principal amount, Rate of interest, and Time: ");
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + interest);
    }

    void perimeterOfRectangle(Scanner sc) {
        System.out.print("Enter length and width of the rectangle: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter is: " + perimeter);
    }

    void powerCalculation(Scanner sc) {
        System.out.print("Enter the base and exponent: ");
        double base = sc.nextDouble();
        double exponent = sc.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("Result is: " + result);
    }

    void averageOfThreeNumbers(Scanner sc) {
        System.out.print("Enter three numbers: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        double average = (x + y + z) / 3;
        System.out.println("Average is: " + average);
    }

    void kilometersToMiles(Scanner sc) {
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println("That's " + miles + " miles");
    }
}
