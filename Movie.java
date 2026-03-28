public class Movie {
  private String title;
  private double duration;
  private int rating;

  /*** Constructor ****/
  public Movie(String t, double d)
  {
    title = t;
    duration = d;
    rating = 0;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public double getDuration() {
    return duration;
  }
  
  public int getRating() {
    return rating;
  }
  
  public String toString() 
  {
    String info = "\"" + title + "\", and has duration of " + duration;
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  public boolean equals(Movie b){
    if (this.title.equals(b.title) && this.duration == b.duration){ // this
      return true;
    }
    return false;
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  public void setDuration(double d) {
    duration = d;
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
