import java.util.*;

class Question35 {
	public static void main(String[] args) 
	{
		System.out.println("#35. Write a program to find the number of words in a string.");
		System.out.println("Please input a string : ");
		Scanner s = new Scanner(System.in);  
		String string = s.nextLine();
		
		System.out.print("the number of words is: " + string.split(" ").length);
		
		
	}
}