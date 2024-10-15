import java.util.*;
import java.util.regex.Pattern;

class Question56
{
	public static void main(String[] args) 
	{
		System.out.println("#56. Write a program to implement a simple calculator to evaluate an expression string with +, -, *, /.  ");
				
		while(true)
		{
			System.out.println("Please input a string <number1> <operator> <number2> :");
			Scanner s = new Scanner(System.in);  
			String input = s.nextLine();
			if(input.equals("q"))
			{
				break;
			}
			else 
			{
				Pattern pattern = Pattern.compile("^(\\-|\\+)?\\d+(\\.\\d+)?(\\s+)?[\\-|\\+\\*\\/](\\s+)?(\\-|\\+)?\\d+(\\.\\d+)?");
				if(pattern.matcher(input).matches())
				{
					input = input.replace(" ", "");
					double n1 = 1;
					double n2 = 1;
					int operatorIndex = 0;
					String operator1 = "";
					String operator2 = "";
					String operator3 = "";
					
					for(int i = 0; i < input.length(); i++)
					{
						char o = input.charAt(i);
						if(i == 0) 
						{
							if(o == '-' || o == '+')
							{
								operator1 = String.valueOf(o);
							}
						}
						
						if((o == '-' || o == '+' || o == '*' || o == '/') && operator2.equals("") && (i > 0))
						{
							operator2 = String.valueOf(o);
							operatorIndex = i;
						}
						
						if(!operator2.equals("") && (o == '-' || o == '+'))
						{
							operator3 = String.valueOf(o);
						}
					}
					
					double number1 = Double.valueOf(input.substring(0, operatorIndex));
					double number2 = Double.valueOf(input.substring(operatorIndex+1, input.length()));
					if(operator2.equals("-"))
					{
						System.out.println("result = " + (number1 - number2));
					}
					if(operator2.equals("+"))
					{
						System.out.println("result = " + (number1+number2));
					}
					if(operator2.equals("*"))
					{
						System.out.println("result = " + (number1*number2));
					}
					if(operator2.equals("/"))
					{
						if(number2 != 0)
						{
							System.out.println("result = " + (number1/number2));
						}
						else
						{
							System.out.println("result = " + number1 + " / " + number2);
						}
					}
				}
				else 
				{
					System.out.println("Wrong Input, please try again");
				}
			}
		}
		
	}
}