import java.util.ArrayList;

public class Test1212
{
 	public static void main(String[] args)
    {
		ArrayList numbers = new ArrayList();

		int k;
		for (k = 1; k <= 10; k++)
			numbers.add(new Integer(k));

		int sum = 0;
		for (k = 0; k < numbers.size(); k++)
		{
			Integer temp = (Integer) numbers.get(k);
			sum += temp.intValue();
		}

		double average = (double) sum / numbers.size();
		System.out.println(average);
    }
}




