import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
  public static void main(String[] args) {  
    
	// Allows for program to recognize the users input
    Scanner scanner = new Scanner(System.in);
    
    // It following the codes logic
    while (true) {
    //The string[] Choices is a list where it stores all the choices the user can input. 
      String[] Choices = {"Rock", "Paper", "Scissors"};
      // The String computerMove is the computers random move, it uses the Random method to generate its choice. 
      String computerMove = Choices[new Random().nextInt(Choices.length)];
      // String playerMove is what the players choice 
      String playerMove;
      
      // It following the codes logic
      while(true) {
        System.out.println("Please enter your move (Rock 🗿, Paper 📄, or Scissors ✂️)");
        playerMove = scanner.nextLine();
        // The users only choices, otherwise it will just stop.
        if (playerMove.equals("Rock") || playerMove.equals("Paper") || playerMove.equals("Scissors")) {
          break;
        }
        System.out.println(playerMove + " is not a valid move.");
      }
      
      //This print out whatever the random choices
      System.out.println("Computer played: " + computerMove);
      
      //Conditional statement of all possible combinations of wins,loses and ties.
      if (playerMove.equals(computerMove)) {
        System.out.println("The game was a tie!");
      }
      else if (playerMove.equals("Rock")) {
        if (computerMove.equals("Paper")) {
          System.out.println("You lose!");
          
        } else if (computerMove.equals("Scissors")) {
          System.out.println("You win!");
        }
      }
      
      else if (playerMove.equals("Paper")) {
        if (computerMove.equals("Rock")) {
          System.out.println("You win!");
          
        } else if (computerMove.equals("Scissors")) {
          System.out.println("You lose!");
        }
      }
      
      else if (playerMove.equals("Scissors")) {
        if (computerMove.equals("Paper")) {
          System.out.println("You win!");
          
        } else if (computerMove.equals("Rock")) {
          System.out.println("You lose!");
        }
      }
      
      // Asking users if they want to play again then enter Yes/No
      System.out.println("Play again? (Yes/No)");
      String playAgain = scanner.nextLine();
      
      // If they pick no then the program break(stop), if yes then the new round continue.
      if (!playAgain.equals("Yes")) {
        break;
      }
    }
    
    // Telling the program to not take anymore users input.
    scanner.close();
  }
}
;