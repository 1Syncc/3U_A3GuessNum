/*
Thoren Herr
November 25th 2021
This program is a number guessing game where the user gets 5 trys to guess the number and if they are close the computer says "Warm" but if they are far from the number the computer says "Cold". When the game ends, the program asks the user if they want to continue or stop.  If the user says yes, the program clears the console and restarts the game. If the user inputs a String or Char instead of a int, the program says "Error" and ends.
*/

import java.util.*;

public class A3GuessNum
{
  
  public static void main(String[] arg){
    Scanner input = new Scanner(System.in);
    Random numGenerator = new Random();
    
    int goAgain = 0;

    

    do{
    int randomNum = numGenerator.nextInt(500) + 1;
    int tries = 1; 
    int guess;

    //Game instructions
    System.out.println("----------------------------------------------");
    System.out.println("          Welcome to GuessNum Game!");
    System.out.println("             Here are the rules:");
    System.out.println(" ");
    System.out.println("You have 5 guesses");
    System.out.println("Pick a number between 0 and 500");
    System.out.println("If your guess is more than 25 away = cold");
    System.out.println("If your guess is more than 50 away = freezing");
    System.out.println("If your guess is more than 10 away = warm");
    System.out.println("If your guess is less than 5 away = Hot ");
    System.out.println(" ");
    System.out.println("----------------------------------------------");
    System.out.println("");

    //beguinning of while loop
    while(tries <= 5){

      //try to make sure the user does not input letters
      try{
    System.out.println("This is try number " + tries);
    System.out.println("Guess a number");
    System.out.println("");
    guess = input.nextInt();
    input.nextLine();
      } catch(InputMismatchException e){

      System.out.println("Error: No Number Detected");
      System.out.println("");
      break;

    }
    
    tries += 1; //adds total number of tries

    int difference = guess - randomNum; //difference of the guess and randomNum to help                                          with hints

    if(difference <= -1){

      difference *= -1;

    } 

    if(guess > 500) {

      System.out.println("Error: Number over 500");
      System.out.println("");

    }else if(guess == randomNum){

      System.out.println("");
      System.out.println("Correct!");
      System.out.println("");
      break; 

    }else if(difference >= 25 && difference <= 50) {

      System.out.println("");
      System.out.println("Cold");
      System.out.println("");

    }else if(difference > 50){

      System.out.println("");
      System.out.println("Freezing");
      System.out.println("");

    }else if(difference >= 6 && difference < 25){

      System.out.println("");
      System.out.println("Warm");
      System.out.println("");

    }else if(difference > 0  && difference < 6){

      System.out.println("");
      System.out.println("Hot");
      System.out.println("");

    }

    
    }
    
    System.out.println("Do you want to play again?");
    System.out.println("");
    String playAgain = input.nextLine();
    
    if(playAgain.equalsIgnoreCase("no")){

      System.out.println("Thanks for playing!");
      break;

    } else if(playAgain.equalsIgnoreCase("yes")){

      System.out.print("\033[H\033[2J");

    }else{

      System.out.println("Error: Unkown Command, Please Restart");
      System.out.println("");
      break;

    }
    
    }while(true);// Close do-while loop
    
  }// close main
}
