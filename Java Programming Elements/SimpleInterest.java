import java.util.Scanner;

class ChocolateDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        int perChild = chocolates / children;
        int remaining = chocolates % children;

        System.out.println("Each child gets " + perChild + " chocolates, and remaining chocolates are " + remaining + ".");
    }
}
