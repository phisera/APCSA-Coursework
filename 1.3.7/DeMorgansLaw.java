//Sophia Liao
//APCSA
//10-28-2026

import java.util.Scanner;

public class DeMorgansLaw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 'true' or 'false' for A");
        boolean a = sc.nextBoolean();

        System.out.println("Enter 'true' or 'false' for B");
        boolean b = sc.nextBoolean();

        System.out.println("\n not (a and b) == (not a) or (not b)");

        // !(a && b)
        boolean expression1 = !(a && b);
        if (expression1) {
            System.out.println("Result for !(a && b): true (It is not the case that both are true)");
        } else {
            System.out.println("Result for !(a && b): false (Both A and B are true)");
        }

        // !a || !b
        boolean expression2 = !a || !b;
        if (expression2) {
            System.out.println("Result for (!a || !b): true (At least one variable is false)");
        } else {
            System.out.println("Result for (!a || !b): false (Neither variable is false)");
        }

        if (expression1 == expression2) {
            System.out.println("Both expressions match");
        } else {
            System.out.println("Expressions do not match");
        }

        System.out.println("\nnot (a or b) == (not a) and (not b)");

        // !(a || b)
        boolean expression3 = !(a || b);
        if (expression3) {
            System.out.println("Result for !(a || b): true (Neither A nor B is true)");
        } else {
            System.out.println("Result for !(a || b): false (At least one variable is true)");
        }

        // !a && !b
        boolean expression4 = !a && !b;
        if (expression4) {
            System.out.println("Result for (!a && !b): true (Both variables are false)");
        } else {
            System.out.println("Result for (!a && !b): false (At least one variable is not false)");
        }

        if (expression3 == expression4) {
            System.out.println("Both expressions match");
        } else {
            System.out.println("Expressions do not match");
        }

        sc.close();
    }
}