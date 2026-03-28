// Calculating the Distance from a point to the origin, PLTW 1.2.9, 9/24/2024, Kanishk Sasikumar
// Import Statement
import java.util.Scanner;

public class Mathmethods {
  public static void main(String[] args)
  {
    // Making Scanner
    Scanner sc = new Scanner(System.in);
    System.out.println("This code calculates the destance from a point to the origin");

    // Asking for x-coordinate
    System.out.println("Give me the x-coordinate of the point: ");
    double xcoordinate = sc.nextDouble();

    // Asking for y coordinate
    System.out.println("Give me the y-coordinate of the point: ");
    double ycoordinate = sc.nextDouble();

    // Calculating the absolute of x-coordinate and y-coordinate
    double absolutex = Math.abs(xcoordinate);
    double absolutey = Math.abs(ycoordinate);

    // Calculating the square of the absolute x and y numbers
    double absoluesquarex = Math.pow(absolutex, 2);
    double absolutesquarey = Math.pow(absolutey, 2);

    // Adding the x-coordinate and y-coordinate
    double addingpoints = absoluesquarex + absolutesquarey;

    // Calculating the square root of the entire thing
    double squareroot = Math.sqrt(addingpoints);

    // Printing out final statement
    System.out.println("The distance of the point to the origin value is: " + squareroot);

    // Random range
    double random = Math.random();
    System.out.println("Random number 1(range: min = 2134, max = 2136): " + (random * 2 + 2134));
    System.out.println("Random number 2(range: min = 2398, max = 2401 )" + (random * 3 + 2398));

    sc.close();
  }
}
