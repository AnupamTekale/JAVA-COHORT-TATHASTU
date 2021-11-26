import java.util.*;
public class factorial
{
	static int fact(int n)
	{
		if(n==0)
			return 1;
		else
			return n * fact(n-1);
	}
	public static void main(String s[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = in.nextInt();
		System.out.println("Factorial of a number is : " + fact(num));
	}
}