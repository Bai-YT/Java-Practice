public class Test0825
{
 	public static void main(String[] args)
 	{
		String s1 = "Noel";
		String s2 = "";
		for (int k = s1.length(); k > 0; k--)
			s2 += s1.substring(k);
		System.out.println(s2);
 	}
}



