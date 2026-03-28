/*
 * Activity 1.2.5
 */
public class DogRunner2
{
  public static void main(String[] args)
  {
    //Creates new object
    Dog dog = new Dog("Avash");
    String dogName = dog.getName();
    System.out.println("The Dog name is: " + dogName);

    //Print Statement
    System.out.println("Dog is Good Dog:  "  + dog.isGoodDog());

    System.out.println(dogName + " favorite toy: " + dog.getToy());
    System.out.println(dog.getName() + " favorite toy: " + dog.getToy());

    int morning = dog.goOutside(); // Creating New Variable
    System.out.println("Dog goes outside in the morning: " + morning + " minutes");//Output
    int night = dog.goOutside(0.5); // Creating New Variable
    System.out.println("Dog goes outside in the night: " + night + " minutes");//Output

    System.out.println("Total time dog goes outside: " + dog.totalHours(0.5) + " minutes");

    //Instantiate a no-arg Dog object in runner
    Dog dog2 = new Dog();


  }
}