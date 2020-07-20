import java.util.ArrayList;

/*** Part (a) ***/

class RandomPlayer extends Player
{
  public RandomPlayer(String aName)
  {
    super(aName);
  }

  public String getNextMove(GameState state)
  {
    ArrayList<String> moves = state.getCurrentMoves();
    if (moves.isEmpty())
      return "no move";
    else
      return moves.get((int)(Math.random() * moves.size()));
  }
}

