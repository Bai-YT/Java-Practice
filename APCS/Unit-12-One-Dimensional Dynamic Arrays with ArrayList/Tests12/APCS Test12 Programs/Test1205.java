import java.util.ArrayList;

public class Test1205
{
 	public static void main(String[] args)
    {
		ArrayList names = new ArrayList();
		names.add("John");
		names.add("Greg");
		names.add("Maria");
		names.add("Heidi");
		names.remove(1);
		names.remove(2);
		System.out.println();
		for (int k = 0; k < names.size(); k++)
			System.out.print(names.get(k) + "  ");
    }
}




