import java.util.ArrayList;

public class Test1216
{
 	public static void main(String[] args)
 	{
		ArrayList<Double> reals = new ArrayList<Double>();
		reals.add(400.0);
		reals.add(500.0);
		reals.add(600.0);

		Double realObject = reals.get(0);
		double realPrimitive = (reals.get(0)).doubleValue();
    }
}




