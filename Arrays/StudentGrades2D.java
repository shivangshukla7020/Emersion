import java.util.*;
public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        double[] percent = new double[n];
        char[] grade = new char[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
                if (marks[i][j] < 0) { i--; break; }
            }
            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            grade[i] = percent[i] >= 90 ? 'A' : percent[i] >= 75 ? 'B' : percent[i] >= 60 ? 'C' : percent[i] >= 40 ? 'D' : 'F';
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("Percentage: %.2f, Grade: %c%n", percent[i], grade[i]);
        }
    }
}