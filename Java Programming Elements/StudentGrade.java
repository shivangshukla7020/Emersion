import java.util.*;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt(), c = sc.nextInt(), m = sc.nextInt();
        double avg = (p + c + m) / 3.0;
        System.out.printf("Average: %.2f\n", avg);
        if (avg >= 90) System.out.println("Grade: A");
        else if (avg >= 75) System.out.println("Grade: B");
        else if (avg >= 60) System.out.println("Grade: C");
        else if (avg >= 40) System.out.println("Grade: D");
        else System.out.println("Grade: F");
    }
}