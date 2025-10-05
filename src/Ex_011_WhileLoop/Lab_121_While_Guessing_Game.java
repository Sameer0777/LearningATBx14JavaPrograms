package Ex_011_WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class Lab_121_While_Guessing_Game {
    public static void main(String[] args) {

        Random rd = new Random();
        int numberToBeGuessed = rd.nextInt(101);
        System.out.println(numberToBeGuessed);

        Scanner sc = new Scanner(System.in);
        int guessedNumber;
        int attempts = 0;

        while(true){

            if(!sc.hasNextInt()){
                System.out.println("Enter an Integer Number!!!!");
                sc.next(); // Consumes invalid token
                continue;
            }
            guessedNumber = sc.nextInt();

            if(guessedNumber <= 0 || guessedNumber > 100){
                System.out.println("Enter the Number Between 1 to 100 !!!!!");
                continue;
            }
            attempts++;

            if(guessedNumber < numberToBeGuessed){
                System.out.println("Too Low, Try Again");
            }
            else if(guessedNumber > numberToBeGuessed){
                System.out.println("Too High, Try Again");
            }
            else{
                System.out.println("You Guessed it Right! in "+attempts+" attempts");
                break;
            }
        }
    }
}
