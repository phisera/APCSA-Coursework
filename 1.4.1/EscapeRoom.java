//Sophia Liao
//APCSA
//11-5=2026

import java.util.Scanner;

/**
 * Create an escape room game where the player must navigate
 * to the other side of the screen in the fewest steps, while
 * avoiding obstacles and collecting prizes.
 */

public class EscapeRoom {
    /*
     * TO-DO: Process game commands from user input:
     * right, left, up, down: move player size of move, m, if player try to go off
     * grid or bump into wall, score decreases
     * jump over 1 space: player cannot jump over walls
     * pick up prize: score increases, if there is no prize, penalty
     * help: display all possible commands
     * end: reach the far right wall, score increase, game ends, if game ends
     * without reaching far right wall, penalty
     * replay: shows number of player steps and resets the board, player or another
     * player can play the same board
     *
     * if player land on a trap, spring a trap to increase score: the program must
     * first check if there is a trap, if none exists, penalty
     * Note that you must adjust the score with any method that returns a score
     * Optional: create a custom image for player - use the file player.png on disk
     */

    public static void main(String[] args) {
        // welcome message
        System.out.println("Welcome to EscapeRoom!");
        System.out.println("Get to the other side of the room, avoiding walls and invisible traps,");
        System.out.println("pick up all the prizes.\n");

        GameGUI game = new GameGUI();
        game.createBoard();

        // size of move
        int m = 60;
        // individual player moves
        int px = 0;
        int py = 0;

        int score = 0;

        Scanner in = new Scanner(System.in);
        String[] validCommands = { "right", "left", "up", "down", "r", "l", "u", "d",
                "jump", "jr", "jumpleft", "jl", "jumpup", "ju", "jumpdown", "jd",
                "pickup", "p", "scan", "quit", "q", "replay", "help", "?" };

        // set up game
        boolean play = true;
        while (play) {

            // get user command and validate
            System.out.print("Enter command:");
            String input = UserInput.getValidInput(validCommands);


            // Move right
            if (input.equals("right") || input.equals("r")) {
                px = m;
                py = 0;
                score += game.movePlayer(px, py);
                if (game.isTrap(0, 0)) {
                    score += game.springTrap(0, 0);
                }
            }

            // Move left
            else if (input.equals("left") || input.equals("l")) {
                px = -m;
                py = 0;
                score += game.movePlayer(px, py);
                if (game.isTrap(0, 0)) {
                    score += game.springTrap(0, 0);
                }
            }

            // Move up
            else if (input.equals("up") || input.equals("u")) {
                px = 0;
                py = -m;
                score += game.movePlayer(px, py);
                if (game.isTrap(0, 0)) {
                    score += game.springTrap(0, 0);
                }
            }

            // Move down
            else if (input.equals("down") || input.equals("d")) {
                px = 0;
                py = m;
                score += game.movePlayer(px, py);
                if (game.isTrap(0, 0)) {
                    score += game.springTrap(0, 0);
                }
            }

            // Jump right
            else if (input.equals("jump") || input.equals("jr")) {
                score += game.movePlayer(2 * m, 0);
                if (game.isTrap(0, 0)) {
                    score += game.springTrap(0, 0);
                }
            }

            // Jump left
            else if (input.equals("jumpleft") || input.equals("jl")) {
                score += game.movePlayer(-2 * m, 0);
                if (game.isTrap(0, 0)) {
                    score += game.springTrap(0, 0);
                }
            }

            // Jump up
            else if (input.equals("jumpup") || input.equals("ju")) {
                score += game.movePlayer(0, -2 * m);
                if (game.isTrap(0, 0)) {
                    score += game.springTrap(0, 0);
                }
            }

            // Jump down
            else if (input.equals("jumpdown") || input.equals("jd")) {
                score += game.movePlayer(0, 2 * m);
                if (game.isTrap(0, 0)) {
                    score += game.springTrap(0, 0);
                }
            }

            // Pick up prize/coin?
            else if (input.equals("pickup") || input.equals("p")) {
                score += game.pickupPrize();
            }

            // Replay game
            else if (input.equals("replay")) {
                System.out.println("Steps: " + game.getSteps());
                score += game.replay();
            }

            // helpppppp meeee
            else if (input.equals("help") || input.equals("?")) {
                System.out.println("Valid commands: \"right\", \"left\", \"up\", \"down\", \"r\", \"l\", \"u\", \"d\",\n" +
                        "                \"jump\", \"jr\", \"jumpleft\", \"jl\", \"jumpup\", \"ju\", \"jumpdown\", \"jd\",\n" +
                        "                \"pickup\", \"p\", \"quit\", \"q\", \"replay\", \"help\", \"?\" ");
                }

            // Quit game
            else if (input.equals("quit") || input.equals("q")) {
                play = false;
            }


            else if (input.equals("scan")) {
                System.out.println("Scanning for traps...");

                boolean foundTrap = false;

                if (game.isTrap(m, 0)) {
                    System.out.println("Trap to the RIGHT!");
                    foundTrap = true;
                }

                if (game.isTrap(-m, 0)) {
                    System.out.println("Trap to the LEFT!");
                    foundTrap = true;
                }

                if (game.isTrap(0, -m)) {
                    System.out.println("Trap ABOVE you!");
                    foundTrap = true;
                }

                if (game.isTrap(0, m)) {
                    System.out.println("Trap BELOW you!");
                    foundTrap = true;
                }

                if (!foundTrap) {
                    System.out.println("No traps nearby!");
                }
            }

            // Invalid command
            else {
                System.out.println("Invalid command!");
                score--;
            }

            System.out.println("Current score: " + score);


            /* uncomment when user quits */
            // play = false;
        }

        score += game.endGame();

        System.out.println("Your score is: " + score);
        System.out.println("Would you like to play Double or Nothing? (yes/no)");
        String choice = in.nextLine();

        if (choice.equals("yes")) {
            System.out.println("JAVA TRIVIA!");
            System.out.println("What data type is used to store true or false values?");
            System.out.println("A. int");
            System.out.println("B. boolean");
            System.out.println("C. String");
            System.out.println("D. double");

            System.out.print("Your answer (A/B/C/D): ");
            String answer = in.nextLine().toLowerCase();

            if (answer.equals("b")) {
                System.out.println("Correct! Your score is doubled!");
                score = score * 2;
            }
            else {
                System.out.println("Incorrect! Your score is now 0.");
                score = 0;
            }
        }
        else {
            System.out.println("You kept your original score.");
        }

        System.out.println("Final score=" + score);
        System.out.println("steps=" + game.getSteps());

    }
}
