
public class FR0903
{
   public static void main(String[] args)
   {
     System.out.println(getGCF(120,108));
   }
   
   public static int getGCF (int num1, int num2)	
	{
		int gcf = 1;  int remainder = 1;
		while (remainder != 0)
		{
			remainder = num1 % num2;
			if (remainder == 0)
				gcf = num2;
			else
			{
				num1 = num2;
				num2 = remainder;
			}
		}
		return gcf;
	}
}