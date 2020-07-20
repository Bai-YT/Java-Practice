import java.util.ArrayList;

public class Test1227
{
 	public static void main(String[] args)
 	{
		ArrayList<String> list1 = new ArrayList<String>();
      ArrayList<String> list2 = list1;
      list1.add("Tom");
      list1.add("Sue");
      list1.add("Bob");
      list1.add("Ann");
      list2.set(2,"Joe");
      
      System.out.println(list1);
      System.out.println(list2);
      
   }
}







