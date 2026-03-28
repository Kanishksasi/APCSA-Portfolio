/* Kanishk Sasikumar, 10/11/2024, Compound Boolean Truth Tables
 * Activity 1.3.5
 */
import java.util.Scanner;

public class CompoundBoolean
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in); 
    
    System.out.println("Enter the first number");
    int a = Integer.parseInt(sc.nextLine()); 

    System.out.println("Enter the second number");
    int b = Integer.parseInt(sc.nextLine()); 
    
    /* your code here */
    System.out.println("Enter the third number");
    int c = Integer.parseInt(sc.nextLine()); 
    if (a>b)
    {System.out.println("a is greater than b: " + true);}
    if (a<b)
    {System.out.println("a is less than b: " + true);}
    if (a==b)
    {System.out.println("a equals b: " + true);}
    if ((a>b) && (b>c))
    {System.out.println("(a<b) and (b>c): " + true);}
    if ((a>b) || (b>c)){
      if (a>b)
      {System.out.println("a>b: " + true);}
      else if (b>c)
      {System.out.println("b>c: " + true);}
    }
    if (!(a>b))
    {System.out.println("Not (a>b): "+ true);}
    if (!((a>b) && (b>c)))
    {System.out.println("(Not ((a>b) and (b>c))): " + true);}
    if (!(a>b) && (b>c))
    {System.out.println("(Not(a>b) and (b>c)): " + true);}
  }
}
