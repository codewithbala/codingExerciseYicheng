import java.util.Arrays;

class Question140
{
	public static void main(String[] args) 
	{
		// 140. Write a program to implement the Fibonacci sequence using dynamic programming.
		int n = 7;
		int result = fibonacci(n);
		System.out.println(result);
	}
	
	static int fibonacci(int n) 
	{
		int[] memo = new int[n + 1];
		Arrays.fill(memo, -1);
		return fibonacciUtil(n, memo);
	}
	
	static int fibonacciUtil(int n, int[] memo) 
	{
		if (n <= 1) 
		{
			return n;
		}
		
		if (memo[n] != -1) 
		{
			return memo[n];
		}
		
		memo[n] = fibonacciUtil(n - 1, memo) + fibonacciUtil(n - 2, memo);

		return memo[n];
	}

}