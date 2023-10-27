import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 0;
        
        System.out.println("Welcome to the number guessing game");
        System.out.println("Select a number between 1 and 100. Try to guess it in 5 attempts.");
        
        while (attempts < 5) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            
            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
                continue;
            }
            if (guess == numberToGuess) {
                System.out.println("You've guessed the number correctly: ");
                break;
            }
            else if (guess < numberToGuess) {
                System.out.println("Aim higher");
            }
            else {
                System.out.println("Aim lower");
            }
            
            attempts++;
        }
        
        if (attempts == 5) {
            System.out.println("You've run out of attempts. The correct number was: " + numberToGuess);
        }
        
        scanner.close();
    }
}
