package hw01;
import java.util.Scanner;
import java.util.Random;
public class HomeWork1 {
    public static void main(String[] args) {
        //Creation
        System.out.println("Let the game begin!.");
        Random rand = new Random();
        int RandomNumber = rand.nextInt(100);
        int guess;
        boolean won = false;
        Scanner scan = new Scanner(System.in);

        //Calculation
        while(won == false){
            guess = scan.nextInt();
            if(guess == RandomNumber){
                won = true;
            }
            else if(guess < RandomNumber){
                System.out.println("Your number is too small. Please, try again.");
            }
            else if(guess > RandomNumber){
                System.out.println("Your number is too big. Please, try again.");
            }
        }

        //Printing
        System.out.println("Congratulations," + RandomNumber);
    }
}
