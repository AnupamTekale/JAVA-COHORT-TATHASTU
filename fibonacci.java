import java.util.*;


class fibonacci {
  
  static int[] fib; 

  public static void fibonacci(int n) {
    fib = new int[n+1];
    fib[0] = 0; 
    fib[1] = 1;
    
    for(int i = 2; i <= n; i++) {
      fib[i] = fib[i-1] + fib[i-2];
    }

    System.out.println(Arrays.toString(fib));
  }
  
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
	  System.out.print("Enter the number : ");
      int n = in.nextInt();
      fibonacci(n);    
  }
}
