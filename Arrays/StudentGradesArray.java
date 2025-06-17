import java.util.*;
public class StudentGradesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] percents = new double[n];
        char[] grades = new char[n];
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt(), c = sc.nextInt(), m = sc.nextInt();
            if (p < 0 || c < 0 || m < 0) { i--; continue; }
            percents[i] = (p + c + m) / 3.0;
            grades[i] = percents[i] >= 90 ? 'A' : percents[i] >= 75 ? 'B' : percents[i] >= 60 ? 'C' : percents[i] >= 40 ? 'D' : 'F';
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("Percentage: %.2f, Grade: %c%n", percents[i], grades[i]);
        }
    }
}