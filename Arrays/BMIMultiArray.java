import java.util.*;
public class BMIMultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] data = new double[n][3];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            double w = sc.nextDouble(), h = sc.nextDouble();
            if (w <= 0 || h <= 0) { i--; continue; }
            h /= 100;
            double bmi = w / (h * h);
            data[i][0] = w;
            data[i][1] = h;
            data[i][2] = bmi;
            status[i] = bmi < 18.5 ? "Underweight" : bmi < 25 ? "Normal" : bmi < 30 ? "Overweight" : "Obese";
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("Weight: %.1f kg, Height: %.2f m, BMI: %.2f, Status: %s%n",
                data[i][0], data[i][1], data[i][2], status[i]);
        }
    }
}