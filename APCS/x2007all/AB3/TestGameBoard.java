public class TestGameBoard
{
  public static void main(String[] args)
  {
    GameBoard board = new GameBoard(4);
    System.out.println(board + "\n" + board.getMaxScore());
  }
}
