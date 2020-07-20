
public class FR0803
{
   public static void main(String[] args)
   {
      System.out.println(isPalindrome("AARDVARK"));
      System.out.println(isPalindrome("RACECAR"));
   }
   
   public static String getReverse(String s)
	{
      String temp = ""; 
		int n = s.length()-1;
		for (int k = n; k >= 0; k--)
			temp += s.substring(k,k+1);
      return temp;	
	}	
   
   public static boolean isPalindrome(String s)
   {
      String temp = getReverse(s);
      return s.equals(temp);
   }
   
}