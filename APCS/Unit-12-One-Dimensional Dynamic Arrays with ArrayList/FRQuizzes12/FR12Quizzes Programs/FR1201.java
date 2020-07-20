
import java.util.ArrayList;

public class FR1201
{
	public static void main(String[] args)
	{
      Names names = new Names();
      names.addName("Tom");
      names.addName("Sue");
      names.addName("Bob");
      names.addName("Meg");
      
      names.showNames();
      names.swapNames(1,2);
      names.showNames();

	}
}



class Names
{
	ArrayList<String> list;
	
	public Names()
	{
		list = new ArrayList<String>();
	}
   
   public void addName(String s)
   {
      list.add(s);
   }
	
	public void swapNames(int p, int q)
	{
		String temp = list.get(p);
		list.set(p,list.get(q));
		list.set(q,temp);
	}
   
   public void showNames()
   {
      System.out.println(list);
   }
}
