
public class FR0801
{
   public static void main(String[] args)
   {
      printReverse("AARDVARK");
   }
   
   public static void printReverse(String s)
	{
		int n = s.length()-1;
		for (int k = n; k >= 0; k--)
			System.out.print(s.substring(k,k+1));	
	}	
}