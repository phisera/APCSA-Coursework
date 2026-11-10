//Sophia Liao
//APCSA
//11-9-2026

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        divisibility();
        getDigits();
        frequencyCount();
        minAndMax();
        sumAndAverage();
    }

    public static void divisibility() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dividend: ");
        int dividend = sc.nextInt();
        System.out.println("Enter the divisor: ");
        int divisor = sc.nextInt();

        double a;
        a = (double) dividend;

        while (a > 0.00) {
            a = a - (double)divisor;
        }

        if (a == 0.00) {
            System.out.println("The dividend is divisible by the divisor");
        }
        else {
            System.out.println("The dividend is not divisible by the divisor");
        }

    }

    public static void getDigits() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer to see its digits: ");
        int number = sc.nextInt();
        int digit;

        while (number > 0) {
            digit = number % 10;
            System.out.println(digit);
            number = number / 10;
        }
    }

    public static void frequencyCount() {
        Scanner sc = new Scanner(System.in);
        // choose something to count: # of times the word "pink" is said.
        System.out.println("Enter a sentence and I will count shhhh...it's a secret ");
        String str = sc.nextLine();
        int count = 0;
        int i = 0;

        while (i <= str.length() - 4) {
            if (str.substring(i, i + 4).equals("pink")) {
                count++;
            }
            i++;
        }
        System.out.println("Pink appears " + count + " times.");
    }

    public static void minAndMax() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers will you enter?");
        int numValues = sc.nextInt();
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        int min = number;
        int max = number;
        int count = 1;

        while (count < numValues) {
            System.out.println("Enter a number:");
            number = sc.nextInt();

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
            count++;
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    public static void sumAndAverage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values to sum and average:");
        int numValues = sc.nextInt();
        int count = 0;
        int sum = 0;

        while (count < numValues) {
            System.out.println("Enter a non-zero number:");
            int number = sc.nextInt();

            if (number != 0) {
                sum = sum + number;
                count++;
            }
            else {
                System.out.println("No zeros mister.");
            }
        }
        double average = (double) sum / numValues;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}

