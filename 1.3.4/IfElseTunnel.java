//Sophia
//APCSA
//10-20-2026

import java.util.Scanner;

public class IfElseTunnel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isValidInput = false;
        boolean hasCandle = false;

        // The while loop should keep asking for input until the user provides a P or an E
        while (!isValidInput) {
            System.out.println("You are in a room with a small table and a lit candle.  There is a entrance to a tunnel to the east.  What would you like to do?");
            System.out.println("(P) Pick up the candle and enter the tunnel");
            System.out.println("(E) Enter the tunnel");
            String choice = sc.nextLine();

            if (choice.equals("P") | choice.equals("E")) {
                isValidInput = true;
            }

            if (choice.equals("P")) {
                hasCandle = true;
            }

            if (choice.equals("E") & hasCandle == false) {
                System.out.println("You enter the tunnel and quickly find yourself lost.");
            }

            if (choice.equals("P") && hasCandle == true) {
                System.out.println("You enter the tunnel and can clearly see the walls and flooring from the candlelight.");
            }
        }

        /* Your code here to use the boolean variables to print messages. */

    }
}
