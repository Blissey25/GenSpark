import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] arg) throws Exception {
        Scanner userInput = new Scanner(System.in);

        String name = null, j;
        try {
            System.out.println("Hello! What is your name?");
            name = userInput.next();

        }catch(Exception e){
            System.out.println("Not a valid name.");
        }
        System.out.println("Well, " + name + ", I am thinking of a number between 1-20. " +
                "Take a guess.");

        int secretNum;
        secretNum = (int)(Math.random() * 20);
        Scanner keyboard = new Scanner(System.in);
        int guess = 0;
        int K = 0;
        if (K < 6)
            try {
                do {
                    System.out.print("Enter a guess: ");
                    guess = keyboard.nextInt();
                    if (guess == secretNum) {
                        System.out.println("Good job, " + name + " ! You guessed my number in " + K + " guesses.");

                    } else if (guess < secretNum) {
                        System.out.println("Your guess is too low. " +
                                "Take another guess.");
                        K++;
                    } else if (guess > secretNum) {
                        System.out.println("Your guess is too high. " +
                                "Take another guess.");
                        K++;
                    }


                } while (guess != secretNum) ;
            }catch(InputMismatchException e){
                System.out.println("Error: Please select a valid number!");
            }
        else {
            System.out.println("You have guessed " + K + " times. You lose!");
        }
        if (guess == secretNum) {
            System.out.println("Would you like to go again? Y/N");
            j = userInput.next();

        }
    }
}
