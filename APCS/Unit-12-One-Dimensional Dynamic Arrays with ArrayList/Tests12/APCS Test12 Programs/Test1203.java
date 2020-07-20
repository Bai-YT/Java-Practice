import java.util.ArrayList;

public class Test1203
{
 	public static void main(String[] args)
    {
		ArrayList names = new ArrayList();
		names.add("John");
		names.add("Greg");
		names.add("Maria");
		names.add("Heidi");
		names.add(2,"Jessica");
		System.out.println();
		for (int k = 0; k < names.size(); k++)
			System.out.print(names.get(k) + "  ");
    }
}




