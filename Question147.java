class Stack
{
	int[] stack;
	int size;
	
	Stack(int size)
	{
		this.stack = new int[size];
		this.size = 0;
	}
	
	boolean push(int e)
	{
		if(size == this.stack.length)
		{
			return false;
		}
		
		this.stack[size] = e;
		this.size ++;
		return true;
	}
	
	int pop()
	{
		int e = this.stack[size-1];
		this.stack[size-1] = 0;
		size -- ;
		return e;
	}
}

class Question147
{
	// 147. Write a program to implement a stack using an array. 
	public static void main(String[] args) 
	{
		Stack s = new Stack(4);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}