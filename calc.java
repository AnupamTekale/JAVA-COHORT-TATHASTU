import java.util.*;
public class calc
{
	static void add(int a, int b)
	{
		System.out.println("Addition = " + (a + b));
	}
	static void subtract(int a, int b)
	{
		System.out.println("Subtraction = " + (a - b));
	}
	static void multiply(int a, int b)
	{
		System.out.println("Multiplication = " + (a * b));
	}
	static void division(int a, int b)
	{
		if(a>b && b!=0)
			System.out.println("Division = " +(float) (a / b));
		else
			System.out.println("A IS SMALLER THAN B");
	}
	
	public static void main(String s[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first number :");
		int num1 = in.nextInt();
		System.out.print("Enter second number :");
		int num2 = in.nextInt();
		
		System.out.print("Enter an operator (+, -, *, /): ");
        char op = in.next().charAt(0);
		
		switch(op)
		{
			case '+' : 
			add(num1,num2);
			break;
			
			case '-' :
			subtract(num1,num2);
			break;
			
			case '*' :
			multiply(num1,num2);
			break;
			
			case '/' :
			division(num1,num2);
			break;
			
			default :
			System.out.println("Entered wrong operation");
			break;
		}
		
	}
}