public class challenge4 {
  public static void main(String[] args){
    String phrase = "Hello,there";
    int mid = (int)(phrase.length()/2);
    String substring = phrase.substring(0, mid);
    String substring2 = phrase.substring(mid, phrase.length());
    System.out.println(substring2 + substring);
  }
}
