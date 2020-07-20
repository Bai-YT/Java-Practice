// Java1002.java
// The <Point> class is improved with a second "overloaded" constructor.


public class Java1002
{
	public static void main(String[] args)
	{
      Point point1 = new Point();
      System.out.println("Point1 at (" + point1.getX() + "," + point1.getY() + ")");

      Point point2 = new Point(500,300);
      System.out.println("Point2 at (" + point2.getX() + "," + point2.getY() + ")");
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

   public Point(int x, int y)
   {
      this.x = x;
      this.y = y;
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
