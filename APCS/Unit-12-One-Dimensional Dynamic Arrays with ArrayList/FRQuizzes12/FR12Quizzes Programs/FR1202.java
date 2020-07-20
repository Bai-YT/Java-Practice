
import java.util.ArrayList;

public class FR1202
{
	public static void main(String[] args)
	{
      Names names = new Names();
      names.addName("Tom");
      names.addName("Sue");
      names.addName("Bob");
      names.addName("Meg");
      
      names.showList();
      names.reverseList();
      names.showList();

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
   
   public void reverseList()
	{
		int start = 0;
		int end = list.size() - 1;
		while (start <= end/2)
		{
			swapNames(start,end);
			start++;
			end--;
		}
	}

   
   
   public void showList()
   {
      System.out.println(list);
   }
}
