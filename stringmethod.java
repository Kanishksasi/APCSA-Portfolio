public class stringmethod 
{
  public static void main(String[] args){
    // 1. Declare and initialize 3 one word string literals
    String stringliteral = "Hi";
    String stringliteral2 = "Hello";
    String stringliteral3 = "Bye";

    // 2. Declare and initialize one int variable
    int integer = 1;

    // 3. Instantiate one String object with a reference data value
    String reference = new String("dab me up");

    // 4. Instantiate this object: Object Sixth = new Object();
    Object sixth = new Object();

    // 5. Use a print statement to output the object in step 3, and another print statement for the object in Step 4.
    System.out.println("Object in step 3: " + reference);
    System.out.println("Object in step 4: " + sixth);

    // 6. Concatenate two String literals in a print statement using +. Include the add line escape sequence.
    System.out.println(reference + sixth + "\n");

    // 7. Use += to concatenate one of your String literals with additional text in a print statment. Include the tab escape sequence.
    String usingPlusEquals = stringliteral;
    usingPlusEquals += stringliteral2;
    usingPlusEquals += stringliteral3;

    // 8. Use another print statement to show how += created a new String
    System.out.println(usingPlusEquals);

    // 9. Use the .concat(); method to concatenate a different String literal with text in a print statement.
    usingPlusEquals = usingPlusEquals.concat("Heart" + "Attack");

    // 10. Use a print statement to create an implicit conversion using one of your String variables and your int variable.
    System.out.println("String" + 123);

    // 11. Declare and initialize the following variable:
    String pangram = "The quick brown fox jumps over the lazy dog";

    // 12. Declare and initialize an int variable with the value of pangram.length();.
    int len = pangram.length();

    // 13. Use a print statement to output the length of pangram.
    System.out.println(len);

    // 14. Declare and initialize an int variable using .indexOf(); with the value of "quick."
    int index = pangram.indexOf("quick");

    // 15. Use a print statement to output index location of "quick." Include the escape sequence for " ". \*
    System.out.println(index + " \"quick\"");

    // 16. Create a substring of pangram to output "The quick brown fox."
    System.out.println(pangram.substring(0, 19));

    // 17. Declare and initialize a String Variable that uses a single actual parameter to create a substring containing "jumps over the lazy dog" and output the results.
    
     String var2 = pangram.substring(20, 43);
    System.out.println(var2);

    // 18. Declare and initialize a variable using the .substring(); method with the value of "lazy".
    String var1 = pangram.substring(35, 39);
    System.out.println(var1);

    // 19. Declare and initialize a variable using the .substring(); method with the value of "fox." 
    String var3 = pangram.substring(16, 19);
    System.out.println(var3);

    // 20. Concatenate the previous two variables using += as a variable, then use in a print statement to output "lazyfox."
    System.out.println(var1 +var3);





  }
}
