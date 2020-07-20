package checkeven;
import java.text.DecimalFormat;
public class CheckEven {
	
	
	private static DecimalFormat df1 = new DecimalFormat(".##");
	
	static int x = 10;
	public static void main(String[] args) {
		
		/*int number = 13;
		CheckEvenNumber(number);
		int sum = add(67,56);// sum = 67+56
		System.out.println(6.95+6.49);
		System.out.println(df1.format(add(6.95,6.49)));*/
		x = changeme(x);
		System.out.println(x);
		}
	public static int changeme(int x)
	{
		x=20;
		return x;
	}
	
	public static void CheckEvenNumber(int a){
		if(a % 2 == 1){
			System.out.println("The number is odd.");
		}
		else{
			System.out.println("The number is even.");
		}
	}
	public static int add(int a, int b)
	{
	int s = a+b;
		return s;
	}
	public static double add(double a, double b)
	{
	return a+b;
	}
}

