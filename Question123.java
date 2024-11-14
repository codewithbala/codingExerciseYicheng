import java.util.*;
import javax.sound.midi.*;
import java.awt.*;

class tNode
{
	String data;
	tNode left;
	tNode right;
	
	tNode(String data)
	{
		this.data = data;
	}
}

class Tree
{
	tNode root;
	Tree(tNode root)
	{
		this.root = root;
	}
	
	public String toString()
	{
		return toStringR(root);
	}
	
	public String toStringR(tNode root)
	{
		if(root != null)
		{
			String res = "";
			String s1 = toStringR(root.left);
			String s2 = toStringR(root.right);
			if(!s1.equals(""))
			{
				res = s1;
			}
			
			if(!res.equals(""))
			{
				if(!s2.equals(""))
				{
					res = res + " " + s2;
				}
			}
			else 
			{
				res = s2;
			}
			
			if(!res.equals(""))
			{
				res = res + " " + root.data;
			}
			else 
			{
				res = root.data;
			}
			
			
			return res;
		}
		else 
		{
			return "";
		}
	}
	
	
	public void print()
	{
		printR(root);
	}
	
	public void printR(tNode node)
	{
		if(node != null)
		{
			System.out.print(node.data);
			if(node.left != null || node.right != null)
			{
				System.out.print("(");
				printR(node.left);
				System.out.print(",");
				printR(node.right);
				System.out.print(")");
			}
		}
	}
}


class Question123
{
	public static void main(String[] args) 
	{
		// 123. Write a program to implement a basic calculator using stacks. 		
		System.out.println( calculator(getPostfixExpression("1 + (2.3 + 3.4) * (4 / 5)")) );
	}
	
	public static String getPostfixExpression(String input)
	{
		tNode t = getPostfixExpressionR(input);
		Tree tree = new Tree(t);
		return tree.toString();
	}
	
	
	public static tNode getPostfixExpressionR(String input)
	{
		input = input.replace(" ", "");
		int i = 0;
		int cutPoint1 = -1;
		int cutPoint2 = -1;
		boolean inBracket = false;
		while(i < input.length())
		{
			char c = input.charAt(i);
			if(c == '(')
			{
				inBracket = true;
			}
			
			if(c == ')')
			{
				inBracket = false;
			}
			
			if(inBracket == false)
			{
				if(c == '+' || c == '-')
				{
					cutPoint1 = i;
					break;
				}
				
				if((c == '*' || c == '/') && cutPoint2 == -1)
				{
					cutPoint2 = i;
				}
			}
			
			i++;
		}
		
		if(cutPoint1 > 0)
		{
			tNode root = new tNode(String.valueOf(input.charAt(cutPoint1)));
			root.left  = getPostfixExpressionR(input.substring(0, cutPoint1));
			root.right = getPostfixExpressionR(input.substring(cutPoint1+1));
			return root;
		}
		else if(cutPoint2 > 0)
		{
			tNode root = new tNode(String.valueOf(input.charAt(cutPoint2)));
			root.left  = getPostfixExpressionR(input.substring(0, cutPoint2));
			root.right = getPostfixExpressionR(input.substring(cutPoint2+1));
			return root;
		}
		else 
		{
			if(input.charAt(0) == '(' && input.charAt(input.length()-1) == ')')
			{
				return getPostfixExpressionR(input.substring(1, input.length()-1));
			}
			else 
			{
				tNode root = new tNode(input);
				return root;
			}
		}
		
	}
	
	
	public static Float calculator(String input)
	{
		if(input == null)
		{
			return null;
		}
		
		if(input.equals(""))
		{
			return 0f;
		}
		
		
		Stack<Float> s = new Stack<Float>();
		String[] array = input.split(" ");
		for(int i = 0; i < array.length; i++)
		{
			String token = array[i];
			if(token.equals("*"))
			{
				float number1 = s.pop();
				float number2 = s.pop();
				s.push(number2*number1);
			}
			else if(token.equals("/"))
			{
				float number1 = s.pop();
				float number2 = s.pop();
				s.push(number2/number1);
			}
			else if(token.equals("+"))
			{
				float number1 = s.pop();
				float number2 = s.pop();
				s.push(number2+number1);
			}
			else if(token.equals("-"))
			{
				float number1 = s.pop();
				float number2 = s.pop();
				s.push(number2-number1);
			}
			else 
			{
				s.push(Float.valueOf(token));
			}
		}
		
		return s.pop();
	}
}