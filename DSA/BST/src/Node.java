
public class Node {
	int data;
	Node left;
	Node right;
	
	
	public Node(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
		
	}
	public Node(int data,Node n)
	{
		this.data=data;
		this.left=n;
		this.right=null;
		
	}
	 public String toString()
	 {
		 String str=" "+data+ ",";
		 return str;
	 }

}
