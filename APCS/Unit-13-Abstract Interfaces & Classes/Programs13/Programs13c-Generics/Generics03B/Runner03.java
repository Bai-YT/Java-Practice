// Generics03B
// The <Runner03> class tests the "generic" <ObjArray> class.
// This runner class is 100% identical to the one used in the
// Generics03A folder.
// This testing class does not know or care about <E> or <Aardvark>.


public class Runner03
{
	public static void main (String[] args)
	{
      ObjArray<String> names = new ObjArray<String>();
      names.add("Isolde");
      names.add("John");
      names.add("Greg");
      names.add("Maria");
      names.add("Heidi");
      System.out.println(names);
      
      names.add(5,"Braxi");
      names.add(0,"Marie");
      System.out.println(names);
      
      for (int k = 0; k < names.size(); k++)
         System.out.print(names.get(k) + "  ");
      System.out.println("\n");
      
      names.set(3,"Aardvark");
      names.set(4,"Aardvark");
      System.out.println(names);
      
      names.remove(3);
      names.remove(4);
      System.out.println(names);
	}
}
