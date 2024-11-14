class MyListNode
{
	Node node;
	MyListNode next;
	
	MyListNode(int x, int y)
	{
		this.node.x = x;
		this.node.y = y;
		this.next = null;
	}
	
	MyListNode(Node n)
	{
		this.node = n;
		this.next = null;
	}
}

class MyList
{
	MyListNode head;
	
	MyList()
	{
		this.head = null;
	}
	
	public void add(Node n)
	{
		if(this.head == null)
		{
			this.head = new MyListNode(n);
		}
		else
		{
			MyListNode p = head;
			while (p != null) 
			{
				if(p.node.x == n.x && p.node.y == n.y)
				{
					if(n.G < p.node.G)
					{
						p.node = n;
						break;
					}
				}
				
				if(p.next == null)
				{
					p.next = new MyListNode(n);
					break;
				}
				p = p.next;
			}
		}
	}
	
	public Node get(int n)
	{
		int i = 0;
		MyListNode p = head;
		while (p != null) 
		{
			if(i == n)
			{
				return p.node;
			}
			p = p.next;
			i++;
		}
		return null;
	}
	
	public Node remove(int n)
	{
		if(n == 0)
		{
			Node t = head.node;
			head = head.next;
			return t;
		}
		else 
		{
			int i = 0;
			MyListNode q = null;
			MyListNode p = head;
			while(p != null)
			{
				if(i == n)
				{
					Node t = p.node;
					q.next = p.next;
					return p.node;
				}
				i++;
				q = p;
				p = p.next;
			}
			
			return null;
		}
		
	}
	
	public boolean contain(int x, int y)
	{
		if(this.head == null)
		{
			return false;
		}
		else
		{
			MyListNode p = head;
			while (p != null) 
			{
				if(p.node.x == x && p.node.y == y)
				{
					return true;
				}
				p = p.next;
			}
			return false;
		}
	}
	
	public MyList sortByF()
	{
		MyList tmp = new MyList();
		
		while(head != null)
		{
			MyListNode p = head;
			MyListNode q = null;
			MyListNode minG = head;
			MyListNode pre  = null;
			while(p != null)
			{
				if(p.node.F < minG.node.F)
				{
					pre = q;
					minG = p;
				}
				q = p;
				p = p.next;
			}
			
			if(pre != null)
			{
				pre.next = minG.next;
				minG.next = null;
				tmp.add(minG.node);
			}
			else 
			{
				if(head.next == null)
				{
					tmp.add(head.node);
					head = null;
				}
				else 
				{
					tmp.add(head.node);
					head = head.next;
				}
			}
		}
		
		return tmp;
	}
	
	public void print()
	{
		MyListNode p = head;
		while (p != null) 
		{
			//System.out.print("(" + p.node.x + "," + p.node.y + ") -> ");
			System.out.print("(" + p.node.x + "," + p.node.y + ") F " + p.node.F + " -> ");
			p = p.next;
		}
		System.out.print("end\n");
	}
}


class Node
{
	Node parent;
	int x;
	int y;
	Node neighbor;
	MyList childList;
	
	double G;
	double H;
	double F;
	
	Node(int x, int y)
	{
		this.x = x;
		this.y = y;
		this.parent = null;
		this.neighbor = null;
		this.childList = new MyList();
	}
	
	public String toString()
	{
		return "(" + x + " " + y + ")";
	}
}


class Question121
{
	public static void main(String[] args) 
	{
		// 121. Write a program to implement the A*  search algorithm for pathfinding.	
		
		// Description of the Grid-
		// 1--> The cell is not blocked
		// 0--> The cell is blocked
		int[][] grid = { 
			{ 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
			{ 1, 1, 1, 0, 1, 1, 1, 0, 1, 1 },
			{ 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
			{ 0, 0, 1, 0, 1, 0, 0, 0, 0, 1 },
			{ 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
			{ 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 },
			{ 1, 0, 0, 0, 0, 1, 0, 0, 0, 1 },
			{ 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
			{ 1, 1, 1, 0, 0, 0, 1, 0, 0, 1 } };

		// Source is the left-most bottom-most corner
		int[] src = { 8, 0 };

		// Destination is the left-most top-most corner
		int[] dest = { 0, 0 };
		
		aStarSearch(grid, src, dest);
		
		
		/*
		MyList myList = new MyList();
		Node t1 = new Node(1,2);
		t1.F = 3;
		Node t2 = new Node(2,3);
		t2.F = 2;
		Node t3 = new Node(3,4);
		t3.F = 1;
		Node t4 = new Node(4,5);
		t4.F = 7;
		Node t5 = new Node(5,6);
		t5.F = 9;
		Node t6 = new Node(6,7);
		t6.F = 0;
		
		myList.add(t1);
		myList.add(t2);
		myList.add(t3);
		myList.add(t4);
		myList.add(t5);
		myList.add(t6);
		
		myList.print();
		myList = myList.sortByF();
		myList.print();*/
		
	}
	
	
	public static void aStarSearch(int[][] grid, int[] src, int[] dest)
	{
		MyList closedList = new MyList();
		MyList openedList = new MyList();
		
		Node start = new Node(src[0], src[1]);
		start.G = 0;
		start.H = (dest[0] - src[0] > 0 ? dest[0] - src[0] : src[0] - dest[0]) + (dest[1] - src[1] > 0 ? dest[1] - src[1] : src[1] - dest[1]);
		start.F = start.H + start.G;
		
		Node target = null;
		
		openedList.add(start);		
		while(openedList.head != null)
		{
			Node parent = openedList.remove(0);
			if(parent.x == dest[0] && parent.y == dest[1])
			{
				target = parent;
				break;
			}
			
			if(closedList.contain(parent.x, parent.y))
			{
				continue;
			}
			
			int x = parent.x;
			int y = parent.y;
			if(x - 1 >= 0 && grid[x-1][y] != 0 && !closedList.contain(x-1, y))
			{
				Node t = new Node(x-1, y);
				t.G = parent.G + 1;
				t.H = (dest[0] - (x -1) > 0 ? dest[0] - (x -1) : (x -1) - dest[0]) + (dest[1] - y > 0 ? dest[1] - y : y - dest[1]);
				t.F = t.G + t.H;
				t.parent = parent;
				parent.childList.add(t);
				openedList.add(t);
			}
			if(y - 1 >= 0 && grid[x][y-1] != 0 && !closedList.contain(x, y-1))
			{
				Node t = new Node(x, y-1);
				t.parent = parent;
				t.G = parent.G + 1;
				t.H = (dest[0] - x > 0 ? dest[0] - x : x - dest[0]) + (dest[1] - (y-1) > 0 ? dest[1] - (y-1) : (y-1) - dest[1]);
				t.F = t.G + t.H;
				parent.childList.add(t);
				openedList.add(t);
			}
			if(x - 1 >= 0 && y - 1 >= 0 && grid[x-1][y-1] != 0 && !closedList.contain(x-1, y-1))
			{
				Node t = new Node(x-1, y-1);
				t.parent = parent;
				t.G = parent.G + 1.414;
				t.H = (dest[0] - (x -1) > 0 ? dest[0] - (x -1) : (x -1) - dest[0]) + (dest[1] - (y-1) > 0 ? dest[1] - (y-1) : (y-1) - dest[1]);
				t.F = t.G + t.H;
				parent.childList.add(t);
				openedList.add(t);
			}
			if(x - 1 >= 0 && y + 1 < grid[0].length && grid[x-1][y+1] != 0 && !closedList.contain(x-1, y+1))
			{
				Node t = new Node(x-1, y+1);
				t.parent = parent;
				t.G = parent.G + 1.414;
				t.H = (dest[0] - (x-1) > 0 ? dest[0] - (x-1) : (x-1) - dest[0]) + (dest[1] - (y+1) > 0 ? dest[1] - (y+1) : (y+1) - dest[1]);
				t.F = t.G + t.H;
				parent.childList.add(t);
				openedList.add(t);
			}
			
			if(x + 1 < grid.length && grid[x+1][y] != 0 && !closedList.contain(x+1, y))
			{
				Node t = new Node(x+1, y);
				t.parent = parent;
				t.G = parent.G + 1;
				t.H = (dest[0] - (x+1) > 0 ? dest[0] - (x+1) : (x+1) - dest[0]) + (dest[1] - y > 0 ? dest[1] - y : y - dest[1]);
				t.F = t.G + t.H;
				parent.childList.add(t);
				openedList.add(t);
			}
			
			if(y + 1 < grid[0].length && grid[x][y+1] != 0&& !closedList.contain(x, y+1))
			{
				Node t = new Node(x, y+1);
				t.parent = parent;
				t.G = parent.G + 1;
				t.H = (dest[0] - x > 0 ? dest[0] - x : x - dest[0]) + (dest[1] - (y+1) > 0 ? dest[1] - (y+1) : (y+1) - dest[1]);
				t.F = t.G + t.H;
				parent.childList.add(t);
				openedList.add(t);
			}
			
			if(x+1 < grid.length  &&  y+1< grid[0].length && grid[x+1][y+1] != 0 && !closedList.contain(x+1, y+1))
			{
				Node t = new Node(x+1, y+1);
				t.parent = parent;
				t.G = parent.G + 1.414;
				t.H = (dest[0] - (x+1) > 0 ? dest[0] - (x+1) : (x+1) - dest[0]) + (dest[1] - (y+1) > 0 ? dest[1] - (y+1) : (y+1) - dest[1]);
				t.F = t.G + t.H;
				parent.childList.add(t);
				openedList.add(t);
			}
			
			if(x+1 < grid.length && y - 1 >= 0 && grid[x+1][y-1] != 0 && !closedList.contain(x+1, y-1))
			{
				Node t = new Node(x+1, y-1);
				t.parent = parent;
				t.G = parent.G + 1.414;
				t.H = (dest[0] - (x+1) > 0 ? dest[0] - (x+1) : (x+1) - dest[0]) + (dest[1] - (y-1) > 0 ? dest[1] - (y-1) : (y-1) - dest[1]);
				t.F = t.G + t.H;
				parent.childList.add(t);
				openedList.add(t);
			}
			
			openedList = openedList.sortByF();
			closedList.add(parent);
		}
		
		
		Node t = target;
		System.out.println("Path: ");
		while(t != null)
		{
			System.out.print("(" + t.x + "," + t.y +") -> ");
			t = t.parent;
		}
	}
	
}

// A* Search Algorithm
/*
1.  Initialize the open list
2.  Initialize the closed list
		put the starting node on the open 
		list (you can leave its f at zero)
3.  while the open list is not empty
		a) find the node with the least f on 
			 the open list, call it "q"
		b) pop q off the open list
	
		c) generate q's 8 successors and set their 
			 parents to q
	 
		d) for each successor
				i) if successor is the goal, stop search
				
				ii) else, compute both g and h for successor
					successor.g = q.g + distance between 
															successor and q
					successor.h = distance from goal to 
					successor (This can be done using many 
					ways, we will discuss three heuristics- 
					Manhattan, Diagonal and Euclidean 
					Heuristics)
					
					successor.f = successor.g + successor.h
				iii) if a node with the same position as 
							successor is in the OPEN list which has a 
						   lower f than successor, skip this successor
				iV) if a node with the same position as 
							successor  is in the CLOSED list which has
							a lower f than successor, skip this successor
							otherwise, add  the node to the open list
					 end (for loop)
				  
		e) push q on the closed list end (while loop)

*/