/*
 * Activity 2.5.7
 * 
 * The runner for the MediaLibrary program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();
    // Steps 1-6
    Book myBook = new Book("The Lord of the Rings", "Tolkien");
    System.out.println("My Book: " + myBook);
    System.out.println("Library: \n" + myLib);
    myLib.addBook(myBook);
    System.out.println("Library:\n" + myLib);

    // Steps 8-9
    int myRating = 5;
    myBook.adjustRating(myRating);//Line 69 in book
    System.out.println(myBook);
    System.out.println("myRating=" + myRating);

    // Step 10
    myBook.adjustRating(15);
    System.out.println("Second " + myBook);
    myBook.adjustRating(-10);
    System.out.println("Third" + myBook);

    // Step 12-14
    System.out.println("Book changed!");
    myBook.setTitle("Fellowship of the Ring");
    myBook.adjustRating(5); // or myBook.setAuthor("JRR Tokien")
    System.out.println("Book: " + myBook);
    System.out.println("Library: " + myLib);

    // Step 15-17
    System.out.println("You have a NEW Library");
    MediaLib myLib2 = new MediaLib();

    Book newBook = new Book("To Kill a Mockingbird", "Lee");
    myLib2.addBook(newBook);
    System.out.println(myLib2);
    newBook = new Book("1984", "Orwell");
    System.out.println(myLib2);

    // Step 20
    /*System.out.println("before test:" + newBook);
    myLib.testBook(newBook);
    System.out.println("after test:" + newBook);*/

    // Step 25
    Book newBook2 = new Book("To Kill a Mockingbird", "Lee");
    newBook2.setTitle("To Kill a Mockingbird");
    newBook2.setAuthor("Lee");
    newBook.equals(newBook2);

    // Step 27
    //System.out.println(newBook2.title);

    // Step 32
    Movie newMovie1 = new Movie("Cars", 1.57);
    myLib2.addMovie(newMovie1);
    System.out.println("newMovie1 To string: " + newMovie1.toString());
    
    Movie newMovie2 = new Movie("Avengers Endgame", 3.15);
    myLib2.addMovie(newMovie2);
    System.out.println("newMovie2 To string: " + newMovie2.toString());

    newMovie1.equals(newMovie2);

  }
}