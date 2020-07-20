// Java1207.java
// This program demonstrates how <int> values stored into an <ArrayList> 
// object are first converted to <Integer> objects.
// The <Integer> class is called a "wrapper" class.
// Try running with commented-out line #30.


import java.util.ArrayList;

public class Java1207
{
	public static void main(String[] args)
	{
		ArrayList numbers = new ArrayList();

		for (int k = 1; k <= 500; k++)
		{
			int rndInt = (int) (Math.random() * 900 + 100);
			numbers.add(new Integer(rndInt));
         System.out.print(rndInt + "  ");
         if (k % 15 == 0)
            System.out.println();
		}

		int sum = 0;
		for (int k = 0; k < numbers.size(); k++)
		{
			Integer temp = (Integer) numbers.get(k);  
			sum += temp.intValue();
         // sum += numbers.get(k);  
		}
		System.out.println("\n\nSum: " + sum);
	}
}

