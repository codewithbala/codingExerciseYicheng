import java.util.*;

class TreeNode
{
	int data;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int data)
	{
		this.data = data;
	}
}

class Tree
{
	TreeNode root;
	
	Tree(TreeNode root)
	{
		this.root = root;
	}
	
	int maximumPath()
	{
		int left  = this.maxPath(root.left);
		int right = this.maxPath(root.right);
		if(left > 0 && right > 0)
		{
			return root.data + left + right;
		}
		else if(left > 0 && right <= 0)
		{
			return root.data + left;
		}
		else if(left <= 0 && right > 0)
		{
			return root.data + right;
		}
		else 
		{
			return left > right ? left + root.data : right + + root.data;
		}
		
	}
	
	int maxPath(TreeNode root)
	{
		if(root == null)
		{
			return 0;
		}
		else
		{
			int left = maxPath(root.left);
			int right = maxPath(root.right);
			return left > right ? left + root.data : right + + root.data;
		}
	}
	
	
	void print(TreeNode root)
	{
		if(root == null)
		{
			System.out.print(" ");
		}
		else 
		{
			System.out.print("(" + root.data);
			
			print(root.left);
			System.out.print(", ");
			print(root.right);
			
			System.out.print(")");
		}
	}
	
	void printTree()
	{
		print(this.root);
		System.out.println();
	}
}

class Question2_13 {
	public static void main(String[] args) 
	{
		// 13. Write a program to find the maximum path sum in a binary tree.
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(2);
		root.right = new TreeNode(10);
		root.left.left = new TreeNode(20);
		root.left.right = new TreeNode(1);
		root.right.right = new TreeNode(-25);
		root.right.right.left = new TreeNode(3);
		root.right.right.right = new TreeNode(4);
		
		Tree t = new Tree(root);
		t.printTree();
		System.out.println(t.maximumPath()); 
		
	}
}