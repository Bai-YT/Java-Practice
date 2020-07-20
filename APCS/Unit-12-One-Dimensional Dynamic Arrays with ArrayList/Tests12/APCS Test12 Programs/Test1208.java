import java.util.ArrayList;

public class Test1208
{
 	public static void main(String[] args)
    {
		ArrayList names = new ArrayList();
		names.add("Isolde");
		names.add("John");
		names.add("Greg");
		names.add("Maria");
		names.add("Heidi");
		for (int k = 0; k < 5; k++)
			names.set(k,"Anthony");
		System.out.println(names);
    }
}




