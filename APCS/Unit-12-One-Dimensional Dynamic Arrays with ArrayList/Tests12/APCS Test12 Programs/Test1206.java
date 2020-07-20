import java.util.ArrayList;

public class Test1206
{
 	public static void main(String[] args)
    {
		ArrayList names = new ArrayList();
		names.remove(1);
		names.remove(2);
		names.add("John");
		names.add("Greg");
		names.add("Maria");
		names.add("Heidi");
		System.out.println();
		for (int k = 0; k < names.size(); k++)
			System.out.print(names.get(k) + "  ");

    }
}




