
class Node
{
	int data;
	Node left;
	Node right;
	
	Node(int data)
	{
		this.data = data;
		left = null;
		right  = null;
	}	
}


class Question149 {
	public static void main(String[] args) 
	{
		//149. Write a program to find the lowest common ancestor (LCA) of two nodes in a binary tree. 
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		System.out.println(LCA(root,4,5).data);
	}
	
	
	public static Node LCA(Node node, int n1, int n2)
	{
		if (node == null)
		{
			return null;
		}
		
		if (node.data == n1 || node.data == n2)
		{
			return node;
		}
		
		Node left_lca = LCA(node.left, n1, n2);
		Node right_lca = LCA(node.right, n1, n2);
		
		if (left_lca != null && right_lca != null)
		{
			return node;
		}
		
		return (left_lca != null) ? left_lca : right_lca;
	}
}