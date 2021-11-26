import java.util.*;
public class remove
{
	public static void main(String s[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size :");
		int size = in.nextInt();
		List<Integer> al = new ArrayList<>();
		for(int i=0;i<size;i++)
			al.add(in.nextInt());
		
		System.out.print("Enter the number to remove :");
		int num = in.nextInt();
		if(al.contains(num))
		{
			al.remove(num);
			System.out.println("After removing " + num + " arraylist is " + al);
		}
		else
			System.out.println("The given number is not in the arraylist");
		
	}
}