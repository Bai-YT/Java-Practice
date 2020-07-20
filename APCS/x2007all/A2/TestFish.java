public class TestFish
{
  public static void main(String[] args)
  {
    BoundedEnv env = new BoundedEnv(4, 6);
    Fish f1 = new Fish(env, new Location(0, 2));
    Fish f2 = new Fish(env, new Location(1, 0));
    Fish f3 = new Fish(env, new Location(1, 3));
    Fish f4 = new Fish(env, new Location(1, 4));
    Fish f5 = new Fish(env, new Location(2, 1));
    PounceFish p = new PounceFish(env, new Location(1, 1), Direction.EAST);
    p.setRange(2);
    SimpleMBSDisplay display = new SimpleMBSDisplay(env, 1000);
    display.showEnv();
    p.act();
    display.showEnv();
  }
}

