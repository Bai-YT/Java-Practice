public class Test0822
{
 	public static void main(String[] args)
 	{
		String s1 = "Aardvark";
		String s2 = "";
		for (int k = 1; k <= 3; k++)
			s2 += s1.substring(k);
		System.out.println(s2);
 	}
}


