
public class Test1023
{
   public static void main(String[] args)
   {
      Point point = new Point(500,300);
      System.out.println("Point at (" + point.getX() + "," + point.getY() + ")");
   }
}


class Point
{
   private int x;
   private int y;

   public Point(int x, int y)
   {
      this.x = x;
      this.y = y;
   }

   public int getX() 	{ return x; }
   public int getY()	{ return y; }
}



