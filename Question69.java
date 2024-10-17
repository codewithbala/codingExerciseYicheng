import java.util.*;
import java.util.stream.*;

class Question69 {
	public static void main(String[] args) 
	{
		// 69. Write a program to remove duplicates from an unsorted linked list.
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(5);
		list.add(2);
		list.add(3);
		list.add(7);
		list.add(4);
		list.add(2);
		list.add(1);
		
		System.out.println(list);
		System.out.println(list.stream().distinct().collect(Collectors.toList()));
		
	}
}