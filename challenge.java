public class challenge{
  public static void main(String[] args) {
    double random = Math.random();
    double random1 = Math.random();
    int player1 = (int)(random * 100 + 1);
    int player2 = (int)(random1 * 100 + 1);
    int twominusone = player1 - player2;
    System.out.println("Player 1 score: " + player1);
    System.out.println("Player 2 score: " + player2);
    System.out.println("Player 1 - Player 2: " + twominusone);
    if (twominusone > 0){
      int newplayer2 = player2 + twominusone;
      System.out.println("Player 2 new score: " + newplayer2);
    }
    if (twominusone < 0){
      int newplayer1 = player1 + Math.abs(twominusone);
      System.out.println("Player 1 new score: " + newplayer1);
    }
    if (twominusone == 0){
      System.out.println("It is a tie");
    }
  }
}
