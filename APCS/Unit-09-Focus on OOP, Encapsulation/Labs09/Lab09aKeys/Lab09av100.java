// Lab09av100.java
// The Rational Class Program I
// This is the completed 100 Point Version of the Lab09a assignment.


import java.util.Scanner;


public class Lab09av100
{
	private static int num, den;   // numerator and denominator of the rational number

	public static void main (String[] args)
	{
		enterData();
		Rational r = new Rational(num,den);
		r.displayData();
	}

	public static void enterData()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the numerator ----> ");
		num = input.nextInt();
		System.out.print("\nEnter the denominator --> ");
		den = input.nextInt();
	}
}



class Rational
{

	private int reducedNum,firstNum;
	private int reducedDen,firstDen;
   private int gcf;

	public Rational(int n, int d)
	{
		firstNum = reducedNum = n;
		firstDen = reducedDen = d;
		reduce();
	}

	public double getDecimal() { return (double) firstNum/firstDen; }

	public String getReduced() { return reducedNum + "/" + reducedDen; }

	public String getOriginal() { return firstNum + "/" + firstDen; }

	public void reduce()
	{
		getGCF(firstNum,firstDen);
		reducedNum /= gcf;
		reducedDen /= gcf;
	}

	public void displayData()
	{
		System.out.println();
		System.out.println(getOriginal() + " equals " + getDecimal());
		System.out.println();
		System.out.println("and reduces to " + getReduced());
		System.out.println();
	}

	private void getGCF(int n1,int n2)
	{
		int rem = 0;
		gcf = 1;
		do
		{
			rem = n1 % n2;
			if (rem == 0)
				gcf = n2;
			else
			{
				n1 = n2;
				n2 = rem;
			}
		}
		while (rem != 0);
	}
}








