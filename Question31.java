import javax.sound.midi.*;

class Question31 {
	public static void main(String[] args) 
	{
		//31. Write a program to find the longest common prefix of an array of strings. 
		String[] array = {"geeksforgeeks", "geeks", "geek", "geezer" };
		String prefix = "";
		
		if(array.length > 0)
		{
			int i = 1;
			while(true)
			{
				String tmpPrefix = array[0].substring(0, i);
				boolean hasPrefix = true;
				
				for(String s:array)
				{
					if(!s.substring(0, i).equals(tmpPrefix))
					{
						hasPrefix = false;
						break;
					}
				}
				
				if(hasPrefix == false)
				{
					break;
				}
				else 
				{
					prefix = tmpPrefix;
					i++;
				}
			}
			System.out.println("The longest common prefix is: " + prefix);
		}
		else 
		{
			System.out.println("There is not common prefix ");
		}
		
		
	}
}