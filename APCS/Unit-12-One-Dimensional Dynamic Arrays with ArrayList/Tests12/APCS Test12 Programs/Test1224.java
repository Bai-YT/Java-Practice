import java.util.ArrayList;

public class Test1224
{
 	public static void main(String[] args)
 	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Isolde");
		names.add("John");
		names.add("Greg");
		names.add("Maria");
		names.add("Heidi");

		for (String name : names)
		{
			name = "Qwerty";
			System.out.print(name + "  ");
		}
    }
}







