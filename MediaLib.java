/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;
  public static String owner;
  private static int numEntries;

  public void addBook(Book b)
  {
    book = b;
    numEntries += 1;
  }

  public String toString() 
  {
    String info = "";
    if (book != null){
      info += "Book: " + book + "\n";
    }
    if (movie!= null){
      info += "Movie: " + movie + "\n";
    }
    
    return info;
  }

  public void testBook (Book tester){
    tester.setTitle("Diary of the Wimpy Kid");
    System.out.println(tester);
  }

  // Step 31
  public void addMovie(Movie m){
    movie = m;
    numEntries += 1;
  }

  public static String getOwner(){
    return owner;
  }

  public static void changeOwner(String o){
    owner = o;
  }

  public static int getNumEntries(){
    System.out.println("Test: Owner is " + owner);
    return numEntries;
  }

  // 14 Slideshow
  public void changeBook(Book b){
    book = b;
  }

  public void changeMovie(Movie m){
    movie = m;
  }

  // Step 27
  public void addSong(Song s){
    song = s;
    numEntries += 1;
  }
}