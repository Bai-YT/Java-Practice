import java.util.ArrayList;

public class DYRT1201Q10
{
	public static void main(String[] args)
	{
      ArrayList<String> names = new ArrayList<String>();
      names.add("Tom");
      names.add("Sue");
      names.add("Bob");
      names.add("Meg");
      
      for (int index = 0; index < names.size(); index++)
	      System.out.println(names.get(index));
         
      for (String name: names)
	      System.out.println(name);
	}
}
