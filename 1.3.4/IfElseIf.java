//Sophia
//APCSA
//10-20-2026

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name");
        String name = sc.nextLine();

        System.out.println("Enter the number");
        int grade = sc.nextInt();

        // Insert code for comparasion.
        if (grade >= 90) {
            System.out.println(name + " received an A");
        }

        else if (grade >= 80) {
            System.out.println(name + " received a B");
        }
        else if (grade >= 70) {
            System.out.println(name + " received a C");
        }
        else if (grade >= 60) {
            System.out.println(name + " received a D");
        }
        else {
            System.out.println(name + " received an F");
        }

    }
}