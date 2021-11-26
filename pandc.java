import java.util.*;
public class pandc
{
	static int fact(int number)
	{
		if(number==0)
			return 1;
		else
			return number*fact(number-1);
	}
	
	public static void main(String s[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter value of n : ");
		int n = in.nextInt();
		System.out.print("Enter value of r : ");
		int r = in.nextInt();
		int combination = fact(n) / (fact(r) * fact(n-r));
		int permutation = fact(n) / fact(n-r);
		
		System.out.println("Permutation = " + permutation + "\n" + "Combination = " + combination);
	}
}	