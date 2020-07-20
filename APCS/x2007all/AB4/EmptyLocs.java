import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class EmptyLocs
{
  /*** Part (b) ***/

  /** @param env the environment over which to iterate
   *         Precondition: env is square, i.e., env.numRows() == env.numCols()
   *  @param n the desired number of empty locations to be returned
   *         Precondition: n > 0
   *  @return a list of the first n empty locations;
   *          all empty locations if there are fewer than n empty locations.
   *          Locations are ordered in the order in which they are visited by the  EnvIterator
   */
  public List<Location> emptyLocs(BoundedEnv env, int n)
  {
    List<Location> emptyLocs = new LinkedList<Location>();
    Iterator<Location> it = new EnvIterator(env);
    int count = 0;

    while (count < n && it.hasNext())
    {
      Location loc = it.next();
      if (env.isEmpty(loc))
      {
        emptyLocs.add(loc);
        count++;
      }
    }

    return emptyLocs;
  }
}
