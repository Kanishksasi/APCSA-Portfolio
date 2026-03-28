// Import statements
import java.util.Scanner;

public class Madlib3 {
  public static void main(String[] args)
  {
    // Scanner
    Scanner sc = new Scanner(System.in);

    // Third Madlib
    String madlib3 = "Once upon a time, a (1) (2) decided to (3) (4). It found (5) friends who wanted to join the fun. Together, they explored a (6) forest filled with (7)!";
    System.out.println("Third Madlib: ");
    System.out.println(madlib3);
    System.out.println("First space(adjective): ");
    String first3 = sc.nextLine();
    System.out.println("Second space(noun): ");
    String second3 = sc.nextLine();
    System.out.println("Third space(verb): ");
    String third3 = sc.nextLine();
    System.out.println("Fourth space(adverb): ");
    String fourth3 = sc.nextLine();
    System.out.println("Fifth space(number): ");
    String fifth3 = sc.nextLine();
    System.out.println("Sixth space(adjective): ");
    int sixth3 = sc.nextInt();
    sc.nextLine();
    System.out.println("Seventh Space(noun): ");
    String seventh3 = sc.nextLine();
    // Put it together
    String opening3 = "Once upon a time, a ";
    String ob3 = "(1) ";
    String tb3 = "(2) decided to "; 
    String thb3 =   "(3) ";
    String fb3 = "(4). It found ";
    String fib3 = "(5) friends who wanted to join the fun. Together, they explored a ";
    String sb3 = "(6) forest filled with ";
    String seb3 = "(7)!";
    ob3 = ob3.substring(0, ob3.indexOf("(1)")) + first3 + ob3.substring(ob3.indexOf("(1)") + 3);
    tb3 = tb3.substring(0, tb3.indexOf("(2)")) + second3 + tb3.substring(tb3.indexOf("(2)") + 3);
    thb3 = thb3.substring(0, thb3.indexOf("(3)")) + third3 + thb3.substring(thb3.indexOf("(3)") + 3);
    fb3 = fb3.substring(0, fb3.indexOf("(4)")) + fourth3 + fb3.substring(fb3.indexOf("(4)") + 3);
    fib3 = fib3.substring(0, fib3.indexOf("(5)")) + fifth3 + fib3.substring(fib3.indexOf("(5)") + 3);
    sb3 = sb3.substring(0, sb3.indexOf("(6)")) + sixth3 + sb3.substring(sb3.indexOf("(6)") + 3);
    seb3 = seb3.substring(0, seb3.indexOf("(7)")) + seventh3 + seb3.substring(seb3.indexOf("(7)") + 3);
    System.out.println("initial: ");
    System.out.println(madlib3);
    System.out.println("Final: ");
    System.out.print(opening3 + ob3 + tb3 + thb3 + fb3 + fib3 + sb3 + seb3);
 

    sc.close();
  }
}
