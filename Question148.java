import java.util.Stack;

class myQueue
{
	Stack<Integer> s1;
	Stack<Integer> s2;
	
	myQueue()
	{
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();
	}
	
	
	void enQueue(int e)
	{
		s1.push(e);
	}
	
	int deQueue()
	{
		if (s2.isEmpty()) 
		{
			while (!s1.isEmpty()) 
			{
			   s2.push(s1.pop());
			}
		}
		return s2.pop();
	}
	
}


class Question148
{
	// 148. Write a program to implement a queue using two stacks.
	public static void main(String[] args) 
	{
		myQueue q = new myQueue();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		System.out.print(q.deQueue());
		System.out.print(q.deQueue());
		System.out.print(q.deQueue());
		System.out.print(q.deQueue());
		
		
	}
}