
public class FR0802
{
   public static void main(String[] args)
   {
      System.out.println(getReverse("AARDVARK"));
   }
   
   public static String getReverse(String s)
	{
      String temp = ""; 
		int n = s.length()-1;
		for (int k = n; k >= 0; k--)
			temp += s.substring(k,k+1);
      return temp;	
	}	
}