public class Test0911
	{
	    public static void main (String args[ ])
	    {
	        Piggy kathy = new Piggy("Kathy",1500.0);
	        Piggy rachel = new Piggy("Rachel",2500.0);
	        kathy.showData();								            // Line 1
	        System.out.println("Name:     " + rachel.name);     // Line 2
	        System.out.println("Savings:  " + rachel.savings);  // Line 3
	    }
	}

	class Piggy
	{
	    public double savings;
	    private String name;

	    public Piggy(String n, double s)
	    {
	        name = n;
	        savings = s;
	    }

	    public void showData()
	    {
	        System.out.println("Name:     " + name);			   // Line 4
	        System.out.println("Savings:  " + savings);			// Line 5
	    }
	}
