/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */
  Player player1; // Instance variables
  Player player2; // Instance variables
  Board game; // Instance variables
  boolean solved; // Instancee variables
  /* your code here - constructor(s) */ 
  public PhraseSolver(){ // Class Constructor
    player1 = new Player(); // Class Objects
    player2 = new Player(); // Class Objects
    game = new Board(); // Class Objects
    solved = false;
  }
  /* your code here - accessor(s) */
  
  /* your code here - mutator(s)  */

  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;
    Scanner input = new Scanner(System.in);
    boolean correct = true;
    while (!solved) 
    {
      
      /* your code here - game logic */
      System.out.println(game.getSolvedPhrase());
      int lettervalue = game.getCurrentLetterValue();
      System.out.println("Current Letter Value: " + lettervalue);
      int totalpts1 = lettervalue;
      int totalpts2 = lettervalue;
      if (currentPlayer == 1){
        System.out.println(player1.getName() + " Guess: ");
        totalpts1 += lettervalue;
      }
      if (currentPlayer == 2) {
        System.out.println(player2.getName() + " Guess: ");
        totalpts2 += lettervalue;
        
      }
      Scanner sc = new Scanner(System.in);
      String guess = sc.nextLine();

      if (game.guessLetter(guess)){
        System.out.println("Good Guess");
      }

      if (game.guessLetter(guess) == false) {
        System.out.println("Incorrect guess");
        if (currentPlayer == 1){
          currentPlayer = 2;
        }
        else {
          currentPlayer = 1;
        }
      }
      System.out.println(currentPlayer);
      /* your code here - determine how game ends */
      if (game.isSolved(guess) == true){
        System.out.println("The phrase has been solved! The final point tally is: ");
        solved = true;
        System.out.println(player1.getName() + " points: " + totalpts1);
        System.out.println(player2.getName() + " points: " + totalpts2);
        if (totalpts1 > totalpts2){
          System.out.println(player1.getName() + " totally crushed " + player2.getName());
        }
        else if(totalpts1 == totalpts2){
          System.out.println("Its a tie");
        }
        else {
          System.out.println(player2.getName() + " totally crushed " + player1.getName());
        }
      }
      
    } 
    
  }
  
}