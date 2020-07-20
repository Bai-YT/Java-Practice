// Generics02
// This class tests the <IntArray> implementation of the <IntList> interface.


public class Runner02
{
	public static void main (String[] args)
	{
      IntArray numbers = new IntArray();
      
      for (int k = 0; k < 10; k++)
         numbers.add(k + 100);
      System.out.println(numbers);
      
      numbers.add(10,999);
      numbers.add(0,999);
      System.out.println(numbers);
      
      for (int k = 0; k < numbers.size(); k++)
         System.out.print(numbers.get(k) + "  ");
      System.out.println("\n");
      
      numbers.set(3,555);
      numbers.set(6,555);
      System.out.println(numbers);
      
      numbers.remove(3);
      numbers.remove(6);
      System.out.println(numbers);
	}
}
