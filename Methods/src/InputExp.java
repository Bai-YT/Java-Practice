import java.util.Scanner;


public class InputExp
{
	
public static Scanner input = new Scanner(System.in);

	public static void chooseBigger (int a, int b){
		System.out.println(Math.max(a,b));
	}
	
	public static int genRandom (int n1, int n2){
		return (int) ( Math.random() * ( n2 / n1 ) + n1 );
	}
	
	public static void guess(){
		System.out.print("Please enter an integer between 1 and 100: ");
		int g; int steps = 0;
		int n = (int) (Math.random() * 99 + 1);
		do{
			steps++;
			g = input.nextInt();
			if(g > 100 || g <= 0){
				System.out.println("The number should be between 1 and 100.");
				System.out.print("Please enter again: ");
			}
			else if(g > n)
				System.out.print("Please enter a smaller number: ");
			else if (g < n)
				System.out.print("Please enter a bigger number: ");
			else{
				System.out.println("Congratulations! The number is " + n + ".");
				System.out.print("You took " + steps + " steps to find the number.");
			}
		}
		while(g != n);
	}
		
	public static void main (String[] args)
	{
		//int num1 = input.nextInt();
		//int num2 = input.nextInt();
		//chooseBigger(num1, num2);
		//System.out.println("Random Generated "+genRandom(num1, num2));
		guess();
	}	
}