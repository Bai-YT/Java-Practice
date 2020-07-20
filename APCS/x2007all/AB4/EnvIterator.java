import java.util.Iterator;

public class EnvIterator implements Iterator<Location>
{
  private Environment env; // the environment over which to iterate
  private Location loc;    // the next location to be returned

  /** @param anEnv the environment over which to iterate
   *         Precondition: anEnv is square, i.e., anEnv.numRows() == anEnv.numCols()
   */
  public EnvIterator(BoundedEnv anEnv)
  {
    env = anEnv;
    loc = new Location(0, 0);
  }

  /** @return true if this EnvIterator has more elements
   *          false otherwise
   */
  public boolean hasNext()
  { return env.isValid(loc); }

  /*** Part (a) ***/

  /** Precondition: hasNext() returns true
   *  Postcondition: loc has been updated to the successor location
   *  @return the next location in the environment
   */
  public Location next()
  {
    int row = loc.row();
    int col = loc.col();
    Location oldLoc = loc;

    if (row == env.numRows() - 1)
      loc = new Location(col + 1, env.numCols() - 1);
    else if (col == 0)
      loc = new Location(0, row + 1);
    else
      loc = new Location(row + 1, col - 1);

    return oldLoc;
  }

/*
  public Location next()
  {
    int row = loc.row();
    int col = loc.col();

    if (row == env.numRows() - 1)
    {
      row = col + 1;
      col = env.numCols() - 1;
    }
    else if (col == 0)
    {
      col = row + 1;
      row = 0;
    }
    else
    {
      row++;
      col--;
    }

    Location oldLoc = loc;
    loc = new Location(row, col);

    return oldLoc;
  }
*/


  /****************/

  /*
   * Throws an UnsupportedOperationException since it is impossible to
   * remove a location from an environment.
   */
  public void remove()
  { throw new UnsupportedOperationException(); }
}
