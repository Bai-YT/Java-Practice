import java.util.Random;

public class DYRT0601Q09
{
	public static void main(String[] args)
	{
      Random rand = new Random();
      for (int k = 1; k <= 10; k++)
         System.out.println(rand.nextInt(1001));
	}
}
