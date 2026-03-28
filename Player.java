/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  private String name; // instance variables
  private int points; // instance variables
  /* your code here - constructor(s) */ 
  public Player(){ // class constructor
    System.out.println("Enter Player Name: ");
    Scanner sc = new Scanner(System.in);
    String newName = sc.nextLine();

    name = newName;
    System.out.println("Hello and welcome to the game, " + name);
    points = 0;
  }
  public Player(String inputName){ // Parameterized constructor
    setName(inputName); 
    System.out.println("Hello and welcome to the game, " + name);
    points = 0;
  }
  /* your code here - accessor(s) */ 
  public String getName() { // returning name
    return name;
  }
  public int getPoints() { // returning points
    return points;
  }
  /* your code here - mutator(s) */ 
  public void addPoints(int p){
    points += p;
  }
  public void setName(String newname){
    name = newname;
  }
}