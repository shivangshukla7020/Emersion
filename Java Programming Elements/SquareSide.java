import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int perimeter = sc.nextInt();
        int side = perimeter / 4;

        System.out.printf("The length of the side is %d whose perimeter is %d\n", side, perimeter);
    }
}
