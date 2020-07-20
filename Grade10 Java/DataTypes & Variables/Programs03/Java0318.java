// Java0318.java
// This program does exactly the same thing as the previous program.
// By using self-commenting variables, the program is much easier to read and understand.

public class Java0318
{
	public static void main (String[] args)
	{
		double hoursWorked;
		double hourlyRate;
		double grossPay;
		double deductions;
		double netPay;

		hoursWorked = 35;
		hourlyRate = 8.75;
		grossPay = hoursWorked * hourlyRate;
		deductions = grossPay * 0.29;
		netPay = grossPay - deductions;

		System.out.println("Hours Worked: 	" + hoursWorked);
		System.out.println("Hourly Rate:    " + hourlyRate);
		System.out.println("Gross Pay:      " + grossPay);
		System.out.println("Deductions:     " + deductions);
		System.out.println("Net Pay:        " + netPay);
		System.out.println();
	}
}
