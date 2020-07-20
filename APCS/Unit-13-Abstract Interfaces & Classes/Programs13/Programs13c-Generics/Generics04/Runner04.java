// Generics04
// The <Runner04> class tests the "generic" <ObjArray> class.


public class Runner04
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
      
      names.add(0,"Braxi");
      names.add(6,"Marie");
      System.out.println(names);
      
      for (int k = 0; k < names.size(); k++)
         System.out.print(names.get(k) + "  ");
      System.out.println("\n");
      
      names.set(3,"Aardvark");
      System.out.println(names.set(4,"Aardvark"));
      System.out.println(names);
      
      names.remove(3);
      names.remove(4);
      System.out.println(names);
	}
}
