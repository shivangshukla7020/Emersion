import java.util.*;
public class BMIBatchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] weights = new double[n], heights = new double[n], bmi = new double[n];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextDouble();
            heights[i] = sc.nextDouble();
            heights[i] /= 100;
            bmi[i] = weights[i] / (heights[i] * heights[i]);
            status[i] = bmi[i] < 18.5 ? "Underweight" : bmi[i] < 25 ? "Normal" : bmi[i] < 30 ? "Overweight" : "Obese";
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("Height: %.2f m, Weight: %.1f kg, BMI: %.2f, Status: %s%n", heights[i], weights[i], bmi[i], status[i]);
        }
    }
}