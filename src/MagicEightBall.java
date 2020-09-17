import java.util.Scanner;
import java.util.Random;

/**
 * Magic 8 Ball
 *
 * Simple Magic 8 Ball Using Do-While Loop And Switch Statements
 *
 * @author Ethan Loev
 * @version 09/17/2020
 *
 */

public class MagicEightBall {
    static boolean isContinuing = true; // Keeps track of whether user wishes to play again

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Instantiate a new Scanner object

        do {
            Random rand = new Random(); // Instantiate a new Random object
            String question = "";
            String playAgain = "";


            int generatedNumber = rand.nextInt(5); // Generate random integer [0, 4]

            System.out.println("I am the Magic 8 ball! Ask your question:"); // Welcome prompt
            question = scanner.nextLine(); // Stores user input

            System.out.println(""); // New line
            System.out.printf("Question: %s\n", question); // Displays users' question

            switch (generatedNumber) { // Picks and displays response based on randomly generated integer
                case 0:
                    System.out.println("Response: Indeed.");
                    break;
                case 1:
                    System.out.println("Response: It does not look promising.");
                    break;
                case 2:
                    System.out.println("Response: I think you're onto something..");
                    break;
                case 3:
                    System.out.println("Response: Negative.");
                    break;
                case 4:
                    System.out.println("Response: It looks promising.");
                    break;
            }

            System.out.println("");
            System.out.println("Would you like to ask another question? (Yes/No)"); // Asks user to play again
            playAgain = scanner.nextLine();
            System.out.println("");

            switch (playAgain) { // Change value of boolean depending on user input
                case "Yes": case "yes":
                    isContinuing = true;
                    break;
                case "No": case "no":
                    isContinuing = false;
                    break;
            }
        } while (isContinuing); // Repeat if boolean is still true

        System.out.println("Thank you for playing!"); // Closing prompt

    }
}
