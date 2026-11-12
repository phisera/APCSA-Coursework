//Sophia Liao
//APCSA
//11-11-2026

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        countByTwo();
        decrement();
        scope();
        colorIterator();
        compoundWord();
    }

    public static void countByTwo() {
        for (int i = 0; i <= 10; i+=2) {
            System.out.println(i);
        }
    }

    public static void decrement() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void scope() {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Output finished, i=" + i);
    }

    public static void colorIterator() {
        String str = "Red Green Blue";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(i, i + 1));
        }
    }

    public static void compoundWord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two words one at a time.");

        String name = "";
        for (int i = 0; i < 2; i++) {
            String input = sc.nextLine();
            name += input;
        }
        System.out.println("compound word:" + name);
    }

    public static void whileAndFor1() {
        int i = -10;
        while (i <= 10) {
            System.out.println(i);
            i += 1;
        }

        for (int j = -10; j <= 10; j++) {
            System.out.println(j);
        }
    }

    public static void whileAndFor2() {
        int i = -10;
        while (i <= 10) {
            System.out.println(i);
            i += 1;
        }

        for (int j = 0; j <= 50; j += 5) {
            System.out.println(j);
        }

        int k = 0;
        while (k <= 50) {
            System.out.println(k);
            k += 5;
        }
    }
}