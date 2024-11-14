class Node 
{
	int data;
	Node left;
	Node right;
	
	public Node(int value)
	{
		this.data = value;
		this.left = null;
		this.right = null;
	}
}

class BinarySearchTree
{
	Node root;
	
	
	BinarySearchTree()
	{}
	
	public void insert(int value)
	{
		if(root == null)
		{
			root = new Node(value);
		}
		else 
		{
			this.insertR(root, value);
		}
	}
	
	private void insertR(Node root, int value)
	{
		if(value > root.data)
		{
			if(root.right != null)
			{
				insertR(root.right, value);
			}
			else 
			{
				root.right = new Node(value);
			}
		}
		else if(value < root.data)
		{
			if(root.left != null)
			{
				insertR(root.left, value);
			}
			else 
			{
				root.left = new Node(value);
			}
		}
	}
	
	public boolean search(int value)
	{
		return this.searchR(this.root, value);
	}
	
	private boolean searchR(Node root, int value)
	{
		
		if(root == null)
		{
			return false;
		}
		else if(root.data == value)
		{
			return true;
		}
		else 
		{
			if(root.data < value)
			{
				return searchR(root.right, value);
			}
			else 
			{
				return searchR(root.left, value);
			}
		}
	}
	
	
	void print(Node root)
	{
		if(root != null)
		{
			System.out.print(root.data);
			System.out.print("(");
			print(root.left);
			System.out.print(",");
			print(root.right);
			System.out.print(")");
		}
		else 
		{
			System.out.print("-");
			
		}
	}
	
	void printTree()
	{
		print(this.root);
		System.out.println();
	}
}



class Question122
{
	// 122. Write a program to implement a binary search tree with insertion and search operations. 
	public static void main(String[] args) 
	{
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(6);
		bst.insert(5);
		bst.insert(2);
		bst.insert(4);
		bst.insert(8);
		bst.insert(9);
		
		bst.printTree();
		
		System.out.println("search 7 :" + bst.search(7));
		System.out.println("search 2 :" + bst.search(2));
		System.out.println("search 8 :" + bst.search(8));
	}
}