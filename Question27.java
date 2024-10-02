import java.util.*;

class Question27
{
	public static void main(String[] args) 
	{
		System.out.println("#27. Write a program to capitalize the first letter of each word in a sentence.");
		System.out.println("Please input a sentence: ");

		Scanner s = new Scanner(System.in);  
		String string = s.nextLine();
		String[] array = string.split(" ");
		String result = "";
		for(String tmp: array)
		{
			char firstLetter = tmp.charAt(0);
			char capitalFirstLetter = Character.toUpperCase(firstLetter);
			result = result + " "+ tmp.replace(tmp.charAt(0), capitalFirstLetter);
		}
		
		System.out.println(result);
	}
}