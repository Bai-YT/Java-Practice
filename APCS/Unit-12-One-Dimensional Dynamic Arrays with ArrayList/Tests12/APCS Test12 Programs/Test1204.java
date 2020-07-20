import java.util.ArrayList;

public class Test1204
{
 	public static void main(String[] args)
    {
		ArrayList names = new ArrayList();
		names.add("John");
		names.add("Greg");
		names.add("Maria");
		names.add("Heidi");
		names.set(2,"Jessica");
		System.out.println();
		for (int k = 0; k < names.size(); k++)
			System.out.print(names.get(k) + "  ");
    }
}




