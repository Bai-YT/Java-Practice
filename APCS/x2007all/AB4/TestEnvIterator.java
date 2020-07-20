import java.util.Iterator;
import java.util.List;

public class TestEnvIterator
{
  public static void main(String[] args)
  {
    BoundedEnv env1 = new BoundedEnv(5, 5);
    Iterator<Location> it = new EnvIterator(env1);
    while (it.hasNext())
      System.out.println(it.next());

    BoundedEnv env2 = new BoundedEnv(4, 4);
    new Fish(env2, new Location(0, 0));
    new Fish(env2, new Location(0, 2));
    new Fish(env2, new Location(1, 1));
    new Fish(env2, new Location(1, 3));
    new Fish(env2, new Location(2, 1));
    new Fish(env2, new Location(3, 1));
    EmptyLocs test = new EmptyLocs();
    System.out.println(test.emptyLocs(env2, 5));
  }
}
