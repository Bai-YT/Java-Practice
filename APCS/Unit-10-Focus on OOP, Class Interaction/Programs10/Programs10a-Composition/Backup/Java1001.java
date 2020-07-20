// Java1001.java
// This program introduces the first stage of <Point> class, which
// stores the (X,Y) values of one coordinate graphics location.


public class Java1001
{
	public static void main(String[] args)
	{
      Point point = new Point();
      System.out.println("Point at (" + point.getX() + "," + point.getY() + ")");
	}
}


class Point
{
   private int x, y;

   public Point()
   {
      x = 0;
      y = 0;
   }

   public int getX()
   {
      return x;
   }

   public int getY()
   {
      return y;
   }

}


