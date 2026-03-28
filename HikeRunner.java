/*
 * Activity 2.5.6
 */
public class HikeRunner
{
  public static void main(String[] args)
  {
    Hike hike1 = new Hike("Sharp Top", 3.3, 1253);
    System.out.println(hike1);
    Hike hike2 = new Hike("Apple Orchard", 2.6, 1003);
    System.out.println(hike2);

    // step 7
    System.out.println("First hike longer? " + hike1.isLongerThan(hike2));

    // step 9
    System.out.println("First hike goes higher? " + hike1.isHigherThan(hike2));

    // step 12
    Hike hike3 = new Hike("Tanawha");
    System.out.println(hike3);

    // step 14
    Hike hike4 = new Hike("Crabtree Falls", 2.6);
    System.out.println(hike4);

    // Call getChallenging()
    System.out.println("Which hike is challenging: " + hike1.getChallenging(hike2));

    // Call getFavorite()
    hike1.setFavorite(hike3, hike4);
    System.out.println("My favorite hike: " + hike1.getFavorite());

    // Instantiate hike6
    Hike hike6 = new Hike("");

    // Output hike 6
    System.out.println(hike6);

    hike1.setFavorite(hike6, hike2);
    System.out.println("My favorite hike(2 or 6): " + hike1.getFavorite());

  }
}