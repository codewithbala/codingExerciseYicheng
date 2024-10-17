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
	
	int getDepth()
	{
		return this.depth(root);
	}
	
	int depth(TreeNode root)
	{
		if(root == null)
		{
			return 0;
		}
		else
		{
			int left = depth(root.left);
			int right = depth(root.right);
			return left > right ? left + 1 : right + 1;
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


class Question70 {
	public static void main(String[] args) 
	{
		// 70. Write a program to find the maximum depth of a binary tree.
		
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(4);
		
		Tree t = new Tree(root);
		t.printTree();
		System.out.println(t.getDepth());
		
	}
}