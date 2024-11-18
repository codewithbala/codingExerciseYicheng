import java.util.*;

class Question134
{
	static Stack<Character> Undo = new Stack<Character>();
	static Stack<Character> Redo = new Stack<Character>();
	
	public static void main(String[] args) 
	{
		// 134. Write a program to implement a simple version of a text editor with undo functionality. 
		String[] Q = { "WRITE A", "WRITE B", "WRITE C", "UNDO", "READ", "REDO", "READ" };
		QUERY(Q);
	}
	
	static void WRITE(Stack<Character> Undo, char X)
	{
		Undo.push(X);
	}
	
	static void UNDO(Stack<Character> Undo, Stack<Character> Redo)
	{
		char X = (char)Undo.peek();
		Undo.pop();
		Redo.push(X);
	}
	
	static void REDO(Stack<Character> Undo, Stack<Character> Redo)
	{
		char X = (char)Redo.peek();
		Redo.pop();
		Undo.push(X);
	}
	
	static void READ(Stack<Character> Undo)
	{
		Stack<Character> revOrder = new Stack<Character>();
		while (Undo.size() > 0)
		{
			revOrder.push(Undo.peek());
			Undo.pop();
		}

		while (revOrder.size() > 0)
		{
			System.out.print(revOrder.peek());
			Undo.push(revOrder.peek());
			revOrder.pop();
		}
		System.out.print(" ");
	}
	
	static void QUERY(String[] Q)
	{
		int N = Q.length;

		// Traverse all the query
		for (int i = 0; i < N; i++)
		{
			if(Q[i] == "UNDO")
			{
				UNDO(Undo, Redo);
			}
			else if(Q[i] == "REDO")
			{
				REDO(Undo, Redo);
			}
			else if(Q[i] == "READ")
			{
				READ(Undo);
			}
			else
			{
				WRITE(Undo, Q[i].charAt(6));
			}
		}
	}
}

