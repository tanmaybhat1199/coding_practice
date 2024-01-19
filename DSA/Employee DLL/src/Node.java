public class Node {
	private Employee data;
	private Node prev;
	private Node next;
	
	
	public Node() {
		this.data=null;
		this.prev=this.next=null;
	}
	
	public Node(Employee data)
	{
		this.data=data;
		this.prev=this.next=null;
	}
	
	public void Setprev(Node prev)
	{
		this.prev=prev;
	}
	public void SetNext(Node next)
	{
		this.next=next;
	}
	public void SetEmpdata(Employee data)
	{
		this.data=data;
	}
	public Node getprev()
	{
		return prev;
		
	}
	public Node getnext()
	{
		return next;
		
	}
	public Employee  getEmpData()
	{
		return data;
		
	}
	public String toString()
	{
		String str=""+data;  //Or We Can Write SOP(data);
		return str;
	}

}

















	
