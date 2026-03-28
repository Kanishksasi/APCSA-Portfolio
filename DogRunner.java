/*
 * Activity 1.2.4
 */
public class DogRunner
{
  public static void main(String[] args)
  {
    Dog myDog = new Dog("Aveek");
    myDog.eat(2);
    myDog.play();
    myDog.setAge(9, 9);
    myDog.speak();

    System.out.print("\n");

    Dog mysecondDog = new Dog("Aditya");
    mysecondDog.walk(5);
    mysecondDog.eat("Pedigree");
    mysecondDog.play("Bones");
    mysecondDog.setAge(5);

    System.out.print("\n");

    Dog mythirdDog = new Dog("Abhinav");
    mythirdDog.eat("Rice", 3);
    mythirdDog.setAge(1.5);
    mythirdDog.sit();
    mythirdDog.walk(5, "Bentonville Dog Park");

    System.out.print("\n");
  }
}