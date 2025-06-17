import java.util.*;
public class MatrixToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt(), idx = 0;
        int[][] matrix = new int[r][c];
        int[] flat = new int[r * c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                matrix[i][j] = sc.nextInt();
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                flat[idx++] = matrix[i][j];
        for (int num : flat) System.out.print(num + " ");
    }
}