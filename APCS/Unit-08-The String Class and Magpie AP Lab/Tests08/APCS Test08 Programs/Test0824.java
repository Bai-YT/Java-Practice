public class Test0824
{
 	public static void main(String[] args)
 	{
		String s1 = "Noel";
		String s2 = "";
		int n = s1.length();
		for (int k = 0; k < n; k++)
			s2 += s1.substring(k);
		System.out.println(s2);
 	}
}



