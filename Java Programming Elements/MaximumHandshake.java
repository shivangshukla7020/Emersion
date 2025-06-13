import java.util.*;
class MaximumHandshake{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int noOfStudents = sc.nextInt();

        System.out.println((noOfStudents*(noOfStudents-1))/2);
    }
}