import java.util.*;

class TreeNode
{
	String value;
	boolean isToken;
	List<TreeNode> childList;
	
	TreeNode(String value, boolean isToken)
	{
		this.value = value;
		this.isToken = isToken;
		this.childList = new ArrayList<TreeNode>();
	}
	
	void addChild(TreeNode node)
	{
		this.childList.add(node);
	}
}

class TrieTree
{
	TreeNode root;
	
	TrieTree()
	{
		root = new TreeNode(null, false);
	}
	
	void add(String token)
	{
		List<TreeNode> childList = root.childList;
		int i = 0;
		while(i < token.length())
		{
			TreeNode p = null;
			for(int j = 0; j < childList.size(); j++)
			{
				if(childList.get(j).value.equals(token.substring(i, i+1)))
				{
					p = childList.get(j);
				}
			}
			
			if(p != null)
			{
				if(i == token.length() -1)
				{
					p.isToken = true;
				}
				
				childList = p.childList;
				
			}
			else 
			{
				TreeNode newNode = new TreeNode(token.substring(i, i+1), false);
				if(i == token.length() -1)
				{
					newNode.isToken = true;
				}
				childList.add(newNode);
				childList = newNode.childList;
			}
			i++;
		}
		
	}
	
	boolean search(String token)
	{
		List<TreeNode> childList = root.childList;
		int i = 0;
		while(i < token.length())
		{
			TreeNode p = null;
			for(int j = 0; j < childList.size(); j++)
			{
				if(childList.get(j).value.equals(token.substring(i, i+1)))
				{
					p = childList.get(j);
				}
			}
			
			if(p != null)
			{
				if(i == token.length() -1)
				{
					if(p.isToken == true)
					{
						return true;
					}
					else 
					{
						return false;
					}
				}
				
				childList = p.childList;
				
			}
			else 
			{
				return false;
			}
			i++;
		}
		return false;
	}
	
	boolean delete(String token)
	{
		List<TreeNode> childList = root.childList;
		List<TreeNode> path = new ArrayList<TreeNode>();
		int i = 0;
		while(i < token.length())
		{
			TreeNode p = null;
			for(int j = 0; j < childList.size(); j++)
			{
				if(childList.get(j).value.equals(token.substring(i, i+1)))
				{
					p = childList.get(j);
				}
			}
			
			if(p != null)
			{
				path.add(p);
				if(i == token.length() -1)
				{
					if(p.isToken == true)
					{
						if(p.childList.size() == 0)
						{
							for(int k = path.size()-1; k >= 0; k--)
							{
								TreeNode t = path.get(k);
								t.childList = new ArrayList<TreeNode>();
								if(t.isToken == true && !t.equals(p))
								{
									break;
								}
							}
							
						}
						else 
						{
							p.isToken = false;
							return true;
						}
					}
					else 
					{
						return false;
					}
				}
				
				childList = p.childList;
				
			}
			else 
			{
				return false;
			}
			i++;
		}
		return false;
		
	}
	
	
	void print(TreeNode root)
	{
		System.out.print("(" + root.value);
		if(root.isToken)
		{
			System.out.print(".");
		}
		
		int i = 0;
		while(i < root.childList.size())
		{
			print(root.childList.get(i));
			i++;
		}
		
		System.out.print(")");
	}
	
	void printTree()
	{
		print(this.root);
		System.out.println();
	}
}



class Question57 {
	public static void main(String[] args) 
	{
		// 57. Write a program to implement a trie (prefix tree). ");
		
		TrieTree t = new TrieTree();
		t.add("and");
		t.add("ant");
		t.add("do");
		t.add("geek");
		t.add("dad");
		t.add("ball");
		t.add("apple");
		t.add("app");
		t.printTree();
		
		System.out.println("search 'and' " + t.search("and"));
		System.out.println("search 'app' " + t.search("app"));
		System.out.println("search 'apple' " + t.search("apple"));
		System.out.println("search 'belt' " + t.search("belt"));
		
		t.delete("apple");
		t.printTree();
		
		
		
	}
}