import java.util.Scanner;

class TotalIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary (INR): ");
        double salary = sc.nextDouble();
        System.out.print("Enter bonus (INR): ");
        double bonus = sc.nextDouble();

        double total = salary + bonus;
        System.out.println("The salary is INR " + salary + " and the bonus is INR " + bonus + ". Hence, total income is INR " + total + ".");
    }
}
