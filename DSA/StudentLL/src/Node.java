
public class Node {
	private Student Data;
	private Node next;
	
	public Node()
	{
		this.Data=null;
		this.next=null;
	}

	public Node(Student data)
	{
		this.Data=data;
		this.next=null;
	}

	public Student getData() {
		return Data;
	}

	public void setData(Student data) {
		Data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
