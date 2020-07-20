import java.awt.Color;

public class PounceFish extends Fish
{
  private int range;  // the distance that a  PounceFish can see; range > 0

  public PounceFish(Environment env, Location loc)
  {
    super(env, loc, env.randomDirection(), Color.yellow);
  }

  public PounceFish(Environment env, Location loc, Direction dir)
  {
    super(env, loc, dir, Color.yellow);
  }

  public PounceFish(Environment env, Location loc, Direction dir, Color col)
  {
    super(env, loc, dir, col);
  }

  protected void generateChild(Location loc)
  {
    PounceFish child = new PounceFish(environment(), loc,
                                        environment().randomDirection(),
                                        color());
  }

  public void setRange(int r)
  {
    range = r;
  }

  /*** Part (a) ***/

  /** Looks ahead range locations in current direction
   *  @return the nearest fish in that direction within range (if any);
   *          null if no such fish is found
   */
  private Fish findFish()
  {
    Environment env = environment();
    Location loc = location();
    for (int k = 0; k < range; k++)
    {
      loc = env.getNeighbor(loc, direction());
      if (env.isValid(loc) && !env.isEmpty(loc))
        return (Fish)env.objectAt(loc);
    }
    return null;
  }

  /*** Part (b) ***/

  /** Acts for one step in the simulation
   */
  public void act()
  {
    if (!isInEnv())
      return;

    Fish prey = findFish();

    if (prey != null)
    {
      Location preyLoc = prey.location();
      prey.die();
      changeLocation(preyLoc);
    }
    else
      super.act();
  }
}
