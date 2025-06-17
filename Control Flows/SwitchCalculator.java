import java.util.*;
public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double first = sc.nextDouble(), second = sc.nextDouble();
        String op = sc.next();
        switch (op) {
            case "+": System.out.println(first + second); break;
            case "-": System.out.println(first - second); break;
            case "*": System.out.println(first * second); break;
            case "/": System.out.println(second != 0 ? first / second : "Cannot divide by zero"); break;
            default: System.out.println("Invalid Operator");
        }
    }
}
