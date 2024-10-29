import java.util.*;

class Node {
	int data;
	Node left, right;
	
	Node(int key)
	{
		data = key;
		left = right = null;
	}
}

class BinaryTree 
{
	Node root;
	
	void deserialize(String s)
	{
		if(s.equals("#"))
		{
			this.root = null;
		}
		else 
		{
			List<Node> stack = new ArrayList<Node>();
			
			int i = 0;
			this.root = new Node(-1);
			stack.add(this.root);
			while(stack != null && i < s.length())
			{
				Node t = stack.get(stack.size()-1);
				stack.remove(stack.size()-1);
				
				if(s.charAt(i) != '#')
				{
					t.data = Integer.valueOf(String.valueOf(s.charAt(i)));
					t.left = new Node(-1);
					t.right = new Node(-1);
					stack.add(t.right);
					stack.add(t.left);
				}
				else 
				{
					t = null;
				}
				i++;
				
			}
		}
	}
	
	
	String print(Node root)
	{
		if(root == null)
		{
			return "#";
		}
		else 
		{
			return root.data + print(root.left) + print(root.right);
		}
	}
	
	String serialize()
	{
		return print(this.root);
	}
}


class Question99 {
	public static void main(String[] args) 
	{
		// 99. Write a program to serialize and deserialize a binary tree. 
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		//tree.root.right = new Node(5);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(4);
		//tree.root.right.right = new Node(6);*/
		String s = tree.serialize();
		System.out.println(s);
		
		BinaryTree tree2 = new BinaryTree();
		tree2.deserialize(s);
		System.out.println(tree.serialize());
		
	}
	
	
	
}