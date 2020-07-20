import java.util.ArrayList;

public class Test1221
{
 	public static void main(String[] args)
 	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Isolde");
		names.add("John");
		names.add("Greg");
		names.add("Maria");

		System.out.println(names);

		for (int index = 0; index < names.size(); index++)
			System.out.print(names.get(index) + ", ");

		System.out.println();

		for (String name: names)
			System.out.print(name + ", ");
    }
}







