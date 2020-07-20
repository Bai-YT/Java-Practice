import java.util.ArrayList;

public class Test1223
{
 	public static void main(String[] args)
 	{
		ArrayList<String> names1 = new ArrayList<String>();
		ArrayList<String> names2 = new ArrayList<String>();

		names1.add("Isolde");
		names1.add("John");
		names1.add("Greg");
		names1.add("Maria");
		names1.add("Heidi");

		System.out.println(names1);

		for (String name: names1)
			names2.add(name);

		System.out.println(names2);

    }
}







