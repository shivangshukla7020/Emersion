import java.util.*;
public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) nums[i] = sc.nextInt();
        for (int num : nums) {
            if (num > 0) System.out.println(num + (num % 2 == 0 ? " is Even" : " is Odd"));
            else if (num < 0) System.out.println(num + " is Negative");
            else System.out.println("Zero");
        }
        if (nums[0] == nums[4]) System.out.println("First and last are equal");
        else if (nums[0] > nums[4]) System.out.println("First is greater than last");
        else System.out.println("First is less than last");
    }
}