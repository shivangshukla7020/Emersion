import java.util.*;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double heightCm = sc.nextDouble();
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);
        System.out.printf("BMI: %.2f\n", bmi);
    }
}