import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(100) + 1;
        int attempts = 0;
        int maxAttempts = 5;
        boolean guessed = false;

        System.out.println("=== Welcome to the Number Guessing Game ===");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("You have " + maxAttempts + " attempts.\n");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = sc.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                System.out.println("🎉 Congratulations! You guessed the number in " + attempts + " attempts.");
                guessed = true;
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            System.out.println("Attempts left: " + (maxAttempts - attempts) + "\n");
        }

        if (!guessed) {
            System.out.println("😔 Sorry, you've used all attempts.");
            System.out.println("The correct number was: " + randomNumber);
        }

        System.out.println("Thank you for playing!");
        sc.close();
    }
}