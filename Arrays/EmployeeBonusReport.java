import java.util.*;
public class EmployeeBonusReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10], newSalary = new double[10], bonus = new double[10];
        int[] service = new int[10];
        double totalBonus = 0, totalOld = 0, totalNew = 0;
        for (int i = 0; i < 10; i++) {
            salary[i] = sc.nextDouble();
            service[i] = sc.nextInt();
            if (salary[i] <= 0 || service[i] < 0) { i--; continue; }
            bonus[i] = service[i] > 5 ? salary[i] * 0.05 : salary[i] * 0.02;
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOld += salary[i];
            totalNew += newSalary[i];
        }
        System.out.printf("Total Bonus: %.2f, Total Old Salary: %.2f, Total New Salary: %.2f%n", totalBonus, totalOld, totalNew);
    }
}