// Java0319.java
// This program adds a multi-line comment at the beginning to help explain the program.
// Several single-line comments are also added to provide more detail for each variable.

/********************************************************************
 **                                                                **
 **   Payroll Program                                              **
 **   Written by Leon Schram 09-07-15                              **
 **                                                                **
 **   This program takes the hours worked and hourly rate of       **
 **   an employee and computes the gross pay earned.               **
 **   Federal deductions are computed as 29% of gross pay.         **
 **   Finally the take-home pay or net pay is computed by          **
 **   subtraction deductions from gross pay.                       **
 **                                                                **
 ********************************************************************/

public class Java0319
{
	public static void main (String[] args)
	{
		double hoursWorked;	  // hours worked per week
		double hourlyRate;	  // payrate earned per hour
		double grossPay;	  // total earnings in a week
		double deductions;	  // total federal tax deductions
		double netPay;		  // employee take-home pay

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
