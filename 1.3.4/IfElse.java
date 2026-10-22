//Sophia
//APCSA
//10-20-2026

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // A scanner to get user input.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name");
        String name = sc.nextLine();

        System.out.println("Enter the number");
        int grade = sc.nextInt();

        if (grade > 90){
            System.out.println(name + " received an A.");
        }

        // close Scanner when done
        sc.close();
    }
}