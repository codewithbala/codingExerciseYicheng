class MyListNode
{
	int key;
	int value;
	MyListNode next;
	
	MyListNode(int k, int v)
	{
		this.key = k;
		this.value = v;
	}
}

class MyList
{
	MyListNode head;
	
	MyList()
	{
		this.head = null;
	}
	
	public void add(int k, int v)
	{
		if(this.head == null)
		{
			this.head = new MyListNode(k, v);
		}
		else
		{
			MyListNode p = head;
			while (p != null) 
			{
				if(p.key == k)
				{
					p.value = v;
					break;
				}
				
				if(p.next == null)
				{
					p.next = new MyListNode(k, v);
					break;
				}
				p = p.next;
			}
		}
	}
	
	public int get(int k)
	{
		int i = 0;
		MyListNode p = head;
		while (p != null) 
		{
			if(p.key == k)
			{
				return p.value;
			}
			p = p.next;
			i++;
		}
		return -1;
	}
	
	public boolean remove(int k)
	{
		
		if(head.key == k)
		{
			head = head.next;
			return true;
		}
		else 
		{
			int i = 0;
			MyListNode q = null;
			MyListNode p = head;
			while(p != null)
			{
				if(p.key == k)
				{
					q.next = p.next;
					return true;
				}
				i++;
				q = p;
				p = p.next;
			}
			return false;
		}
	}
	
	public void print()
	{
		MyListNode p = head;
		while (p != null) 
		{
			System.out.print("(" + p.key + "," + p.value + ") " +" -> ");
			p = p.next;
		}
		System.out.print("end\n");
	}
}

class MyHashTable
{
	MyList[] bin = new MyList[10];
	
	MyHashTable()
	{
		bin = new MyList[10];
		for(int i = 0; i < bin.length; i++)
		{
			bin[i] = new MyList();
		}

	}
	
	public void add(int k, int v)
	{
		int i = k % 10;
		bin[i].add(k, v);
	}
	
	public boolean remove(int k)
	{
		int i = k % 10;
		return bin[i].remove(k);
	}
	
	public int get(int k)
	{
		int i = k % 10;
		return bin[i].get(k);
	}
	
	public void print()
	{
		for(int i = 0; i < bin.length; i++)
		{
			bin[i].print();
		}
	}
}

class Question139
{
	public static void main(String[] args) 
	{
		// 139. Write a program to implement a hash table with collision handling using chaining.  
		MyHashTable myhasTable = new MyHashTable();
		myhasTable.add(1, 1);
		myhasTable.add(2, 2);
		myhasTable.add(3, 1);
		myhasTable.add(11, 9);
		myhasTable.add(12, 5);
		System.out.println(myhasTable.get(11));
		myhasTable.remove(11);
		System.out.println(myhasTable.get(11));
		System.out.println(myhasTable.get(12));
		myhasTable.add(1, 5);
		System.out.println(myhasTable.get(1));
	}
}
