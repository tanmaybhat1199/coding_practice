
	public class Node {
		
	    Employee data;
		Node next;         
		
		public Node() {
	     data=null;
	     next=null;
	     
	     
		}

		public Node(Employee data)
		{
			this.data=data;
			this.next=null;
		}
		public Node(Employee data,Node next)
		{
			this.data=data;
			this.next=next;
		}
		public Node(Node next)
		{
			this.data=null;
			this.next=next;
		}
	}



