import java.util.*; 

class Question6
{
	public static void main(String[] args) 
	{
		System.out.println("#6 Write a program to print the first n prime numbers.  ");
		System.out.println("Please input a int number: ");
		
		boolean correctInput = false;
		int number = 1;
		
		while(correctInput == false)
		{
			try 
			{
				Scanner s = new Scanner(System.in);  
				number = s.nextInt();
				correctInput = true;
			} 
			catch (Exception e) 
			{
				System.out.println("Wrong Input, Please Try Again:");
				correctInput = false;
			}
		}
		
		if(number == 1)
		{
			System.out.println("1");
		}
		else if(number == 2)
		{
			System.out.println("1 2");
		}
		else 
		{
			System.out.print("1 2 ");
			for(int i = 3, j = 3 ; i <= number; i++, j=j+2)
			{
				boolean isPrime = true;
				int k = 2;
				while( k*k <= j)
				{
					if( j%k == 0)
					{
						isPrime = false;
						break;
					}
					else 
					{
						k++;
					}
				}
				
				if(isPrime = true)
				{
					System.out.print(j + " ");
				}
			}
		}
	}
}