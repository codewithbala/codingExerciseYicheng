class Node {
	int data;
	Node left, right;

	Node(int val) {
		data = val;
		left = right = null;
	}
}

class Question65 {
	public static void main(String[] args) 
	{
		// 65. Write a program to check if two binary trees are identical.
		Node r1 = new Node(1);
		r1.left = new Node(2);
		r1.right = new Node(3);
		r1.left.left = new Node(4);
		
		Node r2 = new Node(1);
		r2.left = new Node(2);
		r2.right = new Node(3);
		r2.left.left = new Node(4);
		
		System.out.println(isIdentical(r1,r2) );
		
	}
	
	public static boolean isIdentical(Node r1, Node r2) 
	{
		if (r1 == null && r2 == null)
		{
			return true;
		}
		
		if ((r1 == null && r2 != null) || (r1 != null && r2 == null))
		{
			return false;
		}
		
		return (r1.data == r2.data) && isIdentical(r1.left, r2.left) && isIdentical(r1.right, r2.right);
	}
}