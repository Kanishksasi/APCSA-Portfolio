/*
 * Activity 1.3.3
 */
import java.util.Scanner;

public class IfElseTunnel
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    boolean isValidInput = false;
    boolean hasCandle = false;
    boolean wild = false;
    boolean died = false;
    boolean kill = false;
    boolean end = false;
    boolean temple = false;

    
    // The while loop should keep asking for input until the user provides a P or an E
    while (!isValidInput)
    {
      // Starting Point
      System.out.println("You are in a room with a small table and a lit candle.  There is a entrance to a tunnel to the east and a door to the west.  What would you like to do?");
      System.out.println("(P) Pick up the candle and enter the tunnel");
      System.out.println("(E) Enter the tunnel");
      String choice = sc.nextLine();

      /* Your code here to set boolean variables */
      if (choice.equals("E") || choice.equals("P")){
        isValidInput = true;
      }
      if (choice.equals("P")){
        hasCandle = true;
      }
    }
    /* Your code here to use the boolean variables to print messages. */
    // Option E or P
    if (hasCandle == false){
      System.out.println("You enter the tunnel and quickly find yourself lost. You walk in the direction that you feel the cave moving, then you hear a roar but you also find a door in the dark. What do you do?");
      System.out.println("(O) You open the door");
      System.out.println("(R) You run as fast as you can in the dark");
      String choice2 = sc.nextLine();
      // Option O
      if (choice2.equals("O")){
        isValidInput = true;
        wild = true;
      }
      // Option R
      else {
        isValidInput = true;
        died = true;
      }
    }
    // Option P
    if (hasCandle == true) {
      System.out.println("You enter the tunnel and can clearly see the walls and flooring from the candlelight. You hear a roar but you find a door. What do you do?");
      System.out.println("(L) You take the candle and look around to see where the noise came from");
      System.out.println("(O) You open the door");
      String choice3 = sc.nextLine();
      // Choice O
      if (choice3.equals("O")){
        isValidInput = true;
        wild = true;
      }
      // Choice L
      else {
        isValidInput = true;
        died = true;
        wild = false;
      }
    }
    // If you open the door
    if (wild == true) {
      System.out.println("You get into a deep dense forest and close the door. Then you meet Sami Sazci. What do you do?");
      System.out.println("(K) You kill him.");
      System.out.println("(B) You become his best friend.");
      String choice4 = sc.nextLine();
      // If you become his friend
      if (choice4.equals("B")){
        isValidInput = true;
        temple = true;
      }
      // If you kill Sami
      else{
        isValidInput = true;
        kill = true;
      }
      }
      // You find a temple
      if (temple == true){
        System.out.println("Both of you walk some distance. Then, you find a temple dedicated to Aveek and is made of gold. What do you do?");
        System.out.println("(S) You decide to share the gold");
        System.out.println("(K) You decide not to share and kill him");
        String choice5 = sc.nextLine();
        if (choice5.equals("S")){
          isValidInput = true;
          end = true;
        }
        if (choice5.equals("K")){
          isValidInput = true;
          kill = true;
        }
      }
    // Endings:
    if (died == true){
      System.out.println("The animal bites you and kills you with its venom. The end.");
    }
    if (kill == true){
      System.out.println("Sami decided not to die and kills you. The end.");
    }
    if (end == true){
      System.out.println("Sami says you can keep the gold and you live happpily ever after. The end.");
    }

  }
}