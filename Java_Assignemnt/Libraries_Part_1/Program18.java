import java.util.Random;
import java.util.Scanner;

public class Program18 {

    public static void main(String[] args) {

        
        Random rand = new Random();
        int randomNumber = rand.nextInt(25) + 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Guess the number (between 1 and 25): You have 3 attempts.");

        // Loop for 3 attempts
        for (int i = 1; i <= 3; i++) {
            System.out.print("Attempt " + i + ": ");
            int userGuess = sc.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("You guessed it right! The number was: " + randomNumber);
                return; 
            } else {
                System.out.println("Wrong guess. Try again.");
            }
        }

    
        System.out.println("Sorry! The correct number was: " + randomNumber);

        sc.close();
    }
}
