public class Song {
  private String title;
  private int rating;
  
  /*** Constructor ****/
  public Song(String t, String a)
  {
    title = t;
    rating = 0;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }
 
  public int getRating() {
    return rating;
  }
  
  public String toString() 
  {
    String info = "\"" + title + "\"";
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  public boolean equals(Song s){
    if (this.title.equals(s.title) && this.rating == s.rating){ // this
      return true;
    }
    return false;
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  // Create the method
  public void adjustRating(int r){
    // Step 10-11 improve the method
    if ((rating +r >= 0) && (rating + r <= 10)){
      rating += r;
    }
    r = 10; // step 9: changing the param here has no effect in the runner
  }
}
