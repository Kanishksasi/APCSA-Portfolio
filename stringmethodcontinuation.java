public class stringmethodcontinuation 
{
  public static void main(String[] args)
  {
    // 1. Declare and initialize 12 String literals
    String a = "a";
    String b = "aa";
    String c = "ac";
    String d = "bb";
    String e = "d";
    String f = "D";
    String g = "f";
    String h = " ";
    String i = "~";
    String j = "Cat";
    String k = "Dog";
    String l = "a";

    // 2. Use. compareTo() to compare the following combinations with output in a print statement
    System.out.println("Bullet point h to bullet point i: " + h.compareTo(i)); // a
    System.out.println("Bullet point a to bullet point g: " + a.compareTo(g)); // b
    System.out.println("Bullet point g to bullet point a: " + g.compareTo(a)); // c
    System.out.println("Bullet point b to bullet point d: " + b.compareTo(d)); // d
    System.out.println("Bullet point b to bullet point c: " + b.compareTo(c)); // e
    System.out.println("Bullet point j to bullet point k: " + j.compareTo(k)); // f
    System.out.println("Bullet point e to bullet point f: " + e.compareTo(f)); // g
    System.out.println("Bullet point g to bullet point k: " + g.compareTo(k)); // h

    // 3. Code a print statement using ==  to return a boolean for bullet point a and bullet point l
    System.out.println("Using == to return a boolean: " + (a == l));

    // 4. Code a print statement using .equals() to return a boolean for bullet point a and bullet point l
    System.out.println("Using .equals() to return a boolean: " + a.equals(l));

    // 5. Instantiate 3 String objects
    String Apple = new String("Apple");
    String Pear = new String("Pear");
    String Apple2 = new String("Apple");

    // 6. Code a print statement using .equals() to return a boolean for bullet point a .equals(); bullet point c
    System.out.println("Using .equals() to return a boolean for bullet point a.equals(); bullet point c: " + Apple.equals(Apple2));

    // 7. Code a print statement using .equals() to return a boolean for bullet point a.equals(); bullet point b
    System.out.println("Using .equals() to return a boolean for bullet point a.equals(); bullet point b: " + Apple.equals(Pear));

    // 8. Declare and initialize two String literals
    String literal1 = new String("The quick brown fox");
    String literal2 = new String("Over the lazy dog");

    // 9. Declare and initialize a String variable assigned to a substring containing the index value of one letter using index values from bullet point a
    String subfox = (literal1.substring(2, 3));

    // 10. Declare and initialize a String variable assigned the value of the same letter from bullet point b also using index values
    String subfox2 = (literal2.substring(2, 3));

    // 11. Code a print statement using .equals() to return true
    System.out.println("Using .equals() to return true: " + subfox.equals(subfox2));

    // 12. Declare and initialize an int variable using .indexOf(); that assigns the value of "brown" from bullet point a
    int index = literal1.indexOf("brown");

    // 13. Declare and initialize a String variable using .substring(); that uses your int variable above, plus the number of letters in "brown" as the second value
    String subint = (literal1.substring(index,index + 6));

    // 14. Declare and initialize another int variable using .indexOf(); that assigns the value of "dog" from bullet point b
    int subindex = literal2.indexOf("dog");

    // 15. Declare and initialize a String variable using .substring(); that uses your substring from bullet point 13 that will modify bullet point b to output "Over the lazy brown dog"
    String variable = (literal2.substring(0, 13) + subint + "dog");

    System.out.println(variable);
  }
}
