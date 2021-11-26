import java.util.*;
public class palindrome
{
	static String reverse(String s)
	{
		String rev ="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		return rev;
	}		
	public static void main(String hehe[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = in.next();
		String palindro ="";
		palindro = reverse(str);
		if(palindro.equals(str))
			System.out.println("Given string is a Palindrome");
		else
			System.out.println("It is not a Palindrome");
	}
}