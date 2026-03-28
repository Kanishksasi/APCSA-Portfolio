// import statements
import java.util.Scanner;

public class Madlib {
  public static void main(String[] args)
  {
    // First Madlib
    String madlib1 = ("(1) went to the beach with (2). First they (3) in their pool. Then they saw (4) and (5). Lastly they built a sandcastle out of (6) stones.");
    System.out.println("First Madlib: ");
    System.out.println(madlib1);
    Scanner sc = new Scanner(System.in);
    System.out.println("First space(noun): ");
    String first = sc.nextLine();
    System.out.println("Second space(noun): ");
    String second = sc.nextLine();
    System.out.println("Third space(verb): ");
    String third = sc.nextLine();
    System.out.println("Fourth space(noun): ");
    String fourth = sc.nextLine();
    System.out.println("Fifth space(noun): ");
    String fifth = sc.nextLine();
    System.out.println("Sixth space(number): ");
    int sixth = sc.nextInt();
    sc.nextLine();

    // Put it together
    String ob = "(1) went to the beach with ";
    String tb = "(2). First they "; 
    String thb =   "(3) in their pool. Then they saw ";
    String fb = "(4) and ";
    String fib = "(5). Lastly they buil a sandcastle out of ";
    String sb = "(6) stones.";
    ob = ob.substring(0, ob.indexOf("(1)")) + first + ob.substring(ob.indexOf("(1)") + 3);
    tb = tb.substring(0, tb.indexOf("(2)")) + second + tb.substring(tb.indexOf("(2)") + 3);
    thb = thb.substring(0, thb.indexOf("(3)")) + third + thb.substring(thb.indexOf("(3)") + 3);
    fb = fb.substring(0, fb.indexOf("(4)")) + fourth + fb.substring(fb.indexOf("(4)") + 3);
    fib = fib.substring(0, fib.indexOf("(5)")) + fifth + fib.substring(fib.indexOf("(5)") + 3);
    sb = sb.substring(0, sb.indexOf("(6)")) + sixth + sb.substring(sb.indexOf("(6)") + 3);
    System.out.println("initial: ");
    System.out.println(madlib1);
    System.out.println("Final: ");
    System.out.println(ob + tb + thb + fb + fib + sb);

    sc.close();
    }
}
