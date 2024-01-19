
public class Node {
	int data;
	Node next;
	Node prev;
	
	public Node() {
		this.prev=null;
		this.data=0;
		this.next=null;
	}
	public Node(int data) {
		this.prev=null;
		this.data=data;
		this.next=null;
	}

	public String toString()
	{
		String str= ""+data +" ";
		return str;
	}
}
