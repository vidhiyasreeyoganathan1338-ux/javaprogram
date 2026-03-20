//Number guessing game
import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand=new Random();
        int secretNumber=rand.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        int guess=0;
        int attempts=0;
        while(guess!=secretNumber)
        {
            System.out.println("Guess a number between 1 and 100");
            guess=sc.nextInt();
            attempts++;
            if(guess<secretNumber)
            {
                System.out.println("Too low! Try again");
            }
            else if(guess>secretNumber)
            {
                System.out.println("Too high! Try Again");
            }
            else
            {
                System.out.println("CORRECT!! YOU GOT IT IN "+attempts+" attempts!");
            }
        }
    }
}
