
public class DLinkedList {
	private Node head;
	private Node tail;
	
	public DLinkedList() {
	   this.head=this.tail=null;
	}
	
	public void InsertFirst(Employee Emp)
	{
		Node tmp=new Node(Emp);
		if(tail==null  && head==null)
		{
			this.head=this.tail=tmp;
			
		}
		else
		{
			head.Setprev(tmp);
			tmp.SetNext(head);
			head=tmp;
		}
	}
    public void Append(Employee Emp)
    {
    	Node tmp=new Node(Emp);
    	if(tail==null  && head==null)
		{
			this.head=this.tail=tmp;
			
		}
    	else
    	{
    		tail.SetNext(tmp);
    		tmp.Setprev(tail);
    		tmp.SetNext(null);
    		 
    		
    	}
    			
    }
    public void InsertAtMid(Employee e)
    {
    	Node tmp=new Node(e);
    	if(tail==null  && head==null)
		{
			this.head=this.tail=tmp;
			
		}
    	else
    	{
    		Node it=head;
    		Node et=head;
    		int count=0;
    		while(it.getnext()!=null)
    		{
    			it=it.getnext();
    			count++;
    			if(count==2)
    			{
    				et=et.getnext();
    				count=0;
    			}
    			
    		}
    		tmp.SetNext(et.getnext());
    		et.getnext().Setprev(tmp);
    		et.SetNext(tmp);
    		tmp.Setprev(et);
    	}
    	
    }

	public void InsertByPos(Employee Emp, int pos) {
		Node tmp = new Node(Emp);
		if (pos == 1) {
			InsertFirst(Emp);
		} else {
			Node it = head;
			if (it.getnext() == null) {
				Append(Emp);
			} else if (it != null) {
				for (int i = 1; i < pos - 1; i++) {
					it = it.getnext();
				}
				tmp.SetNext(it.getnext());
				it.getnext().Setprev(tmp);
				it.SetNext(tmp);
				tmp.Setprev(it);
			}
		}
	
		
	}
	public void DeleteLast()
	{
		if(head.getnext()==null)
		{
			head=null;
		}
		else
		{
			tail=tail.getprev();
			
		}
	}

	public void DeleteOlderThan31() {
		Node it = head;
		
			while (it.getnext() != null) {
				if (it.getEmpData().getAge() < 31) {
					
					it.getprev().SetNext(it.getnext());
					it.getnext().Setprev(it.getprev());

				}
				

				it = it.getnext();
			}
		}
		
    public String toString()
    {
    	String str="";
    	if(tail==null  && head==null)
    	{
    		str=str+"The Linked List Is Empty";
    	}
    	else
    	{
    		Node it=head;
    		while(it !=null)
    		{
    		str=str+it;
    		it=it.getnext();
    	}
    }
    	System.out.println();
    	return str;
    }
    
    
    public static void printCommanEmployees(DLinkedList L1,DLinkedList L2)
    {
    	Node it1=L1.head;
    	Node it2=L2.head;
    	while(it1.getnext()!=null)
    	{
    		while(it2.getnext()!=null)
    		{
    			if(it1.getEmpData()==it2.getEmpData())
    			System.out.println("Comman Employee :" + it1);
    			it2=it2.getnext();
    			
    		}
    		it1=it1.getnext();
    		
    	}
    }
    
    public static DLinkedList concat(DLinkedList L1,DLinkedList L2)
    {
    	DLinkedList L3=new DLinkedList();
    	if(L2.tail==null  && L2.head==null)
    	{
    		System.out.println("This Link List Is Empty");
    		return L1;
    	}
    	else
    	{
    		Node it=L2.head; 
    		while(it.getnext()!=null)
    		{
    			L1.tail.SetNext(it);
    			it.Setprev(L1.tail);
    			L1.tail=it;
    			it=it.getnext();
    			
    			
    		}
    		Node itp=L1.head;
    		Node t=L3.head;
    		while(itp.getnext() !=null)
    		{
    			if(t==null) {
    				t=itp;
    				itp.Setprev(t);
    			}
    			t.SetNext(itp);
    			itp.Setprev(t);
    			itp=itp.getnext();
    			t=itp;
    			
    		}
    		return L3;
    	}
    	
    	
    }
    
   
}
