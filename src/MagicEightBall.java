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

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in); // Instantiate a new Scanner object

        do {
            Random rand = new Random(); // Instantiate a new Random object
            String question;
            String playAgain;


            int generatedNumber = rand.nextInt(7); // Generate random integer [0, 4]

            System.out.println("I am the Magic 8 ball! Ask your question:"); // Welcome prompt
            question = scanner.nextLine(); // Stores user input

            Thread.sleep(1000);
            System.out.println("\n"); // New line
            System.out.printf("Question: %s\n", question); // Displays users' question
            Thread.sleep(1000);

            // Picks and displays response based on randomly generated integer
            switch (generatedNumber) {
                case 0 -> System.out.println("Response: Indeed.");
                case 1 -> System.out.println("Response: It does not look promising.");
                case 2 -> System.out.println("Response: I think you're onto something..");
                case 3 -> System.out.println("Response: Negative.");
                case 4 -> System.out.println("Response: It looks promising.");
                case 5 -> System.out.println("Response: The answer is not apparent. Try again.");
                case 6 -> System.out.println("Response: It is a possibility.");
            }

            System.out.println("\n");
            System.out.println("Would you like to ask another question? (Yes/No)"); // Asks user to play again
            playAgain = scanner.nextLine();
            System.out.println("\n");

            // Change value of boolean depending on user input
            switch (playAgain) {
                case "Yes", "yes" -> isContinuing = true;
                case "No", "no" -> isContinuing = false;
            }
        } while (isContinuing); // Repeat if boolean is still true

        System.out.println("Thank you for playing!"); // Closing prompt

    }
}
