import java.util.Scanner;

public class Calculator 
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		double num1;
		double num2;
		String operation;
		char operator;
		
		System.out.print("Enter first double: ");
		num1 = input.nextInt();
		
		System.out.print("\nEnter a mathematical operator (+,-,*,/): ");
		operation = input.next();
		
		System.out.print("\nEnter second double: ");
		num2 = input.nextInt();
		
		input.close();
		
		operator = operation.charAt(0);
		
		if (operator == '+')
		{
			System.out.printf("\n%f + %f = ", num1, num2);
			System.out.printf( "%f", num1 + num2);
		}
		else if (operator == '-')
		{
			System.out.printf("\n%f - %f = ", num1, num2);
			System.out.printf("%f", num1 - num2);
		}
		else if (operator == '*')
		{
			System.out.printf("\n%f * %f = ", num1, num2);
			System.out.printf("%f", num1 * num2);
		}
		else if(operator == '/')
		{
			System.out.printf("\n%f / %f = ", num1, num2);
			System.out.printf("%f", num1 / num2);
		}
		else
		{
			System.out.print("\nInvalid operator.");
		}
	}
}
