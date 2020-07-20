public class Test0823
{
 	public static void main(String[] args)
 	{
		String s1 = "Noel";
		String s2 = "";
		int n = s1.length();
		for (int k = 0; k < n; k++)
			s2 += s1.substring(0,k);
		System.out.println(s2);
 	}
}




