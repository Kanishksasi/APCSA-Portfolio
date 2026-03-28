// Math Class function Methods, PLTW 1.2.9, 9/19/2024, Kanishk Sasikumar

// Class Name
public class MathNumbers 
{
  public static void main(String[] args)
  {
    // 3. Construct two integer objects and assign each a value
    Integer objectone  = 1;
    Integer objecttwo = 2;

    // 4. Declare/Initialize 3 primitive integer variables
    int one;
    int two;
    int three;

    one = objectone;
    two = objecttwo.intValue();
    three = 3;
    Integer objectthree = three;

    // 5. Code output statements using the above variables
    System.out.println("The value of integer object: " + objectone);
    System.out.println("The value of your first primitive unboxing: " + one);
    System.out.println("The primitive using .intValue(): " + two);
    System.out.println("The value of your last integer object (autoboxing): " + objectthree);
    System.out.println("Concatenation operator: " + objecttwo + objectone);
    System.out.println("Using two of the above variables/objects in an expression: " + (three+objecttwo));

    // 6. See the syntax for the deprecated constructs on slide 11, and add them to your program.
    //Integer example = new Integer(2); Deprecated
    //Integer example2 = new Integer(35);

    // 7. Use MAX_VALUE and MIN_VALUE with Integers and output their values.
    System.out.println("Use Max value with Integer:  " + Integer.MAX_VALUE);
    System.out.println("Use Min value with integer: " + Integer.MIN_VALUE);

    // 8. Use two new Integers that will contain a "customized" min/max values via an expression using the two integers from point 7 above
    Integer ex = Integer.MAX_VALUE - 20000;
    Integer ex2 = Integer.MIN_VALUE + 20000;

    // 9. Code a statement using each of the methods below and output the usage in some way
    double number = 25.0;
    System.out.println("Absolute statement: " + Math.abs(three));
    System.out.println("Power statement: " + Math.pow(3, 2));
    System.out.println("Square Root Statement: " + Math.sqrt(number));

    // 10. Use Math.random(); and then output the following with concatenated text
    double random = Math.random();
    System.out.println("Random double from 0.0 to 0.9: " + random);
    System.out.println("Truncation Effect: " + ((int) random));
    System.out.println("Random Integer from 0 to 9: " + (random*10));
    System.out.println("Random integer from 1 to 10: " + (random + 1));
    System.out.println("Random integer from 1 to 100: " + (random * 100 + 1));
    System.out.println("Random Integer that produces only multiples of 2: " + ((int) ((random * 10))*2));
    System.out.println("Random negative integer: " + (random * -1));
    System.out.println("Random integer between -5 and 5: " + (random - 5));
  }  
}
