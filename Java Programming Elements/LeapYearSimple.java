import java.util.*;
public class LeapYearSimple {
    public static void main(String[] args) {
        int y = new Scanner(System.in).nextInt();
        if (y >= 1582 && ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}