import java.util.Scanner;

public class FriendsInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age and height of Amar:");
        int age1 = sc.nextInt();
        double height1 = sc.nextDouble();

        System.out.println("Enter age and height of Akbar:");
        int age2 = sc.nextInt();
        double height2 = sc.nextDouble();

        System.out.println("Enter age and height of Anthony:");
        int age3 = sc.nextInt();
        double height3 = sc.nextDouble();

        // Youngest
        String youngest = (age1 <= age2 && age1 <= age3) ? "Amar" :
                          (age2 <= age1 && age2 <= age3) ? "Akbar" : "Anthony";

        // Tallest
        String tallest = (height1 >= height2 && height1 >= height3) ? "Amar" :
                         (height2 >= height1 && height2 >= height3) ? "Akbar" : "Anthony";

        System.out.println("Youngest friend: " + youngest);
        System.out.println("Tallest friend: " + tallest);
    }
}
