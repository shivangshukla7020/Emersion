import java.util.Scanner;

class TravelInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter from city: ");
        String fromCity = sc.nextLine();
        System.out.print("Enter via city: ");
        String viaCity = sc.nextLine();
        System.out.print("Enter to city: ");
        String toCity = sc.nextLine();

        System.out.print("Distance from " + fromCity + " to " + viaCity + " (miles): ");
        double d1 = sc.nextDouble();
        System.out.print("Distance from " + viaCity + " to " + toCity + " (miles): ");
        double d2 = sc.nextDouble();

        System.out.print("Time from " + fromCity + " to " + viaCity + " (minutes): ");
        double t1 = sc.nextDouble();
        System.out.print("Time from " + viaCity + " to " + toCity + " (minutes): ");
        double t2 = sc.nextDouble();

        double totalDistance = (d1 + d2) * 1.60934; // in kilometers
        double totalTime = t1 + t2;

        System.out.println("The total distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and total time is " + totalTime + " minutes.");
    }
}
