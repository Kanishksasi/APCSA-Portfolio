// Import statements
import java.util.Scanner;

public class Madlib2 {
  public static void main(String[] args)
  {
    // Scanner
    Scanner sc = new Scanner(System.in);

    // Second Madlib
    String madlib2 = "Today, I went to the zoo and saw a (1) (2). It was a (3) day, but I (4) near the (5). I counted (6) of them! It was the most (7) day ever!";
    System.out.println("Second Madlib: ");
    System.out.println(madlib2);
    System.out.println("First space(adjective): ");
    String first2 = sc.nextLine();
    System.out.println("Second space(noun): ");
    String second2 = sc.nextLine();
    System.out.println("Third space(adverb): ");
    String third2 = sc.nextLine();
    System.out.println("Fourth space(verb): ");
    String fourth2 = sc.nextLine();
    System.out.println("Fifth space(noun): ");
    String fifth2 = sc.nextLine();
    System.out.println("Sixth space(number): ");
    int sixth2 = sc.nextInt();
    sc.nextLine();
    System.out.println("Seventh Space(adjective): ");
    String seventh2 = sc.nextLine();

    String opening = "Today, I went to the zoo and saw a ";
    String ob2 = "(1) ";
    String tb2 = "(2). It was "; 
    String thb2 =   "(3) day, but I ";
    String fb2 = "(4) near the ";
    String fib2 = "(5). I counted ";
    String sb2 = "(6) of them! It was the most ";
    String seb2 = "(7) day ever!";
    ob2 = ob2.substring(0, ob2.indexOf("(1)")) + first2 + ob2.substring(ob2.indexOf("(1)") + 3);
    tb2 = tb2.substring(0, tb2.indexOf("(2)")) + second2 + tb2.substring(tb2.indexOf("(2)") + 3);
    thb2 = thb2.substring(0, thb2.indexOf("(3)")) + third2 + thb2.substring(thb2.indexOf("(3)") + 3);
    fb2 = fb2.substring(0, fb2.indexOf("(4)")) + fourth2 + fb2.substring(fb2.indexOf("(4)") + 3);
    fib2 = fib2.substring(0, fib2.indexOf("(5)")) + fifth2 + fib2.substring(fib2.indexOf("(5)") + 3);
    sb2 = sb2.substring(0, sb2.indexOf("(6)")) + sixth2 + sb2.substring(sb2.indexOf("(6)") + 3);
    seb2 = seb2.substring(0, seb2.indexOf("(7)")) + seventh2 + seb2.substring(seb2.indexOf("(7)") + 3);
    System.out.println("initial: ");
    System.out.println(madlib2);
    System.out.println("Final: ");
    System.out.print(opening + ob2 + tb2 + thb2 + fb2 + fib2 + sb2 + seb2);

    sc.close();
  }
}
