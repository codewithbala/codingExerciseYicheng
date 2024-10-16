
class Node 
{
	int data;
	Node next;
	Node(int x) 
	{
		this.data = x;
		this.next = null;
	}
}

class MyList
{
	Node head;
	
	MyList()
	{
		head  = null;
	}
	
	void add(Node node)
	{
		if(head == null)
		{
			head = node;
		}
		else 
		{
			Node p = head;
			while(p != null)
			{
				if(p.next == null)
				{
					p.next = node;
					break;
				}
				else 
				{
					p = p.next;
				}
			}
		}
	}
	
	void print()
	{
		Node p = head;
		while(p != null)
		{
			System.out.print(p.data + " -> ");
			p = p.next;
		}
		System.out.print("\n");
	}
	
	
}

class Question64 {
	public static void main(String[] args) 
	{
		// 64. Write a program to merge two sorted linked lists. 
		MyList l1 = new MyList();
		l1.add(new Node(1));
		l1.add(new Node(3));
		l1.add(new Node(5));
		l1.add(new Node(6));
		l1.print();
		
		MyList l2 = new MyList();
		l2.add(new Node(0));
		l2.add(new Node(2));
		l2.add(new Node(4));
		l2.add(new Node(9));
		l2.print();
		
		MyList res = merge(l1, l2);
		res.print();
		
		
	}
	
	public static MyList merge(MyList l1, MyList l2)
	{
		MyList res = new MyList();
		Node p = l1.head;
		Node q = l2.head;
		
		while(p != null || q != null)
		{
			if(p == null)
			{
				res.add(new Node(q.data));
				q = q.next;
			}
			else if(q == null)
			{
				res.add(new Node(p.data));
				p = p.next;
			}
			else
			{
				if(p.data < q.data)
				{
					res.add(new Node(p.data));
					p = p.next;
				}
				else 
				{
					res.add(new Node(q.data));
					q = q.next;
				}
			}
		}
		
		return res;
		
	}
}