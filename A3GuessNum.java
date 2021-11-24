/*
Thoren Herr
November 24th 2021
This program is a number guessing game where the user gets 5 trys to guess the number and if they are close the computer says "Warm" but if they are far from the number the computer says "Cold"
*/

import java.util.*;

public class A3GuessNum
{
  
  public static void main(String[] arg){
    Scanner input = new Scanner(System.in);
    Random numGenerator = new Random();
    
    int goAgain = 0;

    do{
    int randomNum = numGenerator.nextInt(100) + 1;
    int tries = 1; 
    int guess;

    System.out.println("----------------------------------------------");
    System.out.println("          Welcome to GuessNum Game!");
    System.out.println("             Here are the rules:");
    System.out.println(" ");
    System.out.println("You have 5 guesses");
    System.out.println("Pick a number between 0 and 100");
    System.out.println("If your guess is more than 25 away = cold");
    System.out.println("If your guess is more than 50 away = freezing");
    System.out.println("If your guess is more than 10 away = warm");
    System.out.println("If your guess is less than 5 away = Hot ");
    System.out.println(" ");
    System.out.println("----------------------------------------------");
    System.out.println("");


    while(tries <= 5){

    System.out.println("This is try number " + tries);
    System.out.println("Guess a number");
    guess = input.nextInt();
    input.nextLine();
    
    tries += 1;

    int difference = guess - randomNum;

    if(difference <= -1){

      difference *= -1;

    }

    if(guess > 100) {

      System.out.println("Error: Number over 100");

    }else if(guess == randomNum){

      System.out.println("Correct!");
      break; 

    }else if(difference >= 25 && difference <= 50) {

      System.out.println("Cold");

    }else if(difference > 50){

      System.out.println("Freezing");

    }else if(difference >= 6 && difference < 25){

      System.out.println("Warm");

    }else if(difference > 0  && difference < 6){

      System.out.println("Hot");

    }

    
    }
    
    System.out.println("Do you want to play again?");
    String playAgain = input.nextLine();
    
    if(playAgain.equalsIgnoreCase("no")){

      break;

    } else if(playAgain.equalsIgnoreCase("yes")){

      System.out.print("\033[H\033[2J");

    }else{

      System.out.println("Error: Unkown Command, Please Restart");
      break;

    }
    
    }while(true);// Close do-while loop
  }// close main
}
