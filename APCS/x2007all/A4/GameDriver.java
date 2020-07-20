public class GameDriver
{
  private GameState state;  // the current state of the game

  public GameDriver(GameState initial)
  { state = initial; }

  /*** Part (b) ***/

  /** Plays an entire game, as described in the problem description
   */
  public void play()
  {
    System.out.println(state);

    while(!state.isGameOver())
    {
      Player p = state.getCurrentPlayer();
      String move = p.getNextMove(state);
      System.out.println(p.getName() + " ==> " + move);
      state.makeMove(move);
    }

    Player winner = state.getWinner();

    if (winner != null)
      System.out.println(winner.getName() + " wins");
    else
      System.out.println("Game ends in a draw");
  }
}
