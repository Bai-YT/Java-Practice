public class Test0830
{
 	public static void main(String[] args)
 	{
		String s1 = "The rain in spain falls mainly in the plain";
		String s2 = "in";
      for (int k = 10; k < s1.length(); k+=10)
      {
		   System.out.print(s1.indexOf(s2,k) + "  ");
      }
 	}
}


