
public class FR0901
{
   public static void main(String[] args)
   {
     for (int k = 1; k <= 20; k++)
      System.out.print(getRandom(10,99) + " ");
   }
   
   public static int getRandom (int min, int max)
   {
	   int range = max - min + 1;
	   double temp = Math.random() * range;
	   int rnd = (int) temp + min;
	   return rnd;
   }
}