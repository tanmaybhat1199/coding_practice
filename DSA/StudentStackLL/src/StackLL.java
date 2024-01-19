
public class StackLL {
	Node top;
	
	public StackLL()
	{
		this.top=null;
	}
	
	public void push(Student val) {
		Node tmp=new Node(val);
		if(top==null)
		{
		 top=tmp;	
		}
		else
		{
		tmp.next=top;
		top=tmp;
		}
	}
	
  public Student pop()
  {
	  Student tmp=null;
	  if(top!=null)
	  {
		  tmp=top.data;
		  top=top.next;
	  }
	  return tmp;
		
  }
  public boolean isEmpty()
  {
	  if(top==null)
	  {
		  return true;
	  }
	  else return false;
  }
  
  public Student peek()
  {
	  if(top != null)
	  {
		  return top.data;
	  }
	  else return null;

  }
	
	

}
