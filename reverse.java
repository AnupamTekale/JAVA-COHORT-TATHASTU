import java.util.*;
public class reverse
{
	static void reverse(String s)
	{
		String rev ="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		System.out.println("REVERSED WORD IS : " + rev);
	}		
	public static void main(String hehe[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = in.next();
		reverse(str);
	}
}