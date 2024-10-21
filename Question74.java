class Node {
	int data;
	Node left, right;
	Node(int d)
	{
		data = d;
		left = right = null;
	}
}

class Tree
{
	Node root;
	
	Tree()
	{
	}
	
	
	boolean checkBalanace()
	{
		return this.isBalanced(this.root);
	}
	
	boolean isBalanced(Node node)
	{
		
		if (node == null)
		{
			return true;
		}
		
		int lh = height(node.left);
		int rh = height(node.right);
		int abs = lh - rh;
		abs = abs > 0 ? abs : -abs;	

		if ((abs <= 1) && isBalanced(node.left) && isBalanced(node.right))
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}
	
	int height(Node node)
	{
		if (node == null)
		{
			return 0;
		}
		else 
		{
			int lh = height(node.left);
			int rh = height(node.right);
			return lh > rh ? lh + 1 : rh + 1;
		}
		
	}
	
}

class Question74
{
	public static void main(String[] args) 
	{
		// 74. Write a program to check if a binary tree is balanced. 
		Tree tree = new Tree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.left.left = new Node(8);

		System.out.println(tree.checkBalanace());
	}
	
	
}