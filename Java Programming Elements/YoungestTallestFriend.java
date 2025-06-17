import java.util.*;
public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3], heights = new int[3];
        for (int i = 0; i < 3; i++) {
            ages[i] = sc.nextInt();
            heights[i] = sc.nextInt();
        }
        int min = 0, max = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[min]) min = i;
            if (heights[i] > heights[max]) max = i;
        }
        System.out.println("Youngest: " + (min == 0 ? "Amar" : min == 1 ? "Akbar" : "Anthony"));
        System.out.println("Tallest: " + (max == 0 ? "Amar" : max == 1 ? "Akbar" : "Anthony"));
    }
}