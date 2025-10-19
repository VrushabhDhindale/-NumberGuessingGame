import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int attempt = 0;
        int guess;
        int randomNumber = r.nextInt(1,11);

        System.out.println("Number Guessing Gaming.");
        System.out.println("Guess the number between 1 to 10.");

        do{

            System.out.print("Enter the number : ");
            guess = sc.nextInt();
            attempt ++;

            if(guess < randomNumber){

                System.out.println("Number is too low!");

            } else if (guess > randomNumber){

                System.out.println("Number is too high!");

            } else {

                System.out.println("Correct Number!");
                System.out.println("You have won the game in " + attempt + " attempt.");

            }

        }while(guess != randomNumber);

        sc.close();

    }

}
