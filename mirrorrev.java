import java.util.*;
public class mirrorrev
{
	static boolean isMirrorInverse(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[arr[i]]!=i)
				return false;
		}
		return true;
		
		
	}
	public static void main(String s[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int size = in.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
			arr[i]=in.nextInt();
		
		if (isMirrorInverse(arr))
            System.out.println("Yes");
        else
            System.out.println("No");
		
	}
}