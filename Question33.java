import java.util.*;

class Question33 {
	public static void main(String[] args) 
	{
		System.out.println("#33. Write a program to remove all whitespace from a string. ");
		System.out.println("Please input a string : ");
		Scanner s = new Scanner(System.in);  
		String string = s.nextLine();
		
		String result = string.replaceAll(" ", "");
		System.out.println(result);
		
	}
}