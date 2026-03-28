public class MediaLibRunnerStatic {
  public static void main(String[] args) {
    System.out.println(MediaLib.getOwner() + "'s Library");
    MediaLib.changeOwner("Kanishk");
    System.out.println(MediaLib.getOwner() + "'s Library");
    System.out.println("Number of Entries: " + MediaLib.getNumEntries());

    // 10
    MediaLib myLib1 = new MediaLib();
    MediaLib myLib2 = new MediaLib();

    // 11
    Book myBook = new Book("Diary of a Wimpy Kid - Wrecking Ball", "Jeff Kinney");
    Movie myMovie = new Movie("Cars", 1.57);
    Song mySong = new Song("Slim Shady", "Eminem");

    myLib1.addBook(myBook);
    myLib2.addMovie(myMovie);

    System.out.print(myLib1);
    System.out.println(myLib1.getNumEntries());
    System.out.print(myLib2);
    System.out.println(myLib2.getNumEntries());

    myLib1.addSong(mySong);

    System.out.println(myLib1);
    
  }
}
