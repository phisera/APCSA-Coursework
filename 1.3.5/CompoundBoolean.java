import java.util.Scanner;

public class CompoundBoolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = sc.nextInt();

        System.out.println("Enter the second number");
        int b = sc.nextInt();

        System.out.println("Enter the third number");
        int c = sc.nextInt();

        if (a > 0 && b > 0) {
            System.out.println("Both the first and second numbers are positive.");
        }

        if (a > 10 || b > 10) {
            System.out.println("At least one of the first two numbers is greater than 10.");
        }

        if (!(a == b)) {
            System.out.println("The first and second numbers are different.");
        }

        if (a < b && b < c) {
            System.out.println("The three numbers are in increasing order.");
        }

        if ((a > 0 && b > 0) || !(c > 0)) {
            System.out.println("The first two numbers are positive, or the third number is not positive.");
        }

        sc.close();
    }
}