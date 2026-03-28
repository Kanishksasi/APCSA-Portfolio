/* Kanishk Sasikumar, 10/10/2024
 * Activit 1.3.4
 */
import java.util.Scanner;

public class IfElseIf 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in); 
    
    System.out.println("Enter name");
    String name = sc.nextLine(); 

    System.out.println("Enter the number");
    int grade = Integer.parseInt(sc.nextLine());

    // Insert code for comparasion.
    if (grade >= 90)
    {
      System.out.println(name + " received an A");
    }
    /* your code here */
    else if (grade >= 80){
      System.out.println(name + " received an B");
    }
    else if (grade >= 70){
      System.out.println(name + " received an C");
    }
    else if (grade >= 60){
      System.out.println(name + " received an D");
    }
    else if (grade <= 59){
      System.out.println(name + " received an F");
    }
    
    
  
  }
}
