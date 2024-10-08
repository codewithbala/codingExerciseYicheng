import java.util.*;

class Question49 {
	public static void main(String[] args) 
	{
		System.out.println("#49. Write a program to print Pascal's triangle up to n rows. ");
		System.out.println("Please input a number >= 0 : ");
		
		boolean correctInput = false;
		int number = -1;
		
		while(correctInput == false)
		{
			try 
			{
				Scanner s = new Scanner(System.in);  
				number = s.nextInt();
				if(number >= 0)
				{
					correctInput = true;
				}
				else 
				{
					System.out.println("Wrong Input, Please input a positive number:");
					correctInput = false;
				}
			} 
			catch (Exception e) 
			{
				System.out.println("Wrong Input, Please Try Again:");
				correctInput = false;
			}
		}
		
		
		if(number < 2)
		{
			System.out.println("1 ");
		}
		else if(number == 2)
		{
			System.out.println("1 ");
			System.out.println("1 1 ");
		}
		else 
		{
			System.out.println("1 ");
			System.out.println("1 1 ");
			
			int i = 3;
			int[] preArray = {1, 1};
			while(i <= number)
			{
				int[] array = new int[i];
				array[0] = 1;
				for(int j = 1; j < preArray.length; j++)
				{
					array[j] = preArray[j-1] + preArray[j];
				}
				array[i-1] = 1;
				
				for(int k = 0; k < array.length; k++)
				{
					System.out.print(array[k] + " ");
				}
				System.out.println();
				preArray = array;
				
				i++;
			}
			
		}
		
		
	}
}