
public class DLinkedList {
	Node head;
	Node tail;
	
	public DLinkedList()
	{
		this.head=null;
		this.tail=null;
	}
	
	public void insert(int value)
	{//check for the first value
		Node tmp=new Node(value);
		if(head==null)
		{
			head=tail=tmp;
		}
		else
		{
			head.prev=tmp;
			tmp.next=head;
			head=tmp;
			
		}
	}
	
	public void append(int value)
	{
		//check for the first value
			Node tmp=new Node(value);
			if(tail==null)
			{
				head=tail=tmp;
			}
			else
			{
				tail.next=tmp;
				tmp.prev=tail;
				tail=tmp;
			}
	}
	
	public void DeleteLast()
	{
		if(tail==null)
		{
			System.out.println("Linked List Is Empty");
		}
		else if(head==tail) //if(tail.prev==null) if(head.next==null)
		{
			head=null;
			tail=null;
		
		}
		else
		{
			Node tmp=tail;
			tail=tail.prev;
			tail.next=null;
			tmp.prev=null;
		}
	}

//Write Delete First
	public void DeleteFirst()
	{
		if(tail==null)
		{
			System.out.println("Linked List Is Empty");
			
		}
		else
		{
			if(head.next==null)
			{
				head=null;
			}
			else
			{
				Node it=head;   //head=head.next;
				head=it.next;
				it.next.prev=null;
				it.next=it.prev=null;
			}
			
		}
	}
	public void Insertpos(int DATA,int pos)
	{
		int count=LLength();
		Node tmp=new Node(DATA);
		if(pos ==1)
		{
			insert(DATA);
		}
		if(pos==count+1)
		
		{
			append(DATA);
		}
		else if(pos!=1 && pos != count+1)
		{
			Node it = head;
			for(int i=1;i<pos-1;i++)
			{
				it=it.next;
				
			}
			tmp.next=it.next;	
			it.next.prev=tmp;
			tmp.prev=it;
			it.next=tmp;
			
		}
		else
		{
			System.out.println("Linked List Is Empty");
		}
		
	}

public int LLength()
{
	int noofNodes=0;
	Node it=head;
	while(it != null)
	{
		noofNodes++;
		it=it.next;
	
	}
	return noofNodes;
}

public void deletepos(int pos)
{
	int count=LLength();
	
	if(pos ==1)
	{
	 DeleteFirst();
	}
	if(pos==count)
	
	{
		DeleteLast();
	}
	else if(pos!=1 && pos != count)
	{
		Node it = head;
		for(int i=1;i<pos-1;i++)
		{
			it=it.next;
			
		}
		Node p=it.next;
		it.next=p.next;
		p.next.prev=it;
		p.next=null;
		p.prev=null;
	}
	else
	{
		System.out.println("Linked List Is Empty");
	}
	
}

 public void RevPrint()
 {
	 Node it=tail;
	 while(it!= null)
	 {
		 System.out.print(it + ",");
		 it=it.prev;
	 }
	 System.out.println();
 }
 public String toString()
 {
	 String str="";
	 if(tail==null)
	 {
		 str=str+"The List Is Empty";
	 }
	 else
	 {
		 Node it=head;
		 while(it != null)
		 {
			 str=str+it;
			 it=it.next;
		 }
	 }
	 return str;
 }
}
