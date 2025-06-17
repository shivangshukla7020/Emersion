import java.util.*;
public class LimitedInputSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[10];
        int index = 0;
        double total = 0.0;
        while (true) {
            double num = sc.nextDouble();
            if (num <= 0 || index == 10) break;
            nums[index++] = num;
        }
        for (int i = 0; i < index; i++) total += nums[i];
        System.out.println("Sum = " + total);
    }
}