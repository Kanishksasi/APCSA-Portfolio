public class two {
  public String name;
  public int years;
  public int sleeping;

  public two(String n, int y) {
      name = n;
      years = y;
  }
  public two(int formal) {
      sleeping = formal;
  }
  public void sleep(int sleeping) {
      System.out.println("This object sleeps " + sleeping + " hours a week.");
  }
  public void pet() {
      String age;
      if (years < 10) {
          age = "which is < 10 years old.";
          System.out.println("My object's name is " + name + " and is " + years + " years old " + age);
      }
      if (years > 10) {
          age = "which is > 10 years old.";
          System.out.println("My object's name is " + name + " and is " + years + " years old " + age);
      } 
      if (years == 10) {
          age = "which is = 10 years old.";
          System.out.println("My object's name is " + name + " and is " + years + " years old " + age);
      }
  }
}
